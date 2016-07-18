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

public class Task_data_elementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_data_element_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	
	public Task_data_elementDetachedCriteria() {
		super(pwfms.Task_data_element.class, pwfms.Task_data_elementCriteria.class);
		task_data_element_id = new IntegerExpression("task_data_element_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
	}
	
	public Task_data_elementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Task_data_elementCriteria.class);
		task_data_element_id = new IntegerExpression("task_data_element_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public Task_data_element uniqueTask_data_element(PersistentSession session) {
		return (Task_data_element) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_data_element[] listTask_data_element(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_data_element[]) list.toArray(new Task_data_element[list.size()]);
	}
}

