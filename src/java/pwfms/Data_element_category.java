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
@Table(name="data_element_category")
public class Data_element_category implements Serializable {
	public Data_element_category() {
	}
	
	public static Data_element_category loadData_element_categoryByORMID(int data_element_category_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_element_categoryByORMID(session, data_element_category_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category getData_element_categoryByORMID(int data_element_category_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getData_element_categoryByORMID(session, data_element_category_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByORMID(int data_element_category_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_element_categoryByORMID(session, data_element_category_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category getData_element_categoryByORMID(int data_element_category_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getData_element_categoryByORMID(session, data_element_category_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByORMID(PersistentSession session, int data_element_category_id) throws PersistentException {
		try {
			return (Data_element_category) session.load(pwfms.Data_element_category.class, new Integer(data_element_category_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category getData_element_categoryByORMID(PersistentSession session, int data_element_category_id) throws PersistentException {
		try {
			return (Data_element_category) session.get(pwfms.Data_element_category.class, new Integer(data_element_category_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByORMID(PersistentSession session, int data_element_category_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Data_element_category) session.load(pwfms.Data_element_category.class, new Integer(data_element_category_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category getData_element_categoryByORMID(PersistentSession session, int data_element_category_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Data_element_category) session.get(pwfms.Data_element_category.class, new Integer(data_element_category_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryData_element_category(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryData_element_category(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryData_element_category(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryData_element_category(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category[] listData_element_categoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listData_element_categoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category[] listData_element_categoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listData_element_categoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryData_element_category(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element_category as Data_element_category");
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
	
	public static List queryData_element_category(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element_category as Data_element_category");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Data_element_category", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category[] listData_element_categoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryData_element_category(session, condition, orderBy);
			return (Data_element_category[]) list.toArray(new Data_element_category[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category[] listData_element_categoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryData_element_category(session, condition, orderBy, lockMode);
			return (Data_element_category[]) list.toArray(new Data_element_category[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_element_categoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadData_element_categoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Data_element_category[] data_element_categorys = listData_element_categoryByQuery(session, condition, orderBy);
		if (data_element_categorys != null && data_element_categorys.length > 0)
			return data_element_categorys[0];
		else
			return null;
	}
	
	public static Data_element_category loadData_element_categoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Data_element_category[] data_element_categorys = listData_element_categoryByQuery(session, condition, orderBy, lockMode);
		if (data_element_categorys != null && data_element_categorys.length > 0)
			return data_element_categorys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateData_element_categoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateData_element_categoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateData_element_categoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateData_element_categoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateData_element_categoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element_category as Data_element_category");
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
	
	public static java.util.Iterator iterateData_element_categoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Data_element_category as Data_element_category");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Data_element_category", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Data_element_category loadData_element_categoryByCriteria(Data_element_categoryCriteria data_element_categoryCriteria) {
		Data_element_category[] data_element_categorys = listData_element_categoryByCriteria(data_element_categoryCriteria);
		if(data_element_categorys == null || data_element_categorys.length == 0) {
			return null;
		}
		return data_element_categorys[0];
	}
	
	public static Data_element_category[] listData_element_categoryByCriteria(Data_element_categoryCriteria data_element_categoryCriteria) {
		return data_element_categoryCriteria.listData_element_category();
	}
	
	public static Data_element_category createData_element_category() {
		return new pwfms.Data_element_category();
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
				getCompany().getData_element_category().remove(this);
			}
			
			pwfms.Data_element[] lData_elements = (pwfms.Data_element[])getData_element().toArray(new pwfms.Data_element[getData_element().size()]);
			for(int i = 0; i < lData_elements.length; i++) {
				lData_elements[i].setData_element_category(null);
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
				getCompany().getData_element_category().remove(this);
			}
			
			pwfms.Data_element[] lData_elements = (pwfms.Data_element[])getData_element().toArray(new pwfms.Data_element[getData_element().size()]);
			for(int i = 0; i < lData_elements.length; i++) {
				lData_elements[i].setData_element_category(null);
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
	
	@Column(name="data_element_category_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_DATA_ELEMENT_CATEGORY_DATA_ELEMENT_CATEGORY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_DATA_ELEMENT_CATEGORY_DATA_ELEMENT_CATEGORY_ID_GENERATOR", strategy="native")	
	private int data_element_category_id;
	
	@Column(name="data_element_category_name", nullable=false, length=50)	
	private String data_element_category_name;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="data_element_category", targetEntity=pwfms.Data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set data_element = new java.util.HashSet();
	
	private void setData_element_category_id(int value) {
		this.data_element_category_id = value;
	}
	
	public int getData_element_category_id() {
		return data_element_category_id;
	}
	
	public int getORMID() {
		return getData_element_category_id();
	}
	
	public void setData_element_category_name(String value) {
		this.data_element_category_name = value;
	}
	
	public String getData_element_category_name() {
		return data_element_category_name;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setData_element(java.util.Set value) {
		this.data_element = value;
	}
	
	public java.util.Set getData_element() {
		return data_element;
	}
	
	
	public String toString() {
		return String.valueOf(getData_element_category_id());
	}
	
}
