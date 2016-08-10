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

public class Task_activity_entityCriteria extends AbstractORMCriteria {
	public final IntegerExpression task_activity_entity_id;
	public final IntegerExpression task_activityId;
	public final AssociationExpression task_activity;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	
	public Task_activity_entityCriteria(Criteria criteria) {
		super(criteria);
		task_activity_entity_id = new IntegerExpression("task_activity_entity_id", this);
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this);
		task_activity = new AssociationExpression("task_activity", this);
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this);
		entity_type = new AssociationExpression("entity_type", this);
		data_elementId = new IntegerExpression("data_element.data_element_id", this);
		data_element = new AssociationExpression("data_element", this);
		data_element_value = new StringExpression("data_element_value", this);
	}
	
	public Task_activity_entityCriteria(PersistentSession session) {
		this(session.createCriteria(Task_activity_entity.class));
	}
	
	public Task_activity_entityCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Entity_typeCriteria createEntity_typeCriteria() {
		return new Entity_typeCriteria(createCriteria("entity_type"));
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public Task_activity_entity uniqueTask_activity_entity() {
		return (Task_activity_entity) super.uniqueResult();
	}
	
	public Task_activity_entity[] listTask_activity_entity() {
		java.util.List list = super.list();
		return (Task_activity_entity[]) list.toArray(new Task_activity_entity[list.size()]);
	}
}

