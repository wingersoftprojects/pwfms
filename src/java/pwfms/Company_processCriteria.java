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

public class Company_processCriteria extends AbstractORMCriteria {
	public final IntegerExpression company_process_id;
	public final StringExpression process_name;
	public final StringExpression process_description;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity;
	public final CollectionExpression task;
	
	public Company_processCriteria(Criteria criteria) {
		super(criteria);
		company_process_id = new IntegerExpression("company_process_id", this);
		process_name = new StringExpression("process_name", this);
		process_description = new StringExpression("process_description", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		activity = new CollectionExpression("activity", this);
		task = new CollectionExpression("task", this);
	}
	
	public Company_processCriteria(PersistentSession session) {
		this(session.createCriteria(Company_process.class));
	}
	
	public Company_processCriteria() throws PersistentException {
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
	
	public Company_process uniqueCompany_process() {
		return (Company_process) super.uniqueResult();
	}
	
	public Company_process[] listCompany_process() {
		java.util.List list = super.list();
		return (Company_process[]) list.toArray(new Company_process[list.size()]);
	}
}

