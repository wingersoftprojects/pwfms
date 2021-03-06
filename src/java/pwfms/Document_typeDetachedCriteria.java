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

public class Document_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression document_type_id;
	public final StringExpression document_type_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity_document_type;
	public final CollectionExpression task_activity_doc;
	
	public Document_typeDetachedCriteria() {
		super(pwfms.Document_type.class, pwfms.Document_typeCriteria.class);
		document_type_id = new IntegerExpression("document_type_id", this.getDetachedCriteria());
		document_type_name = new StringExpression("document_type_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity_document_type = new CollectionExpression("activity_document_type", this.getDetachedCriteria());
		task_activity_doc = new CollectionExpression("task_activity_doc", this.getDetachedCriteria());
	}
	
	public Document_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Document_typeCriteria.class);
		document_type_id = new IntegerExpression("document_type_id", this.getDetachedCriteria());
		document_type_name = new StringExpression("document_type_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		activity_document_type = new CollectionExpression("activity_document_type", this.getDetachedCriteria());
		task_activity_doc = new CollectionExpression("task_activity_doc", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Activity_document_typeDetachedCriteria createActivity_document_typeCriteria() {
		return new Activity_document_typeDetachedCriteria(createCriteria("activity_document_type"));
	}
	
	public Task_activity_docDetachedCriteria createTask_activity_docCriteria() {
		return new Task_activity_docDetachedCriteria(createCriteria("task_activity_doc"));
	}
	
	public Document_type uniqueDocument_type(PersistentSession session) {
		return (Document_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Document_type[] listDocument_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Document_type[]) list.toArray(new Document_type[list.size()]);
	}
}

