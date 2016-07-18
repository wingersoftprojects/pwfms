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

public class ProcessDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression process_id;
	public final StringExpression process_name;
	public final StringExpression process_description;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity;
	public final CollectionExpression task;
	
	public ProcessDetachedCriteria() {
		super(pwfms.Process.class, pwfms.ProcessCriteria.class);
		process_id = new IntegerExpression("process_id", this.getDetachedCriteria());
		process_name = new StringExpression("process_name", this.getDetachedCriteria());
		process_description = new StringExpression("process_description", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity = new CollectionExpression("activity", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public ProcessDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.ProcessCriteria.class);
		process_id = new IntegerExpression("process_id", this.getDetachedCriteria());
		process_name = new StringExpression("process_name", this.getDetachedCriteria());
		process_description = new StringExpression("process_description", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity = new CollectionExpression("activity", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Process uniqueProcess(PersistentSession session) {
		return (Process) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Process[] listProcess(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Process[]) list.toArray(new Process[list.size()]);
	}
}

