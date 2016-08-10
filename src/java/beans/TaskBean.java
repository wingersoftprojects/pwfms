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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.orm.PersistentException;
import org.primefaces.model.chart.PieChartModel;
import pwfms.Task_activity;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class TaskBean extends AbstractBean<Task> implements Serializable {

    private List<Task> pending_tasks;
    private List<Task> completed_tasks;
    private PieChartModel tasksModel;

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
            if (aNewTaskId > 0 && null != aSavedTask) {
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

    /**
     * @return the pending_tasks
     */
    public List<Task> getPending_tasks() {
        try {
            pending_tasks = Task.queryTask("current_status='PENDING'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pending_tasks;
    }

    /**
     * @param pending_tasks the pending_tasks to set
     */
    public void setPending_tasks(List<Task> pending_tasks) {
        this.pending_tasks = pending_tasks;
    }

    /**
     * @return the tasksModel
     */
    public PieChartModel getTasksModel() {
        tasksModel = new PieChartModel();
        tasksModel.set("Pending Process Tasks",pending_tasks.size());
        tasksModel.set("Completed Process Tasks",completed_tasks.size());
        tasksModel.setTitle("Process Tasks");
        tasksModel.setLegendPosition("w");
        tasksModel.setShowDataLabels(true);
        return tasksModel;
    }

    /**
     * @param tasksModel the tasksModel to set
     */
    public void setTasksModel(PieChartModel tasksModel) {
        this.tasksModel = tasksModel;
    }

    /**
     * @return the completed_tasks
     */
    public List<Task> getCompleted_tasks() {
        try {
            completed_tasks = Task.queryTask("current_status='COMPLETE'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(TaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completed_tasks;
    }

    /**
     * @param completed_tasks the completed_tasks to set
     */
    public void setCompleted_tasks(List<Task> completed_tasks) {
        this.completed_tasks = completed_tasks;
    }
}
