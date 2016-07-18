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
@Table(name="task_data_element")
public class Task_data_element implements Serializable {
	public Task_data_element() {
	}
	
	public static Task_data_element loadTask_data_elementByORMID(int task_data_element_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_data_elementByORMID(session, task_data_element_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element getTask_data_elementByORMID(int task_data_element_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_data_elementByORMID(session, task_data_element_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByORMID(int task_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_data_elementByORMID(session, task_data_element_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element getTask_data_elementByORMID(int task_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_data_elementByORMID(session, task_data_element_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByORMID(PersistentSession session, int task_data_element_id) throws PersistentException {
		try {
			return (Task_data_element) session.load(pwfms.Task_data_element.class, new Integer(task_data_element_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element getTask_data_elementByORMID(PersistentSession session, int task_data_element_id) throws PersistentException {
		try {
			return (Task_data_element) session.get(pwfms.Task_data_element.class, new Integer(task_data_element_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByORMID(PersistentSession session, int task_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_data_element) session.load(pwfms.Task_data_element.class, new Integer(task_data_element_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element getTask_data_elementByORMID(PersistentSession session, int task_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_data_element) session.get(pwfms.Task_data_element.class, new Integer(task_data_element_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_data_element(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_data_element(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_data_element(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_data_element(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element[] listTask_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element[] listTask_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_data_element(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_data_element as Task_data_element");
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
	
	public static List queryTask_data_element(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_data_element as Task_data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_data_element", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element[] listTask_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask_data_element(session, condition, orderBy);
			return (Task_data_element[]) list.toArray(new Task_data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element[] listTask_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask_data_element(session, condition, orderBy, lockMode);
			return (Task_data_element[]) list.toArray(new Task_data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task_data_element[] task_data_elements = listTask_data_elementByQuery(session, condition, orderBy);
		if (task_data_elements != null && task_data_elements.length > 0)
			return task_data_elements[0];
		else
			return null;
	}
	
	public static Task_data_element loadTask_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task_data_element[] task_data_elements = listTask_data_elementByQuery(session, condition, orderBy, lockMode);
		if (task_data_elements != null && task_data_elements.length > 0)
			return task_data_elements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTask_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_data_element as Task_data_element");
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
	
	public static java.util.Iterator iterateTask_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_data_element as Task_data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_data_element", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_data_element loadTask_data_elementByCriteria(Task_data_elementCriteria task_data_elementCriteria) {
		Task_data_element[] task_data_elements = listTask_data_elementByCriteria(task_data_elementCriteria);
		if(task_data_elements == null || task_data_elements.length == 0) {
			return null;
		}
		return task_data_elements[0];
	}
	
	public static Task_data_element[] listTask_data_elementByCriteria(Task_data_elementCriteria task_data_elementCriteria) {
		return task_data_elementCriteria.listTask_data_element();
	}
	
	public static Task_data_element createTask_data_element() {
		return new pwfms.Task_data_element();
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
				getTask().getTask_data_element().remove(this);
			}
			
			if(getData_element() != null) {
				getData_element().getTask_data_element().remove(this);
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
				getTask().getTask_data_element().remove(this);
			}
			
			if(getData_element() != null) {
				getData_element().getTask_data_element().remove(this);
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
	
	@Column(name="task_data_element_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_TASK_DATA_ELEMENT_TASK_DATA_ELEMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_TASK_DATA_ELEMENT_TASK_DATA_ELEMENT_ID_GENERATOR", strategy="native")	
	private int task_data_element_id;
	
	@ManyToOne(targetEntity=pwfms.Task.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_id", referencedColumnName="task_id", nullable=false) })	
	private pwfms.Task task;
	
	@ManyToOne(targetEntity=pwfms.Data_element.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="data_element_id", referencedColumnName="data_element_id", nullable=false) })	
	private pwfms.Data_element data_element;
	
	@Column(name="data_element_value", nullable=false, length=250)	
	private String data_element_value;
	
	private void setTask_data_element_id(int value) {
		this.task_data_element_id = value;
	}
	
	public int getTask_data_element_id() {
		return task_data_element_id;
	}
	
	public int getORMID() {
		return getTask_data_element_id();
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
	
	public void setTask(pwfms.Task value) {
		this.task = value;
	}
	
	public pwfms.Task getTask() {
		return task;
	}
	
	public String toString() {
		return String.valueOf(getTask_data_element_id());
	}
	
}
