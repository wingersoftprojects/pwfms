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
@Table(name="company")
public class Company implements Serializable {
	public Company() {
	}
	
	public static Company loadCompanyByORMID(int company_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompanyByORMID(session, company_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company getCompanyByORMID(int company_id) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getCompanyByORMID(session, company_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByORMID(int company_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompanyByORMID(session, company_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company getCompanyByORMID(int company_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return getCompanyByORMID(session, company_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByORMID(PersistentSession session, int company_id) throws PersistentException {
		try {
			return (Company) session.load(pwfms.Company.class, new Integer(company_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company getCompanyByORMID(PersistentSession session, int company_id) throws PersistentException {
		try {
			return (Company) session.get(pwfms.Company.class, new Integer(company_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByORMID(PersistentSession session, int company_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company) session.load(pwfms.Company.class, new Integer(company_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company getCompanyByORMID(PersistentSession session, int company_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Company) session.get(pwfms.Company.class, new Integer(company_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryCompany(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return queryCompany(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company[] listCompanyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listCompanyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company[] listCompanyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return listCompanyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompany(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company as Company");
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
	
	public static List queryCompany(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company as Company");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company[] listCompanyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompany(session, condition, orderBy);
			return (Company[]) list.toArray(new Company[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company[] listCompanyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompany(session, condition, orderBy, lockMode);
			return (Company[]) list.toArray(new Company[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompanyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return loadCompanyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Company[] companys = listCompanyByQuery(session, condition, orderBy);
		if (companys != null && companys.length > 0)
			return companys[0];
		else
			return null;
	}
	
	public static Company loadCompanyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Company[] companys = listCompanyByQuery(session, condition, orderBy, lockMode);
		if (companys != null && companys.length > 0)
			return companys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompanyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateCompanyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompanyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = pwfms.PWFMPersistentManager.instance().getSession();
			return iterateCompanyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompanyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company as Company");
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
	
	public static java.util.Iterator iterateCompanyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From pwfms.Company as Company");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Company", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Company loadCompanyByCriteria(CompanyCriteria companyCriteria) {
		Company[] companys = listCompanyByCriteria(companyCriteria);
		if(companys == null || companys.length == 0) {
			return null;
		}
		return companys[0];
	}
	
	public static Company[] listCompanyByCriteria(CompanyCriteria companyCriteria) {
		return companyCriteria.listCompany();
	}
	
	public static Company createCompany() {
		return new pwfms.Company();
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
			pwfms.Company_process[] lCompany_processs = (pwfms.Company_process[])getCompany_process().toArray(new pwfms.Company_process[getCompany_process().size()]);
			for(int i = 0; i < lCompany_processs.length; i++) {
				lCompany_processs[i].setCompany(null);
			}
			pwfms.Document_type[] lDocument_types = (pwfms.Document_type[])getDocument_type().toArray(new pwfms.Document_type[getDocument_type().size()]);
			for(int i = 0; i < lDocument_types.length; i++) {
				lDocument_types[i].setCompany(null);
			}
			pwfms.User_detail[] lUser_details = (pwfms.User_detail[])getUser_detail().toArray(new pwfms.User_detail[getUser_detail().size()]);
			for(int i = 0; i < lUser_details.length; i++) {
				lUser_details[i].setCompany(null);
			}
			pwfms.Group_detail[] lGroup_details = (pwfms.Group_detail[])getGroup_detail().toArray(new pwfms.Group_detail[getGroup_detail().size()]);
			for(int i = 0; i < lGroup_details.length; i++) {
				lGroup_details[i].setCompany(null);
			}
			pwfms.Entity_type[] lEntity_types = (pwfms.Entity_type[])getEntity_type().toArray(new pwfms.Entity_type[getEntity_type().size()]);
			for(int i = 0; i < lEntity_types.length; i++) {
				lEntity_types[i].setCompany(null);
			}
			pwfms.Data_element[] lData_elements = (pwfms.Data_element[])getData_element().toArray(new pwfms.Data_element[getData_element().size()]);
			for(int i = 0; i < lData_elements.length; i++) {
				lData_elements[i].setCompany(null);
			}
			pwfms.Data_element_category[] lData_element_categorys = (pwfms.Data_element_category[])getData_element_category().toArray(new pwfms.Data_element_category[getData_element_category().size()]);
			for(int i = 0; i < lData_element_categorys.length; i++) {
				lData_element_categorys[i].setCompany(null);
			}
			pwfms.Outcome[] lOutcomes = (pwfms.Outcome[])getOutcome().toArray(new pwfms.Outcome[getOutcome().size()]);
			for(int i = 0; i < lOutcomes.length; i++) {
				lOutcomes[i].setCompany(null);
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
			pwfms.Company_process[] lCompany_processs = (pwfms.Company_process[])getCompany_process().toArray(new pwfms.Company_process[getCompany_process().size()]);
			for(int i = 0; i < lCompany_processs.length; i++) {
				lCompany_processs[i].setCompany(null);
			}
			pwfms.Document_type[] lDocument_types = (pwfms.Document_type[])getDocument_type().toArray(new pwfms.Document_type[getDocument_type().size()]);
			for(int i = 0; i < lDocument_types.length; i++) {
				lDocument_types[i].setCompany(null);
			}
			pwfms.User_detail[] lUser_details = (pwfms.User_detail[])getUser_detail().toArray(new pwfms.User_detail[getUser_detail().size()]);
			for(int i = 0; i < lUser_details.length; i++) {
				lUser_details[i].setCompany(null);
			}
			pwfms.Group_detail[] lGroup_details = (pwfms.Group_detail[])getGroup_detail().toArray(new pwfms.Group_detail[getGroup_detail().size()]);
			for(int i = 0; i < lGroup_details.length; i++) {
				lGroup_details[i].setCompany(null);
			}
			pwfms.Entity_type[] lEntity_types = (pwfms.Entity_type[])getEntity_type().toArray(new pwfms.Entity_type[getEntity_type().size()]);
			for(int i = 0; i < lEntity_types.length; i++) {
				lEntity_types[i].setCompany(null);
			}
			pwfms.Data_element[] lData_elements = (pwfms.Data_element[])getData_element().toArray(new pwfms.Data_element[getData_element().size()]);
			for(int i = 0; i < lData_elements.length; i++) {
				lData_elements[i].setCompany(null);
			}
			pwfms.Data_element_category[] lData_element_categorys = (pwfms.Data_element_category[])getData_element_category().toArray(new pwfms.Data_element_category[getData_element_category().size()]);
			for(int i = 0; i < lData_element_categorys.length; i++) {
				lData_element_categorys[i].setCompany(null);
			}
			pwfms.Outcome[] lOutcomes = (pwfms.Outcome[])getOutcome().toArray(new pwfms.Outcome[getOutcome().size()]);
			for(int i = 0; i < lOutcomes.length; i++) {
				lOutcomes[i].setCompany(null);
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
	
	@Column(name="company_id", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="PWFMS_COMPANY_COMPANY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PWFMS_COMPANY_COMPANY_ID_GENERATOR", strategy="native")	
	private int company_id;
	
	@Column(name="company_name", nullable=false, unique=true, length=50)	
	private String company_name;
	
	@Column(name="address", nullable=true, length=200)	
	private String address;
	
	@Column(name="logo", nullable=true)	
	private java.sql.Blob logo;
	
	@Column(name="email", nullable=true, length=100)	
	private String email;
	
	@Column(name="phone", nullable=true, length=50)	
	private String phone;
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Company_process.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set company_process = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Document_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set document_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.User_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set user_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Group_detail.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_detail = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Entity_type.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set entity_type = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Data_element.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set data_element = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Data_element_category.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set data_element_category = new java.util.HashSet();
	
	@OneToMany(mappedBy="company", targetEntity=pwfms.Outcome.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set outcome = new java.util.HashSet();
	
	private void setCompany_id(int value) {
		this.company_id = value;
	}
	
	public int getCompany_id() {
		return company_id;
	}
	
	public int getORMID() {
		return getCompany_id();
	}
	
	public void setCompany_name(String value) {
		this.company_name = value;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setLogo(java.sql.Blob value) {
		this.logo = value;
	}
	
	public java.sql.Blob getLogo() {
		return logo;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCompany_process(java.util.Set value) {
		this.company_process = value;
	}
	
	public java.util.Set getCompany_process() {
		return company_process;
	}
	
	
	public void setDocument_type(java.util.Set value) {
		this.document_type = value;
	}
	
	public java.util.Set getDocument_type() {
		return document_type;
	}
	
	
	public void setUser_detail(java.util.Set value) {
		this.user_detail = value;
	}
	
	public java.util.Set getUser_detail() {
		return user_detail;
	}
	
	
	public void setGroup_detail(java.util.Set value) {
		this.group_detail = value;
	}
	
	public java.util.Set getGroup_detail() {
		return group_detail;
	}
	
	
	public void setEntity_type(java.util.Set value) {
		this.entity_type = value;
	}
	
	public java.util.Set getEntity_type() {
		return entity_type;
	}
	
	
	public void setData_element(java.util.Set value) {
		this.data_element = value;
	}
	
	public java.util.Set getData_element() {
		return data_element;
	}
	
	
	public void setData_element_category(java.util.Set value) {
		this.data_element_category = value;
	}
	
	public java.util.Set getData_element_category() {
		return data_element_category;
	}
	
	
	public void setOutcome(java.util.Set value) {
		this.outcome = value;
	}
	
	public java.util.Set getOutcome() {
		return outcome;
	}
	
	
	public String toString() {
		return String.valueOf(getCompany_id());
	}
	
}
