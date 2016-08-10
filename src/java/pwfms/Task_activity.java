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
@Table(name="task_activity")
public class Task_activity implements Serializable {
	public Task_activity() {
	}
	
	public static Task_activity loadTask_activityByORMID(int task_activity_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activityByORMID(session, task_activity_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity getTask_activityByORMID(int task_activity_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_activityByORMID(session, task_activity_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByORMID(int task_activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activityByORMID(session, task_activity_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity getTask_activityByORMID(int task_activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_activityByORMID(session, task_activity_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByORMID(PersistentSession session, int task_activity_id) throws PersistentException {
		try {
			return (Task_activity) session.load(pwfms.Task_activity.class, new Integer(task_activity_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity getTask_activityByORMID(PersistentSession session, int task_activity_id) throws PersistentException {
		try {
			return (Task_activity) session.get(pwfms.Task_activity.class, new Integer(task_activity_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByORMID(PersistentSession session, int task_activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_activity) session.load(pwfms.Task_activity.class, new Integer(task_activity_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity getTask_activityByORMID(PersistentSession session, int task_activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_activity) session.get(pwfms.Task_activity.class, new Integer(task_activity_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_activity(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_activity(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity[] listTask_activityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_activityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity[] listTask_activityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_activityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity as Task_activity");
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
	
	public static List queryTask_activity(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity as Task_activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_activity", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity[] listTask_activityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask_activity(session, condition, orderBy);
			return (Task_activity[]) list.toArray(new Task_activity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity[] listTask_activityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask_activity(session, condition, orderBy, lockMode);
			return (Task_activity[]) list.toArray(new Task_activity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task_activity[] task_activitys = listTask_activityByQuery(session, condition, orderBy);
		if (task_activitys != null && task_activitys.length > 0)
			return task_activitys[0];
		else
			return null;
	}
	
	public static Task_activity loadTask_activityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task_activity[] task_activitys = listTask_activityByQuery(session, condition, orderBy, lockMode);
		if (task_activitys != null && task_activitys.length > 0)
			return task_activitys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTask_activityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_activityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_activityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_activityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_activityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity as Task_activity");
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
	
	public static java.util.Iterator iterateTask_activityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity as Task_activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_activity", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity loadTask_activityByCriteria(Task_activityCriteria task_activityCriteria) {
		Task_activity[] task_activitys = listTask_activityByCriteria(task_activityCriteria);
		if(task_activitys == null || task_activitys.length == 0) {
			return null;
		}
		return task_activitys[0];
	}
	
	public static Task_activity[] listTask_activityByCriteria(Task_activityCriteria task_activityCriteria) {
		return task_activityCriteria.listTask_activity();
	}
	
	public static Task_activity createTask_activity() {
		return new pwfms.Task_activity();
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
			if(getTask() != null) {
				getTask().getTask_activity().remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().getTask_activity().remove(this);
			}
			
			if(getActivity_assigned_to() != null) {
				getActivity_assigned_to().getTask_activity().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getTask_activity().remove(this);
			}
			
			if(getEntity_type() != null) {
				getEntity_type().getTask_activity().remove(this);
			}
			
			if(getEntity_instance() != null) {
				getEntity_instance().getTask_activity().remove(this);
			}
			
			pwfms.Task_activity_de[] lTask_activity_des = (pwfms.Task_activity_de[])getTask_activity_de().toArray(new pwfms.Task_activity_de[getTask_activity_de().size()]);
			for(int i = 0; i < lTask_activity_des.length; i++) {
				lTask_activity_des[i].setTask_activity(null);
			}
			pwfms.Task_activity_doc[] lTask_activity_docs = (pwfms.Task_activity_doc[])getTask_activity_doc().toArray(new pwfms.Task_activity_doc[getTask_activity_doc().size()]);
			for(int i = 0; i < lTask_activity_docs.length; i++) {
				lTask_activity_docs[i].setTask_activity(null);
			}
			pwfms.Task_activity_entity[] lTask_activity_entitys = (pwfms.Task_activity_entity[])getTask_activity_entity().toArray(new pwfms.Task_activity_entity[getTask_activity_entity().size()]);
			for(int i = 0; i < lTask_activity_entitys.length; i++) {
				lTask_activity_entitys[i].setTask_activity(null);
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
			if(getTask() != null) {
				getTask().getTask_activity().remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().getTask_activity().remove(this);
			}
			
			if(getActivity_assigned_to() != null) {
				getActivity_assigned_to().getTask_activity().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getTask_activity().remove(this);
			}
			
			if(getEntity_type() != null) {
				getEntity_type().getTask_activity().remove(this);
			}
			
			if(getEntity_instance() != null) {
				getEntity_instance().getTask_activity().remove(this);
			}
			
			pwfms.Task_activity_de[] lTask_activity_des = (pwfms.Task_activity_de[])getTask_activity_de().toArray(new pwfms.Task_activity_de[getTask_activity_de().size()]);
			for(int i = 0; i < lTask_activity_des.length; i++) {
				lTask_activity_des[i].setTask_activity(null);
			}
			pwfms.Task_activity_doc[] lTask_activity_docs = (pwfms.Task_activity_doc[])getTask_activity_doc().toArray(new pwfms.Task_activity_doc[getTask_activity_doc().size()]);
			for(int i = 0; i < lTask_activity_docs.length; i++) {
				lTask_activity_docs[i].setTask_activity(null);
			}
			pwfms.Task_activity_entity[] lTask_activity_entitys = (pwfms.Task_activity_entity[])getTask_activity_entity().toArray(new pwfms.Task_activity_entity[getTask_activity_entity().size()]);
			for(int i = 0; i < lTask_activity_entitys.length; i++) {
				lTask_activity_entitys[i].setTask_activity(null);
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
	
	@Column(name="task_activity_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_TASK_ACTIVITY_TASK_ACTIVITY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_TASK_ACTIVITY_TASK_ACTIVITY_ID_GENERATOR", strategy="native")	
	private int task_activity_id;
	
	@ManyToOne(targetEntity=pwfms.Task.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_id", referencedColumnName="task_id", nullable=false) })	
	private pwfms.Task task;
	
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
	
	@Column(name="added_by", nullable=true, length=11)	
	private Integer added_by;
	
	@ManyToOne(targetEntity=pwfms.User_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_assigned_to", referencedColumnName="user_detail_id") })	
	private pwfms.User_detail activity_assigned_to;
	
	@Column(name="due_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date due_date;
	
	@Column(name="flag_date", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date flag_date;
	
	@ManyToOne(targetEntity=pwfms.Outcome.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="outcome_id", referencedColumnName="outcome_id") })	
	private pwfms.Outcome outcome;
	
	@ManyToOne(targetEntity=pwfms.Entity_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="entity_type_id", referencedColumnName="entity_type_id") })	
	private pwfms.Entity_type entity_type;
	
	@Column(name="status", nullable=true, length=100)	
	private String status;
	
	@Column(name="comment", nullable=true, length=250)	
	private String comment;
	
	@ManyToOne(targetEntity=pwfms.Entity_instance.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="entity_instance_id", referencedColumnName="entity_instance_id") })	
	private pwfms.Entity_instance entity_instance;
	
	@OneToMany(mappedBy="task_activity", targetEntity=pwfms.Task_activity_de.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="task_activity", targetEntity=pwfms.Task_activity_doc.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity_doc = new java.util.HashSet();
	
	@OneToMany(mappedBy="task_activity", targetEntity=pwfms.Task_activity_entity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity_entity = new java.util.HashSet();
	
	private void setTask_activity_id(int value) {
		this.task_activity_id = value;
	}
	
	public int getTask_activity_id() {
		return task_activity_id;
	}
	
	public int getORMID() {
		return getTask_activity_id();
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
	
	public void setAdded_by(int value) {
		setAdded_by(new Integer(value));
	}
	
	public void setAdded_by(Integer value) {
		this.added_by = value;
	}
	
	public Integer getAdded_by() {
		return added_by;
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
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setTask(pwfms.Task value) {
		this.task = value;
	}
	
	public pwfms.Task getTask() {
		return task;
	}
	
	public void setEntity_type(pwfms.Entity_type value) {
		this.entity_type = value;
	}
	
	public pwfms.Entity_type getEntity_type() {
		return entity_type;
	}
	
	public void setOutcome(pwfms.Outcome value) {
		this.outcome = value;
	}
	
	public pwfms.Outcome getOutcome() {
		return outcome;
	}
	
	public void setActivity(pwfms.Activity value) {
		this.activity = value;
	}
	
	public pwfms.Activity getActivity() {
		return activity;
	}
	
	public void setActivity_assigned_to(pwfms.User_detail value) {
		this.activity_assigned_to = value;
	}
	
	public pwfms.User_detail getActivity_assigned_to() {
		return activity_assigned_to;
	}
	
	public void setEntity_instance(pwfms.Entity_instance value) {
		this.entity_instance = value;
	}
	
	public pwfms.Entity_instance getEntity_instance() {
		return entity_instance;
	}
	
	public void setTask_activity_de(java.util.Set value) {
		this.task_activity_de = value;
	}
	
	public java.util.Set getTask_activity_de() {
		return task_activity_de;
	}
	
	
	public void setTask_activity_doc(java.util.Set value) {
		this.task_activity_doc = value;
	}
	
	public java.util.Set getTask_activity_doc() {
		return task_activity_doc;
	}
	
	
	public void setTask_activity_entity(java.util.Set value) {
		this.task_activity_entity = value;
	}
	
	public java.util.Set getTask_activity_entity() {
		return task_activity_entity;
	}
	
	
	public String toString() {
		return String.valueOf(getTask_activity_id());
	}
	
}
