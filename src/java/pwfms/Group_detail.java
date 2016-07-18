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
@Table(name="group_detail")
public class Group_detail implements Serializable {
	public Group_detail() {
	}
	
	public static Group_detail loadGroup_detailByORMID(int group_detail_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_detailByORMID(session, group_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail getGroup_detailByORMID(int group_detail_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getGroup_detailByORMID(session, group_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByORMID(int group_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_detailByORMID(session, group_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail getGroup_detailByORMID(int group_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getGroup_detailByORMID(session, group_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByORMID(PersistentSession session, int group_detail_id) throws PersistentException {
		try {
			return (Group_detail) session.load(pwfms.Group_detail.class, new Integer(group_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail getGroup_detailByORMID(PersistentSession session, int group_detail_id) throws PersistentException {
		try {
			return (Group_detail) session.get(pwfms.Group_detail.class, new Integer(group_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByORMID(PersistentSession session, int group_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_detail) session.load(pwfms.Group_detail.class, new Integer(group_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail getGroup_detailByORMID(PersistentSession session, int group_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_detail) session.get(pwfms.Group_detail.class, new Integer(group_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryGroup_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryGroup_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail[] listGroup_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listGroup_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail[] listGroup_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listGroup_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_detail as Group_detail");
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
	
	public static List queryGroup_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_detail as Group_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail[] listGroup_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGroup_detail(session, condition, orderBy);
			return (Group_detail[]) list.toArray(new Group_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail[] listGroup_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGroup_detail(session, condition, orderBy, lockMode);
			return (Group_detail[]) list.toArray(new Group_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Group_detail[] group_details = listGroup_detailByQuery(session, condition, orderBy);
		if (group_details != null && group_details.length > 0)
			return group_details[0];
		else
			return null;
	}
	
	public static Group_detail loadGroup_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Group_detail[] group_details = listGroup_detailByQuery(session, condition, orderBy, lockMode);
		if (group_details != null && group_details.length > 0)
			return group_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGroup_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateGroup_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateGroup_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_detail as Group_detail");
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
	
	public static java.util.Iterator iterateGroup_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_detail as Group_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_detail loadGroup_detailByCriteria(Group_detailCriteria group_detailCriteria) {
		Group_detail[] group_details = listGroup_detailByCriteria(group_detailCriteria);
		if(group_details == null || group_details.length == 0) {
			return null;
		}
		return group_details[0];
	}
	
	public static Group_detail[] listGroup_detailByCriteria(Group_detailCriteria group_detailCriteria) {
		return group_detailCriteria.listGroup_detail();
	}
	
	public static Group_detail createGroup_detail() {
		return new pwfms.Group_detail();
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
				getCompany().getGroup_detail().remove(this);
			}
			
			pwfms.Group_right[] lGroup_rights = (pwfms.Group_right[])getGroup_right().toArray(new pwfms.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setGroup_detail(null);
			}
			pwfms.Group_user[] lGroup_users = (pwfms.Group_user[])getGroup_user().toArray(new pwfms.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setGroup_detail(null);
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
				getCompany().getGroup_detail().remove(this);
			}
			
			pwfms.Group_right[] lGroup_rights = (pwfms.Group_right[])getGroup_right().toArray(new pwfms.Group_right[getGroup_right().size()]);
			for(int i = 0; i < lGroup_rights.length; i++) {
				lGroup_rights[i].setGroup_detail(null);
			}
			pwfms.Group_user[] lGroup_users = (pwfms.Group_user[])getGroup_user().toArray(new pwfms.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setGroup_detail(null);
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
	
	@Column(name="group_detail_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_GROUP_DETAIL_GROUP_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_GROUP_DETAIL_GROUP_DETAIL_ID_GENERATOR", strategy="native")	
	private int group_detail_id;
	
	@Column(name="group_name", nullable=false, unique=true, length=50)	
	private String group_name;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="group_detail", targetEntity=pwfms.Group_right.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_right = new java.util.HashSet();
	
	@OneToMany(mappedBy="group_detail", targetEntity=pwfms.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_user = new java.util.HashSet();
	
	private void setGroup_detail_id(int value) {
		this.group_detail_id = value;
	}
	
	public int getGroup_detail_id() {
		return group_detail_id;
	}
	
	public int getORMID() {
		return getGroup_detail_id();
	}
	
	public void setGroup_name(String value) {
		this.group_name = value;
	}
	
	public String getGroup_name() {
		return group_name;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setGroup_right(java.util.Set value) {
		this.group_right = value;
	}
	
	public java.util.Set getGroup_right() {
		return group_right;
	}
	
	
	public void setGroup_user(java.util.Set value) {
		this.group_user = value;
	}
	
	public java.util.Set getGroup_user() {
		return group_user;
	}
	
	
	public String toString() {
		return String.valueOf(getGroup_detail_id());
	}
	
}
