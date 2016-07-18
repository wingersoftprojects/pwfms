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

public class Activity_document_typeCriteria extends AbstractORMCriteria {
	public final IntegerExpression activity_document_type_id;
	public final IntegerExpression activityId;
	public final AssociationExpression activity;
	public final IntegerExpression document_typeId;
	public final AssociationExpression document_type;
	public final IntegerExpression is_mandatory;
	
	public Activity_document_typeCriteria(Criteria criteria) {
		super(criteria);
		activity_document_type_id = new IntegerExpression("activity_document_type_id", this);
		activityId = new IntegerExpression("activity.activity_id", this);
		activity = new AssociationExpression("activity", this);
		document_typeId = new IntegerExpression("document_type.document_type_id", this);
		document_type = new AssociationExpression("document_type", this);
		is_mandatory = new IntegerExpression("is_mandatory", this);
	}
	
	public Activity_document_typeCriteria(PersistentSession session) {
		this(session.createCriteria(Activity_document_type.class));
	}
	
	public Activity_document_typeCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public ActivityCriteria createActivityCriteria() {
		return new ActivityCriteria(createCriteria("activity"));
	}
	
	public Document_typeCriteria createDocument_typeCriteria() {
		return new Document_typeCriteria(createCriteria("document_type"));
	}
	
	public Activity_document_type uniqueActivity_document_type() {
		return (Activity_document_type) super.uniqueResult();
	}
	
	public Activity_document_type[] listActivity_document_type() {
		java.util.List list = super.list();
		return (Activity_document_type[]) list.toArray(new Activity_document_type[list.size()]);
	}
}

