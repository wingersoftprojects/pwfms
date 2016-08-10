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

public class User_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression user_detail_id;
	public final StringExpression user_name;
	public final StringExpression user_password;
	public final StringExpression first_name;
	public final StringExpression second_name;
	public final StringExpression third_name;
	public final BlobExpression user_image;
	public final StringExpression user_category;
	public final IntegerExpression is_active;
	public final IntegerExpression is_general_admin;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression group_user;
	public final CollectionExpression task;
	public final CollectionExpression task1;
	public final CollectionExpression task_activity;
	
	public User_detailDetachedCriteria() {
		super(pwfms.User_detail.class, pwfms.User_detailCriteria.class);
		user_detail_id = new IntegerExpression("user_detail_id", this.getDetachedCriteria());
		user_name = new StringExpression("user_name", this.getDetachedCriteria());
		user_password = new StringExpression("user_password", this.getDetachedCriteria());
		first_name = new StringExpression("first_name", this.getDetachedCriteria());
		second_name = new StringExpression("second_name", this.getDetachedCriteria());
		third_name = new StringExpression("third_name", this.getDetachedCriteria());
		user_image = new BlobExpression("user_image", this.getDetachedCriteria());
		user_category = new StringExpression("user_category", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_general_admin = new IntegerExpression("is_general_admin", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		task1 = new CollectionExpression("task1", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
	}
	
	public User_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.User_detailCriteria.class);
		user_detail_id = new IntegerExpression("user_detail_id", this.getDetachedCriteria());
		user_name = new StringExpression("user_name", this.getDetachedCriteria());
		user_password = new StringExpression("user_password", this.getDetachedCriteria());
		first_name = new StringExpression("first_name", this.getDetachedCriteria());
		second_name = new StringExpression("second_name", this.getDetachedCriteria());
		third_name = new StringExpression("third_name", this.getDetachedCriteria());
		user_image = new BlobExpression("user_image", this.getDetachedCriteria());
		user_category = new StringExpression("user_category", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		is_general_admin = new IntegerExpression("is_general_admin", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
		task = new CollectionExpression("task", this.getDetachedCriteria());
		task1 = new CollectionExpression("task1", this.getDetachedCriteria());
		task_activity = new CollectionExpression("task_activity", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Group_userDetachedCriteria createGroup_userCriteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user"));
	}
	
	public TaskDetachedCriteria createTaskCriteria() {
		return new TaskDetachedCriteria(createCriteria("task"));
	}
	
	public TaskDetachedCriteria createTask1Criteria() {
		return new TaskDetachedCriteria(createCriteria("task1"));
	}
	
	public Task_activityDetachedCriteria createTask_activityCriteria() {
		return new Task_activityDetachedCriteria(createCriteria("task_activity"));
	}
	
	public User_detail uniqueUser_detail(PersistentSession session) {
		return (User_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User_detail[] listUser_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

