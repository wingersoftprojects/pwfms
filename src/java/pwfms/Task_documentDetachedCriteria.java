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

public class Task_documentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression task_document_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final BlobExpression document_value;
	
	public Task_documentDetachedCriteria() {
		super(pwfms.Task_document.class, pwfms.Task_documentCriteria.class);
		task_document_id = new IntegerExpression("task_document_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		document_value = new BlobExpression("document_value", this.getDetachedCriteria());
	}
	
	public Task_documentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Task_documentCriteria.class);
		task_document_id = new IntegerExpression("task_document_id", this.getDetachedCriteria());
		taskId = new IntegerExpression("task.task_id", this.getDetachedCriteria());
		task = new AssociationExpression("task", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		document_value = new BlobExpression("document_value", this.getDetachedCriteria());
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Task_document uniqueTask_document(PersistentSession session) {
		return (Task_document) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Task_document[] listTask_document(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Task_document[]) list.toArray(new Task_document[list.size()]);
	}
}

