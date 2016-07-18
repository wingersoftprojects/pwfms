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

public class Group_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression group_detail_id;
	public final StringExpression group_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression group_right;
	public final CollectionExpression group_user;
	
	public Group_detailDetachedCriteria() {
		super(pwfms.Group_detail.class, pwfms.Group_detailCriteria.class);
		group_detail_id = new IntegerExpression("group_detail_id", this.getDetachedCriteria());
		group_name = new StringExpression("group_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
	}
	
	public Group_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Group_detailCriteria.class);
		group_detail_id = new IntegerExpression("group_detail_id", this.getDetachedCriteria());
		group_name = new StringExpression("group_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		group_right = new CollectionExpression("group_right", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Group_rightDetachedCriteria createGroup_rightCriteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_right"));
	}
	
	public Group_userDetachedCriteria createGroup_userCriteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user"));
	}
	
	public Group_detail uniqueGroup_detail(PersistentSession session) {
		return (Group_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Group_detail[] listGroup_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Group_detail[]) list.toArray(new Group_detail[list.size()]);
	}
}

