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

public class Activity_data_elementCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_data_element_id;
	public final IntegerExpression data_elementId;
	public final AssociationExpression data_element;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression sectionId;
	public final AssociationExpression section;
	public final IntegerExpression data_element_order;
	public final IntegerExpression is_mandatory;
	
	public Activity_data_elementCriteria(Criteria criteria) {
		super(criteria);
		activity_data_element_id = new IntegerExpression("activity_data_element_id", this);
		data_elementId = new IntegerExpression("data_element.data_element_id", this);
		data_element = new AssociationExpression("data_element", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		sectionId = new IntegerExpression("section.section_id", this);
		section = new AssociationExpression("section", this);
		data_element_order = new IntegerExpression("data_element_order", this);
		is_mandatory = new IntegerExpression("is_mandatory", this);
	}
	
	public Activity_data_elementCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_data_element.class));
	}
	
	public Activity_data_elementCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public SectionCriteria createSectionCriteria() {
		return new SectionCriteria(createCriteria("section"));
	}
	
	public Activity_data_element uniqueActivity_data_element() {
		return (Activity_data_element) super.uniqueResult();
	}
	
	public Activity_data_element[] listActivity_data_element() {
		java.util.List list = super.list();
		return (Activity_data_element[]) list.toArray(new Activity_data_element[list.size()]);
	}
}

