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
@Table(name="entity_type")
public class Entity_type implements Serializable {
	public Entity_type() {
	}
	
	public static Entity_type loadEntity_typeByORMID(int entity_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_typeByORMID(session, entity_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type getEntity_typeByORMID(int entity_type_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getEntity_typeByORMID(session, entity_type_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByORMID(int entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_typeByORMID(session, entity_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type getEntity_typeByORMID(int entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getEntity_typeByORMID(session, entity_type_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByORMID(PersistentSession session, int entity_type_id) throws PersistentException {
		try {
			return (Entity_type) session.load(pwfms.Entity_type.class, new Integer(entity_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type getEntity_typeByORMID(PersistentSession session, int entity_type_id) throws PersistentException {
		try {
			return (Entity_type) session.get(pwfms.Entity_type.class, new Integer(entity_type_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByORMID(PersistentSession session, int entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entity_type) session.load(pwfms.Entity_type.class, new Integer(entity_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type getEntity_typeByORMID(PersistentSession session, int entity_type_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entity_type) session.get(pwfms.Entity_type.class, new Integer(entity_type_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryEntity_type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryEntity_type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type[] listEntity_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listEntity_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type[] listEntity_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listEntity_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type as Entity_type");
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
	
	public static List queryEntity_type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type as Entity_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entity_type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type[] listEntity_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntity_type(session, condition, orderBy);
			return (Entity_type[]) list.toArray(new Entity_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type[] listEntity_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntity_type(session, condition, orderBy, lockMode);
			return (Entity_type[]) list.toArray(new Entity_type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Entity_type[] entity_types = listEntity_typeByQuery(session, condition, orderBy);
		if (entity_types != null && entity_types.length > 0)
			return entity_types[0];
		else
			return null;
	}
	
	public static Entity_type loadEntity_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Entity_type[] entity_types = listEntity_typeByQuery(session, condition, orderBy, lockMode);
		if (entity_types != null && entity_types.length > 0)
			return entity_types[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEntity_typeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateEntity_typeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntity_typeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateEntity_typeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntity_typeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type as Entity_type");
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
	
	public static java.util.Iterator iterateEntity_typeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type as Entity_type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entity_type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type loadEntity_typeByCriteria(Entity_typeCriteria entity_typeCriteria) {
		Entity_type[] entity_types = listEntity_typeByCriteria(entity_typeCriteria);
		if(entity_types == null || entity_types.length == 0) {
			return null;
		}
		return entity_types[0];
	}
	
	public static Entity_type[] listEntity_typeByCriteria(Entity_typeCriteria entity_typeCriteria) {
		return entity_typeCriteria.listEntity_type();
	}
	
	public static Entity_type createEntity_type() {
		return new pwfms.Entity_type();
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
				getCompany().getEntity_type().remove(this);
			}
			
			pwfms.Activity_entity_type[] lActivity_entity_types = (pwfms.Activity_entity_type[])getActivity_entity_type().toArray(new pwfms.Activity_entity_type[getActivity_entity_type().size()]);
			for(int i = 0; i < lActivity_entity_types.length; i++) {
				lActivity_entity_types[i].setEntity_type(null);
			}
			pwfms.Entity_type_data_element[] lEntity_type_data_elements = (pwfms.Entity_type_data_element[])getEntity_type_data_element().toArray(new pwfms.Entity_type_data_element[getEntity_type_data_element().size()]);
			for(int i = 0; i < lEntity_type_data_elements.length; i++) {
				lEntity_type_data_elements[i].setEntity_type(null);
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
				getCompany().getEntity_type().remove(this);
			}
			
			pwfms.Activity_entity_type[] lActivity_entity_types = (pwfms.Activity_entity_type[])getActivity_entity_type().toArray(new pwfms.Activity_entity_type[getActivity_entity_type().size()]);
			for(int i = 0; i < lActivity_entity_types.length; i++) {
				lActivity_entity_types[i].setEntity_type(null);
			}
			pwfms.Entity_type_data_element[] lEntity_type_data_elements = (pwfms.Entity_type_data_element[])getEntity_type_data_element().toArray(new pwfms.Entity_type_data_element[getEntity_type_data_element().size()]);
			for(int i = 0; i < lEntity_type_data_elements.length; i++) {
				lEntity_type_data_elements[i].setEntity_type(null);
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
	
	@Column(name="entity_type_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ENTITY_TYPE_ENTITY_TYPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ENTITY_TYPE_ENTITY_TYPE_ID_GENERATOR", strategy="native")	
	private int entity_type_id;
	
	@Column(name="entity_type_name", nullable=false, unique=true, length=50)	
	private String entity_type_name;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="entity_type", targetEntity=pwfms.Activity_entity_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_entity_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="entity_type", targetEntity=pwfms.Entity_type_data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set entity_type_data_element = new java.util.HashSet();
	
	private void setEntity_type_id(int value) {
		this.entity_type_id = value;
	}
	
	public int getEntity_type_id() {
		return entity_type_id;
	}
	
	public int getORMID() {
		return getEntity_type_id();
	}
	
	public void setEntity_type_name(String value) {
		this.entity_type_name = value;
	}
	
	public String getEntity_type_name() {
		return entity_type_name;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setActivity_entity_type(java.util.Set value) {
		this.activity_entity_type = value;
	}
	
	public java.util.Set getActivity_entity_type() {
		return activity_entity_type;
	}
	
	
	public void setEntity_type_data_element(java.util.Set value) {
		this.entity_type_data_element = value;
	}
	
	public java.util.Set getEntity_type_data_element() {
		return entity_type_data_element;
	}
	
	
	public String toString() {
		return String.valueOf(getEntity_type_id());
	}
	
}
