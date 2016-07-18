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

public class Entity_detailCriteria extends AbstractORMCriteria {
	public final IntegerExpression entity_detail_id;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final StringExpression data_element_value;
	public final CollectionExpression task;
	
	public Entity_detailCriteria(Criteria criteria) {
		super(criteria);
		entity_detail_id = new IntegerExpression("entity_detail_id", this);
		data_elementId = new IntegerExpression("data_element.data_element_id", this);
		data_element = new AssociationExpression("data_element", this);
		data_element_value = new StringExpression("data_element_value", this);
		task = new CollectionExpression("task", this);
	}
	
	public Entity_detailCriteria(PersistentSession session) {
		this(session.createCriteria(Entity_detail.class));
	}
	
	public Entity_detailCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public Entity_detail uniqueEntity_detail() {
		return (Entity_detail) super.uniqueResult();
	}
	
	public Entity_detail[] listEntity_detail() {
		java.util.List list = super.list();
		return (Entity_detail[]) list.toArray(new Entity_detail[list.size()]);
	}
}

