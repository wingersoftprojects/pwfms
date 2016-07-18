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

public class Task_documentCriteria extends AbstractORMCriteria {
	public final IntegerExpression task_document_id;
	public final IntegerExpression taskId;
	public final AssociationExpression task;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final BlobExpression document_value;
	
	public Task_documentCriteria(Criteria criteria) {
		super(criteria);
		task_document_id = new IntegerExpression("task_document_id", this);
		taskId = new IntegerExpression("task.task_id", this);
		task = new AssociationExpression("task", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
		document_value = new BlobExpression("document_value", this);
	}
	
	public Task_documentCriteria(PersistentSession session) {
		this(session.createCriteria(Task_document.class));
	}
	
	public Task_documentCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Task_document uniqueTask_document() {
		return (Task_document) super.uniqueResult();
	}
	
	public Task_document[] listTask_document() {
		java.util.List list = super.list();
		return (Task_document[]) list.toArray(new Task_document[list.size()]);
	}
}

