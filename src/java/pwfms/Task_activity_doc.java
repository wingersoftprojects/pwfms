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
@Table(name="task_activity_doc")
public class Task_activity_doc implements Serializable {
	public Task_activity_doc() {
	}
	
	public static Task_activity_doc loadTask_activity_docByORMID(int task_activity_doc_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_docByORMID(session, task_activity_doc_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc getTask_activity_docByORMID(int task_activity_doc_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_activity_docByORMID(session, task_activity_doc_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByORMID(int task_activity_doc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_docByORMID(session, task_activity_doc_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc getTask_activity_docByORMID(int task_activity_doc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getTask_activity_docByORMID(session, task_activity_doc_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByORMID(PersistentSession session, int task_activity_doc_id) throws PersistentException {
		try {
			return (Task_activity_doc) session.load(pwfms.Task_activity_doc.class, new Integer(task_activity_doc_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc getTask_activity_docByORMID(PersistentSession session, int task_activity_doc_id) throws PersistentException {
		try {
			return (Task_activity_doc) session.get(pwfms.Task_activity_doc.class, new Integer(task_activity_doc_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByORMID(PersistentSession session, int task_activity_doc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_activity_doc) session.load(pwfms.Task_activity_doc.class, new Integer(task_activity_doc_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc getTask_activity_docByORMID(PersistentSession session, int task_activity_doc_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Task_activity_doc) session.get(pwfms.Task_activity_doc.class, new Integer(task_activity_doc_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity_doc(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_activity_doc(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity_doc(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryTask_activity_doc(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc[] listTask_activity_docByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_activity_docByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc[] listTask_activity_docByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listTask_activity_docByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTask_activity_doc(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_doc as Task_activity_doc");
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
	
	public static List queryTask_activity_doc(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_doc as Task_activity_doc");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_activity_doc", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc[] listTask_activity_docByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTask_activity_doc(session, condition, orderBy);
			return (Task_activity_doc[]) list.toArray(new Task_activity_doc[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc[] listTask_activity_docByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTask_activity_doc(session, condition, orderBy, lockMode);
			return (Task_activity_doc[]) list.toArray(new Task_activity_doc[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_docByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadTask_activity_docByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Task_activity_doc[] task_activity_docs = listTask_activity_docByQuery(session, condition, orderBy);
		if (task_activity_docs != null && task_activity_docs.length > 0)
			return task_activity_docs[0];
		else
			return null;
	}
	
	public static Task_activity_doc loadTask_activity_docByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Task_activity_doc[] task_activity_docs = listTask_activity_docByQuery(session, condition, orderBy, lockMode);
		if (task_activity_docs != null && task_activity_docs.length > 0)
			return task_activity_docs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTask_activity_docByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_activity_docByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_activity_docByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateTask_activity_docByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTask_activity_docByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_doc as Task_activity_doc");
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
	
	public static java.util.Iterator iterateTask_activity_docByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Task_activity_doc as Task_activity_doc");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Task_activity_doc", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Task_activity_doc loadTask_activity_docByCriteria(Task_activity_docCriteria task_activity_docCriteria) {
		Task_activity_doc[] task_activity_docs = listTask_activity_docByCriteria(task_activity_docCriteria);
		if(task_activity_docs == null || task_activity_docs.length == 0) {
			return null;
		}
		return task_activity_docs[0];
	}
	
	public static Task_activity_doc[] listTask_activity_docByCriteria(Task_activity_docCriteria task_activity_docCriteria) {
		return task_activity_docCriteria.listTask_activity_doc();
	}
	
	public static Task_activity_doc createTask_activity_doc() {
		return new pwfms.Task_activity_doc();
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
				getTask_activity().getTask_activity_doc().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getTask_activity_doc().remove(this);
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
				getTask_activity().getTask_activity_doc().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getTask_activity_doc().remove(this);
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
	
	@Column(name="task_activity_doc_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_TASK_ACTIVITY_DOC_TASK_ACTIVITY_DOC_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_TASK_ACTIVITY_DOC_TASK_ACTIVITY_DOC_ID_GENERATOR", strategy="native")	
	private int task_activity_doc_id;
	
	@ManyToOne(targetEntity=pwfms.Task_activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="task_activity_id", referencedColumnName="task_activity_id", nullable=false) })	
	private pwfms.Task_activity task_activity;
	
	@ManyToOne(targetEntity=pwfms.Document_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="document_type_id", referencedColumnName="document_type_id", nullable=false) })	
	private pwfms.Document_type document_type;
	
	@Column(name="document_value", nullable=false)	
	private java.sql.Blob document_value;
	
	private void setTask_activity_doc_id(int value) {
		this.task_activity_doc_id = value;
	}
	
	public int getTask_activity_doc_id() {
		return task_activity_doc_id;
	}
	
	public int getORMID() {
		return getTask_activity_doc_id();
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
	
	public void setTask_activity(pwfms.Task_activity value) {
		this.task_activity = value;
	}
	
	public pwfms.Task_activity getTask_activity() {
		return task_activity;
	}
	
	public String toString() {
		return String.valueOf(getTask_activity_doc_id());
	}
	
}
