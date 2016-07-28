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
@Table(name="activity")
public class Activity implements Serializable {
	public Activity() {
	}
	
	public static Activity loadActivityByORMID(int activity_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivityByORMID(session, activity_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(int activity_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivityByORMID(session, activity_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByORMID(int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivityByORMID(session, activity_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getActivityByORMID(session, activity_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByORMID(PersistentSession session, int activity_id) throws PersistentException {
		try {
			return (Activity) session.load(pwfms.Activity.class, new Integer(activity_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(PersistentSession session, int activity_id) throws PersistentException {
		try {
			return (Activity) session.get(pwfms.Activity.class, new Integer(activity_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByORMID(PersistentSession session, int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity) session.load(pwfms.Activity.class, new Integer(activity_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity getActivityByORMID(PersistentSession session, int activity_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Activity) session.get(pwfms.Activity.class, new Integer(activity_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryActivity(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listActivityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActivity(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity as Activity");
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
	
	public static List queryActivity(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity as Activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActivity(session, condition, orderBy);
			return (Activity[]) list.toArray(new Activity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity[] listActivityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActivity(session, condition, orderBy, lockMode);
			return (Activity[]) list.toArray(new Activity[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadActivityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Activity[] activitys = listActivityByQuery(session, condition, orderBy);
		if (activitys != null && activitys.length > 0)
			return activitys[0];
		else
			return null;
	}
	
	public static Activity loadActivityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Activity[] activitys = listActivityByQuery(session, condition, orderBy, lockMode);
		if (activitys != null && activitys.length > 0)
			return activitys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActivityByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivityByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateActivityByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActivityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity as Activity");
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
	
	public static java.util.Iterator iterateActivityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Activity as Activity");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Activity", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Activity loadActivityByCriteria(ActivityCriteria activityCriteria) {
		Activity[] activitys = listActivityByCriteria(activityCriteria);
		if(activitys == null || activitys.length == 0) {
			return null;
		}
		return activitys[0];
	}
	
	public static Activity[] listActivityByCriteria(ActivityCriteria activityCriteria) {
		return activityCriteria.listActivity();
	}
	
	public static Activity createActivity() {
		return new pwfms.Activity();
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
			if(getCompany_process() != null) {
				getCompany_process().getActivity().remove(this);
			}
			
			pwfms.Section[] lSections = (pwfms.Section[])getSection().toArray(new pwfms.Section[getSection().size()]);
			for(int i = 0; i < lSections.length; i++) {
				lSections[i].setActivity(null);
			}
			pwfms.Activity_data_element[] lActivity_data_elements = (pwfms.Activity_data_element[])getActivity_data_element().toArray(new pwfms.Activity_data_element[getActivity_data_element().size()]);
			for(int i = 0; i < lActivity_data_elements.length; i++) {
				lActivity_data_elements[i].setActivity(null);
			}
			pwfms.Activity_outcome[] lActivity_outcomes = (pwfms.Activity_outcome[])getActivity_outcome().toArray(new pwfms.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setActivity(null);
			}
			pwfms.Activity_document_type[] lActivity_document_types = (pwfms.Activity_document_type[])getActivity_document_type().toArray(new pwfms.Activity_document_type[getActivity_document_type().size()]);
			for(int i = 0; i < lActivity_document_types.length; i++) {
				lActivity_document_types[i].setActivity(null);
			}
			pwfms.Activity_entity_type[] lActivity_entity_types = (pwfms.Activity_entity_type[])getActivity_entity_type().toArray(new pwfms.Activity_entity_type[getActivity_entity_type().size()]);
			for(int i = 0; i < lActivity_entity_types.length; i++) {
				lActivity_entity_types[i].setActivity(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setActivity(null);
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
			if(getCompany_process() != null) {
				getCompany_process().getActivity().remove(this);
			}
			
			pwfms.Section[] lSections = (pwfms.Section[])getSection().toArray(new pwfms.Section[getSection().size()]);
			for(int i = 0; i < lSections.length; i++) {
				lSections[i].setActivity(null);
			}
			pwfms.Activity_data_element[] lActivity_data_elements = (pwfms.Activity_data_element[])getActivity_data_element().toArray(new pwfms.Activity_data_element[getActivity_data_element().size()]);
			for(int i = 0; i < lActivity_data_elements.length; i++) {
				lActivity_data_elements[i].setActivity(null);
			}
			pwfms.Activity_outcome[] lActivity_outcomes = (pwfms.Activity_outcome[])getActivity_outcome().toArray(new pwfms.Activity_outcome[getActivity_outcome().size()]);
			for(int i = 0; i < lActivity_outcomes.length; i++) {
				lActivity_outcomes[i].setActivity(null);
			}
			pwfms.Activity_document_type[] lActivity_document_types = (pwfms.Activity_document_type[])getActivity_document_type().toArray(new pwfms.Activity_document_type[getActivity_document_type().size()]);
			for(int i = 0; i < lActivity_document_types.length; i++) {
				lActivity_document_types[i].setActivity(null);
			}
			pwfms.Activity_entity_type[] lActivity_entity_types = (pwfms.Activity_entity_type[])getActivity_entity_type().toArray(new pwfms.Activity_entity_type[getActivity_entity_type().size()]);
			for(int i = 0; i < lActivity_entity_types.length; i++) {
				lActivity_entity_types[i].setActivity(null);
			}
			pwfms.Task_activity[] lTask_activitys = (pwfms.Task_activity[])getTask_activity().toArray(new pwfms.Task_activity[getTask_activity().size()]);
			for(int i = 0; i < lTask_activitys.length; i++) {
				lTask_activitys[i].setActivity(null);
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
	
	@Column(name="activity_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_ACTIVITY_ACTIVITY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_ACTIVITY_ACTIVITY_ID_GENERATOR", strategy="native")	
	private int activity_id;
	
	@Column(name="activity_name", nullable=false, length=100)	
	private String activity_name;
	
	@ManyToOne(targetEntity=pwfms.Company_process.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="company_process_id", referencedColumnName="company_process_id", nullable=false) })	
	private pwfms.Company_process company_process;
	
	@Column(name="is_start", nullable=true, length=1)	
	private Integer is_start;
	
	@Column(name="is_final", nullable=true, length=1)	
	private Integer is_final;
	
	@Column(name="from_activity_id", nullable=true, length=11)	
	private Integer from_activity_id;
	
	@Column(name="to_activity_id_success", nullable=true, length=11)	
	private Integer to_activity_id_success;
	
	@Column(name="to_activity_id_failure", nullable=true, length=11)	
	private Integer to_activity_id_failure;
	
	@Column(name="duration", nullable=true, length=4)	
	private Integer duration;
	
	@Column(name="flag_after", nullable=true, length=4)	
	private Integer flag_after;
	
	@OneToMany(mappedBy="activity", targetEntity=pwfms.Section.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set section = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=pwfms.Activity_data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_data_element = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=pwfms.Activity_outcome.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_outcome = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=pwfms.Activity_document_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_document_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=pwfms.Activity_entity_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_entity_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="activity", targetEntity=pwfms.Task_activity.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set task_activity = new java.util.HashSet();
	
	private void setActivity_id(int value) {
		this.activity_id = value;
	}
	
	public int getActivity_id() {
		return activity_id;
	}
	
	public int getORMID() {
		return getActivity_id();
	}
	
	public void setActivity_name(String value) {
		this.activity_name = value;
	}
	
	public String getActivity_name() {
		return activity_name;
	}
	
	public void setIs_start(int value) {
		setIs_start(new Integer(value));
	}
	
	public void setIs_start(Integer value) {
		this.is_start = value;
	}
	
	public Integer getIs_start() {
		return is_start;
	}
	
	public void setIs_final(int value) {
		setIs_final(new Integer(value));
	}
	
	public void setIs_final(Integer value) {
		this.is_final = value;
	}
	
	public Integer getIs_final() {
		return is_final;
	}
	
	public void setFrom_activity_id(int value) {
		setFrom_activity_id(new Integer(value));
	}
	
	public void setFrom_activity_id(Integer value) {
		this.from_activity_id = value;
	}
	
	public Integer getFrom_activity_id() {
		return from_activity_id;
	}
	
	public void setTo_activity_id_success(int value) {
		setTo_activity_id_success(new Integer(value));
	}
	
	public void setTo_activity_id_success(Integer value) {
		this.to_activity_id_success = value;
	}
	
	public Integer getTo_activity_id_success() {
		return to_activity_id_success;
	}
	
	public void setTo_activity_id_failure(int value) {
		setTo_activity_id_failure(new Integer(value));
	}
	
	public void setTo_activity_id_failure(Integer value) {
		this.to_activity_id_failure = value;
	}
	
	public Integer getTo_activity_id_failure() {
		return to_activity_id_failure;
	}
	
	public void setDuration(int value) {
		setDuration(new Integer(value));
	}
	
	public void setDuration(Integer value) {
		this.duration = value;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setFlag_after(int value) {
		setFlag_after(new Integer(value));
	}
	
	public void setFlag_after(Integer value) {
		this.flag_after = value;
	}
	
	public Integer getFlag_after() {
		return flag_after;
	}
	
	public void setCompany_process(pwfms.Company_process value) {
		this.company_process = value;
	}
	
	public pwfms.Company_process getCompany_process() {
		return company_process;
	}
	
	public void setSection(java.util.Set value) {
		this.section = value;
	}
	
	public java.util.Set getSection() {
		return section;
	}
	
	
	public void setActivity_data_element(java.util.Set value) {
		this.activity_data_element = value;
	}
	
	public java.util.Set getActivity_data_element() {
		return activity_data_element;
	}
	
	
	public void setActivity_outcome(java.util.Set value) {
		this.activity_outcome = value;
	}
	
	public java.util.Set getActivity_outcome() {
		return activity_outcome;
	}
	
	
	public void setActivity_document_type(java.util.Set value) {
		this.activity_document_type = value;
	}
	
	public java.util.Set getActivity_document_type() {
		return activity_document_type;
	}
	
	
	public void setActivity_entity_type(java.util.Set value) {
		this.activity_entity_type = value;
	}
	
	public java.util.Set getActivity_entity_type() {
		return activity_entity_type;
	}
	
	
	public void setTask_activity(java.util.Set value) {
		this.task_activity = value;
	}
	
	public java.util.Set getTask_activity() {
		return task_activity;
	}
	
	
	public String toString() {
		return String.valueOf(getActivity_id());
	}
	
}
