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

public class Activity_entity_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_entity_type_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final IntegerExpression is_mandatory;
	
	public Activity_entity_typeDetachedCriteria() {
		super(pwfms.Activity_entity_type.class, pwfms.Activity_entity_typeCriteria.class);
		activity_entity_type_id = new IntegerExpression("activity_entity_type_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public Activity_entity_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Activity_entity_typeCriteria.class);
		activity_entity_type_id = new IntegerExpression("activity_entity_type_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Entity_typeDetachedCriteria createEntity_typeCriteria() {
		return new Entity_typeDetachedCriteria(createCriteria("entity_type"));
	}
	
	public Activity_entity_type uniqueActivity_entity_type(PersistentSession session) {
		return (Activity_entity_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_entity_type[] listActivity_entity_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_entity_type[]) list.toArray(new Activity_entity_type[list.size()]);
	}
}

