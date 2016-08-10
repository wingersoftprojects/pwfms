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

public class Entity_instanceCriteria extends AbstractORMCriteria {
	public final IntegerExpression entity_instance_id;
	public final StringExpression entity_instance_name;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final CollectionExpression entity_detail;
	public final CollectionExpression task_activity;
	
	public Entity_instanceCriteria(Criteria criteria) {
		super(criteria);
		entity_instance_id = new IntegerExpression("entity_instance_id", this);
		entity_instance_name = new StringExpression("entity_instance_name", this);
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this);
		entity_type = new AssociationExpression("entity_type", this);
		entity_detail = new CollectionExpression("entity_detail", this);
		task_activity = new CollectionExpression("task_activity", this);
	}
	
	public Entity_instanceCriteria(PersistentSession session) {
		this(session.createCriteria(Entity_instance.class));
	}
	
	public Entity_instanceCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Entity_typeCriteria createEntity_typeCriteria() {
		return new Entity_typeCriteria(createCriteria("entity_type"));
	}
	
	public Entity_detailCriteria createEntity_detailCriteria() {
		return new Entity_detailCriteria(createCriteria("entity_detail"));
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public Entity_instance uniqueEntity_instance() {
		return (Entity_instance) super.uniqueResult();
	}
	
	public Entity_instance[] listEntity_instance() {
		java.util.List list = super.list();
		return (Entity_instance[]) list.toArray(new Entity_instance[list.size()]);
	}
}

