/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Entity_instance;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.orm.PersistentException;
import pwfms.Activity;
import pwfms.Activity_data_element;
import pwfms.Activity_document_type;
import pwfms.Activity_entity_type;
import pwfms.Data_element;
import pwfms.Entity_detail;
import pwfms.Entity_type;
import pwfms.Entity_type_data_element;
import pwfms.Task;
import pwfms.Task_activity;
import pwfms.Task_activity_de;
import pwfms.Task_activity_doc;
import pwfms.Task_activity_entity;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Entity_instanceBean extends AbstractBean<Entity_instance> implements Serializable {

    private List<Entity_detail> entity_details;

    public Entity_instanceBean() {
        super(Entity_instance.class);
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public void saveNewEntityInstance(int user_detail_id) {
        int aNewEntityInstanceId = 0;
        Entity_instance aSavedEntityInstance = null;
        try {
            aNewEntityInstanceId = super.save_return(user_detail_id);
            aSavedEntityInstance = Entity_instance.getEntity_instanceByORMID(aNewEntityInstanceId);
            if (aNewEntityInstanceId > 0 && null != aSavedEntityInstance) {
                Entity_detailBean edb = new Entity_detailBean();
                for (Entity_detail ed : this.getEntity_details()) {
                    ed.setEntity_instance(aSavedEntityInstance);
                    ed.setEntity_type(aSavedEntityInstance.getEntity_type());
                    //ed.setData_element(null);
                    //ed.setData_element_value(null);
                    edb.setSelected(ed);
                    edb.save_silent(user_detail_id);
                }
                this.getEntity_details().clear();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createEntityInstanceDEs(Entity_type entity_type) {
        this.entity_details = new ArrayList<>();
        List<Entity_type_data_element> etdes = new ArrayList<>();
        try {
            etdes = Entity_type_data_element.queryEntity_type_data_element("entity_type=" + entity_type.getEntity_type_id(), null);
            for (int i = 0; i < etdes.size(); i++) {
                Entity_type_data_element etde = new Entity_type_data_element();
                etde = etdes.get(i);
                Entity_detail ed = new Entity_detail();
                ed.setData_element(etde.getData_element());
                ed.setEntity_type(etde.getEntity_type());
                ed.setData_element_value("");
                this.entity_details.add(ed);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the entity_details
     */
    public List<Entity_detail> getEntity_details() {
        return entity_details;
    }

    /**
     * @param entity_details the entity_details to set
     */
    public void setEntity_details(List<Entity_detail> entity_details) {
        this.entity_details = entity_details;
    }

}
