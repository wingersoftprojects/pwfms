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
@Table(name="entity_type_data_element")
public class Entity_type_data_element implements Serializable {
	public Entity_type_data_element() {
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByORMID(int entity_type_data_element) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_type_data_elementByORMID(session, entity_type_data_element);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element getEntity_type_data_elementByORMID(int entity_type_data_element) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getEntity_type_data_elementByORMID(session, entity_type_data_element);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByORMID(int entity_type_data_element, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_type_data_elementByORMID(session, entity_type_data_element, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element getEntity_type_data_elementByORMID(int entity_type_data_element, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getEntity_type_data_elementByORMID(session, entity_type_data_element, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByORMID(PersistentSession session, int entity_type_data_element) throws PersistentException {
		try {
			return (Entity_type_data_element) session.load(pwfms.Entity_type_data_element.class, new Integer(entity_type_data_element));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element getEntity_type_data_elementByORMID(PersistentSession session, int entity_type_data_element) throws PersistentException {
		try {
			return (Entity_type_data_element) session.get(pwfms.Entity_type_data_element.class, new Integer(entity_type_data_element));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByORMID(PersistentSession session, int entity_type_data_element, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entity_type_data_element) session.load(pwfms.Entity_type_data_element.class, new Integer(entity_type_data_element), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element getEntity_type_data_elementByORMID(PersistentSession session, int entity_type_data_element, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entity_type_data_element) session.get(pwfms.Entity_type_data_element.class, new Integer(entity_type_data_element), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_type_data_element(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryEntity_type_data_element(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_type_data_element(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryEntity_type_data_element(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element[] listEntity_type_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listEntity_type_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element[] listEntity_type_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listEntity_type_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntity_type_data_element(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type_data_element as Entity_type_data_element");
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
	
	public static List queryEntity_type_data_element(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type_data_element as Entity_type_data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entity_type_data_element", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element[] listEntity_type_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntity_type_data_element(session, condition, orderBy);
			return (Entity_type_data_element[]) list.toArray(new Entity_type_data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element[] listEntity_type_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntity_type_data_element(session, condition, orderBy, lockMode);
			return (Entity_type_data_element[]) list.toArray(new Entity_type_data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_type_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadEntity_type_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Entity_type_data_element[] entity_type_data_elements = listEntity_type_data_elementByQuery(session, condition, orderBy);
		if (entity_type_data_elements != null && entity_type_data_elements.length > 0)
			return entity_type_data_elements[0];
		else
			return null;
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Entity_type_data_element[] entity_type_data_elements = listEntity_type_data_elementByQuery(session, condition, orderBy, lockMode);
		if (entity_type_data_elements != null && entity_type_data_elements.length > 0)
			return entity_type_data_elements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEntity_type_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateEntity_type_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntity_type_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateEntity_type_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntity_type_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type_data_element as Entity_type_data_element");
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
	
	public static java.util.Iterator iterateEntity_type_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Entity_type_data_element as Entity_type_data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entity_type_data_element", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entity_type_data_element loadEntity_type_data_elementByCriteria(Entity_type_data_elementCriteria entity_type_data_elementCriteria) {
		Entity_type_data_element[] entity_type_data_elements = listEntity_type_data_elementByCriteria(entity_type_data_elementCriteria);
		if(entity_type_data_elements == null || entity_type_data_elements.length == 0) {
			return null;
		}
		return entity_type_data_elements[0];
	}
	
	public static Entity_type_data_element[] listEntity_type_data_elementByCriteria(Entity_type_data_elementCriteria entity_type_data_elementCriteria) {
		return entity_type_data_elementCriteria.listEntity_type_data_element();
	}
	
	public static Entity_type_data_element createEntity_type_data_element() {
		return new pwfms.Entity_type_data_element();
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
				getEntity_type().getEntity_type_data_element().remove(this);
			}
			
			if(getData_element() != null) {
				getData_element().getEntity_type_data_element().remove(this);
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
				getEntity_type().getEntity_type_data_element().remove(this);
			}
			
			if(getData_element() != null) {
				getData_element().getEntity_type_data_element().remove(this);
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
	
	@Column(name="entity_type_data_element", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ENTITY_TYPE_DATA_ELEMENT_ENTITY_TYPE_DATA_ELEMENT_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ENTITY_TYPE_DATA_ELEMENT_ENTITY_TYPE_DATA_ELEMENT_GENERATOR", strategy="native")	
	private int entity_type_data_element;
	
	@ManyToOne(targetEntity=pwfms.Entity_type.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="entity_type_id", referencedColumnName="entity_type_id", nullable=false) })	
	private pwfms.Entity_type entity_type;
	
	@ManyToOne(targetEntity=pwfms.Data_element.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="data_element_id", referencedColumnName="data_element_id", nullable=false) })	
	private pwfms.Data_element data_element;
	
	@Column(name="is_mandatory", nullable=false, length=1)	
	private int is_mandatory;
	
	private void setEntity_type_data_element(int value) {
		this.entity_type_data_element = value;
	}
	
	public int getEntity_type_data_element() {
		return entity_type_data_element;
	}
	
	public int getORMID() {
		return getEntity_type_data_element();
	}
	
	public void setIs_mandatory(int value) {
		this.is_mandatory = value;
	}
	
	public int getIs_mandatory() {
		return is_mandatory;
	}
	
	public void setData_element(pwfms.Data_element value) {
		this.data_element = value;
	}
	
	public pwfms.Data_element getData_element() {
		return data_element;
	}
	
	public void setEntity_type(pwfms.Entity_type value) {
		this.entity_type = value;
	}
	
	public pwfms.Entity_type getEntity_type() {
		return entity_type;
	}
	
	public String toString() {
		return String.valueOf(getEntity_type_data_element());
	}
	
}
