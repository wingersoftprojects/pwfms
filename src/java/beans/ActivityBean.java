/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Activity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.orm.PersistentException;
import pwfms.Company_process;
import pwfms.PWFMPersistentManager;
import pwfms.Task;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class ActivityBean extends AbstractBean<Activity> implements Serializable {

    public ActivityBean() {
        super(Activity.class);
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

//    public List<Activity> getActivities(Process aProcess) {
//        List<Activity> aActivities = new ArrayList<Activity>();
//        aActivities = Activity.queryActivity("process=" + aProcess., null);
//        return aActivities;
//    }
    public Activity getStartingActivity(Company_process aProcess) {
        List<Activity> aActivities = new ArrayList<>();
        Activity aActivity = new Activity();
        try {
            aActivities = Activity.queryActivity("is_start=1 AND company_process=" + aProcess.getCompany_process_id(), null);
            for (Activity a : aActivities) {
                aActivity = a;
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aActivity;
    }
    
    public List<Activity> getActivitiesByProcess(Company_process aProcess) {
        List<Activity> aActivities = new ArrayList<>();
        try {
            aActivities = Activity.queryActivity("company_process=" + aProcess.getCompany_process_id(), null);
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aActivities;
    }
    
    public List<Activity> getActivitiesByTask(Task aTask) {
        List<Activity> aActivities = new ArrayList<>();
        try {
            aActivities = (List<Activity>) PWFMPersistentManager.instance().getSession().createQuery("SELECT a FROM Task_activity ta INNER JOIN ta.activity a WHERE ta.task=" + aTask.getTask_id()).list();
            //aActivities = Activity.queryActivity("task=" + aTask.getTask_id(), null);
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(ActivityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aActivities;
    }

}
