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

public class Data_elementDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression task_data_element;
	
	public Data_elementDetachedCriteria() {
		super(pwfms.Data_element.class, pwfms.Data_elementCriteria.class);
		data_element_id = new IntegerExpression("data_element_id", this.getDetachedCriteria());
		data_element_code = new StringExpression("data_element_code", this.getDetachedCriteria());
		data_element_name = new StringExpression("data_element_name", this.getDetachedCriteria());
		data_type = new StringExpression("data_type", this.getDetachedCriteria());
		data_size = new IntegerExpression("data_size", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		is_email = new IntegerExpression("is_email", this.getDetachedCriteria());
		is_phone = new IntegerExpression("is_phone", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		data_element_categoryId = new IntegerExpression("data_element_category.data_element_category_id", this.getDetachedCriteria());
		data_element_category = new AssociationExpression("data_element_category", this.getDetachedCriteria());
		activity_data_element = new CollectionExpression("activity_data_element", this.getDetachedCriteria());
		entity_type_data_element = new CollectionExpression("entity_type_data_element", this.getDetachedCriteria());
		entity_detail = new CollectionExpression("entity_detail", this.getDetachedCriteria());
		task_data_element = new CollectionExpression("task_data_element", this.getDetachedCriteria());
	}
	
	public Data_elementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Data_elementCriteria.class);
		data_element_id = new IntegerExpression("data_element_id", this.getDetachedCriteria());
		data_element_code = new StringExpression("data_element_code", this.getDetachedCriteria());
		data_element_name = new StringExpression("data_element_name", this.getDetachedCriteria());
		data_type = new StringExpression("data_type", this.getDetachedCriteria());
		data_size = new IntegerExpression("data_size", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		is_email = new IntegerExpression("is_email", this.getDetachedCriteria());
		is_phone = new IntegerExpression("is_phone", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		data_element_categoryId = new IntegerExpression("data_element_category.data_element_category_id", this.getDetachedCriteria());
		data_element_category = new AssociationExpression("data_element_category", this.getDetachedCriteria());
		activity_data_element = new CollectionExpression("activity_data_element", this.getDetachedCriteria());
		entity_type_data_element = new CollectionExpression("entity_type_data_element", this.getDetachedCriteria());
		entity_detail = new CollectionExpression("entity_detail", this.getDetachedCriteria());
		task_data_element = new CollectionExpression("task_data_element", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Data_element_categoryDetachedCriteria createData_element_categoryCriteria() {
		return new Data_element_categoryDetachedCriteria(createCriteria("data_element_category"));
	}
	
	public Activity_data_elementDetachedCriteria createActivity_data_elementCriteria() {
		return new Activity_data_elementDetachedCriteria(createCriteria("activity_data_element"));
	}
	
	public Entity_type_data_elementDetachedCriteria createEntity_type_data_elementCriteria() {
		return new Entity_type_data_elementDetachedCriteria(createCriteria("entity_type_data_element"));
	}
	
	public Entity_detailDetachedCriteria createEntity_detailCriteria() {
		return new Entity_detailDetachedCriteria(createCriteria("entity_detail"));
	}
	
	public Task_activity_deDetachedCriteria createTask_data_elementCriteria() {
		return new Task_activity_deDetachedCriteria(createCriteria("task_data_element"));
	}
	
	public Data_element uniqueData_element(PersistentSession session) {
		return (Data_element) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Data_element[] listData_element(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Data_element[]) list.toArray(new Data_element[list.size()]);
	}
}

