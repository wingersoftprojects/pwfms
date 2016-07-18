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

public class Entity_type_data_elementCriteria extends AbstractORMCriteria {
	public final IntegerExpression entity_type_data_element;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final IntegerExpression is_mandatory;
	
	public Entity_type_data_elementCriteria(Criteria criteria) {
		super(criteria);
		entity_type_data_element = new IntegerExpression("entity_type_data_element", this);
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this);
		entity_type = new AssociationExpression("entity_type", this);
		data_elementId = new IntegerExpression("data_element.data_element_id", this);
		data_element = new AssociationExpression("data_element", this);
		is_mandatory = new IntegerExpression("is_mandatory", this);
	}
	
	public Entity_type_data_elementCriteria(PersistentSession session) {
		this(session.createCriteria(Entity_type_data_element.class));
	}
	
	public Entity_type_data_elementCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Entity_typeCriteria createEntity_typeCriteria() {
		return new Entity_typeCriteria(createCriteria("entity_type"));
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public Entity_type_data_element uniqueEntity_type_data_element() {
		return (Entity_type_data_element) super.uniqueResult();
	}
	
	public Entity_type_data_element[] listEntity_type_data_element() {
		java.util.List list = super.list();
		return (Entity_type_data_element[]) list.toArray(new Entity_type_data_element[list.size()]);
	}
}

