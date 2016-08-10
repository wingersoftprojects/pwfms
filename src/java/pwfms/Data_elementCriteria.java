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

public class Data_elementCriteria extends AbstractORMCriteria {
	public final IntegerExpression data_element_id;
	public final StringExpression data_element_code;
	public final StringExpression data_element_name;
	public final StringExpression data_type;
	public final IntegerExpression data_size;
	public final StringExpression description;
	public final IntegerExpression is_email;
	public final IntegerExpression is_phone;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final IntegerExpression data_element_categoryId;
	public final AssociationExpression data_element_category;
	public final CollectionExpression activity_data_element;
	public final CollectionExpression entity_type_data_element;
	public final CollectionExpression entity_detail;
	public final CollectionExpression task_activity_de;
	public final CollectionExpression task_activity_entity;
	
	public Data_elementCriteria(Criteria criteria) {
		super(criteria);
		data_element_id = new IntegerExpression("data_element_id", this);
		data_element_code = new StringExpression("data_element_code", this);
		data_element_name = new StringExpression("data_element_name", this);
		data_type = new StringExpression("data_type", this);
		data_size = new IntegerExpression("data_size", this);
		description = new StringExpression("description", this);
		is_email = new IntegerExpression("is_email", this);
		is_phone = new IntegerExpression("is_phone", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		data_element_categoryId = new IntegerExpression("data_element_category.data_element_category_id", this);
		data_element_category = new AssociationExpression("data_element_category", this);
		activity_data_element = new CollectionExpression("activity_data_element", this);
		entity_type_data_element = new CollectionExpression("entity_type_data_element", this);
		entity_detail = new CollectionExpression("entity_detail", this);
		task_activity_de = new CollectionExpression("task_activity_de", this);
		task_activity_entity = new CollectionExpression("task_activity_entity", this);
	}
	
	public Data_elementCriteria(PersistentSession session) {
		this(session.createCriteria(Data_element.class));
	}
	
	public Data_elementCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Data_element_categoryCriteria createData_element_categoryCriteria() {
		return new Data_element_categoryCriteria(createCriteria("data_element_category"));
	}
	
	public Activity_data_elementCriteria createActivity_data_elementCriteria() {
		return new Activity_data_elementCriteria(createCriteria("activity_data_element"));
	}
	
	public Entity_type_data_elementCriteria createEntity_type_data_elementCriteria() {
		return new Entity_type_data_elementCriteria(createCriteria("entity_type_data_element"));
	}
	
	public Entity_detailCriteria createEntity_detailCriteria() {
		return new Entity_detailCriteria(createCriteria("entity_detail"));
	}
	
	public Task_activity_deCriteria createTask_activity_deCriteria() {
		return new Task_activity_deCriteria(createCriteria("task_activity_de"));
	}
	
	public Task_activity_entityCriteria createTask_activity_entityCriteria() {
		return new Task_activity_entityCriteria(createCriteria("task_activity_entity"));
	}
	
	public Data_element uniqueData_element() {
		return (Data_element) super.uniqueResult();
	}
	
	public Data_element[] listData_element() {
		java.util.List list = super.list();
		return (Data_element[]) list.toArray(new Data_element[list.size()]);
	}
}

