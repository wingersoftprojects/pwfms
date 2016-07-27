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

public class Task_activity_docDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_activity_doc_id;
	public final IntegerExpression task_activityId;
	public final AssociationExpression task_activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final BlobExpression document_value;
	
	public Task_activity_docDetachedCriteria() {
		super(pwfms.Task_activity_doc.class, pwfms.Task_activity_docCriteria.class);
		task_activity_doc_id = new IntegerExpression("task_activity_doc_id", this.getDetachedCriteria());
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this.getDetachedCriteria());
		task_activity = new AssociationExpression("task_activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		document_value = new BlobExpression("document_value", this.getDetachedCriteria());
	}
	
	public Task_activity_docDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Task_activity_docCriteria.class);
		task_activity_doc_id = new IntegerExpression("task_activity_doc_id", this.getDetachedCriteria());
		task_activityId = new IntegerExpression("task_activity.task_activity_id", this.getDetachedCriteria());
		task_activity = new AssociationExpression("task_activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		document_value = new BlobExpression("document_value", this.getDetachedCriteria());
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Task_activity_doc uniqueTask_activity_doc(PersistentSession session) {
		return (Task_activity_doc) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_activity_doc[] listTask_activity_doc(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_activity_doc[]) list.toArray(new Task_activity_doc[list.size()]);
	}
}

