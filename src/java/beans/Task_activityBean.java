/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Task_activity;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.orm.PersistentException;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import pwfms.Activity;
import pwfms.Activity_data_element;
import pwfms.Activity_document_type;
import pwfms.Activity_entity_type;
import pwfms.Company_process;
import pwfms.PWFMPersistentManager;
import pwfms.Task;
import pwfms.Task_activity_de;
import pwfms.Task_activity_doc;
import pwfms.Task_activity_entity;
import utilities.GeneralUtilities;

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
    private List<Task_activity> pending_task_activities;
    private List<Task_activity> completed_task_activities;
    private BarChartModel task_activityModel;

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

    public void completeTaskActivity(int user_detail_id) {
        try {
            Task_activity task_activity = new Task_activity();
            //1.update current ta Status
            if (super.getSelected().getOutcome().getIs_success() == 1) {
                super.getSelected().setStatus("COMPLETE");
            } else {
                super.getSelected().setStatus("PENDING");
            }
            super.getSelected().setEnd_date(new Timestamp(new Date().getTime()));
            task_activity = super.getSelected();
            super.save(user_detail_id);

            //2. Update the main task's status and date
            TaskBean oldtb = new TaskBean();
            oldtb.setSelected(task_activity.getTask());
            oldtb.getSelected().setCurrent_status(task_activity.getStatus());
            oldtb.getSelected().setCurrent_status_date(new Timestamp(new Date().getTime()));
            oldtb.save_silent(user_detail_id);

            //3.insert ades
            try {
                if (task_activity.getTask_activity_id() > 0) {
                    Task_activity_deBean tadeb = new Task_activity_deBean();
                    for (Task_activity_de tade : this.getTask_activity_des()) {
                        tade.setTask_activity(task_activity);
                        tadeb.setSelected(tade);
                        tadeb.save_silent(user_detail_id);
                    }
                    this.getTask_activity_des().clear();
                }
            } catch (NullPointerException npe) {
                Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, npe);
            }
            //4.insert adoc
            try {
                if (task_activity.getTask_activity_id() > 0) {
                    Task_activity_docBean tadocb = new Task_activity_docBean();
                    for (Task_activity_doc tadoc : this.getTask_activity_docs()) {
                        tadoc.setTask_activity(task_activity);
                        tadocb.setSelected(tadoc);
                        tadocb.save_silent(user_detail_id);
                    }
                    this.getTask_activity_docs().clear();
                }
            } catch (NullPointerException npe) {
                Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, npe);
            }

            //5. insert new based on next one
            Task_activityBean newtab = new Task_activityBean();
            Task_activity ta2 = new Task_activity();
            int to_activity_id = 0;
            try {
                if (task_activity.getOutcome().getIs_success() == 1) {
                    to_activity_id = task_activity.getActivity().getTo_activity_id_success();
                } else {
                    to_activity_id = task_activity.getActivity().getTo_activity_id_failure();
                }
                ta2.setActivity(Activity.getActivityByORMID(to_activity_id));
            } catch (NullPointerException | PersistentException npe) {
                Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, npe);
            }
            ta2.setTask(task_activity.getTask());
            ta2.setStart_date(new Timestamp(new Date().getTime()));
            ta2.setAdd_date(new Timestamp(new Date().getTime()));
            ta2.setAdded_by(user_detail_id);
            ta2.setActivity_assigned_to(loginBean.getUser_detail());
            ta2.setStatus("PENDING");
            ta2.setComment("");
            ta2.setAdded_by(user_detail_id);
            newtab.setSelected(ta2);
            newtab.save_silent(user_detail_id);
        } catch (Exception e) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, e);
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

    /**
     * @return the pending_task_activities
     */
    public List<Task_activity> getPending_task_activities() {
        try {
            pending_task_activities = Task_activity.queryTask_activity("status='PENDING'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pending_task_activities;
    }

    /**
     * @param pending_task_activities the pending_task_activities to set
     */
    public void setPending_task_activities(List<Task_activity> pending_task_activities) {
        this.pending_task_activities = pending_task_activities;
    }

    /**
     * @return the completed_task_activities
     */
    public List<Task_activity> getCompleted_task_activities() {
        try {
            completed_task_activities = Task_activity.queryTask_activity("status='COMPLETE'", null);
        } catch (PersistentException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completed_task_activities;
    }

    /**
     * @param completed_task_activities the completed_task_activities to set
     */
    public void setCompleted_task_activities(List<Task_activity> completed_task_activities) {
        this.completed_task_activities = completed_task_activities;
    }

    /**
     * @return the task_activityModel
     */
    public BarChartModel getTask_activityModel() {
        BarChartModel model = new BarChartModel();
        ChartSeries ser1 = new ChartSeries();
        ser1.setLabel("Task Activities");
        try {
            String qString = "SELECT ta.status,count(ta.status) FROM Task_activity ta "
                    + " "
                    + "GROUP BY ta.status";
            List<Object[]> result = PWFMPersistentManager.instance().getSession().createQuery(qString).list();
            for (Object[] resultElement : result) {
                long number = (long) resultElement[1];
                ser1.set(resultElement[0], number);
            }
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Task_activityBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        model.addSeries(ser1);
        task_activityModel = model;
        task_activityModel.setLegendPosition("e");
        task_activityModel.setShowPointLabels(true);
        task_activityModel.getAxes().put(AxisType.X, new CategoryAxis("Status"));
        Axis yAxis = task_activityModel.getAxis(AxisType.Y);
        yAxis = task_activityModel.getAxis(AxisType.Y);
        yAxis.setLabel("Number");
        yAxis.setMin(0);
        yAxis.setMax(15);
        return task_activityModel;
    }

    /**
     * @param task_activityModel the task_activityModel to set
     */
    public void setTask_activityModel(BarChartModel task_activityModel) {
        this.task_activityModel = task_activityModel;
    }

}
