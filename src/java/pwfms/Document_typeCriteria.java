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

public class Document_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression document_type_id;
	public final StringExpression document_type_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression activity_document_type;
	public final CollectionExpression task_document;
	
	public Document_typeCriteria(Criteria criteria) {
		super(criteria);
		document_type_id = new IntegerExpression("document_type_id", this);
		document_type_name = new StringExpression("document_type_name", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		activity_document_type = new CollectionExpression("activity_document_type", this);
		task_document = new CollectionExpression("task_document", this);
	}
	
	public Document_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Document_type.class));
	}
	
	public Document_typeCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Activity_document_typeCriteria createActivity_document_typeCriteria() {
		return new Activity_document_typeCriteria(createCriteria("activity_document_type"));
	}
	
	public Task_activity_docCriteria createTask_documentCriteria() {
		return new Task_activity_docCriteria(createCriteria("task_document"));
	}
	
	public Document_type uniqueDocument_type() {
		return (Document_type) super.uniqueResult();
	}
	
	public Document_type[] listDocument_type() {
		java.util.List list = super.list();
		return (Document_type[]) list.toArray(new Document_type[list.size()]);
	}
}

