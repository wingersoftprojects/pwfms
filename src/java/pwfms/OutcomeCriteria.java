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

public class OutcomeCriteria extends AbstractORMCriteria {
	public final IntegerExpression outcome_id;
	public final StringExpression outcome_name;
	public final IntegerExpression is_success;
	public final IntegerExpression is_failure;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity_outcome;
	public final CollectionExpression task_activity;
	
	public OutcomeCriteria(Criteria criteria) {
		super(criteria);
		outcome_id = new IntegerExpression("outcome_id", this);
		outcome_name = new StringExpression("outcome_name", this);
		is_success = new IntegerExpression("is_success", this);
		is_failure = new IntegerExpression("is_failure", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		activity_outcome = new CollectionExpression("activity_outcome", this);
		task_activity = new CollectionExpression("task_activity", this);
	}
	
	public OutcomeCriteria(PersistentSession session) {
		this(session.createCriteria(Outcome.class));
	}
	
	public OutcomeCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Activity_outcomeCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeCriteria(createCriteria("activity_outcome"));
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Outcome uniqueOutcome() {
		return (Outcome) super.uniqueResult();
	}
	
	public Outcome[] listOutcome() {
		java.util.List list = super.list();
		return (Outcome[]) list.toArray(new Outcome[list.size()]);
	}
}

