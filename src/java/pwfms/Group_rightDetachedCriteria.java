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

public class Group_rightDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression group_right_id;
	public final IntegerExpression group_detailId;
	public final AssociationExpression group_detail;
	public final StringExpression function_name;
	public final IntegerExpression allow_view;
	public final IntegerExpression allow_add;
	public final IntegerExpression allow_edit;
	public final IntegerExpression allow_delete;
	
	public Group_rightDetachedCriteria() {
		super(pwfms.Group_right.class, pwfms.Group_rightCriteria.class);
		group_right_id = new IntegerExpression("group_right_id", this.getDetachedCriteria());
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this.getDetachedCriteria());
		group_detail = new AssociationExpression("group_detail", this.getDetachedCriteria());
		function_name = new StringExpression("function_name", this.getDetachedCriteria());
		allow_view = new IntegerExpression("allow_view", this.getDetachedCriteria());
		allow_add = new IntegerExpression("allow_add", this.getDetachedCriteria());
		allow_edit = new IntegerExpression("allow_edit", this.getDetachedCriteria());
		allow_delete = new IntegerExpression("allow_delete", this.getDetachedCriteria());
	}
	
	public Group_rightDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Group_rightCriteria.class);
		group_right_id = new IntegerExpression("group_right_id", this.getDetachedCriteria());
		group_detailId = new IntegerExpression("group_detail.group_detail_id", this.getDetachedCriteria());
		group_detail = new AssociationExpression("group_detail", this.getDetachedCriteria());
		function_name = new StringExpression("function_name", this.getDetachedCriteria());
		allow_view = new IntegerExpression("allow_view", this.getDetachedCriteria());
		allow_add = new IntegerExpression("allow_add", this.getDetachedCriteria());
		allow_edit = new IntegerExpression("allow_edit", this.getDetachedCriteria());
		allow_delete = new IntegerExpression("allow_delete", this.getDetachedCriteria());
	}
	
	public Group_detailDetachedCriteria createGroup_detailCriteria() {
		return new Group_detailDetachedCriteria(createCriteria("group_detail"));
	}
	
	public Group_right uniqueGroup_right(PersistentSession session) {
		return (Group_right) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Group_right[] listGroup_right(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Group_right[]) list.toArray(new Group_right[list.size()]);
	}
}

