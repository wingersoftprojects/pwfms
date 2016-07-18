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
@Table(name="group_right", uniqueConstraints={ @UniqueConstraint(columnNames={ "group_detail_id", "function_name" }) })
public class Group_right implements Serializable {
	public Group_right() {
	}
	
	public static Group_right loadGroup_rightByORMID(int group_right_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_rightByORMID(session, group_right_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(int group_right_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getGroup_rightByORMID(session, group_right_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_rightByORMID(session, group_right_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getGroup_rightByORMID(session, group_right_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(PersistentSession session, int group_right_id) throws PersistentException {
		try {
			return (Group_right) session.load(pwfms.Group_right.class, new Integer(group_right_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(PersistentSession session, int group_right_id) throws PersistentException {
		try {
			return (Group_right) session.get(pwfms.Group_right.class, new Integer(group_right_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(PersistentSession session, int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_right) session.load(pwfms.Group_right.class, new Integer(group_right_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(PersistentSession session, int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_right) session.get(pwfms.Group_right.class, new Integer(group_right_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryGroup_right(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryGroup_right(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_right as Group_right");
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
	
	public static List queryGroup_right(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_right as Group_right");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_right", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGroup_right(session, condition, orderBy);
			return (Group_right[]) list.toArray(new Group_right[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGroup_right(session, condition, orderBy, lockMode);
			return (Group_right[]) list.toArray(new Group_right[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Group_right[] group_rights = listGroup_rightByQuery(session, condition, orderBy);
		if (group_rights != null && group_rights.length > 0)
			return group_rights[0];
		else
			return null;
	}
	
	public static Group_right loadGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Group_right[] group_rights = listGroup_rightByQuery(session, condition, orderBy, lockMode);
		if (group_rights != null && group_rights.length > 0)
			return group_rights[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_right as Group_right");
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
	
	public static java.util.Iterator iterateGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Group_right as Group_right");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_right", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByCriteria(Group_rightCriteria group_rightCriteria) {
		Group_right[] group_rights = listGroup_rightByCriteria(group_rightCriteria);
		if(group_rights == null || group_rights.length == 0) {
			return null;
		}
		return group_rights[0];
	}
	
	public static Group_right[] listGroup_rightByCriteria(Group_rightCriteria group_rightCriteria) {
		return group_rightCriteria.listGroup_right();
	}
	
	public static Group_right createGroup_right() {
		return new pwfms.Group_right();
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
			if(getGroup_detail() != null) {
				getGroup_detail().getGroup_right().remove(this);
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
			if(getGroup_detail() != null) {
				getGroup_detail().getGroup_right().remove(this);
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
	
	@Column(name="group_right_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_GROUP_RIGHT_GROUP_RIGHT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_GROUP_RIGHT_GROUP_RIGHT_ID_GENERATOR", strategy="native")	
	private int group_right_id;
	
	@ManyToOne(targetEntity=pwfms.Group_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="group_detail_id", referencedColumnName="group_detail_id", nullable=false) })	
	private pwfms.Group_detail group_detail;
	
	@Column(name="function_name", nullable=false, length=50)	
	private String function_name;
	
	@Column(name="allow_view", nullable=false, length=1)	
	private int allow_view;
	
	@Column(name="allow_add", nullable=false, length=1)	
	private int allow_add;
	
	@Column(name="allow_edit", nullable=false, length=1)	
	private int allow_edit;
	
	@Column(name="allow_delete", nullable=false, length=1)	
	private int allow_delete;
	
	private void setGroup_right_id(int value) {
		this.group_right_id = value;
	}
	
	public int getGroup_right_id() {
		return group_right_id;
	}
	
	public int getORMID() {
		return getGroup_right_id();
	}
	
	public void setFunction_name(String value) {
		this.function_name = value;
	}
	
	public String getFunction_name() {
		return function_name;
	}
	
	public void setAllow_view(int value) {
		this.allow_view = value;
	}
	
	public int getAllow_view() {
		return allow_view;
	}
	
	public void setAllow_add(int value) {
		this.allow_add = value;
	}
	
	public int getAllow_add() {
		return allow_add;
	}
	
	public void setAllow_edit(int value) {
		this.allow_edit = value;
	}
	
	public int getAllow_edit() {
		return allow_edit;
	}
	
	public void setAllow_delete(int value) {
		this.allow_delete = value;
	}
	
	public int getAllow_delete() {
		return allow_delete;
	}
	
	public void setGroup_detail(pwfms.Group_detail value) {
		this.group_detail = value;
	}
	
	public pwfms.Group_detail getGroup_detail() {
		return group_detail;
	}
	
	public String toString() {
		return String.valueOf(getGroup_right_id());
	}
	
}
