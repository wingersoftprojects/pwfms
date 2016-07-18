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

public class Task_data_elementCriteria extends AbstractORMCriteria {
	public final IntegerExpression task_data_element_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	
	public Task_data_elementCriteria(Criteria criteria) {
		super(criteria);
		task_data_element_id = new IntegerExpression("task_data_element_id", this);
		taskId = new IntegerExpression("task.task_id", this);
		task = new AssociationExpression("task", this);
		data_elementId = new IntegerExpression("data_element.data_element_id", this);
		data_element = new AssociationExpression("data_element", this);
		data_element_value = new StringExpression("data_element_value", this);
	}
	
	public Task_data_elementCriteria(PersistentSession session) {
		this(session.createCriteria(Task_data_element.class));
	}
	
	public Task_data_elementCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public Task_data_element uniqueTask_data_element() {
		return (Task_data_element) super.uniqueResult();
	}
	
	public Task_data_element[] listTask_data_element() {
		java.util.List list = super.list();
		return (Task_data_element[]) list.toArray(new Task_data_element[list.size()]);
	}
}

