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

public class Entity_instanceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression entity_instance_id;
	public final StringExpression entity_instance_name;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final CollectionExpression entity_detail;
	public final CollectionExpression task_activity;
	
	public Entity_instanceDetachedCriteria() {
		super(pwfms.Entity_instance.class, pwfms.Entity_instanceCriteria.class);
		entity_instance_id = new IntegerExpression("entity_instance_id", this.getDetachedCriteria());
		entity_instance_name = new StringExpression("entity_instance_name", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		entity_detail = new CollectionExpression("entity_detail", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
	}
	
	public Entity_instanceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Entity_instanceCriteria.class);
		entity_instance_id = new IntegerExpression("entity_instance_id", this.getDetachedCriteria());
		entity_instance_name = new StringExpression("entity_instance_name", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		entity_detail = new CollectionExpression("entity_detail", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
	}
	
	public Entity_typeDetachedCriteria createEntity_typeCriteria() {
		return new Entity_typeDetachedCriteria(createCriteria("entity_type"));
	}
	
	public Entity_detailDetachedCriteria createEntity_detailCriteria() {
		return new Entity_detailDetachedCriteria(createCriteria("entity_detail"));
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public Entity_instance uniqueEntity_instance(PersistentSession session) {
		return (Entity_instance) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entity_instance[] listEntity_instance(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entity_instance[]) list.toArray(new Entity_instance[list.size()]);
	}
}

