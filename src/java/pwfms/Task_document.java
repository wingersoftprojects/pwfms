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
@Table(name="task_document")
public class Task_document implements Serializable {
	public Task_document() {
	}
	
	public static Task_document loadTask_documentByORMID(int task_document_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_documentByORMID(session, task_document_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(int task_document_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_documentByORMID(session, task_document_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByORMID(int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_documentByORMID(session, task_document_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_documentByORMID(session, task_document_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByORMID(PersistentSession session, int task_document_id) throws PersistentException {
		try {
			return (Task_document) session.load(pwfms.Task_document.class, new Integer(task_document_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(PersistentSession session, int task_document_id) throws PersistentException {
		try {
			return (Task_document) session.get(pwfms.Task_document.class, new Integer(task_document_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByORMID(PersistentSession session, int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_document) session.load(pwfms.Task_document.class, new Integer(task_document_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document getTask_documentByORMID(PersistentSession session, int task_document_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_document) session.get(pwfms.Task_document.class, new Integer(task_document_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_document(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_document(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_document(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_document(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_documentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_documentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_document(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_document as Task_document");
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
	
	public static List queryTask_document(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_document as Task_document");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_document", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask_document(session, condition, orderBy);
			return (Task_document[]) list.toArray(new Task_document[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document[] listTask_documentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask_document(session, condition, orderBy, lockMode);
			return (Task_document[]) list.toArray(new Task_document[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_documentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_documentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task_document[] task_documents = listTask_documentByQuery(session, condition, orderBy);
		if (task_documents != null && task_documents.length > 0)
			return task_documents[0];
		else
			return null;
	}
	
	public static Task_document loadTask_documentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task_document[] task_documents = listTask_documentByQuery(session, condition, orderBy, lockMode);
		if (task_documents != null && task_documents.length > 0)
			return task_documents[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTask_documentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_documentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_documentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_documentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_documentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_document as Task_document");
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
	
	public static java.util.Iterator iterateTask_documentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_document as Task_document");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_document", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_document loadTask_documentByCriteria(Task_documentCriteria task_documentCriteria) {
		Task_document[] task_documents = listTask_documentByCriteria(task_documentCriteria);
		if(task_documents == null || task_documents.length == 0) {
			return null;
		}
		return task_documents[0];
	}
	
	public static Task_document[] listTask_documentByCriteria(Task_documentCriteria task_documentCriteria) {
		return task_documentCriteria.listTask_document();
	}
	
	public static Task_document createTask_document() {
		return new pwfms.Task_document();
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
				getTask().getTask_document().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getTask_document().remove(this);
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
				getTask().getTask_document().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getTask_document().remove(this);
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
	
	@Column(name="task_document_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_TASK_DOCUMENT_TASK_DOCUMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_TASK_DOCUMENT_TASK_DOCUMENT_ID_GENERATOR", strategy="native")	
	private int task_document_id;
	
	@ManyToOne(targetEntity=pwfms.Task.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_id", referencedColumnName="task_id", nullable=false) })	
	private pwfms.Task task;
	
	@ManyToOne(targetEntity=pwfms.Document_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="document_type_id", referencedColumnName="document_type_id", nullable=false) })	
	private pwfms.Document_type document_type;
	
	@Column(name="document_value", nullable=false)	
	private java.sql.Blob document_value;
	
	private void setTask_document_id(int value) {
		this.task_document_id = value;
	}
	
	public int getTask_document_id() {
		return task_document_id;
	}
	
	public int getORMID() {
		return getTask_document_id();
	}
	
	public void setDocument_value(java.sql.Blob value) {
		this.document_value = value;
	}
	
	public java.sql.Blob getDocument_value() {
		return document_value;
	}
	
	public void setDocument_type(pwfms.Document_type value) {
		this.document_type = value;
	}
	
	public pwfms.Document_type getDocument_type() {
		return document_type;
	}
	
	public void setTask(pwfms.Task value) {
		this.task = value;
	}
	
	public pwfms.Task getTask() {
		return task;
	}
	
	public String toString() {
		return String.valueOf(getTask_document_id());
	}
	
}
