/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Task_activity;
import java.io.Serializable;
import java.util.ArrayList;
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
import pwfms.Activity_outcome;
import pwfms.Company_process;
import pwfms.Entity_type_data_element;
import pwfms.PWFMPersistentManager;
import pwfms.Task;
import pwfms.Task_activity_de;
import pwfms.Task_activity_doc;
import pwfms.Task_activity_entity;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Task_activityBean extends AbstractBean<Task_activity> implements Serializable {

    private List<Task_activity_de> task_activity_des;
    private List<Task_activity_doc> task_activity_docs;
    private List<Task_activity_entity> task_activity_entities;

    public Task_activityBean() {
        super(Task_activity.class);
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

    public List<Task_activity> getTask_activitiesByProcess(Company_process company_process) {
        List<Task_activity> task_activities = new ArrayList<>();
        try {
            task_activities = (List<Task_activity>) PWFMPersistentManager.instance().getSession().createQuery("SELECT ta FROM Task_activity  ta INNER JOIN ta.task t WHERE t.company_process=" + company_process.getCompany_process_id()).list();
            //task_activities = Task_activity.queryTask_activity("task.company_process=" + company_process, null);
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return task_activities;
    }

    public List<Task_activity> getTask_activitiesByTask(Task task) {
        List<Task_activity> task_activities = new ArrayList<>();
        try {
            task_activities = (List<Task_activity>) PWFMPersistentManager.instance().getSession().createQuery("SELECT ta FROM Task_activity  ta WHERE ta.task=" + task.getTask_id()).list();
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return task_activities;
    }

    public void createTask_activitiesChildren(Activity activity) {
        //task activity data elements
        this.task_activity_des = new ArrayList<>();
        List<Activity_data_element> ades = new ArrayList<>();
        try {
            ades = Activity_data_element.queryActivity_data_element("activity=" + activity.getActivity_id(), null);
            for (int i = 0; i < ades.size(); i++) {
                Activity_data_element ade = new Activity_data_element();
                ade = ades.get(i);
                Task_activity_de tade = new Task_activity_de();
                tade.setData_element(ade.getData_element());
                tade.setData_element_value("");
                this.task_activity_des.add(tade);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        //task activity document type values
        this.task_activity_docs = new ArrayList<>();
        List<Activity_document_type> adts = new ArrayList<>();
        try {
            adts = Activity_document_type.queryActivity_document_type("activity=" + activity.getActivity_id(), null);
            for (int i = 0; i < adts.size(); i++) {
                Activity_document_type adt = new Activity_document_type();
                adt = adts.get(i);
                Task_activity_doc tadoc = new Task_activity_doc();
                tadoc.setDocument_type(adt.getDocument_type());
                tadoc.setDocument_url("");
                this.task_activity_docs.add(tadoc);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        //task activity entity values
        this.task_activity_entities = new ArrayList<>();
        List<Activity_entity_type> aets = new ArrayList<>();
        try {
            aets = Activity_entity_type.queryActivity_entity_type("activity=" + activity.getActivity_id(), null);
            for (int i = 0; i < aets.size(); i++) {
                Activity_entity_type aet = new Activity_entity_type();
                aet = aets.get(i);
                
                Task_activity_entity taet = new Task_activity_entity();
                taet.setEntity_type(aet.getEntity_type());
                taet.setData_element(taet.getData_element());
                taet.setData_element_value("");
                this.task_activity_entities.add(taet);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the task_activity_des
     */
    public List<Task_activity_de> getTask_activity_des() {
        return task_activity_des;
    }

    /**
     * @param task_activity_des the task_activity_des to set
     */
    public void setTask_activity_des(List<Task_activity_de> task_activity_des) {
        this.task_activity_des = task_activity_des;
    }

    /**
     * @return the task_activity_docs
     */
    public List<Task_activity_doc> getTask_activity_docs() {
        return task_activity_docs;
    }

    /**
     * @param task_activity_docs the task_activity_docs to set
     */
    public void setTask_activity_docs(List<Task_activity_doc> task_activity_docs) {
        this.task_activity_docs = task_activity_docs;
    }

    /**
     * @return the task_activity_entities
     */
    public List<Task_activity_entity> getTask_activity_entities() {
        return task_activity_entities;
    }

    /**
     * @param task_activity_entities the task_activity_entities to set
     */
    public void setTask_activity_entities(List<Task_activity_entity> task_activity_entities) {
        this.task_activity_entities = task_activity_entities;
    }

}
