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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CompanyCriteria extends AbstractORMCriteria {
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
	
	public CompanyCriteria(Criteria criteria) {
		super(criteria);
		company_id = new IntegerExpression("company_id", this);
		company_name = new StringExpression("company_name", this);
		address = new StringExpression("address", this);
		logo = new BlobExpression("logo", this);
		email = new StringExpression("email", this);
		phone = new StringExpression("phone", this);
		company_process = new CollectionExpression("company_process", this);
		document_type = new CollectionExpression("document_type", this);
		user_detail = new CollectionExpression("user_detail", this);
		group_detail = new CollectionExpression("group_detail", this);
		entity_type = new CollectionExpression("entity_type", this);
		data_element = new CollectionExpression("data_element", this);
		data_element_category = new CollectionExpression("data_element_category", this);
		outcome = new CollectionExpression("outcome", this);
	}
	
	public CompanyCriteria(PersistentSession session) {
		this(session.createCriteria(Company.class));
	}
	
	public CompanyCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Company_processCriteria createCompany_processCriteria() {
		return new Company_processCriteria(createCriteria("company_process"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public User_detailCriteria createUser_detailCriteria() {
		return new User_detailCriteria(createCriteria("user_detail"));
	}
	
	public Group_detailCriteria createGroup_detailCriteria() {
		return new Group_detailCriteria(createCriteria("group_detail"));
	}
	
	public Entity_typeCriteria createEntity_typeCriteria() {
		return new Entity_typeCriteria(createCriteria("entity_type"));
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public Data_element_categoryCriteria createData_element_categoryCriteria() {
		return new Data_element_categoryCriteria(createCriteria("data_element_category"));
	}
	
	public OutcomeCriteria createOutcomeCriteria() {
		return new OutcomeCriteria(createCriteria("outcome"));
	}
	
	public Company uniqueCompany() {
		return (Company) super.uniqueResult();
	}
	
	public Company[] listCompany() {
		java.util.List list = super.list();
		return (Company[]) list.toArray(new Company[list.size()]);
	}
}

