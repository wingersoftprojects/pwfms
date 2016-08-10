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
@Table(name="entity_instance")
public class Entity_instance implements Serializable {
	public Entity_instance() {
	}
	
	public static Entity_instance loadEntity_instanceByORMID(int entity_instance_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_instanceByORMID(session, entity_instance_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance getEntity_instanceByORMID(int entity_instance_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getEntity_instanceByORMID(session, entity_instance_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByORMID(int entity_instance_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_instanceByORMID(session, entity_instance_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance getEntity_instanceByORMID(int entity_instance_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getEntity_instanceByORMID(session, entity_instance_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByORMID(PersistentSession session, int entity_instance_id) throws PersistentException {
		try {
			return (Entity_instance) session.load(pwfms.Entity_instance.class, new Integer(entity_instance_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance getEntity_instanceByORMID(PersistentSession session, int entity_instance_id) throws PersistentException {
		try {
			return (Entity_instance) session.get(pwfms.Entity_instance.class, new Integer(entity_instance_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByORMID(PersistentSession session, int entity_instance_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entity_instance) session.load(pwfms.Entity_instance.class, new Integer(entity_instance_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance getEntity_instanceByORMID(PersistentSession session, int entity_instance_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entity_instance) session.get(pwfms.Entity_instance.class, new Integer(entity_instance_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_instance(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryEntity_instance(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_instance(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryEntity_instance(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance[] listEntity_instanceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listEntity_instanceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance[] listEntity_instanceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listEntity_instanceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_instance(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_instance as Entity_instance");
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
	
	public static List queryEntity_instance(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_instance as Entity_instance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entity_instance", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance[] listEntity_instanceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntity_instance(session, condition, orderBy);
			return (Entity_instance[]) list.toArray(new Entity_instance[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance[] listEntity_instanceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntity_instance(session, condition, orderBy, lockMode);
			return (Entity_instance[]) list.toArray(new Entity_instance[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_instanceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_instanceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Entity_instance[] entity_instances = listEntity_instanceByQuery(session, condition, orderBy);
		if (entity_instances != null && entity_instances.length > 0)
			return entity_instances[0];
		else
			return null;
	}
	
	public static Entity_instance loadEntity_instanceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Entity_instance[] entity_instances = listEntity_instanceByQuery(session, condition, orderBy, lockMode);
		if (entity_instances != null && entity_instances.length > 0)
			return entity_instances[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEntity_instanceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateEntity_instanceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntity_instanceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateEntity_instanceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntity_instanceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_instance as Entity_instance");
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
	
	public static java.util.Iterator iterateEntity_instanceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_instance as Entity_instance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entity_instance", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_instance loadEntity_instanceByCriteria(Entity_instanceCriteria entity_instanceCriteria) {
		Entity_instance[] entity_instances = listEntity_instanceByCriteria(entity_instanceCriteria);
		if(entity_instances == null || entity_instances.length == 0) {
			return null;
		}
		return entity_instances[0];
	}
	
	public static Entity_instance[] listEntity_instanceByCriteria(Entity_instanceCriteria entity_instanceCriteria) {
		return entity_instanceCriteria.listEntity_instance();
	}
	
	public static Entity_instance createEntity_instance() {
		return new pwfms.Entity_instance();
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
			if(getEntity_type() != null) {
				getEntity_type().getEntity_instance().remove(this);
			}
			
			pwfms.Entity_detail[] lEntity_details = (pwfms.Entity_detail[])getEntity_detail().toArray(new pwfms.Entity_detail[getEntity_detail().size()]);
			for(int i = 0; i < lEntity_details.length; i++) {
				lEntity_details[i].setEntity_instance(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setEntity_instance(null);
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
			if(getEntity_type() != null) {
				getEntity_type().getEntity_instance().remove(this);
			}
			
			pwfms.Entity_detail[] lEntity_details = (pwfms.Entity_detail[])getEntity_detail().toArray(new pwfms.Entity_detail[getEntity_detail().size()]);
			for(int i = 0; i < lEntity_details.length; i++) {
				lEntity_details[i].setEntity_instance(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setEntity_instance(null);
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
	
	@Column(name="entity_instance_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ENTITY_INSTANCE_ENTITY_INSTANCE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ENTITY_INSTANCE_ENTITY_INSTANCE_ID_GENERATOR", strategy="native")	
	private int entity_instance_id;
	
	@Column(name="entity_instance_name", nullable=false, length=100)	
	private String entity_instance_name;
	
	@ManyToOne(targetEntity=pwfms.Entity_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="entity_type_id", referencedColumnName="entity_type_id", nullable=false) })	
	private pwfms.Entity_type entity_type;
	
	@OneToMany(mappedBy="entity_instance", targetEntity=pwfms.Entity_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set entity_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="entity_instance", targetEntity=pwfms.Task_activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity = new java.util.HashSet();
	
	private void setEntity_instance_id(int value) {
		this.entity_instance_id = value;
	}
	
	public int getEntity_instance_id() {
		return entity_instance_id;
	}
	
	public int getORMID() {
		return getEntity_instance_id();
	}
	
	public void setEntity_instance_name(String value) {
		this.entity_instance_name = value;
	}
	
	public String getEntity_instance_name() {
		return entity_instance_name;
	}
	
	public void setEntity_type(pwfms.Entity_type value) {
		this.entity_type = value;
	}
	
	public pwfms.Entity_type getEntity_type() {
		return entity_type;
	}
	
	public void setEntity_detail(java.util.Set value) {
		this.entity_detail = value;
	}
	
	public java.util.Set getEntity_detail() {
		return entity_detail;
	}
	
	
	public void setTask_activity(java.util.Set value) {
		this.task_activity = value;
	}
	
	public java.util.Set getTask_activity() {
		return task_activity;
	}
	
	
	public String toString() {
		return String.valueOf(getEntity_instance_id());
	}
	
}
