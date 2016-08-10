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
/**
 * Stores user details such as username, password, type, status, etc
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="user_detail")
public class User_detail implements Serializable {
	public User_detail() {
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.load(pwfms.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.get(pwfms.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.load(pwfms.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.get(pwfms.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.User_detail as User_detail");
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
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy, lockMode);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy, lockMode);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.User_detail as User_detail");
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
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		User_detail[] user_details = listUser_detailByCriteria(user_detailCriteria);
		if(user_details == null || user_details.length == 0) {
			return null;
		}
		return user_details[0];
	}
	
	public static User_detail[] listUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		return user_detailCriteria.listUser_detail();
	}
	
	public static User_detail createUser_detail() {
		return new pwfms.User_detail();
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
				getCompany().getUser_detail().remove(this);
			}
			
			pwfms.Group_user[] lGroup_users = (pwfms.Group_user[])getGroup_user().toArray(new pwfms.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
			}
			pwfms.Task[] lTasks = (pwfms.Task[])getTask().toArray(new pwfms.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setAdded_by(null);
			}
			pwfms.Task[] lTask1s = (pwfms.Task[])getTask1().toArray(new pwfms.Task[getTask1().size()]);
			for(int i = 0; i < lTask1s.length; i++) {
				lTask1s[i].setTask_assigned_to(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setActivity_assigned_to(null);
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
				getCompany().getUser_detail().remove(this);
			}
			
			pwfms.Group_user[] lGroup_users = (pwfms.Group_user[])getGroup_user().toArray(new pwfms.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
			}
			pwfms.Task[] lTasks = (pwfms.Task[])getTask().toArray(new pwfms.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setAdded_by(null);
			}
			pwfms.Task[] lTask1s = (pwfms.Task[])getTask1().toArray(new pwfms.Task[getTask1().size()]);
			for(int i = 0; i < lTask1s.length; i++) {
				lTask1s[i].setTask_assigned_to(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setActivity_assigned_to(null);
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
	
	@Column(name="user_detail_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_USER_DETAIL_USER_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_USER_DETAIL_USER_DETAIL_ID_GENERATOR", strategy="native")	
	private int user_detail_id;
	
	@Column(name="user_name", nullable=false, unique=true, length=20)	
	private String user_name;
	
	@Column(name="user_password", nullable=false, length=255)	
	private String user_password;
	
	@Column(name="first_name", nullable=false, length=100)	
	private String first_name;
	
	@Column(name="second_name", nullable=false, length=100)	
	private String second_name;
	
	@Column(name="third_name", nullable=false, length=100)	
	private String third_name;
	
	@Column(name="user_image", nullable=true)	
	private java.sql.Blob user_image;
	
	@Column(name="user_category", nullable=true, length=50)	
	private String user_category;
	
	@Column(name="is_active", nullable=false, length=1)	
	private int is_active;
	
	@Column(name="is_general_admin", nullable=false, length=1)	
	private int is_general_admin;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="user_detail", targetEntity=pwfms.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_user = new java.util.HashSet();
	
	@OneToMany(mappedBy="added_by", targetEntity=pwfms.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task = new java.util.HashSet();
	
	@OneToMany(mappedBy="task_assigned_to", targetEntity=pwfms.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity_assigned_to", targetEntity=pwfms.Task_activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity = new java.util.HashSet();
	
	private void setUser_detail_id(int value) {
		this.user_detail_id = value;
	}
	
	public int getUser_detail_id() {
		return user_detail_id;
	}
	
	public int getORMID() {
		return getUser_detail_id();
	}
	
	public void setUser_name(String value) {
		this.user_name = value;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_password(String value) {
		this.user_password = value;
	}
	
	public String getUser_password() {
		return user_password;
	}
	
	public void setFirst_name(String value) {
		this.first_name = value;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setSecond_name(String value) {
		this.second_name = value;
	}
	
	public String getSecond_name() {
		return second_name;
	}
	
	public void setThird_name(String value) {
		this.third_name = value;
	}
	
	public String getThird_name() {
		return third_name;
	}
	
	public void setUser_image(java.sql.Blob value) {
		this.user_image = value;
	}
	
	public java.sql.Blob getUser_image() {
		return user_image;
	}
	
	public void setUser_category(String value) {
		this.user_category = value;
	}
	
	public String getUser_category() {
		return user_category;
	}
	
	public void setIs_active(int value) {
		this.is_active = value;
	}
	
	public int getIs_active() {
		return is_active;
	}
	
	public void setIs_general_admin(int value) {
		this.is_general_admin = value;
	}
	
	public int getIs_general_admin() {
		return is_general_admin;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setGroup_user(java.util.Set value) {
		this.group_user = value;
	}
	
	public java.util.Set getGroup_user() {
		return group_user;
	}
	
	
	public void setTask(java.util.Set value) {
		this.task = value;
	}
	
	public java.util.Set getTask() {
		return task;
	}
	
	
	public void setTask1(java.util.Set value) {
		this.task1 = value;
	}
	
	public java.util.Set getTask1() {
		return task1;
	}
	
	
	public void setTask_activity(java.util.Set value) {
		this.task_activity = value;
	}
	
	public java.util.Set getTask_activity() {
		return task_activity;
	}
	
	
	public String toString() {
		return String.valueOf(getUser_detail_id());
	}
	
}
