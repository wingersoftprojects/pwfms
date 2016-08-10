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

public class Task_activity_entityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_activity_entity_id;
	public final IntegerExpression task_activityId;
	public final AssociationExpression task_activity;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	
	public Task_activity_entityDetachedCriteria() {
		super(pwfms.Task_activity_entity.class, pwfms.Task_activity_entityCriteria.class);
		task_activity_entity_id = new IntegerExpression("task_activity_entity_id", this.getDetachedCriteria());
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this.getDetachedCriteria());
		task_activity = new AssociationExpression("task_activity", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
	}
	
	public Task_activity_entityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Task_activity_entityCriteria.class);
		task_activity_entity_id = new IntegerExpression("task_activity_entity_id", this.getDetachedCriteria());
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this.getDetachedCriteria());
		task_activity = new AssociationExpression("task_activity", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public Entity_typeDetachedCriteria createEntity_typeCriteria() {
		return new Entity_typeDetachedCriteria(createCriteria("entity_type"));
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public Task_activity_entity uniqueTask_activity_entity(PersistentSession session) {
		return (Task_activity_entity) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_activity_entity[] listTask_activity_entity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_activity_entity[]) list.toArray(new Task_activity_entity[list.size()]);
	}
}

