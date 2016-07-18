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

public class ActivityDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression task;
	
	public ActivityDetachedCriteria() {
		super(pwfms.Activity.class, pwfms.ActivityCriteria.class);
		activity_id = new IntegerExpression("activity_id", this.getDetachedCriteria());
		activity_name = new StringExpression("activity_name", this.getDetachedCriteria());
		processId = new IntegerExpression("process.process_id", this.getDetachedCriteria());
		process = new AssociationExpression("process", this.getDetachedCriteria());
		is_start = new IntegerExpression("is_start", this.getDetachedCriteria());
		is_final = new IntegerExpression("is_final", this.getDetachedCriteria());
		from_activity_id = new IntegerExpression("from_activity_id", this.getDetachedCriteria());
		to_activity_id_success = new IntegerExpression("to_activity_id_success", this.getDetachedCriteria());
		to_activity_id_failure = new IntegerExpression("to_activity_id_failure", this.getDetachedCriteria());
		duration = new IntegerExpression("duration", this.getDetachedCriteria());
		flag_after = new IntegerExpression("flag_after", this.getDetachedCriteria());
		section = new CollectionExpression("section", this.getDetachedCriteria());
		activity_data_element = new CollectionExpression("activity_data_element", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
		activity_document_type = new CollectionExpression("activity_document_type", this.getDetachedCriteria());
		activity_entity_type = new CollectionExpression("activity_entity_type", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.ActivityCriteria.class);
		activity_id = new IntegerExpression("activity_id", this.getDetachedCriteria());
		activity_name = new StringExpression("activity_name", this.getDetachedCriteria());
		processId = new IntegerExpression("process.process_id", this.getDetachedCriteria());
		process = new AssociationExpression("process", this.getDetachedCriteria());
		is_start = new IntegerExpression("is_start", this.getDetachedCriteria());
		is_final = new IntegerExpression("is_final", this.getDetachedCriteria());
		from_activity_id = new IntegerExpression("from_activity_id", this.getDetachedCriteria());
		to_activity_id_success = new IntegerExpression("to_activity_id_success", this.getDetachedCriteria());
		to_activity_id_failure = new IntegerExpression("to_activity_id_failure", this.getDetachedCriteria());
		duration = new IntegerExpression("duration", this.getDetachedCriteria());
		flag_after = new IntegerExpression("flag_after", this.getDetachedCriteria());
		section = new CollectionExpression("section", this.getDetachedCriteria());
		activity_data_element = new CollectionExpression("activity_data_element", this.getDetachedCriteria());
		activity_outcome = new CollectionExpression("activity_outcome", this.getDetachedCriteria());
		activity_document_type = new CollectionExpression("activity_document_type", this.getDetachedCriteria());
		activity_entity_type = new CollectionExpression("activity_entity_type", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public ProcessDetachedCriteria createProcessCriteria() {
		return new ProcessDetachedCriteria(createCriteria("process"));
	}
	
	public SectionDetachedCriteria createSectionCriteria() {
		return new SectionDetachedCriteria(createCriteria("section"));
	}
	
	public Activity_data_elementDetachedCriteria createActivity_data_elementCriteria() {
		return new Activity_data_elementDetachedCriteria(createCriteria("activity_data_element"));
	}
	
	public Activity_outcomeDetachedCriteria createActivity_outcomeCriteria() {
		return new Activity_outcomeDetachedCriteria(createCriteria("activity_outcome"));
	}
	
	public Activity_document_typeDetachedCriteria createActivity_document_typeCriteria() {
		return new Activity_document_typeDetachedCriteria(createCriteria("activity_document_type"));
	}
	
	public Activity_entity_typeDetachedCriteria createActivity_entity_typeCriteria() {
		return new Activity_entity_typeDetachedCriteria(createCriteria("activity_entity_type"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Activity uniqueActivity(PersistentSession session) {
		return (Activity) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity[] listActivity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity[]) list.toArray(new Activity[list.size()]);
	}
}

