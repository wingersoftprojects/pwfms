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
@Table(name="company_process")
public class Company_process implements Serializable {
	public Company_process() {
	}
	
	public static Company_process loadCompany_processByORMID(int company_process_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompany_processByORMID(session, company_process_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process getCompany_processByORMID(int company_process_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getCompany_processByORMID(session, company_process_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByORMID(int company_process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompany_processByORMID(session, company_process_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process getCompany_processByORMID(int company_process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getCompany_processByORMID(session, company_process_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByORMID(PersistentSession session, int company_process_id) throws PersistentException {
		try {
			return (Company_process) session.load(pwfms.Company_process.class, new Integer(company_process_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process getCompany_processByORMID(PersistentSession session, int company_process_id) throws PersistentException {
		try {
			return (Company_process) session.get(pwfms.Company_process.class, new Integer(company_process_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByORMID(PersistentSession session, int company_process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company_process) session.load(pwfms.Company_process.class, new Integer(company_process_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process getCompany_processByORMID(PersistentSession session, int company_process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company_process) session.get(pwfms.Company_process.class, new Integer(company_process_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_process(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryCompany_process(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_process(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryCompany_process(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process[] listCompany_processByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listCompany_processByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process[] listCompany_processByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listCompany_processByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany_process(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company_process as Company_process");
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
	
	public static List queryCompany_process(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company_process as Company_process");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company_process", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process[] listCompany_processByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompany_process(session, condition, orderBy);
			return (Company_process[]) list.toArray(new Company_process[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process[] listCompany_processByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompany_process(session, condition, orderBy, lockMode);
			return (Company_process[]) list.toArray(new Company_process[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompany_processByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompany_processByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Company_process[] company_processes = listCompany_processByQuery(session, condition, orderBy);
		if (company_processes != null && company_processes.length > 0)
			return company_processes[0];
		else
			return null;
	}
	
	public static Company_process loadCompany_processByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Company_process[] company_processes = listCompany_processByQuery(session, condition, orderBy, lockMode);
		if (company_processes != null && company_processes.length > 0)
			return company_processes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompany_processByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateCompany_processByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_processByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateCompany_processByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompany_processByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company_process as Company_process");
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
	
	public static java.util.Iterator iterateCompany_processByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company_process as Company_process");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company_process", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company_process loadCompany_processByCriteria(Company_processCriteria company_processCriteria) {
		Company_process[] company_processes = listCompany_processByCriteria(company_processCriteria);
		if(company_processes == null || company_processes.length == 0) {
			return null;
		}
		return company_processes[0];
	}
	
	public static Company_process[] listCompany_processByCriteria(Company_processCriteria company_processCriteria) {
		return company_processCriteria.listCompany_process();
	}
	
	public static Company_process createCompany_process() {
		return new pwfms.Company_process();
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
				getCompany().getCompany_process().remove(this);
			}
			
			pwfms.Activity[] lActivitys = (pwfms.Activity[])getActivity().toArray(new pwfms.Activity[getActivity().size()]);
			for(int i = 0; i < lActivitys.length; i++) {
				lActivitys[i].setCompany_process(null);
			}
			pwfms.Task[] lTasks = (pwfms.Task[])getTask().toArray(new pwfms.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setCompany_process(null);
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
				getCompany().getCompany_process().remove(this);
			}
			
			pwfms.Activity[] lActivitys = (pwfms.Activity[])getActivity().toArray(new pwfms.Activity[getActivity().size()]);
			for(int i = 0; i < lActivitys.length; i++) {
				lActivitys[i].setCompany_process(null);
			}
			pwfms.Task[] lTasks = (pwfms.Task[])getTask().toArray(new pwfms.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setCompany_process(null);
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
	
	@Column(name="company_process_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_COMPANY_PROCESS_COMPANY_PROCESS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_COMPANY_PROCESS_COMPANY_PROCESS_ID_GENERATOR", strategy="native")	
	private int company_process_id;
	
	@Column(name="process_name", nullable=false, unique=true, length=50)	
	private String process_name;
	
	@Column(name="process_description", nullable=true, length=250)	
	private String process_description;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="company_process", targetEntity=pwfms.Activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity = new java.util.HashSet();
	
	@OneToMany(mappedBy="company_process", targetEntity=pwfms.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task = new java.util.HashSet();
	
	private void setCompany_process_id(int value) {
		this.company_process_id = value;
	}
	
	public int getCompany_process_id() {
		return company_process_id;
	}
	
	public int getORMID() {
		return getCompany_process_id();
	}
	
	public void setProcess_name(String value) {
		this.process_name = value;
	}
	
	public String getProcess_name() {
		return process_name;
	}
	
	public void setProcess_description(String value) {
		this.process_description = value;
	}
	
	public String getProcess_description() {
		return process_description;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setActivity(java.util.Set value) {
		this.activity = value;
	}
	
	public java.util.Set getActivity() {
		return activity;
	}
	
	
	public void setTask(java.util.Set value) {
		this.task = value;
	}
	
	public java.util.Set getTask() {
		return task;
	}
	
	
	public String toString() {
		return String.valueOf(getCompany_process_id());
	}
	
}
