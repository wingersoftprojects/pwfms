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

public class Activity_data_elementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_data_element_id;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression sectionId;
	public final AssociationExpression section;
	public final IntegerExpression data_element_order;
	public final IntegerExpression is_mandatory;
	
	public Activity_data_elementDetachedCriteria() {
		super(pwfms.Activity_data_element.class, pwfms.Activity_data_elementCriteria.class);
		activity_data_element_id = new IntegerExpression("activity_data_element_id", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		sectionId = new IntegerExpression("section.section_id", this.getDetachedCriteria());
		section = new AssociationExpression("section", this.getDetachedCriteria());
		data_element_order = new IntegerExpression("data_element_order", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public Activity_data_elementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Activity_data_elementCriteria.class);
		activity_data_element_id = new IntegerExpression("activity_data_element_id", this.getDetachedCriteria());
		data_elementId = new IntegerExpression("data_element.data_element_id", this.getDetachedCriteria());
		data_element = new AssociationExpression("data_element", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		sectionId = new IntegerExpression("section.section_id", this.getDetachedCriteria());
		section = new AssociationExpression("section", this.getDetachedCriteria());
		data_element_order = new IntegerExpression("data_element_order", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public SectionDetachedCriteria createSectionCriteria() {
		return new SectionDetachedCriteria(createCriteria("section"));
	}
	
	public Activity_data_element uniqueActivity_data_element(PersistentSession session) {
		return (Activity_data_element) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_data_element[] listActivity_data_element(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_data_element[]) list.toArray(new Activity_data_element[list.size()]);
	}
}

