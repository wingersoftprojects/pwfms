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

public class Entity_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression entity_type_id;
	public final StringExpression entity_type_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity_entity_type;
	public final CollectionExpression entity_type_data_element;
	public final CollectionExpression entity_detail;
	public final CollectionExpression task_activity;
	
	public Entity_typeCriteria(Criteria criteria) {
		super(criteria);
		entity_type_id = new IntegerExpression("entity_type_id", this);
		entity_type_name = new StringExpression("entity_type_name", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		activity_entity_type = new CollectionExpression("activity_entity_type", this);
		entity_type_data_element = new CollectionExpression("entity_type_data_element", this);
		entity_detail = new CollectionExpression("entity_detail", this);
		task_activity = new CollectionExpression("task_activity", this);
	}
	
	public Entity_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Entity_type.class));
	}
	
	public Entity_typeCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Activity_entity_typeCriteria createActivity_entity_typeCriteria() {
		return new Activity_entity_typeCriteria(createCriteria("activity_entity_type"));
	}
	
	public Entity_type_data_elementCriteria createEntity_type_data_elementCriteria() {
		return new Entity_type_data_elementCriteria(createCriteria("entity_type_data_element"));
	}
	
	public Entity_detailCriteria createEntity_detailCriteria() {
		return new Entity_detailCriteria(createCriteria("entity_detail"));
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Entity_type uniqueEntity_type() {
		return (Entity_type) super.uniqueResult();
	}
	
	public Entity_type[] listEntity_type() {
		java.util.List list = super.list();
		return (Entity_type[]) list.toArray(new Entity_type[list.size()]);
	}
}

