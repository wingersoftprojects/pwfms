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
@Table(name="activity_data_element")
public class Activity_data_element implements Serializable {
	public Activity_data_element() {
	}
	
	public static Activity_data_element loadActivity_data_elementByORMID(int activity_data_element_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_data_elementByORMID(session, activity_data_element_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element getActivity_data_elementByORMID(int activity_data_element_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_data_elementByORMID(session, activity_data_element_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByORMID(int activity_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_data_elementByORMID(session, activity_data_element_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element getActivity_data_elementByORMID(int activity_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_data_elementByORMID(session, activity_data_element_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByORMID(PersistentSession session, int activity_data_element_id) throws PersistentException {
		try {
			return (Activity_data_element) session.load(pwfms.Activity_data_element.class, new Integer(activity_data_element_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element getActivity_data_elementByORMID(PersistentSession session, int activity_data_element_id) throws PersistentException {
		try {
			return (Activity_data_element) session.get(pwfms.Activity_data_element.class, new Integer(activity_data_element_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByORMID(PersistentSession session, int activity_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_data_element) session.load(pwfms.Activity_data_element.class, new Integer(activity_data_element_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element getActivity_data_elementByORMID(PersistentSession session, int activity_data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_data_element) session.get(pwfms.Activity_data_element.class, new Integer(activity_data_element_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_data_element(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_data_element(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_data_element(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_data_element(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element[] listActivity_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element[] listActivity_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_data_element(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_data_element as Activity_data_element");
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
	
	public static List queryActivity_data_element(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_data_element as Activity_data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_data_element", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element[] listActivity_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity_data_element(session, condition, orderBy);
			return (Activity_data_element[]) list.toArray(new Activity_data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element[] listActivity_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity_data_element(session, condition, orderBy, lockMode);
			return (Activity_data_element[]) list.toArray(new Activity_data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity_data_element[] activity_data_elements = listActivity_data_elementByQuery(session, condition, orderBy);
		if (activity_data_elements != null && activity_data_elements.length > 0)
			return activity_data_elements[0];
		else
			return null;
	}
	
	public static Activity_data_element loadActivity_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity_data_element[] activity_data_elements = listActivity_data_elementByQuery(session, condition, orderBy, lockMode);
		if (activity_data_elements != null && activity_data_elements.length > 0)
			return activity_data_elements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivity_data_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_data_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_data_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_data_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_data_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_data_element as Activity_data_element");
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
	
	public static java.util.Iterator iterateActivity_data_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_data_element as Activity_data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_data_element", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_data_element loadActivity_data_elementByCriteria(Activity_data_elementCriteria activity_data_elementCriteria) {
		Activity_data_element[] activity_data_elements = listActivity_data_elementByCriteria(activity_data_elementCriteria);
		if(activity_data_elements == null || activity_data_elements.length == 0) {
			return null;
		}
		return activity_data_elements[0];
	}
	
	public static Activity_data_element[] listActivity_data_elementByCriteria(Activity_data_elementCriteria activity_data_elementCriteria) {
		return activity_data_elementCriteria.listActivity_data_element();
	}
	
	public static Activity_data_element createActivity_data_element() {
		return new pwfms.Activity_data_element();
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
			if(getData_element() != null) {
				getData_element().getActivity_data_element().remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().getActivity_data_element().remove(this);
			}
			
			if(getSection() != null) {
				getSection().getActivity_data_element().remove(this);
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
			if(getData_element() != null) {
				getData_element().getActivity_data_element().remove(this);
			}
			
			if(getActivity() != null) {
				getActivity().getActivity_data_element().remove(this);
			}
			
			if(getSection() != null) {
				getSection().getActivity_data_element().remove(this);
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
	
	@Column(name="activity_data_element_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ACTIVITY_DATA_ELEMENT_ACTIVITY_DATA_ELEMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ACTIVITY_DATA_ELEMENT_ACTIVITY_DATA_ELEMENT_ID_GENERATOR", strategy="native")	
	private int activity_data_element_id;
	
	@ManyToOne(targetEntity=pwfms.Data_element.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="data_element_id", referencedColumnName="data_element_id", nullable=false) })	
	private pwfms.Data_element data_element;
	
	@ManyToOne(targetEntity=pwfms.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private pwfms.Activity activity;
	
	@ManyToOne(targetEntity=pwfms.Section.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="section_id", referencedColumnName="section_id", nullable=false) })	
	private pwfms.Section section;
	
	@Column(name="data_element_order", nullable=false, length=4)	
	private int data_element_order;
	
	@Column(name="is_mandatory", nullable=false, length=1)	
	private int is_mandatory;
	
	private void setActivity_data_element_id(int value) {
		this.activity_data_element_id = value;
	}
	
	public int getActivity_data_element_id() {
		return activity_data_element_id;
	}
	
	public int getORMID() {
		return getActivity_data_element_id();
	}
	
	public void setData_element_order(int value) {
		this.data_element_order = value;
	}
	
	public int getData_element_order() {
		return data_element_order;
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
	
	public void setSection(pwfms.Section value) {
		this.section = value;
	}
	
	public pwfms.Section getSection() {
		return section;
	}
	
	public void setData_element(pwfms.Data_element value) {
		this.data_element = value;
	}
	
	public pwfms.Data_element getData_element() {
		return data_element;
	}
	
	public String toString() {
		return String.valueOf(getActivity_data_element_id());
	}
	
}
