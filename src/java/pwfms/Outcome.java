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
@Table(name="outcome")
public class Outcome implements Serializable {
	public Outcome() {
	}
	
	public static Outcome loadOutcomeByORMID(int outcome_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadOutcomeByORMID(session, outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(int outcome_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getOutcomeByORMID(session, outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByORMID(int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadOutcomeByORMID(session, outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getOutcomeByORMID(session, outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByORMID(PersistentSession session, int outcome_id) throws PersistentException {
		try {
			return (Outcome) session.load(pwfms.Outcome.class, new Integer(outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(PersistentSession session, int outcome_id) throws PersistentException {
		try {
			return (Outcome) session.get(pwfms.Outcome.class, new Integer(outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByORMID(PersistentSession session, int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Outcome) session.load(pwfms.Outcome.class, new Integer(outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome getOutcomeByORMID(PersistentSession session, int outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Outcome) session.get(pwfms.Outcome.class, new Integer(outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOutcome(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryOutcome(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOutcome(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryOutcome(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listOutcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listOutcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOutcome(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Outcome as Outcome");
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
	
	public static List queryOutcome(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Outcome as Outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Outcome", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOutcome(session, condition, orderBy);
			return (Outcome[]) list.toArray(new Outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome[] listOutcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOutcome(session, condition, orderBy, lockMode);
			return (Outcome[]) list.toArray(new Outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadOutcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadOutcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Outcome[] outcomes = listOutcomeByQuery(session, condition, orderBy);
		if (outcomes != null && outcomes.length > 0)
			return outcomes[0];
		else
			return null;
	}
	
	public static Outcome loadOutcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Outcome[] outcomes = listOutcomeByQuery(session, condition, orderBy, lockMode);
		if (outcomes != null && outcomes.length > 0)
			return outcomes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOutcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateOutcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOutcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateOutcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOutcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Outcome as Outcome");
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
	
	public static java.util.Iterator iterateOutcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Outcome as Outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Outcome", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Outcome loadOutcomeByCriteria(OutcomeCriteria outcomeCriteria) {
		Outcome[] outcomes = listOutcomeByCriteria(outcomeCriteria);
		if(outcomes == null || outcomes.length == 0) {
			return null;
		}
		return outcomes[0];
	}
	
	public static Outcome[] listOutcomeByCriteria(OutcomeCriteria outcomeCriteria) {
		return outcomeCriteria.listOutcome();
	}
	
	public static Outcome createOutcome() {
		return new pwfms.Outcome();
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
				getCompany().getOutcome().remove(this);
			}
			
			pwfms.Activity_outcome[] lActivity_outcomes = (pwfms.Activity_outcome[])getActivity_outcome().toArray(new pwfms.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setOutcome(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setOutcome(null);
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
				getCompany().getOutcome().remove(this);
			}
			
			pwfms.Activity_outcome[] lActivity_outcomes = (pwfms.Activity_outcome[])getActivity_outcome().toArray(new pwfms.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setOutcome(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setOutcome(null);
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
	
	@Column(name="outcome_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_OUTCOME_OUTCOME_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_OUTCOME_OUTCOME_ID_GENERATOR", strategy="native")	
	private int outcome_id;
	
	@Column(name="outcome_name", nullable=false, length=50)	
	private String outcome_name;
	
	@Column(name="is_success", nullable=false, length=1)	
	private int is_success;
	
	@Column(name="is_failure", nullable=false, length=1)	
	private int is_failure;
	
	@ManyToOne(targetEntity=pwfms.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_id", referencedColumnName="company_id", nullable=false) })	
	private pwfms.Company company;
	
	@OneToMany(mappedBy="outcome", targetEntity=pwfms.Activity_outcome.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_outcome = new java.util.HashSet();
	
	@OneToMany(mappedBy="outcome", targetEntity=pwfms.Task_activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity = new java.util.HashSet();
	
	private void setOutcome_id(int value) {
		this.outcome_id = value;
	}
	
	public int getOutcome_id() {
		return outcome_id;
	}
	
	public int getORMID() {
		return getOutcome_id();
	}
	
	public void setOutcome_name(String value) {
		this.outcome_name = value;
	}
	
	public String getOutcome_name() {
		return outcome_name;
	}
	
	public void setIs_success(int value) {
		this.is_success = value;
	}
	
	public int getIs_success() {
		return is_success;
	}
	
	public void setIs_failure(int value) {
		this.is_failure = value;
	}
	
	public int getIs_failure() {
		return is_failure;
	}
	
	public void setCompany(pwfms.Company value) {
		this.company = value;
	}
	
	public pwfms.Company getCompany() {
		return company;
	}
	
	public void setActivity_outcome(java.util.Set value) {
		this.activity_outcome = value;
	}
	
	public java.util.Set getActivity_outcome() {
		return activity_outcome;
	}
	
	
	public void setTask_activity(java.util.Set value) {
		this.task_activity = value;
	}
	
	public java.util.Set getTask_activity() {
		return task_activity;
	}
	
	
	public String toString() {
		return String.valueOf(getOutcome_id());
	}
	
}
