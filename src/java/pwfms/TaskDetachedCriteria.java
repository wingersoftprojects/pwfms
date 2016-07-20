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

public class TaskDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_id;
	public final IntegerExpression processId;
	public final AssociationExpression process;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final DateExpression start_date;
	public final DateExpression end_date;
	public final DateExpression add_date;
	public final IntegerExpression added_byId;
	public final AssociationExpression added_by;
	public final IntegerExpression task_assigned_toId;
	public final AssociationExpression task_assigned_to;
	public final DateExpression due_date;
	public final DateExpression flag_date;
	public final IntegerExpression outcomeId;
	public final AssociationExpression outcome;
	public final IntegerExpression entityId;
	public final AssociationExpression entity;
	public final StringExpression comment;
	public final CollectionExpression task_data_element;
	public final CollectionExpression task_document;
	
	public TaskDetachedCriteria() {
		super(pwfms.Task.class, pwfms.TaskCriteria.class);
		task_id = new IntegerExpression("task_id", this.getDetachedCriteria());
		processId = new IntegerExpression("process.process_id", this.getDetachedCriteria());
		process = new AssociationExpression("process", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		added_byId = new IntegerExpression("added_by.user_detail_id", this.getDetachedCriteria());
		added_by = new AssociationExpression("added_by", this.getDetachedCriteria());
		task_assigned_toId = new IntegerExpression("task_assigned_to.user_detail_id", this.getDetachedCriteria());
		task_assigned_to = new AssociationExpression("task_assigned_to", this.getDetachedCriteria());
		due_date = new DateExpression("due_date", this.getDetachedCriteria());
		flag_date = new DateExpression("flag_date", this.getDetachedCriteria());
		outcomeId = new IntegerExpression("outcome.outcome_id", this.getDetachedCriteria());
		outcome = new AssociationExpression("outcome", this.getDetachedCriteria());
		entityId = new IntegerExpression("entity.entity_detail_id", this.getDetachedCriteria());
		entity = new AssociationExpression("entity", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		task_data_element = new CollectionExpression("task_data_element", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.TaskCriteria.class);
		task_id = new IntegerExpression("task_id", this.getDetachedCriteria());
		processId = new IntegerExpression("process.process_id", this.getDetachedCriteria());
		process = new AssociationExpression("process", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		added_byId = new IntegerExpression("added_by.user_detail_id", this.getDetachedCriteria());
		added_by = new AssociationExpression("added_by", this.getDetachedCriteria());
		task_assigned_toId = new IntegerExpression("task_assigned_to.user_detail_id", this.getDetachedCriteria());
		task_assigned_to = new AssociationExpression("task_assigned_to", this.getDetachedCriteria());
		due_date = new DateExpression("due_date", this.getDetachedCriteria());
		flag_date = new DateExpression("flag_date", this.getDetachedCriteria());
		outcomeId = new IntegerExpression("outcome.outcome_id", this.getDetachedCriteria());
		outcome = new AssociationExpression("outcome", this.getDetachedCriteria());
		entityId = new IntegerExpression("entity.entity_detail_id", this.getDetachedCriteria());
		entity = new AssociationExpression("entity", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		task_data_element = new CollectionExpression("task_data_element", this.getDetachedCriteria());
		task_document = new CollectionExpression("task_document", this.getDetachedCriteria());
	}
	
	public ProcessDetachedCriteria createProcessCriteria() {
		return new ProcessDetachedCriteria(createCriteria("process"));
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public User_detailDetachedCriteria createAdded_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("added_by"));
	}
	
	public User_detailDetachedCriteria createTask_assigned_toCriteria() {
		return new User_detailDetachedCriteria(createCriteria("task_assigned_to"));
	}
	
	public OutcomeDetachedCriteria createOutcomeCriteria() {
		return new OutcomeDetachedCriteria(createCriteria("outcome"));
	}
	
	public Entity_detailDetachedCriteria createEntityCriteria() {
		return new Entity_detailDetachedCriteria(createCriteria("entity"));
	}
	
	public Task_data_elementDetachedCriteria createTask_data_elementCriteria() {
		return new Task_data_elementDetachedCriteria(createCriteria("task_data_element"));
	}
	
	public Task_documentDetachedCriteria createTask_documentCriteria() {
		return new Task_documentDetachedCriteria(createCriteria("task_document"));
	}
	
	public Task uniqueTask(PersistentSession session) {
		return (Task) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task[] listTask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

