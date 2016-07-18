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
@Table(name="activity_document_type")
public class Activity_document_type implements Serializable {
	public Activity_document_type() {
	}
	
	public static Activity_document_type loadActivity_document_typeByORMID(int activity_document_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_document_typeByORMID(session, activity_document_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type getActivity_document_typeByORMID(int activity_document_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_document_typeByORMID(session, activity_document_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByORMID(int activity_document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_document_typeByORMID(session, activity_document_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type getActivity_document_typeByORMID(int activity_document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_document_typeByORMID(session, activity_document_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByORMID(PersistentSession session, int activity_document_type_id) throws PersistentException {
		try {
			return (Activity_document_type) session.load(pwfms.Activity_document_type.class, new Integer(activity_document_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type getActivity_document_typeByORMID(PersistentSession session, int activity_document_type_id) throws PersistentException {
		try {
			return (Activity_document_type) session.get(pwfms.Activity_document_type.class, new Integer(activity_document_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByORMID(PersistentSession session, int activity_document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_document_type) session.load(pwfms.Activity_document_type.class, new Integer(activity_document_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type getActivity_document_typeByORMID(PersistentSession session, int activity_document_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_document_type) session.get(pwfms.Activity_document_type.class, new Integer(activity_document_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_document_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_document_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_document_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_document_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type[] listActivity_document_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_document_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type[] listActivity_document_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_document_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_document_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_document_type as Activity_document_type");
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
	
	public static List queryActivity_document_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_document_type as Activity_document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_document_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type[] listActivity_document_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity_document_type(session, condition, orderBy);
			return (Activity_document_type[]) list.toArray(new Activity_document_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type[] listActivity_document_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity_document_type(session, condition, orderBy, lockMode);
			return (Activity_document_type[]) list.toArray(new Activity_document_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_document_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_document_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity_document_type[] activity_document_types = listActivity_document_typeByQuery(session, condition, orderBy);
		if (activity_document_types != null && activity_document_types.length > 0)
			return activity_document_types[0];
		else
			return null;
	}
	
	public static Activity_document_type loadActivity_document_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity_document_type[] activity_document_types = listActivity_document_typeByQuery(session, condition, orderBy, lockMode);
		if (activity_document_types != null && activity_document_types.length > 0)
			return activity_document_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivity_document_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_document_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_document_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_document_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_document_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_document_type as Activity_document_type");
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
	
	public static java.util.Iterator iterateActivity_document_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_document_type as Activity_document_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_document_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_document_type loadActivity_document_typeByCriteria(Activity_document_typeCriteria activity_document_typeCriteria) {
		Activity_document_type[] activity_document_types = listActivity_document_typeByCriteria(activity_document_typeCriteria);
		if(activity_document_types == null || activity_document_types.length == 0) {
			return null;
		}
		return activity_document_types[0];
	}
	
	public static Activity_document_type[] listActivity_document_typeByCriteria(Activity_document_typeCriteria activity_document_typeCriteria) {
		return activity_document_typeCriteria.listActivity_document_type();
	}
	
	public static Activity_document_type createActivity_document_type() {
		return new pwfms.Activity_document_type();
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
			if(getActivity() != null) {
				getActivity().getActivity_document_type().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getActivity_document_type().remove(this);
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
			if(getActivity() != null) {
				getActivity().getActivity_document_type().remove(this);
			}
			
			if(getDocument_type() != null) {
				getDocument_type().getActivity_document_type().remove(this);
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
	
	@Column(name="activity_document_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ACTIVITY_DOCUMENT_TYPE_ACTIVITY_DOCUMENT_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ACTIVITY_DOCUMENT_TYPE_ACTIVITY_DOCUMENT_TYPE_ID_GENERATOR", strategy="native")	
	private int activity_document_type_id;
	
	@ManyToOne(targetEntity=pwfms.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private pwfms.Activity activity;
	
	@ManyToOne(targetEntity=pwfms.Document_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="document_type_id", referencedColumnName="document_type_id", nullable=false) })	
	private pwfms.Document_type document_type;
	
	@Column(name="is_mandatory", nullable=false, length=1)	
	private int is_mandatory;
	
	private void setActivity_document_type_id(int value) {
		this.activity_document_type_id = value;
	}
	
	public int getActivity_document_type_id() {
		return activity_document_type_id;
	}
	
	public int getORMID() {
		return getActivity_document_type_id();
	}
	
	public void setIs_mandatory(int value) {
		this.is_mandatory = value;
	}
	
	public int getIs_mandatory() {
		return is_mandatory;
	}
	
	public void setActivity(pwfms.Activity value) {
		this.activity = value;
	}
	
	public pwfms.Activity getActivity() {
		return activity;
	}
	
	public void setDocument_type(pwfms.Document_type value) {
		this.document_type = value;
	}
	
	public pwfms.Document_type getDocument_type() {
		return document_type;
	}
	
	public String toString() {
		return String.valueOf(getActivity_document_type_id());
	}
	
}
