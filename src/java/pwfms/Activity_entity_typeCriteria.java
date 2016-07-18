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

public class Activity_entity_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_entity_type_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final IntegerExpression is_mandatory;
	
	public Activity_entity_typeCriteria(Criteria criteria) {
		super(criteria);
		activity_entity_type_id = new IntegerExpression("activity_entity_type_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this);
		entity_type = new AssociationExpression("entity_type", this);
		is_mandatory = new IntegerExpression("is_mandatory", this);
	}
	
	public Activity_entity_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_entity_type.class));
	}
	
	public Activity_entity_typeCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Entity_typeCriteria createEntity_typeCriteria() {
		return new Entity_typeCriteria(createCriteria("entity_type"));
	}
	
	public Activity_entity_type uniqueActivity_entity_type() {
		return (Activity_entity_type) super.uniqueResult();
	}
	
	public Activity_entity_type[] listActivity_entity_type() {
		java.util.List list = super.list();
		return (Activity_entity_type[]) list.toArray(new Activity_entity_type[list.size()]);
	}
}

