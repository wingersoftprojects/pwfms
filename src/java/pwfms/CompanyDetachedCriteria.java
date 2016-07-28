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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CompanyDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression company_id;
	public final StringExpression company_name;
	public final StringExpression address;
	public final BlobExpression logo;
	public final StringExpression email;
	public final StringExpression phone;
	public final CollectionExpression company_process;
	public final CollectionExpression document_type;
	public final CollectionExpression user_detail;
	public final CollectionExpression group_detail;
	public final CollectionExpression entity_type;
	public final CollectionExpression data_element;
	public final CollectionExpression data_element_category;
	public final CollectionExpression outcome;
	
	public CompanyDetachedCriteria() {
		super(pwfms.Company.class, pwfms.CompanyCriteria.class);
		company_id = new IntegerExpression("company_id", this.getDetachedCriteria());
		company_name = new StringExpression("company_name", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		logo = new BlobExpression("logo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		phone = new StringExpression("phone", this.getDetachedCriteria());
		company_process = new CollectionExpression("company_process", this.getDetachedCriteria());
		document_type = new CollectionExpression("document_type", this.getDetachedCriteria());
		user_detail = new CollectionExpression("user_detail", this.getDetachedCriteria());
		group_detail = new CollectionExpression("group_detail", this.getDetachedCriteria());
		entity_type = new CollectionExpression("entity_type", this.getDetachedCriteria());
		data_element = new CollectionExpression("data_element", this.getDetachedCriteria());
		data_element_category = new CollectionExpression("data_element_category", this.getDetachedCriteria());
		outcome = new CollectionExpression("outcome", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.CompanyCriteria.class);
		company_id = new IntegerExpression("company_id", this.getDetachedCriteria());
		company_name = new StringExpression("company_name", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		logo = new BlobExpression("logo", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		phone = new StringExpression("phone", this.getDetachedCriteria());
		company_process = new CollectionExpression("company_process", this.getDetachedCriteria());
		document_type = new CollectionExpression("document_type", this.getDetachedCriteria());
		user_detail = new CollectionExpression("user_detail", this.getDetachedCriteria());
		group_detail = new CollectionExpression("group_detail", this.getDetachedCriteria());
		entity_type = new CollectionExpression("entity_type", this.getDetachedCriteria());
		data_element = new CollectionExpression("data_element", this.getDetachedCriteria());
		data_element_category = new CollectionExpression("data_element_category", this.getDetachedCriteria());
		outcome = new CollectionExpression("outcome", this.getDetachedCriteria());
	}
	
	public Company_processDetachedCriteria createCompany_processCriteria() {
		return new Company_processDetachedCriteria(createCriteria("company_process"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public User_detailDetachedCriteria createUser_detailCriteria() {
		return new User_detailDetachedCriteria(createCriteria("user_detail"));
	}
	
	public Group_detailDetachedCriteria createGroup_detailCriteria() {
		return new Group_detailDetachedCriteria(createCriteria("group_detail"));
	}
	
	public Entity_typeDetachedCriteria createEntity_typeCriteria() {
		return new Entity_typeDetachedCriteria(createCriteria("entity_type"));
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public Data_element_categoryDetachedCriteria createData_element_categoryCriteria() {
		return new Data_element_categoryDetachedCriteria(createCriteria("data_element_category"));
	}
	
	public OutcomeDetachedCriteria createOutcomeCriteria() {
		return new OutcomeDetachedCriteria(createCriteria("outcome"));
	}
	
	public Company uniqueCompany(PersistentSession session) {
		return (Company) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Company[] listCompany(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Company[]) list.toArray(new Company[list.size()]);
	}
}

