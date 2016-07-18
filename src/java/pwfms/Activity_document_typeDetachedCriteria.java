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

public class Activity_document_typeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression activity_document_type_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final IntegerExpression is_mandatory;
	
	public Activity_document_typeDetachedCriteria() {
		super(pwfms.Activity_document_type.class, pwfms.Activity_document_typeCriteria.class);
		activity_document_type_id = new IntegerExpression("activity_document_type_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public Activity_document_typeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Activity_document_typeCriteria.class);
		activity_document_type_id = new IntegerExpression("activity_document_type_id", this.getDetachedCriteria());
		activityId = new IntegerExpression("activity.activity_id", this.getDetachedCriteria());
		activity = new AssociationExpression("activity", this.getDetachedCriteria());
		document_typeId = new IntegerExpression("document_type.document_type_id", this.getDetachedCriteria());
		document_type = new AssociationExpression("document_type", this.getDetachedCriteria());
		is_mandatory = new IntegerExpression("is_mandatory", this.getDetachedCriteria());
	}
	
	public ActivityDetachedCriteria createActivityCriteria() {
		return new ActivityDetachedCriteria(createCriteria("activity"));
	}
	
	public Document_typeDetachedCriteria createDocument_typeCriteria() {
		return new Document_typeDetachedCriteria(createCriteria("document_type"));
	}
	
	public Activity_document_type uniqueActivity_document_type(PersistentSession session) {
		return (Activity_document_type) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Activity_document_type[] listActivity_document_type(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Activity_document_type[]) list.toArray(new Activity_document_type[list.size()]);
	}
}

