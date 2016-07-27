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

public class Task_activity_docCriteria extends AbstractORMCriteria {
	public final IntegerExpression task_activity_doc_id;
	public final IntegerExpression task_activityId;
	public final AssociationExpression task_activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final BlobExpression document_value;
	
	public Task_activity_docCriteria(Criteria criteria) {
		super(criteria);
		task_activity_doc_id = new IntegerExpression("task_activity_doc_id", this);
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this);
		task_activity = new AssociationExpression("task_activity", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
		document_value = new BlobExpression("document_value", this);
	}
	
	public Task_activity_docCriteria(PersistentSession session) {
		this(session.createCriteria(Task_activity_doc.class));
	}
	
	public Task_activity_docCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Task_activity_doc uniqueTask_activity_doc() {
		return (Task_activity_doc) super.uniqueResult();
	}
	
	public Task_activity_doc[] listTask_activity_doc() {
		java.util.List list = super.list();
		return (Task_activity_doc[]) list.toArray(new Task_activity_doc[list.size()]);
	}
}

