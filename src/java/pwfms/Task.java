/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: btwesigye
 * License Type: Purchased
 */
package pwfms;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="task")
public class Task implements Serializable {
	public Task() {
	}
	
	public static Task loadTaskByORMID(int task_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTaskByORMID(session, task_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(int task_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTaskByORMID(session, task_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByORMID(int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTaskByORMID(session, task_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTaskByORMID(session, task_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByORMID(PersistentSession session, int task_id) throws PersistentException {
		try {
			return (Task) session.load(pwfms.Task.class, new Integer(task_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(PersistentSession session, int task_id) throws PersistentException {
		try {
			return (Task) session.get(pwfms.Task.class, new Integer(task_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByORMID(PersistentSession session, int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task) session.load(pwfms.Task.class, new Integer(task_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task getTaskByORMID(PersistentSession session, int task_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task) session.get(pwfms.Task.class, new Integer(task_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task as Task");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task as Task");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask(session, condition, orderBy);
			return (Task[]) list.toArray(new Task[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task[] listTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask(session, condition, orderBy, lockMode);
			return (Task[]) list.toArray(new Task[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task[] tasks = listTaskByQuery(session, condition, orderBy);
		if (tasks != null && tasks.length > 0)
			return tasks[0];
		else
			return null;
	}
	
	public static Task loadTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task[] tasks = listTaskByQuery(session, condition, orderBy, lockMode);
		if (tasks != null && tasks.length > 0)
			return tasks[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task as Task");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task as Task");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task loadTaskByCriteria(TaskCriteria taskCriteria) {
		Task[] tasks = listTaskByCriteria(taskCriteria);
		if(tasks == null || tasks.length == 0) {
			return null;
		}
		return tasks[0];
	}
	
	public static Task[] listTaskByCriteria(TaskCriteria taskCriteria) {
		return taskCriteria.listTask();
	}
	
	public static Task createTask() {
		return new pwfms.Task();
	}
	
	public boolean save() throws PersistentException {
		try {
			pwfms.PWFMPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			pwfms.PWFMPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			pwfms.PWFMPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			pwfms.PWFMPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getCompany_process() != null) {
				getCompany_process().getTask().remove(this);
			}
			
			if(getAdded_by() != null) {
				getAdded_by().getTask().remove(this);
			}
			
			if(getTask_assigned_to() != null) {
				getTask_assigned_to().getTask1().remove(this);
			}
			
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setTask(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getCompany_process() != null) {
				getCompany_process().getTask().remove(this);
			}
			
			if(getAdded_by() != null) {
				getAdded_by().getTask().remove(this);
			}
			
			if(getTask_assigned_to() != null) {
				getTask_assigned_to().getTask1().remove(this);
			}
			
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setTask(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="task_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_TASK_TASK_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_TASK_TASK_ID_GENERATOR", strategy="native")	
	private int task_id;
	
	@ManyToOne(targetEntity=pwfms.Company_process.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_process_id", referencedColumnName="company_process_id", nullable=false) })	
	private pwfms.Company_process company_process;
	
	@Column(name="start_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date start_date;
	
	@Column(name="end_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date end_date;
	
	@Column(name="add_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date add_date;
	
	@ManyToOne(targetEntity=pwfms.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="added_by", referencedColumnName="user_detail_id") })	
	private pwfms.User_detail added_by;
	
	@ManyToOne(targetEntity=pwfms.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_assigned_to", referencedColumnName="user_detail_id") })	
	private pwfms.User_detail task_assigned_to;
	
	@Column(name="comment", nullable=true, length=250)	
	private String comment;
	
	@Column(name="current_status", nullable=true, length=100)	
	private String current_status;
	
	@Column(name="current_status_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date current_status_date;
	
	@OneToMany(mappedBy="task", targetEntity=pwfms.Task_activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity = new java.util.HashSet();
	
	private void setTask_id(int value) {
		this.task_id = value;
	}
	
	public int getTask_id() {
		return task_id;
	}
	
	public int getORMID() {
		return getTask_id();
	}
	
	public void setStart_date(java.util.Date value) {
		this.start_date = value;
	}
	
	public java.util.Date getStart_date() {
		return start_date;
	}
	
	public void setEnd_date(java.util.Date value) {
		this.end_date = value;
	}
	
	public java.util.Date getEnd_date() {
		return end_date;
	}
	
	public void setAdd_date(java.util.Date value) {
		this.add_date = value;
	}
	
	public java.util.Date getAdd_date() {
		return add_date;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setCurrent_status(String value) {
		this.current_status = value;
	}
	
	public String getCurrent_status() {
		return current_status;
	}
	
	public void setCurrent_status_date(java.util.Date value) {
		this.current_status_date = value;
	}
	
	public java.util.Date getCurrent_status_date() {
		return current_status_date;
	}
	
	public void setCompany_process(pwfms.Company_process value) {
		this.company_process = value;
	}
	
	public pwfms.Company_process getCompany_process() {
		return company_process;
	}
	
	public void setAdded_by(pwfms.User_detail value) {
		this.added_by = value;
	}
	
	public pwfms.User_detail getAdded_by() {
		return added_by;
	}
	
	public void setTask_assigned_to(pwfms.User_detail value) {
		this.task_assigned_to = value;
	}
	
	public pwfms.User_detail getTask_assigned_to() {
		return task_assigned_to;
	}
	
	public void setTask_activity(java.util.Set value) {
		this.task_activity = value;
	}
	
	public java.util.Set getTask_activity() {
		return task_activity;
	}
	
	
	public String toString() {
		return String.valueOf(getTask_id());
	}
	
}
