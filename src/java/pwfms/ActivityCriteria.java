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

public class ActivityCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_id;
	public final StringExpression activity_name;
	public final IntegerExpression processId;
	public final AssociationExpression process;
	public final IntegerExpression is_start;
	public final IntegerExpression is_final;
	public final IntegerExpression from_activity_id;
	public final IntegerExpression to_activity_id_success;
	public final IntegerExpression to_activity_id_failure;
	public final IntegerExpression duration;
	public final IntegerExpression flag_after;
	public final CollectionExpression section;
	public final CollectionExpression activity_data_element;
	public final CollectionExpression activity_outcome;
	public final CollectionExpression activity_document_type;
	public final CollectionExpression activity_entity_type;
	public final CollectionExpression task_activity;
	
	public ActivityCriteria(Criteria criteria) {
		super(criteria);
		activity_id = new IntegerExpression("activity_id", this);
		activity_name = new StringExpression("activity_name", this);
		processId = new IntegerExpression("process.process_id", this);
		process = new AssociationExpression("process", this);
		is_start = new IntegerExpression("is_start", this);
		is_final = new IntegerExpression("is_final", this);
		from_activity_id = new IntegerExpression("from_activity_id", this);
		to_activity_id_success = new IntegerExpression("to_activity_id_success", this);
		to_activity_id_failure = new IntegerExpression("to_activity_id_failure", this);
		duration = new IntegerExpression("duration", this);
		flag_after = new IntegerExpression("flag_after", this);
		section = new CollectionExpression("section", this);
		activity_data_element = new CollectionExpression("activity_data_element", this);
		activity_outcome = new CollectionExpression("activity_outcome", this);
		activity_document_type = new CollectionExpression("activity_document_type", this);
		activity_entity_type = new CollectionExpression("activity_entity_type", this);
		task_activity = new CollectionExpression("task_activity", this);
	}
	
	public ActivityCriteria(PersistentSession session) {
		this(session.createCriteria(Activity.class));
	}
	
	public ActivityCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public ProcessCriteria createProcessCriteria() {
		return new ProcessCriteria(createCriteria("process"));
	}
	
	public SectionCriteria createSectionCriteria() {
		return new SectionCriteria(createCriteria("section"));
	}
	
	public Activity_data_elementCriteria createActivity_data_elementCriteria() {
		return new Activity_data_elementCriteria(createCriteria("activity_data_element"));
	}
	
	public Activity_outcomeCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeCriteria(createCriteria("activity_outcome"));
	}
	
	public Activity_document_typeCriteria createActivity_document_typeCriteria() {
		return new Activity_document_typeCriteria(createCriteria("activity_document_type"));
	}
	
	public Activity_entity_typeCriteria createActivity_entity_typeCriteria() {
		return new Activity_entity_typeCriteria(createCriteria("activity_entity_type"));
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Activity uniqueActivity() {
		return (Activity) super.uniqueResult();
	}
	
	public Activity[] listActivity() {
		java.util.List list = super.list();
		return (Activity[]) list.toArray(new Activity[list.size()]);
	}
}

