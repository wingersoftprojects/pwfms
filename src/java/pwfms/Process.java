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
@Table(name="process")
public class Process implements Serializable {
	public Process() {
	}
	
	public static Process loadProcessByORMID(int process_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadProcessByORMID(session, process_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process getProcessByORMID(int process_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getProcessByORMID(session, process_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByORMID(int process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadProcessByORMID(session, process_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process getProcessByORMID(int process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getProcessByORMID(session, process_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByORMID(PersistentSession session, int process_id) throws PersistentException {
		try {
			return (Process) session.load(pwfms.Process.class, new Integer(process_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process getProcessByORMID(PersistentSession session, int process_id) throws PersistentException {
		try {
			return (Process) session.get(pwfms.Process.class, new Integer(process_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByORMID(PersistentSession session, int process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Process) session.load(pwfms.Process.class, new Integer(process_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process getProcessByORMID(PersistentSession session, int process_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Process) session.get(pwfms.Process.class, new Integer(process_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProcess(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryProcess(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProcess(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryProcess(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process[] listProcessByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listProcessByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process[] listProcessByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listProcessByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProcess(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Process as Process");
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
	
	public static List queryProcess(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Process as Process");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Process", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process[] listProcessByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProcess(session, condition, orderBy);
			return (Process[]) list.toArray(new Process[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process[] listProcessByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProcess(session, condition, orderBy, lockMode);
			return (Process[]) list.toArray(new Process[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadProcessByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadProcessByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Process[] processes = listProcessByQuery(session, condition, orderBy);
		if (processes != null && processes.length > 0)
			return processes[0];
		else
			return null;
	}
	
	public static Process loadProcessByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Process[] processes = listProcessByQuery(session, condition, orderBy, lockMode);
		if (processes != null && processes.length > 0)
			return processes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProcessByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateProcessByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProcessByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateProcessByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProcessByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Process as Process");
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
	
	public static java.util.Iterator iterateProcessByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Process as Process");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Process", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Process loadProcessByCriteria(ProcessCriteria processCriteria) {
		Process[] processes = listProcessByCriteria(processCriteria);
		if(processes == null || processes.length == 0) {
			return null;
		}
		return processes[0];
	}
	
	public static Process[] listProcessByCriteria(ProcessCriteria processCriteria) {
		return processCriteria.listProcess();
	}
	
	public static Process createProcess() {
		return new pwfms.Process();
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
				getCompany().getProcess().remove(this);
			}
			
			pwfms.Activity[] lActivitys = (pwfms.Activity[])getActivity().toArray(new pwfms.Activity[getActivity().size()]);
			for(int i = 0; i < lActivitys.length; i++) {
				lActivitys[i].setProcess(null);
			}
			pwfms.Task[] lTasks = (pwfms.Task[])getTask().toArray(new pwfms.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setProcess(null);
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
				getCompany().getProcess().remove(this);
			}
			
			pwfms.Activity[] lActivitys = (pwfms.Activity[])getActivity().toArray(new pwfms.Activity[getActivity().size()]);
			for(int i = 0; i < lActivitys.length; i++) {
				lActivitys[i].setProcess(null);
			}
			pwfms.Task[] lTasks = (pwfms.Task[])getTask().toArray(new pwfms.Task[getTask().size()]);
			for(int i = 0; i < lTasks.length; i++) {
				lTasks[i].setProcess(null);
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
	
	@Column(name="process_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_PROCESS_PROCESS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_PROCESS_PROCESS_ID_GENERATOR", strategy="native")	
	private int process_id;
	
	@Column(name="process_name", nullable=false, unique=true, length=50)	
	private String process_name;
	
	@Column(name="process_description", nullable=true, length=250)	
	private String process_description;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="process", targetEntity=pwfms.Activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity = new java.util.HashSet();
	
	@OneToMany(mappedBy="process", targetEntity=pwfms.Task.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task = new java.util.HashSet();
	
	private void setProcess_id(int value) {
		this.process_id = value;
	}
	
	public int getProcess_id() {
		return process_id;
	}
	
	public int getORMID() {
		return getProcess_id();
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
		return String.valueOf(getProcess_id());
	}
	
}
