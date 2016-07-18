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
@Table(name="section")
public class Section implements Serializable {
	public Section() {
	}
	
	public static Section loadSectionByORMID(int section_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadSectionByORMID(session, section_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section getSectionByORMID(int section_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getSectionByORMID(session, section_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByORMID(int section_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadSectionByORMID(session, section_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section getSectionByORMID(int section_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getSectionByORMID(session, section_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByORMID(PersistentSession session, int section_id) throws PersistentException {
		try {
			return (Section) session.load(pwfms.Section.class, new Integer(section_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section getSectionByORMID(PersistentSession session, int section_id) throws PersistentException {
		try {
			return (Section) session.get(pwfms.Section.class, new Integer(section_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByORMID(PersistentSession session, int section_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Section) session.load(pwfms.Section.class, new Integer(section_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section getSectionByORMID(PersistentSession session, int section_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Section) session.get(pwfms.Section.class, new Integer(section_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySection(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return querySection(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySection(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return querySection(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section[] listSectionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listSectionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section[] listSectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listSectionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySection(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Section as Section");
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
	
	public static List querySection(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Section as Section");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Section", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section[] listSectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySection(session, condition, orderBy);
			return (Section[]) list.toArray(new Section[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section[] listSectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySection(session, condition, orderBy, lockMode);
			return (Section[]) list.toArray(new Section[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadSectionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadSectionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Section[] sections = listSectionByQuery(session, condition, orderBy);
		if (sections != null && sections.length > 0)
			return sections[0];
		else
			return null;
	}
	
	public static Section loadSectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Section[] sections = listSectionByQuery(session, condition, orderBy, lockMode);
		if (sections != null && sections.length > 0)
			return sections[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSectionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateSectionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateSectionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Section as Section");
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
	
	public static java.util.Iterator iterateSectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Section as Section");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Section", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Section loadSectionByCriteria(SectionCriteria sectionCriteria) {
		Section[] sections = listSectionByCriteria(sectionCriteria);
		if(sections == null || sections.length == 0) {
			return null;
		}
		return sections[0];
	}
	
	public static Section[] listSectionByCriteria(SectionCriteria sectionCriteria) {
		return sectionCriteria.listSection();
	}
	
	public static Section createSection() {
		return new pwfms.Section();
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
				getActivity().getSection().remove(this);
			}
			
			pwfms.Activity_data_element[] lActivity_data_elements = (pwfms.Activity_data_element[])getActivity_data_element().toArray(new pwfms.Activity_data_element[getActivity_data_element().size()]);
			for(int i = 0; i < lActivity_data_elements.length; i++) {
				lActivity_data_elements[i].setSection(null);
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
				getActivity().getSection().remove(this);
			}
			
			pwfms.Activity_data_element[] lActivity_data_elements = (pwfms.Activity_data_element[])getActivity_data_element().toArray(new pwfms.Activity_data_element[getActivity_data_element().size()]);
			for(int i = 0; i < lActivity_data_elements.length; i++) {
				lActivity_data_elements[i].setSection(null);
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
	
	@Column(name="section_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_SECTION_SECTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_SECTION_SECTION_ID_GENERATOR", strategy="native")	
	private int section_id;
	
	@Column(name="section_name", nullable=false, length=100)	
	private String section_name;
	
	@Column(name="section_order", nullable=false, length=4)	
	private int section_order;
	
	@ManyToOne(targetEntity=pwfms.Activity.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="activity_id", referencedColumnName="activity_id", nullable=false) })	
	private pwfms.Activity activity;
	
	@OneToMany(mappedBy="section", targetEntity=pwfms.Activity_data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set activity_data_element = new java.util.HashSet();
	
	private void setSection_id(int value) {
		this.section_id = value;
	}
	
	public int getSection_id() {
		return section_id;
	}
	
	public int getORMID() {
		return getSection_id();
	}
	
	public void setSection_name(String value) {
		this.section_name = value;
	}
	
	public String getSection_name() {
		return section_name;
	}
	
	public void setSection_order(int value) {
		this.section_order = value;
	}
	
	public int getSection_order() {
		return section_order;
	}
	
	public void setActivity(pwfms.Activity value) {
		this.activity = value;
	}
	
	public pwfms.Activity getActivity() {
		return activity;
	}
	
	public void setActivity_data_element(java.util.Set value) {
		this.activity_data_element = value;
	}
	
	public java.util.Set getActivity_data_element() {
		return activity_data_element;
	}
	
	
	public String toString() {
		return String.valueOf(getSection_id());
	}
	
}
