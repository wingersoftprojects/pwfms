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

public class Company_processDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression company_process_id;
	public final StringExpression process_name;
	public final StringExpression process_description;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity;
	public final CollectionExpression task;
	
	public Company_processDetachedCriteria() {
		super(pwfms.Company_process.class, pwfms.Company_processCriteria.class);
		company_process_id = new IntegerExpression("company_process_id", this.getDetachedCriteria());
		process_name = new StringExpression("process_name", this.getDetachedCriteria());
		process_description = new StringExpression("process_description", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity = new CollectionExpression("activity", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public Company_processDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Company_processCriteria.class);
		company_process_id = new IntegerExpression("company_process_id", this.getDetachedCriteria());
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
	
	public Company_process uniqueCompany_process(PersistentSession session) {
		return (Company_process) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Company_process[] listCompany_process(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Company_process[]) list.toArray(new Company_process[list.size()]);
	}
}

