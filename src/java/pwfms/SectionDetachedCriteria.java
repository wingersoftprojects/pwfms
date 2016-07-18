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

public class SectionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression section_id;
	public final StringExpression section_name;
	public final IntegerExpression section_order;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final CollectionExpression activity_data_element;
	
	public SectionDetachedCriteria() {
		super(pwfms.Section.class, pwfms.SectionCriteria.class);
		section_id = new IntegerExpression("section_id", this.getDetachedCriteria());
		section_name = new StringExpression("section_name", this.getDetachedCriteria());
		section_order = new IntegerExpression("section_order", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		activity_data_element = new CollectionExpression("activity_data_element", this.getDetachedCriteria());
	}
	
	public SectionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.SectionCriteria.class);
		section_id = new IntegerExpression("section_id", this.getDetachedCriteria());
		section_name = new StringExpression("section_name", this.getDetachedCriteria());
		section_order = new IntegerExpression("section_order", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		activity_data_element = new CollectionExpression("activity_data_element", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Activity_data_elementDetachedCriteria createActivity_data_elementCriteria() {
		return new Activity_data_elementDetachedCriteria(createCriteria("activity_data_element"));
	}
	
	public Section uniqueSection(PersistentSession session) {
		return (Section) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Section[] listSection(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Section[]) list.toArray(new Section[list.size()]);
	}
}

