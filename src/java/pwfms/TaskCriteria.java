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
	public final IntegerExpression company_processId;
	public final AssociationExpression company_process;
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
	
	public TaskCriteria(Criteria criteria) {
		super(criteria);
		task_id = new IntegerExpression("task_id", this);
		company_processId = new IntegerExpression("company_process.company_process_id", this);
		company_process = new AssociationExpression("company_process", this);
		start_date = new DateExpression("start_date", this);
		end_date = new DateExpression("end_date", this);
		add_date = new DateExpression("add_date", this);
		added_byId = new IntegerExpression("added_by.user_detail_id", this);
		added_by = new AssociationExpression("added_by", this);
		task_assigned_toId = new IntegerExpression("task_assigned_to.user_detail_id", this);
		task_assigned_to = new AssociationExpression("task_assigned_to", this);
		comment = new StringExpression("comment", this);
		current_status = new StringExpression("current_status", this);
		current_status_date = new DateExpression("current_status_date", this);
		task_activity = new CollectionExpression("task_activity", this);
	}
	
	public TaskCriteria(PersistentSession session) {
		this(session.createCriteria(Task.class));
	}
	
	public TaskCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Company_processCriteria createCompany_processCriteria() {
		return new Company_processCriteria(createCriteria("company_process"));
	}
	
	public User_detailCriteria createAdded_byCriteria() {
		return new User_detailCriteria(createCriteria("added_by"));
	}
	
	public User_detailCriteria createTask_assigned_toCriteria() {
		return new User_detailCriteria(createCriteria("task_assigned_to"));
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Task uniqueTask() {
		return (Task) super.uniqueResult();
	}
	
	public Task[] listTask() {
		java.util.List list = super.list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

