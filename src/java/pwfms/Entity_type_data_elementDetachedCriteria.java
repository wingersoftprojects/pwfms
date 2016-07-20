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

public class Entity_type_data_elementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression entity_type_data_element_id;
	public final IntegerExpression entity_typeId;
	public final AssociationExpression entity_type;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final IntegerExpression is_mandatory;
	
	public Entity_type_data_elementDetachedCriteria() {
		super(pwfms.Entity_type_data_element.class, pwfms.Entity_type_data_elementCriteria.class);
		entity_type_data_element_id = new IntegerExpression("entity_type_data_element_id", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public Entity_type_data_elementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Entity_type_data_elementCriteria.class);
		entity_type_data_element_id = new IntegerExpression("entity_type_data_element_id", this.getDetachedCriteria());
		entity_typeId = new IntegerExpression("entity_type.entity_type_id", this.getDetachedCriteria());
		entity_type = new AssociationExpression("entity_type", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public Entity_typeDetachedCriteria createEntity_typeCriteria() {
		return new Entity_typeDetachedCriteria(createCriteria("entity_type"));
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public Entity_type_data_element uniqueEntity_type_data_element(PersistentSession session) {
		return (Entity_type_data_element) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entity_type_data_element[] listEntity_type_data_element(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entity_type_data_element[]) list.toArray(new Entity_type_data_element[list.size()]);
	}
}

