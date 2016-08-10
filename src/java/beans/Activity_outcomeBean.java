/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.Activity_outcome;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.orm.PersistentException;
import pwfms.Activity;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Activity_outcomeBean extends AbstractBean<Activity_outcome> implements Serializable {

    public Activity_outcomeBean() {
        super(Activity_outcome.class);
    }

    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public List<Activity_outcome> getActivity_outcomes(Activity activity) {
        List<Activity_outcome> aActivity_outcomes = new ArrayList<>();
        try {
            aActivity_outcomes = Activity_outcome.queryActivity_outcome("activity=" + activity.getActivity_id(), null);
        } catch (PersistentException | NullPointerException ex) {
            Logger.getLogger(Activity_outcomeBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aActivity_outcomes;
    }

}
