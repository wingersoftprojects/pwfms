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

public class ProcessCriteria extends AbstractORMCriteria {
	public final IntegerExpression process_id;
	public final StringExpression process_name;
	public final StringExpression process_description;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity;
	public final CollectionExpression task;
	
	public ProcessCriteria(Criteria criteria) {
		super(criteria);
		process_id = new IntegerExpression("process_id", this);
		process_name = new StringExpression("process_name", this);
		process_description = new StringExpression("process_description", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		activity = new CollectionExpression("activity", this);
		task = new CollectionExpression("task", this);
	}
	
	public ProcessCriteria(PersistentSession session) {
		this(session.createCriteria(Process.class));
	}
	
	public ProcessCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Process uniqueProcess() {
		return (Process) super.uniqueResult();
	}
	
	public Process[] listProcess() {
		java.util.List list = super.list();
		return (Process[]) list.toArray(new Process[list.size()]);
	}
}

