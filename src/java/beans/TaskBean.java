/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Task;
import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import pwfms.Task_activity;
import pwfms.User_detail;

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
        this.getSelected().setAdd_date(new Timestamp(new Date().getTime()));
        this.getSelected().setStart_date(new Timestamp(new Date().getTime()));
        this.getSelected().setAdded_by(loginBean.getUser_detail());
        this.getSelected().setCurrent_status_date(new Timestamp(new Date().getTime()));
        this.getSelected().setCurrent_status("PENDING");
        super.save(user_detail_id);
//        //add new activity automatically
//        //first get 
//        Task_activityBean tab=new Task_activityBean();
//        Task_activity ta=new Task_activity();
//        ta.setTask(null);
//        ta.setActivity(null);
//        ta.setStart_date(new Timestamp(new Date().getTime()));
//        ta.setAdd_date(new Timestamp(new Date().getTime()));
    }

}
