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
@Table(name="document_type")
public class Document_type implements Serializable {
	public Document_type() {
	}
	
	public static Document_type loadDocument_typeByORMID(int document_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadDocument_typeByORMID(session, document_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(int document_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getDocument_typeByORMID(session, document_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByORMID(int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadDocument_typeByORMID(session, document_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getDocument_typeByORMID(session, document_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByORMID(PersistentSession session, int document_type_id) throws PersistentException {
		try {
			return (Document_type) session.load(pwfms.Document_type.class, new Integer(document_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(PersistentSession session, int document_type_id) throws PersistentException {
		try {
			return (Document_type) session.get(pwfms.Document_type.class, new Integer(document_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByORMID(PersistentSession session, int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Document_type) session.load(pwfms.Document_type.class, new Integer(document_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type getDocument_typeByORMID(PersistentSession session, int document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Document_type) session.get(pwfms.Document_type.class, new Integer(document_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryDocument_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryDocument_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listDocument_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listDocument_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocument_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Document_type as Document_type");
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
	
	public static List queryDocument_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Document_type as Document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Document_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDocument_type(session, condition, orderBy);
			return (Document_type[]) list.toArray(new Document_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type[] listDocument_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDocument_type(session, condition, orderBy, lockMode);
			return (Document_type[]) list.toArray(new Document_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadDocument_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadDocument_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Document_type[] document_types = listDocument_typeByQuery(session, condition, orderBy);
		if (document_types != null && document_types.length > 0)
			return document_types[0];
		else
			return null;
	}
	
	public static Document_type loadDocument_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Document_type[] document_types = listDocument_typeByQuery(session, condition, orderBy, lockMode);
		if (document_types != null && document_types.length > 0)
			return document_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateDocument_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateDocument_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocument_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Document_type as Document_type");
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
	
	public static java.util.Iterator iterateDocument_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Document_type as Document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Document_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Document_type loadDocument_typeByCriteria(Document_typeCriteria document_typeCriteria) {
		Document_type[] document_types = listDocument_typeByCriteria(document_typeCriteria);
		if(document_types == null || document_types.length == 0) {
			return null;
		}
		return document_types[0];
	}
	
	public static Document_type[] listDocument_typeByCriteria(Document_typeCriteria document_typeCriteria) {
		return document_typeCriteria.listDocument_type();
	}
	
	public static Document_type createDocument_type() {
		return new pwfms.Document_type();
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
			if(getCompany() != null) {
				getCompany().getDocument_type().remove(this);
			}
			
			pwfms.Activity_document_type[] lActivity_document_types = (pwfms.Activity_document_type[])getActivity_document_type().toArray(new pwfms.Activity_document_type[getActivity_document_type().size()]);
			for(int i = 0; i < lActivity_document_types.length; i++) {
				lActivity_document_types[i].setDocument_type(null);
			}
			pwfms.Task_activity_doc[] lTask_documents = (pwfms.Task_activity_doc[])getTask_document().toArray(new pwfms.Task_activity_doc[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setDocument_type(null);
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
			if(getCompany() != null) {
				getCompany().getDocument_type().remove(this);
			}
			
			pwfms.Activity_document_type[] lActivity_document_types = (pwfms.Activity_document_type[])getActivity_document_type().toArray(new pwfms.Activity_document_type[getActivity_document_type().size()]);
			for(int i = 0; i < lActivity_document_types.length; i++) {
				lActivity_document_types[i].setDocument_type(null);
			}
			pwfms.Task_activity_doc[] lTask_documents = (pwfms.Task_activity_doc[])getTask_document().toArray(new pwfms.Task_activity_doc[getTask_document().size()]);
			for(int i = 0; i < lTask_documents.length; i++) {
				lTask_documents[i].setDocument_type(null);
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
	
	@Column(name="document_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_DOCUMENT_TYPE_DOCUMENT_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_DOCUMENT_TYPE_DOCUMENT_TYPE_ID_GENERATOR", strategy="native")	
	private int document_type_id;
	
	@Column(name="document_type_name", nullable=false, unique=true, length=50)	
	private String document_type_name;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="document_type", targetEntity=pwfms.Activity_document_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_document_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="document_type", targetEntity=pwfms.Task_activity_doc.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_document = new java.util.HashSet();
	
	private void setDocument_type_id(int value) {
		this.document_type_id = value;
	}
	
	public int getDocument_type_id() {
		return document_type_id;
	}
	
	public int getORMID() {
		return getDocument_type_id();
	}
	
	public void setDocument_type_name(String value) {
		this.document_type_name = value;
	}
	
	public String getDocument_type_name() {
		return document_type_name;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setActivity_document_type(java.util.Set value) {
		this.activity_document_type = value;
	}
	
	public java.util.Set getActivity_document_type() {
		return activity_document_type;
	}
	
	
	public void setTask_document(java.util.Set value) {
		this.task_document = value;
	}
	
	public java.util.Set getTask_document() {
		return task_document;
	}
	
	
	public String toString() {
		return String.valueOf(getDocument_type_id());
	}
	
}
