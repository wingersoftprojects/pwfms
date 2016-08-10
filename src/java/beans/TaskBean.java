/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Task;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import pwfms.PWFMPersistentManager;
import pwfms.Task_activity;
import pwfms.User_detail;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class TaskBean extends AbstractBean<Task> implements Serializable {

    public TaskBean() {
        super(Task.class);
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

    public void saveNewTask(int user_detail_id) {
        int aNewTaskId = 0;
        Task aSavedTask = null;
        try {
            this.getSelected().setAdd_date(new Timestamp(new Date().getTime()));
            this.getSelected().setStart_date(new Timestamp(new Date().getTime()));
            this.getSelected().setAdded_by(loginBean.getUser_detail());
            this.getSelected().setCurrent_status_date(new Timestamp(new Date().getTime()));
            this.getSelected().setCurrent_status("PENDING");
            aNewTaskId = super.save_return(user_detail_id);
            aSavedTask = Task.getTaskByORMID(aNewTaskId);
            //add new activity automatically
            //first get
            if (aNewTaskId > 0 && null!=aSavedTask) {

                Task_activityBean tab = new Task_activityBean();
                Task_activity ta = new Task_activity();
                ta.setTask(aSavedTask);
                ta.setActivity(new ActivityBean().getStartingActivity(aSavedTask.getCompany_process()));
                ta.setStart_date(new Timestamp(new Date().getTime()));
                ta.setAdd_date(new Timestamp(new Date().getTime()));
                ta.setAdded_by(user_detail_id);
                ta.setActivity_assigned_to(aSavedTask.getTask_assigned_to());
                ta.setStatus("PENDING");
                ta.setComment(aSavedTask.getComment());
                ta.setAdded_by(loginBean.getUser_detail().getUser_detail_id());
                tab.setSelected(ta);
                tab.save(user_detail_id);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
