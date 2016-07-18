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

public class SectionCriteria extends AbstractORMCriteria {
	public final IntegerExpression section_id;
	public final StringExpression section_name;
	public final IntegerExpression section_order;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final CollectionExpression activity_data_element;
	
	public SectionCriteria(Criteria criteria) {
		super(criteria);
		section_id = new IntegerExpression("section_id", this);
		section_name = new StringExpression("section_name", this);
		section_order = new IntegerExpression("section_order", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		activity_data_element = new CollectionExpression("activity_data_element", this);
	}
	
	public SectionCriteria(PersistentSession session) {
		this(session.createCriteria(Section.class));
	}
	
	public SectionCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Activity_data_elementCriteria createActivity_data_elementCriteria() {
		return new Activity_data_elementCriteria(createCriteria("activity_data_element"));
	}
	
	public Section uniqueSection() {
		return (Section) super.uniqueResult();
	}
	
	public Section[] listSection() {
		java.util.List list = super.list();
		return (Section[]) list.toArray(new Section[list.size()]);
	}
}

