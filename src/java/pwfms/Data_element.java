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
@Table(name="data_element")
public class Data_element implements Serializable {
	public Data_element() {
	}
	
	public static Data_element loadData_elementByORMID(int data_element_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_elementByORMID(session, data_element_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element getData_elementByORMID(int data_element_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getData_elementByORMID(session, data_element_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByORMID(int data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_elementByORMID(session, data_element_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element getData_elementByORMID(int data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getData_elementByORMID(session, data_element_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByORMID(PersistentSession session, int data_element_id) throws PersistentException {
		try {
			return (Data_element) session.load(pwfms.Data_element.class, new Integer(data_element_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element getData_elementByORMID(PersistentSession session, int data_element_id) throws PersistentException {
		try {
			return (Data_element) session.get(pwfms.Data_element.class, new Integer(data_element_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByORMID(PersistentSession session, int data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Data_element) session.load(pwfms.Data_element.class, new Integer(data_element_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element getData_elementByORMID(PersistentSession session, int data_element_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Data_element) session.get(pwfms.Data_element.class, new Integer(data_element_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryData_element(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryData_element(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryData_element(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryData_element(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element[] listData_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listData_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element[] listData_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listData_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryData_element(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element as Data_element");
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
	
	public static List queryData_element(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element as Data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Data_element", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element[] listData_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryData_element(session, condition, orderBy);
			return (Data_element[]) list.toArray(new Data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element[] listData_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryData_element(session, condition, orderBy, lockMode);
			return (Data_element[]) list.toArray(new Data_element[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Data_element[] data_elements = listData_elementByQuery(session, condition, orderBy);
		if (data_elements != null && data_elements.length > 0)
			return data_elements[0];
		else
			return null;
	}
	
	public static Data_element loadData_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Data_element[] data_elements = listData_elementByQuery(session, condition, orderBy, lockMode);
		if (data_elements != null && data_elements.length > 0)
			return data_elements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateData_elementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateData_elementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateData_elementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateData_elementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateData_elementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element as Data_element");
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
	
	public static java.util.Iterator iterateData_elementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element as Data_element");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Data_element", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element loadData_elementByCriteria(Data_elementCriteria data_elementCriteria) {
		Data_element[] data_elements = listData_elementByCriteria(data_elementCriteria);
		if(data_elements == null || data_elements.length == 0) {
			return null;
		}
		return data_elements[0];
	}
	
	public static Data_element[] listData_elementByCriteria(Data_elementCriteria data_elementCriteria) {
		return data_elementCriteria.listData_element();
	}
	
	public static Data_element createData_element() {
		return new pwfms.Data_element();
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
				getCompany().getData_element().remove(this);
			}
			
			if(getData_element_category() != null) {
				getData_element_category().getData_element().remove(this);
			}
			
			pwfms.Activity_data_element[] lActivity_data_elements = (pwfms.Activity_data_element[])getActivity_data_element().toArray(new pwfms.Activity_data_element[getActivity_data_element().size()]);
			for(int i = 0; i < lActivity_data_elements.length; i++) {
				lActivity_data_elements[i].setData_element(null);
			}
			pwfms.Entity_type_data_element[] lEntity_type_data_elements = (pwfms.Entity_type_data_element[])getEntity_type_data_element().toArray(new pwfms.Entity_type_data_element[getEntity_type_data_element().size()]);
			for(int i = 0; i < lEntity_type_data_elements.length; i++) {
				lEntity_type_data_elements[i].setData_element(null);
			}
			pwfms.Entity_detail[] lEntity_details = (pwfms.Entity_detail[])getEntity_detail().toArray(new pwfms.Entity_detail[getEntity_detail().size()]);
			for(int i = 0; i < lEntity_details.length; i++) {
				lEntity_details[i].setData_element(null);
			}
			pwfms.Task_activity_de[] lTask_activity_des = (pwfms.Task_activity_de[])getTask_activity_de().toArray(new pwfms.Task_activity_de[getTask_activity_de().size()]);
			for(int i = 0; i < lTask_activity_des.length; i++) {
				lTask_activity_des[i].setData_element(null);
			}
			pwfms.Task_activity_entity[] lTask_activity_entitys = (pwfms.Task_activity_entity[])getTask_activity_entity().toArray(new pwfms.Task_activity_entity[getTask_activity_entity().size()]);
			for(int i = 0; i < lTask_activity_entitys.length; i++) {
				lTask_activity_entitys[i].setData_element(null);
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
				getCompany().getData_element().remove(this);
			}
			
			if(getData_element_category() != null) {
				getData_element_category().getData_element().remove(this);
			}
			
			pwfms.Activity_data_element[] lActivity_data_elements = (pwfms.Activity_data_element[])getActivity_data_element().toArray(new pwfms.Activity_data_element[getActivity_data_element().size()]);
			for(int i = 0; i < lActivity_data_elements.length; i++) {
				lActivity_data_elements[i].setData_element(null);
			}
			pwfms.Entity_type_data_element[] lEntity_type_data_elements = (pwfms.Entity_type_data_element[])getEntity_type_data_element().toArray(new pwfms.Entity_type_data_element[getEntity_type_data_element().size()]);
			for(int i = 0; i < lEntity_type_data_elements.length; i++) {
				lEntity_type_data_elements[i].setData_element(null);
			}
			pwfms.Entity_detail[] lEntity_details = (pwfms.Entity_detail[])getEntity_detail().toArray(new pwfms.Entity_detail[getEntity_detail().size()]);
			for(int i = 0; i < lEntity_details.length; i++) {
				lEntity_details[i].setData_element(null);
			}
			pwfms.Task_activity_de[] lTask_activity_des = (pwfms.Task_activity_de[])getTask_activity_de().toArray(new pwfms.Task_activity_de[getTask_activity_de().size()]);
			for(int i = 0; i < lTask_activity_des.length; i++) {
				lTask_activity_des[i].setData_element(null);
			}
			pwfms.Task_activity_entity[] lTask_activity_entitys = (pwfms.Task_activity_entity[])getTask_activity_entity().toArray(new pwfms.Task_activity_entity[getTask_activity_entity().size()]);
			for(int i = 0; i < lTask_activity_entitys.length; i++) {
				lTask_activity_entitys[i].setData_element(null);
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
	
	@Column(name="data_element_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_DATA_ELEMENT_DATA_ELEMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_DATA_ELEMENT_DATA_ELEMENT_ID_GENERATOR", strategy="native")	
	private int data_element_id;
	
	@Column(name="data_element_code", nullable=true, length=50)	
	private String data_element_code;
	
	@Column(name="data_element_name", nullable=false, length=100)	
	private String data_element_name;
	
	@Column(name="data_type", nullable=false, length=100)	
	private String data_type;
	
	@Column(name="data_size", nullable=false, length=10)	
	private int data_size;
	
	@Column(name="description", nullable=true, length=200)	
	private String description;
	
	@Column(name="is_email", nullable=false, length=1)	
	private int is_email;
	
	@Column(name="is_phone", nullable=false, length=1)	
	private int is_phone;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@ManyToOne(targetEntity=pwfms.Data_element_category.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="data_element_category_id", referencedColumnName="data_element_category_id", nullable=false) })	
	private pwfms.Data_element_category data_element_category;
	
	@OneToMany(mappedBy="data_element", targetEntity=pwfms.Activity_data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_data_element = new java.util.HashSet();
	
	@OneToMany(mappedBy="data_element", targetEntity=pwfms.Entity_type_data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set entity_type_data_element = new java.util.HashSet();
	
	@OneToMany(mappedBy="data_element", targetEntity=pwfms.Entity_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set entity_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="data_element", targetEntity=pwfms.Task_activity_de.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="data_element", targetEntity=pwfms.Task_activity_entity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity_entity = new java.util.HashSet();
	
	private void setData_element_id(int value) {
		this.data_element_id = value;
	}
	
	public int getData_element_id() {
		return data_element_id;
	}
	
	public int getORMID() {
		return getData_element_id();
	}
	
	public void setData_element_code(String value) {
		this.data_element_code = value;
	}
	
	public String getData_element_code() {
		return data_element_code;
	}
	
	public void setData_element_name(String value) {
		this.data_element_name = value;
	}
	
	public String getData_element_name() {
		return data_element_name;
	}
	
	public void setData_type(String value) {
		this.data_type = value;
	}
	
	public String getData_type() {
		return data_type;
	}
	
	public void setData_size(int value) {
		this.data_size = value;
	}
	
	public int getData_size() {
		return data_size;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setIs_email(int value) {
		this.is_email = value;
	}
	
	public int getIs_email() {
		return is_email;
	}
	
	public void setIs_phone(int value) {
		this.is_phone = value;
	}
	
	public int getIs_phone() {
		return is_phone;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setData_element_category(pwfms.Data_element_category value) {
		this.data_element_category = value;
	}
	
	public pwfms.Data_element_category getData_element_category() {
		return data_element_category;
	}
	
	public void setActivity_data_element(java.util.Set value) {
		this.activity_data_element = value;
	}
	
	public java.util.Set getActivity_data_element() {
		return activity_data_element;
	}
	
	
	public void setEntity_type_data_element(java.util.Set value) {
		this.entity_type_data_element = value;
	}
	
	public java.util.Set getEntity_type_data_element() {
		return entity_type_data_element;
	}
	
	
	public void setEntity_detail(java.util.Set value) {
		this.entity_detail = value;
	}
	
	public java.util.Set getEntity_detail() {
		return entity_detail;
	}
	
	
	public void setTask_activity_de(java.util.Set value) {
		this.task_activity_de = value;
	}
	
	public java.util.Set getTask_activity_de() {
		return task_activity_de;
	}
	
	
	public void setTask_activity_entity(java.util.Set value) {
		this.task_activity_entity = value;
	}
	
	public java.util.Set getTask_activity_entity() {
		return task_activity_entity;
	}
	
	
	public String toString() {
		return String.valueOf(getData_element_id());
	}
	
}
