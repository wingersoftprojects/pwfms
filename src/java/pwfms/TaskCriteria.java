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

public class TaskCriteria extends AbstractORMCriteria {
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
	public final IntegerExpression entity_detailId;
	public final AssociationExpression entity_detail;
	public final StringExpression comment;
	public final CollectionExpression task_data_element;
	public final CollectionExpression task_document;
	
	public TaskCriteria(Criteria criteria) {
		super(criteria);
		task_id = new IntegerExpression("task_id", this);
		processId = new IntegerExpression("process.process_id", this);
		process = new AssociationExpression("process", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		start_date = new DateExpression("start_date", this);
		end_date = new DateExpression("end_date", this);
		add_date = new DateExpression("add_date", this);
		added_byId = new IntegerExpression("added_by.user_detail_id", this);
		added_by = new AssociationExpression("added_by", this);
		task_assigned_toId = new IntegerExpression("task_assigned_to.user_detail_id", this);
		task_assigned_to = new AssociationExpression("task_assigned_to", this);
		due_date = new DateExpression("due_date", this);
		flag_date = new DateExpression("flag_date", this);
		outcomeId = new IntegerExpression("outcome.outcome_id", this);
		outcome = new AssociationExpression("outcome", this);
		entity_detailId = new IntegerExpression("entity_detail.entity_detail_id", this);
		entity_detail = new AssociationExpression("entity_detail", this);
		comment = new StringExpression("comment", this);
		task_data_element = new CollectionExpression("task_data_element", this);
		task_document = new CollectionExpression("task_document", this);
	}
	
	public TaskCriteria(PersistentSession session) {
		this(session.createCriteria(Task.class));
	}
	
	public TaskCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public ProcessCriteria createProcessCriteria() {
		return new ProcessCriteria(createCriteria("process"));
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public User_detailCriteria createAdded_byCriteria() {
		return new User_detailCriteria(createCriteria("added_by"));
	}
	
	public User_detailCriteria createTask_assigned_toCriteria() {
		return new User_detailCriteria(createCriteria("task_assigned_to"));
	}
	
	public OutcomeCriteria createOutcomeCriteria() {
		return new OutcomeCriteria(createCriteria("outcome"));
	}
	
	public Entity_detailCriteria createEntity_detailCriteria() {
		return new Entity_detailCriteria(createCriteria("entity_detail"));
	}
	
	public Task_data_elementCriteria createTask_data_elementCriteria() {
		return new Task_data_elementCriteria(createCriteria("task_data_element"));
	}
	
	public Task_documentCriteria createTask_documentCriteria() {
		return new Task_documentCriteria(createCriteria("task_document"));
	}
	
	public Task uniqueTask() {
		return (Task) super.uniqueResult();
	}
	
	public Task[] listTask() {
		java.util.List list = super.list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

