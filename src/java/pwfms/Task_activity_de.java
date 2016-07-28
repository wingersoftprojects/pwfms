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
@Table(name="task_activity_de")
public class Task_activity_de implements Serializable {
	public Task_activity_de() {
	}
	
	public static Task_activity_de loadTask_activity_deByORMID(int task_activity_de_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_deByORMID(session, task_activity_de_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de getTask_activity_deByORMID(int task_activity_de_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_activity_deByORMID(session, task_activity_de_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByORMID(int task_activity_de_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_deByORMID(session, task_activity_de_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de getTask_activity_deByORMID(int task_activity_de_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_activity_deByORMID(session, task_activity_de_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByORMID(PersistentSession session, int task_activity_de_id) throws PersistentException {
		try {
			return (Task_activity_de) session.load(pwfms.Task_activity_de.class, new Integer(task_activity_de_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de getTask_activity_deByORMID(PersistentSession session, int task_activity_de_id) throws PersistentException {
		try {
			return (Task_activity_de) session.get(pwfms.Task_activity_de.class, new Integer(task_activity_de_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByORMID(PersistentSession session, int task_activity_de_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_activity_de) session.load(pwfms.Task_activity_de.class, new Integer(task_activity_de_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de getTask_activity_deByORMID(PersistentSession session, int task_activity_de_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_activity_de) session.get(pwfms.Task_activity_de.class, new Integer(task_activity_de_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity_de(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_activity_de(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity_de(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_activity_de(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de[] listTask_activity_deByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_activity_deByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de[] listTask_activity_deByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_activity_deByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity_de(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_de as Task_activity_de");
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
	
	public static List queryTask_activity_de(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_de as Task_activity_de");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_activity_de", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de[] listTask_activity_deByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask_activity_de(session, condition, orderBy);
			return (Task_activity_de[]) list.toArray(new Task_activity_de[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de[] listTask_activity_deByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask_activity_de(session, condition, orderBy, lockMode);
			return (Task_activity_de[]) list.toArray(new Task_activity_de[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_deByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_deByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task_activity_de[] task_activity_des = listTask_activity_deByQuery(session, condition, orderBy);
		if (task_activity_des != null && task_activity_des.length > 0)
			return task_activity_des[0];
		else
			return null;
	}
	
	public static Task_activity_de loadTask_activity_deByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task_activity_de[] task_activity_des = listTask_activity_deByQuery(session, condition, orderBy, lockMode);
		if (task_activity_des != null && task_activity_des.length > 0)
			return task_activity_des[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTask_activity_deByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_activity_deByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_activity_deByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_activity_deByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_activity_deByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_de as Task_activity_de");
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
	
	public static java.util.Iterator iterateTask_activity_deByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_de as Task_activity_de");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_activity_de", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_de loadTask_activity_deByCriteria(Task_activity_deCriteria task_activity_deCriteria) {
		Task_activity_de[] task_activity_des = listTask_activity_deByCriteria(task_activity_deCriteria);
		if(task_activity_des == null || task_activity_des.length == 0) {
			return null;
		}
		return task_activity_des[0];
	}
	
	public static Task_activity_de[] listTask_activity_deByCriteria(Task_activity_deCriteria task_activity_deCriteria) {
		return task_activity_deCriteria.listTask_activity_de();
	}
	
	public static Task_activity_de createTask_activity_de() {
		return new pwfms.Task_activity_de();
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
			if(getTask_activity() != null) {
				getTask_activity().getTask_activity_de().remove(this);
			}
			
			if(getData_element() != null) {
				getData_element().getTask_activity_de().remove(this);
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
			if(getTask_activity() != null) {
				getTask_activity().getTask_activity_de().remove(this);
			}
			
			if(getData_element() != null) {
				getData_element().getTask_activity_de().remove(this);
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
	
	@Column(name="task_activity_de_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_TASK_ACTIVITY_DE_TASK_ACTIVITY_DE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_TASK_ACTIVITY_DE_TASK_ACTIVITY_DE_ID_GENERATOR", strategy="native")	
	private int task_activity_de_id;
	
	@ManyToOne(targetEntity=pwfms.Task_activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_activity_id", referencedColumnName="task_activity_id", nullable=false) })	
	private pwfms.Task_activity task_activity;
	
	@ManyToOne(targetEntity=pwfms.Data_element.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="data_element_id", referencedColumnName="data_element_id", nullable=false) })	
	private pwfms.Data_element data_element;
	
	@Column(name="data_element_value", nullable=false, length=250)	
	private String data_element_value;
	
	private void setTask_activity_de_id(int value) {
		this.task_activity_de_id = value;
	}
	
	public int getTask_activity_de_id() {
		return task_activity_de_id;
	}
	
	public int getORMID() {
		return getTask_activity_de_id();
	}
	
	public void setData_element_value(String value) {
		this.data_element_value = value;
	}
	
	public String getData_element_value() {
		return data_element_value;
	}
	
	public void setData_element(pwfms.Data_element value) {
		this.data_element = value;
	}
	
	public pwfms.Data_element getData_element() {
		return data_element;
	}
	
	public void setTask_activity(pwfms.Task_activity value) {
		this.task_activity = value;
	}
	
	public pwfms.Task_activity getTask_activity() {
		return task_activity;
	}
	
	public String toString() {
		return String.valueOf(getTask_activity_de_id());
	}
	
}
