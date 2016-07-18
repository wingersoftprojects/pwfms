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

public class OutcomeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression outcome_id;
	public final StringExpression outcome_name;
	public final IntegerExpression is_success;
	public final IntegerExpression is_failure;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity_outcome;
	public final CollectionExpression task;
	
	public OutcomeDetachedCriteria() {
		super(pwfms.Outcome.class, pwfms.OutcomeCriteria.class);
		outcome_id = new IntegerExpression("outcome_id", this.getDetachedCriteria());
		outcome_name = new StringExpression("outcome_name", this.getDetachedCriteria());
		is_success = new IntegerExpression("is_success", this.getDetachedCriteria());
		is_failure = new IntegerExpression("is_failure", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public OutcomeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.OutcomeCriteria.class);
		outcome_id = new IntegerExpression("outcome_id", this.getDetachedCriteria());
		outcome_name = new StringExpression("outcome_name", this.getDetachedCriteria());
		is_success = new IntegerExpression("is_success", this.getDetachedCriteria());
		is_failure = new IntegerExpression("is_failure", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Activity_outcomeDetachedCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeDetachedCriteria(createCriteria("activity_outcome"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Outcome uniqueOutcome(PersistentSession session) {
		return (Outcome) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Outcome[] listOutcome(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Outcome[]) list.toArray(new Outcome[list.size()]);
	}
}

