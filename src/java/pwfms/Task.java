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
			if(getProcess() != null) {
				getProcess().getTask().remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().getTask().remove(this);
			}
			
			if(getAdded_by() != null) {
				getAdded_by().getTask().remove(this);
			}
			
			if(getTask_assigned_to() != null) {
				getTask_assigned_to().getTask1().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getTask().remove(this);
			}
			
			if(getEntity_detail() != null) {
				getEntity_detail().getTask().remove(this);
			}
			
			pwfms.Task_data_element[] lTask_data_elements = (pwfms.Task_data_element[])getTask_data_element().toArray(new pwfms.Task_data_element[getTask_data_element().size()]);
			for(int i = 0; i < lTask_data_elements.length; i++) {
				lTask_data_elements[i].setTask(null);
			}
			pwfms.Task_document[] lTask_documents = (pwfms.Task_document[])getTask_document().toArray(new pwfms.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setTask(null);
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
			if(getProcess() != null) {
				getProcess().getTask().remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().getTask().remove(this);
			}
			
			if(getAdded_by() != null) {
				getAdded_by().getTask().remove(this);
			}
			
			if(getTask_assigned_to() != null) {
				getTask_assigned_to().getTask1().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getTask().remove(this);
			}
			
			if(getEntity_detail() != null) {
				getEntity_detail().getTask().remove(this);
			}
			
			pwfms.Task_data_element[] lTask_data_elements = (pwfms.Task_data_element[])getTask_data_element().toArray(new pwfms.Task_data_element[getTask_data_element().size()]);
			for(int i = 0; i < lTask_data_elements.length; i++) {
				lTask_data_elements[i].setTask(null);
			}
			pwfms.Task_document[] lTask_documents = (pwfms.Task_document[])getTask_document().toArray(new pwfms.Task_document[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setTask(null);
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
	
	@ManyToOne(targetEntity=pwfms.Process.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="process_id", referencedColumnName="process_id", nullable=false) })	
	private pwfms.Process process;
	
	@ManyToOne(targetEntity=pwfms.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private pwfms.Activity activity;
	
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
	@JoinColumns({ @JoinColumn(name="added_by", referencedColumnName="user_detail_id", nullable=false) })	
	private pwfms.User_detail added_by;
	
	@ManyToOne(targetEntity=pwfms.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_assigned_to", referencedColumnName="user_detail_id", nullable=false) })	
	private pwfms.User_detail task_assigned_to;
	
	@Column(name="due_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date due_date;
	
	@Column(name="flag_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date flag_date;
	
	@ManyToOne(targetEntity=pwfms.Outcome.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="outcome_id", referencedColumnName="outcome_id", nullable=false) })	
	private pwfms.Outcome outcome;
	
	@ManyToOne(targetEntity=pwfms.Entity_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="entity_id", referencedColumnName="entity_detail_id", nullable=false) })	
	private pwfms.Entity_detail entity_detail;
	
	@Column(name="comment", nullable=true, length=250)	
	private String comment;
	
	@OneToMany(mappedBy="task", targetEntity=pwfms.Task_data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_data_element = new java.util.HashSet();
	
	@OneToMany(mappedBy="task", targetEntity=pwfms.Task_document.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_document = new java.util.HashSet();
	
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
	
	public void setDue_date(java.util.Date value) {
		this.due_date = value;
	}
	
	public java.util.Date getDue_date() {
		return due_date;
	}
	
	public void setFlag_date(java.util.Date value) {
		this.flag_date = value;
	}
	
	public java.util.Date getFlag_date() {
		return flag_date;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setActivity(pwfms.Activity value) {
		this.activity = value;
	}
	
	public pwfms.Activity getActivity() {
		return activity;
	}
	
	public void setProcess(pwfms.Process value) {
		this.process = value;
	}
	
	public pwfms.Process getProcess() {
		return process;
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
	
	public void setOutcome(pwfms.Outcome value) {
		this.outcome = value;
	}
	
	public pwfms.Outcome getOutcome() {
		return outcome;
	}
	
	public void setEntity_detail(pwfms.Entity_detail value) {
		this.entity_detail = value;
	}
	
	public pwfms.Entity_detail getEntity_detail() {
		return entity_detail;
	}
	
	public void setTask_data_element(java.util.Set value) {
		this.task_data_element = value;
	}
	
	public java.util.Set getTask_data_element() {
		return task_data_element;
	}
	
	
	public void setTask_document(java.util.Set value) {
		this.task_document = value;
	}
	
	public java.util.Set getTask_document() {
		return task_document;
	}
	
	
	public String toString() {
		return String.valueOf(getTask_id());
	}
	
}
