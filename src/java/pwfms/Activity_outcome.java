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
@Table(name="activity_outcome")
public class Activity_outcome implements Serializable {
	public Activity_outcome() {
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(int activity_outcome_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_outcomeByORMID(session, activity_outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(int activity_outcome_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_outcomeByORMID(session, activity_outcome_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_outcomeByORMID(session, activity_outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivity_outcomeByORMID(session, activity_outcome_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id) throws PersistentException {
		try {
			return (Activity_outcome) session.load(pwfms.Activity_outcome.class, new Integer(activity_outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id) throws PersistentException {
		try {
			return (Activity_outcome) session.get(pwfms.Activity_outcome.class, new Integer(activity_outcome_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_outcome) session.load(pwfms.Activity_outcome.class, new Integer(activity_outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome getActivity_outcomeByORMID(PersistentSession session, int activity_outcome_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity_outcome) session.get(pwfms.Activity_outcome.class, new Integer(activity_outcome_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_outcome(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_outcome(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_outcome(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity_outcome(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_outcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity_outcome(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_outcome as Activity_outcome");
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
	
	public static List queryActivity_outcome(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_outcome as Activity_outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_outcome", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity_outcome(session, condition, orderBy);
			return (Activity_outcome[]) list.toArray(new Activity_outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome[] listActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity_outcome(session, condition, orderBy, lockMode);
			return (Activity_outcome[]) list.toArray(new Activity_outcome[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_outcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity_outcome[] activity_outcomes = listActivity_outcomeByQuery(session, condition, orderBy);
		if (activity_outcomes != null && activity_outcomes.length > 0)
			return activity_outcomes[0];
		else
			return null;
	}
	
	public static Activity_outcome loadActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity_outcome[] activity_outcomes = listActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		if (activity_outcomes != null && activity_outcomes.length > 0)
			return activity_outcomes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_outcomeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivity_outcomeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_outcome as Activity_outcome");
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
	
	public static java.util.Iterator iterateActivity_outcomeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity_outcome as Activity_outcome");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity_outcome", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity_outcome loadActivity_outcomeByCriteria(Activity_outcomeCriteria activity_outcomeCriteria) {
		Activity_outcome[] activity_outcomes = listActivity_outcomeByCriteria(activity_outcomeCriteria);
		if(activity_outcomes == null || activity_outcomes.length == 0) {
			return null;
		}
		return activity_outcomes[0];
	}
	
	public static Activity_outcome[] listActivity_outcomeByCriteria(Activity_outcomeCriteria activity_outcomeCriteria) {
		return activity_outcomeCriteria.listActivity_outcome();
	}
	
	public static Activity_outcome createActivity_outcome() {
		return new pwfms.Activity_outcome();
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
			if(getActivity() != null) {
				getActivity().getActivity_outcome().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getActivity_outcome().remove(this);
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
			if(getActivity() != null) {
				getActivity().getActivity_outcome().remove(this);
			}
			
			if(getOutcome() != null) {
				getOutcome().getActivity_outcome().remove(this);
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
	
	@Column(name="activity_outcome_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ACTIVITY_OUTCOME_ACTIVITY_OUTCOME_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ACTIVITY_OUTCOME_ACTIVITY_OUTCOME_ID_GENERATOR", strategy="native")	
	private int activity_outcome_id;
	
	@ManyToOne(targetEntity=pwfms.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private pwfms.Activity activity;
	
	@ManyToOne(targetEntity=pwfms.Outcome.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="outcome_id", referencedColumnName="outcome_id", nullable=false) })	
	private pwfms.Outcome outcome;
	
	private void setActivity_outcome_id(int value) {
		this.activity_outcome_id = value;
	}
	
	public int getActivity_outcome_id() {
		return activity_outcome_id;
	}
	
	public int getORMID() {
		return getActivity_outcome_id();
	}
	
	public void setActivity(pwfms.Activity value) {
		this.activity = value;
	}
	
	public pwfms.Activity getActivity() {
		return activity;
	}
	
	public void setOutcome(pwfms.Outcome value) {
		this.outcome = value;
	}
	
	public pwfms.Outcome getOutcome() {
		return outcome;
	}
	
	public String toString() {
		return String.valueOf(getActivity_outcome_id());
	}
	
}
