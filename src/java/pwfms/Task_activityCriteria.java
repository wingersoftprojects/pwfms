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

public class Task_activityCriteria extends AbstractORMCriteria {
	public final IntegerExpression task_activity_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final DateExpression start_date;
	public final DateExpression end_date;
	public final DateExpression add_date;
	public final IntegerExpression added_by;
	public final IntegerExpression activity_assigned_to;
	public final DateExpression due_date;
	public final DateExpression flag_date;
	public final IntegerExpression outcomeId;
	public final AssociationExpression outcome;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final StringExpression status;
	public final StringExpression comment;
	public final CollectionExpression task_activity_de;
	public final CollectionExpression task_activity_doc;
	
	public Task_activityCriteria(Criteria criteria) {
		super(criteria);
		task_activity_id = new IntegerExpression("task_activity_id", this);
		taskId = new IntegerExpression("task.task_id", this);
		task = new AssociationExpression("task", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		start_date = new DateExpression("start_date", this);
		end_date = new DateExpression("end_date", this);
		add_date = new DateExpression("add_date", this);
		added_by = new IntegerExpression("added_by", this);
		activity_assigned_to = new IntegerExpression("activity_assigned_to", this);
		due_date = new DateExpression("due_date", this);
		flag_date = new DateExpression("flag_date", this);
		outcomeId = new IntegerExpression("outcome.outcome_id", this);
		outcome = new AssociationExpression("outcome", this);
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this);
		entity_type = new AssociationExpression("entity_type", this);
		status = new StringExpression("status", this);
		comment = new StringExpression("comment", this);
		task_activity_de = new CollectionExpression("task_activity_de", this);
		task_activity_doc = new CollectionExpression("task_activity_doc", this);
	}
	
	public Task_activityCriteria(PersistentSession session) {
		this(session.createCriteria(Task_activity.class));
	}
	
	public Task_activityCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public OutcomeCriteria createOutcomeCriteria() {
		return new OutcomeCriteria(createCriteria("outcome"));
	}
	
	public Entity_typeCriteria createEntity_typeCriteria() {
		return new Entity_typeCriteria(createCriteria("entity_type"));
	}
	
	public Task_activity_deCriteria createTask_activity_deCriteria() {
		return new Task_activity_deCriteria(createCriteria("task_activity_de"));
	}
	
	public Task_activity_docCriteria createTask_activity_docCriteria() {
		return new Task_activity_docCriteria(createCriteria("task_activity_doc"));
	}
	
	public Task_activity uniqueTask_activity() {
		return (Task_activity) super.uniqueResult();
	}
	
	public Task_activity[] listTask_activity() {
		java.util.List list = super.list();
		return (Task_activity[]) list.toArray(new Task_activity[list.size()]);
	}
}

