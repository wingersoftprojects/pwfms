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

public class Data_element_categoryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression data_element_category_id;
	public final StringExpression data_element_category_name;
	public final IntegerExpression companyId;
	public final AssociationExpression company;
	public final CollectionExpression data_element;
	
	public Data_element_categoryDetachedCriteria() {
		super(pwfms.Data_element_category.class, pwfms.Data_element_categoryCriteria.class);
		data_element_category_id = new IntegerExpression("data_element_category_id", this.getDetachedCriteria());
		data_element_category_name = new StringExpression("data_element_category_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		data_element = new CollectionExpression("data_element", this.getDetachedCriteria());
	}
	
	public Data_element_categoryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, pwfms.Data_element_categoryCriteria.class);
		data_element_category_id = new IntegerExpression("data_element_category_id", this.getDetachedCriteria());
		data_element_category_name = new StringExpression("data_element_category_name", this.getDetachedCriteria());
		companyId = new IntegerExpression("company.company_id", this.getDetachedCriteria());
		company = new AssociationExpression("company", this.getDetachedCriteria());
		data_element = new CollectionExpression("data_element", this.getDetachedCriteria());
	}
	
	public CompanyDetachedCriteria createCompanyCriteria() {
		return new CompanyDetachedCriteria(createCriteria("company"));
	}
	
	public Data_elementDetachedCriteria createData_elementCriteria() {
		return new Data_elementDetachedCriteria(createCriteria("data_element"));
	}
	
	public Data_element_category uniqueData_element_category(PersistentSession session) {
		return (Data_element_category) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Data_element_category[] listData_element_category(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Data_element_category[]) list.toArray(new Data_element_category[list.size()]);
	}
}

