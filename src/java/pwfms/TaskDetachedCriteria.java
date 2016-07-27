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
	public final DateExpression start_date;
	public final DateExpression end_date;
	public final DateExpression add_date;
	public final IntegerExpression added_byId;
	public final AssociationExpression added_by;
	public final IntegerExpression task_assigned_toId;
	public final AssociationExpression task_assigned_to;
	public final StringExpression comment;
	public final StringExpression current_status;
	public final DateExpression current_status_date;
	public final CollectionExpression task_activity;
	
	public TaskDetachedCriteria() {
		super(pwfms.Task.class, pwfms.TaskCriteria.class);
		task_id = new IntegerExpression("task_id", this.getDetachedCriteria());
		processId = new IntegerExpression("process.process_id", this.getDetachedCriteria());
		process = new AssociationExpression("process", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		added_byId = new IntegerExpression("added_by.user_detail_id", this.getDetachedCriteria());
		added_by = new AssociationExpression("added_by", this.getDetachedCriteria());
		task_assigned_toId = new IntegerExpression("task_assigned_to.user_detail_id", this.getDetachedCriteria());
		task_assigned_to = new AssociationExpression("task_assigned_to", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		current_status = new StringExpression("current_status", this.getDetachedCriteria());
		current_status_date = new DateExpression("current_status_date", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.TaskCriteria.class);
		task_id = new IntegerExpression("task_id", this.getDetachedCriteria());
		processId = new IntegerExpression("process.process_id", this.getDetachedCriteria());
		process = new AssociationExpression("process", this.getDetachedCriteria());
		start_date = new DateExpression("start_date", this.getDetachedCriteria());
		end_date = new DateExpression("end_date", this.getDetachedCriteria());
		add_date = new DateExpression("add_date", this.getDetachedCriteria());
		added_byId = new IntegerExpression("added_by.user_detail_id", this.getDetachedCriteria());
		added_by = new AssociationExpression("added_by", this.getDetachedCriteria());
		task_assigned_toId = new IntegerExpression("task_assigned_to.user_detail_id", this.getDetachedCriteria());
		task_assigned_to = new AssociationExpression("task_assigned_to", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		current_status = new StringExpression("current_status", this.getDetachedCriteria());
		current_status_date = new DateExpression("current_status_date", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
	}
	
	public ProcessDetachedCriteria createProcessCriteria() {
		return new ProcessDetachedCriteria(createCriteria("process"));
	}
	
	public User_detailDetachedCriteria createAdded_byCriteria() {
		return new User_detailDetachedCriteria(createCriteria("added_by"));
	}
	
	public User_detailDetachedCriteria createTask_assigned_toCriteria() {
		return new User_detailDetachedCriteria(createCriteria("task_assigned_to"));
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public Task uniqueTask(PersistentSession session) {
		return (Task) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task[] listTask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

