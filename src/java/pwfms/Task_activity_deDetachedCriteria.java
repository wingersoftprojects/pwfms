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

public class Task_activity_deDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_activity_de_id;
	public final IntegerExpression task_activityId;
	public final AssociationExpression task_activity;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	
	public Task_activity_deDetachedCriteria() {
		super(pwfms.Task_activity_de.class, pwfms.Task_activity_deCriteria.class);
		task_activity_de_id = new IntegerExpression("task_activity_de_id", this.getDetachedCriteria());
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this.getDetachedCriteria());
		task_activity = new AssociationExpression("task_activity", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
	}
	
	public Task_activity_deDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Task_activity_deCriteria.class);
		task_activity_de_id = new IntegerExpression("task_activity_de_id", this.getDetachedCriteria());
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this.getDetachedCriteria());
		task_activity = new AssociationExpression("task_activity", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public Task_activity_de uniqueTask_activity_de(PersistentSession session) {
		return (Task_activity_de) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_activity_de[] listTask_activity_de(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_activity_de[]) list.toArray(new Task_activity_de[list.size()]);
	}
}

