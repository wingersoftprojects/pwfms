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

public class Entity_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression entity_detail_id;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	public final CollectionExpression task;
	
	public Entity_detailDetachedCriteria() {
		super(pwfms.Entity_detail.class, pwfms.Entity_detailCriteria.class);
		entity_detail_id = new IntegerExpression("entity_detail_id", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public Entity_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Entity_detailCriteria.class);
		entity_detail_id = new IntegerExpression("entity_detail_id", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		data_element_value = new StringExpression("data_element_value", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public Entity_detail uniqueEntity_detail(PersistentSession session) {
		return (Entity_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entity_detail[] listEntity_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entity_detail[]) list.toArray(new Entity_detail[list.size()]);
	}
}

