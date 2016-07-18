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
@Table(name="activity_entity_type")
public class Activity_entity_type implements Serializable {
	public Activity_entity_type() {
	}
	
	public static Activity_entity_type loadActivity_entity_typeByORMID(int activity_entity_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_entity_typeByORMID(session, activity_entity_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type getActivity_entity_typeByORMID(int activity_entity_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_entity_typeByORMID(session, activity_entity_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByORMID(int activity_entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_entity_typeByORMID(session, activity_entity_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type getActivity_entity_typeByORMID(int activity_entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_entity_typeByORMID(session, activity_entity_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByORMID(PersistentSession session, int activity_entity_type_id) throws PersistentException {
		try {
			return (Activity_entity_type) session.load(pwfms.Activity_entity_type.class, new Integer(activity_entity_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type getActivity_entity_typeByORMID(PersistentSession session, int activity_entity_type_id) throws PersistentException {
		try {
			return (Activity_entity_type) session.get(pwfms.Activity_entity_type.class, new Integer(activity_entity_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByORMID(PersistentSession session, int activity_entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_entity_type) session.load(pwfms.Activity_entity_type.class, new Integer(activity_entity_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type getActivity_entity_typeByORMID(PersistentSession session, int activity_entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_entity_type) session.get(pwfms.Activity_entity_type.class, new Integer(activity_entity_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_entity_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_entity_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_entity_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_entity_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type[] listActivity_entity_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_entity_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type[] listActivity_entity_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_entity_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_entity_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_entity_type as Activity_entity_type");
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
	
	public static List queryActivity_entity_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_entity_type as Activity_entity_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_entity_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type[] listActivity_entity_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity_entity_type(session, condition, orderBy);
			return (Activity_entity_type[]) list.toArray(new Activity_entity_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type[] listActivity_entity_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity_entity_type(session, condition, orderBy, lockMode);
			return (Activity_entity_type[]) list.toArray(new Activity_entity_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_entity_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_entity_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity_entity_type[] activity_entity_types = listActivity_entity_typeByQuery(session, condition, orderBy);
		if (activity_entity_types != null && activity_entity_types.length > 0)
			return activity_entity_types[0];
		else
			return null;
	}
	
	public static Activity_entity_type loadActivity_entity_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity_entity_type[] activity_entity_types = listActivity_entity_typeByQuery(session, condition, orderBy, lockMode);
		if (activity_entity_types != null && activity_entity_types.length > 0)
			return activity_entity_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivity_entity_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_entity_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_entity_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_entity_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_entity_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_entity_type as Activity_entity_type");
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
	
	public static java.util.Iterator iterateActivity_entity_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_entity_type as Activity_entity_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_entity_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_entity_type loadActivity_entity_typeByCriteria(Activity_entity_typeCriteria activity_entity_typeCriteria) {
		Activity_entity_type[] activity_entity_types = listActivity_entity_typeByCriteria(activity_entity_typeCriteria);
		if(activity_entity_types == null || activity_entity_types.length == 0) {
			return null;
		}
		return activity_entity_types[0];
	}
	
	public static Activity_entity_type[] listActivity_entity_typeByCriteria(Activity_entity_typeCriteria activity_entity_typeCriteria) {
		return activity_entity_typeCriteria.listActivity_entity_type();
	}
	
	public static Activity_entity_type createActivity_entity_type() {
		return new pwfms.Activity_entity_type();
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
				getActivity().getActivity_entity_type().remove(this);
			}
			
			if(getEntity_type() != null) {
				getEntity_type().getActivity_entity_type().remove(this);
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
				getActivity().getActivity_entity_type().remove(this);
			}
			
			if(getEntity_type() != null) {
				getEntity_type().getActivity_entity_type().remove(this);
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
	
	@Column(name="activity_entity_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ACTIVITY_ENTITY_TYPE_ACTIVITY_ENTITY_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ACTIVITY_ENTITY_TYPE_ACTIVITY_ENTITY_TYPE_ID_GENERATOR", strategy="native")	
	private int activity_entity_type_id;
	
	@ManyToOne(targetEntity=pwfms.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private pwfms.Activity activity;
	
	@ManyToOne(targetEntity=pwfms.Entity_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="entity_type_id", referencedColumnName="entity_type_id", nullable=false) })	
	private pwfms.Entity_type entity_type;
	
	@Column(name="is_mandatory", nullable=false, length=1)	
	private int is_mandatory;
	
	private void setActivity_entity_type_id(int value) {
		this.activity_entity_type_id = value;
	}
	
	public int getActivity_entity_type_id() {
		return activity_entity_type_id;
	}
	
	public int getORMID() {
		return getActivity_entity_type_id();
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
	
	public void setEntity_type(pwfms.Entity_type value) {
		this.entity_type = value;
	}
	
	public pwfms.Entity_type getEntity_type() {
		return entity_type;
	}
	
	public String toString() {
		return String.valueOf(getActivity_entity_type_id());
	}
	
}
