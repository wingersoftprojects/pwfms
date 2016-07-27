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

public class Task_activityDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Task_activityDetachedCriteria() {
		super(pwfms.Task_activity.class, pwfms.Task_activityCriteria.class);
		task_activity_id = new IntegerExpression("task_activity_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		added_by = new IntegerExpression("added_by", this.getDetachedCriteria());
		activity_assigned_to = new IntegerExpression("activity_assigned_to", this.getDetachedCriteria());
		due_date = new DateExpression("due_date", this.getDetachedCriteria());
		flag_date = new DateExpression("flag_date", this.getDetachedCriteria());
		outcomeId = new IntegerExpression("outcome.outcome_id", this.getDetachedCriteria());
		outcome = new AssociationExpression("outcome", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		task_activity_de = new CollectionExpression("task_activity_de", this.getDetachedCriteria());
		task_activity_doc = new CollectionExpression("task_activity_doc", this.getDetachedCriteria());
	}
	
	public Task_activityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Task_activityCriteria.class);
		task_activity_id = new IntegerExpression("task_activity_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		added_by = new IntegerExpression("added_by", this.getDetachedCriteria());
		activity_assigned_to = new IntegerExpression("activity_assigned_to", this.getDetachedCriteria());
		due_date = new DateExpression("due_date", this.getDetachedCriteria());
		flag_date = new DateExpression("flag_date", this.getDetachedCriteria());
		outcomeId = new IntegerExpression("outcome.outcome_id", this.getDetachedCriteria());
		outcome = new AssociationExpression("outcome", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		task_activity_de = new CollectionExpression("task_activity_de", this.getDetachedCriteria());
		task_activity_doc = new CollectionExpression("task_activity_doc", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public OutcomeDetachedCriteria createOutcomeCriteria() {
		return new OutcomeDetachedCriteria(createCriteria("outcome"));
	}
	
	public Entity_typeDetachedCriteria createEntity_typeCriteria() {
		return new Entity_typeDetachedCriteria(createCriteria("entity_type"));
	}
	
	public Task_activity_deDetachedCriteria createTask_activity_deCriteria() {
		return new Task_activity_deDetachedCriteria(createCriteria("task_activity_de"));
	}
	
	public Task_activity_docDetachedCriteria createTask_activity_docCriteria() {
		return new Task_activity_docDetachedCriteria(createCriteria("task_activity_doc"));
	}
	
	public Task_activity uniqueTask_activity(PersistentSession session) {
		return (Task_activity) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_activity[] listTask_activity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_activity[]) list.toArray(new Task_activity[list.size()]);
	}
}

