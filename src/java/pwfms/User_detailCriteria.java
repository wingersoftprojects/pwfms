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

public class User_detailCriteria extends AbstractORMCriteria {
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
	
	public User_detailCriteria(Criteria criteria) {
		super(criteria);
		user_detail_id = new IntegerExpression("user_detail_id", this);
		user_name = new StringExpression("user_name", this);
		user_password = new StringExpression("user_password", this);
		first_name = new StringExpression("first_name", this);
		second_name = new StringExpression("second_name", this);
		third_name = new StringExpression("third_name", this);
		user_image = new BlobExpression("user_image", this);
		user_category = new StringExpression("user_category", this);
		is_active = new IntegerExpression("is_active", this);
		is_general_admin = new IntegerExpression("is_general_admin", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		group_user = new CollectionExpression("group_user", this);
		task = new CollectionExpression("task", this);
		task1 = new CollectionExpression("task1", this);
		task_activity = new CollectionExpression("task_activity", this);
	}
	
	public User_detailCriteria(PersistentSession session) {
		this(session.createCriteria(User_detail.class));
	}
	
	public User_detailCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Group_userCriteria createGroup_userCriteria() {
		return new Group_userCriteria(createCriteria("group_user"));
	}
	
	public TaskCriteria createTaskCriteria() {
		return new TaskCriteria(createCriteria("task"));
	}
	
	public TaskCriteria createTask1Criteria() {
		return new TaskCriteria(createCriteria("task1"));
	}
	
	public Task_activityCriteria createTask_activityCriteria() {
		return new Task_activityCriteria(createCriteria("task_activity"));
	}
	
	public User_detail uniqueUser_detail() {
		return (User_detail) super.uniqueResult();
	}
	
	public User_detail[] listUser_detail() {
		java.util.List list = super.list();
		return (User_detail[]) list.toArray(new User_detail[list.size()]);
	}
}

