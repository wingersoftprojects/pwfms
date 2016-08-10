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

public class Entity_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression entity_type_id;
	public final StringExpression entity_type_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity_entity_type;
	public final CollectionExpression entity_type_data_element;
	public final CollectionExpression entity_detail;
	public final CollectionExpression task_activity;
	public final CollectionExpression task_activity_entity;
	public final CollectionExpression entity_instance;
	
	public Entity_typeDetachedCriteria() {
		super(pwfms.Entity_type.class, pwfms.Entity_typeCriteria.class);
		entity_type_id = new IntegerExpression("entity_type_id", this.getDetachedCriteria());
		entity_type_name = new StringExpression("entity_type_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity_entity_type = new CollectionExpression("activity_entity_type", this.getDetachedCriteria());
		entity_type_data_element = new CollectionExpression("entity_type_data_element", this.getDetachedCriteria());
		entity_detail = new CollectionExpression("entity_detail", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
		task_activity_entity = new CollectionExpression("task_activity_entity", this.getDetachedCriteria());
		entity_instance = new CollectionExpression("entity_instance", this.getDetachedCriteria());
	}
	
	public Entity_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Entity_typeCriteria.class);
		entity_type_id = new IntegerExpression("entity_type_id", this.getDetachedCriteria());
		entity_type_name = new StringExpression("entity_type_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity_entity_type = new CollectionExpression("activity_entity_type", this.getDetachedCriteria());
		entity_type_data_element = new CollectionExpression("entity_type_data_element", this.getDetachedCriteria());
		entity_detail = new CollectionExpression("entity_detail", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
		task_activity_entity = new CollectionExpression("task_activity_entity", this.getDetachedCriteria());
		entity_instance = new CollectionExpression("entity_instance", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Activity_entity_typeDetachedCriteria createActivity_entity_typeCriteria() {
		return new Activity_entity_typeDetachedCriteria(createCriteria("activity_entity_type"));
	}
	
	public Entity_type_data_elementDetachedCriteria createEntity_type_data_elementCriteria() {
		return new Entity_type_data_elementDetachedCriteria(createCriteria("entity_type_data_element"));
	}
	
	public Entity_detailDetachedCriteria createEntity_detailCriteria() {
		return new Entity_detailDetachedCriteria(createCriteria("entity_detail"));
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public Task_activity_entityDetachedCriteria createTask_activity_entityCriteria() {
		return new Task_activity_entityDetachedCriteria(createCriteria("task_activity_entity"));
	}
	
	public Entity_instanceDetachedCriteria createEntity_instanceCriteria() {
		return new Entity_instanceDetachedCriteria(createCriteria("entity_instance"));
	}
	
	public Entity_type uniqueEntity_type(PersistentSession session) {
		return (Entity_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entity_type[] listEntity_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entity_type[]) list.toArray(new Entity_type[list.size()]);
	}
}

