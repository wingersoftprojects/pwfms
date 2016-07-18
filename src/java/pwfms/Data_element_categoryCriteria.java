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

public class Data_element_categoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression data_element_category_id;
	public final StringExpression data_element_category_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression data_element;
	
	public Data_element_categoryCriteria(Criteria criteria) {
		super(criteria);
		data_element_category_id = new IntegerExpression("data_element_category_id", this);
		data_element_category_name = new StringExpression("data_element_category_name", this);
		companyId = new IntegerExpression("company.company_id", this);
		company = new AssociationExpression("company", this);
		data_element = new CollectionExpression("data_element", this);
	}
	
	public Data_element_categoryCriteria(PersistentSession session) {
		this(session.createCriteria(Data_element_category.class));
	}
	
	public Data_element_categoryCriteria() throws PersistentException {
		this(pwfms.PWFMPersistentManager.instance().getSession());
	}
	
	public CompanyCriteria createCompanyCriteria() {
		return new CompanyCriteria(createCriteria("company"));
	}
	
	public Data_elementCriteria createData_elementCriteria() {
		return new Data_elementCriteria(createCriteria("data_element"));
	}
	
	public Data_element_category uniqueData_element_category() {
		return (Data_element_category) super.uniqueResult();
	}
	
	public Data_element_category[] listData_element_category() {
		java.util.List list = super.list();
		return (Data_element_category[]) list.toArray(new Data_element_category[list.size()]);
	}
}

