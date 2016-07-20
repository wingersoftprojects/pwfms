/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import pwfms.PWFMPersistentManager;
import pwfms.User_detail;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import utilities.GeneralUtilities;

/**
 *
 * @author bajuna
 */
//@ManagedBean
public abstract class AbstractBean<T> {

    private Class<T> entityClass;
    private User_detail user;
    private T selected;
    private String formstate = "view";
    private List<T> ts;
    private List<T> filteredTs;

    public User_detail getUser() {
        return user;
    }

    public void setUser(User_detail user) {
        this.user = user;
    }
    

    public AbstractBean() {
    }

    //@PostConstruct
    public void init() {

    }

    public void initializelist() {
        try {
            if (entityClass != null) {
                ts = (List<T>) PWFMPersistentManager.instance().getSession().createCriteria(entityClass).list();
            } else {
                ts = new ArrayList<>();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clearCache(T t) {
        try {
            PWFMPersistentManager.instance().getSession().evict(t);
            PWFMPersistentManager.instance().getSession().flush();
            PWFMPersistentManager.instance().getSession().clear();
        } catch (PersistentException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void evictObject(T t) {
        try {
            PWFMPersistentManager.instance().getSession().evict(t);
        } catch (PersistentException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public List<T> getFilteredTs() {
        return filteredTs;
    }

    public void setFilteredTs(List<T> filteredTs) {
        this.filteredTs = filteredTs;
    }

    public List<T> getTs() {
        try {
            if (entityClass != null) {
                ts = (List<T>) PWFMPersistentManager.instance().getSession().createCriteria(entityClass).list();
            } else {
                ts = new ArrayList<>();
            }
        } catch (PersistentException | HibernateException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ts;
    }

    public void setTs(List<T> ts) {
        this.ts = ts;
    }

    public T getSelected() {
        return selected;
    }

    public void setSelected(T selected) {
        this.selected = selected;
    }

    public AbstractBean(Class<T> entityClass) {
        this.entityClass = entityClass;
        add();
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public void createLicense() {

    }

    public void add() {
        try {
            selected = entityClass.newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        formstate = "add";
    }

    public void edit(T t) {
        try {
            //no paramater
            Class noparams[] = {};
            Method method = t.getClass().getMethod("get" + entityClass.getSimpleName() + "_id", noparams);
            int id = (int) method.invoke(t);
            if (id > 0) {
                selected = t;
                formstate = "edit";
            }
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void view(T t) {
        selected = t;
        formstate = "view";
    }

    public void cancel() {
        add();
    }

    public void delete(T t) {
        try {
            //no paramater
            Class noparams[] = {};
            Method method = t.getClass().getMethod("get" + entityClass.getSimpleName() + "_id", noparams);
            int id = (int) method.invoke(t);
            if (id == 0) {
                return;
            }
            selected = t;
            PersistentTransaction transaction = PWFMPersistentManager.instance().getSession().beginTransaction();
            PWFMPersistentManager.instance().getSession().merge(selected);
            transaction.commit();
            saveMessage();
            add();
            initializelist();
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PersistentException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save(int aUserDetailId) {
        Class noparams[] = {};

        try {
            PersistentTransaction transaction = PWFMPersistentManager.instance().getSession().beginTransaction();
            Method method = selected.getClass().getMethod("get" + entityClass.getSimpleName() + "_id", noparams);
            int id = (int) method.invoke(selected);
            if (id > 0) {
                PWFMPersistentManager.instance().getSession().merge(selected);
            } else {
                Method methodsave = selected.getClass().getMethod("save", noparams);
                methodsave.invoke(selected);
            }
            transaction.commit();
            clearCache(selected);
            formstate = "view";
            add();
            initializelist();
            saveMessage();
        } catch (PersistentException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            GeneralUtilities.clearsession();
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = PWFMPersistentManager.instance().getSession().beginTransaction();
            Object findAAgain = PWFMPersistentManager.instance().getSession().merge(selected);
            PWFMPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            PWFMPersistentManager.instance().getSession().evict(selected);
            this.selected = null;
            ts = null;
            initializelist();
        } catch (PersistentException ex) {
            Logger.getLogger(AbstractBean.class
                    .getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance()
                    .addMessage("Delete", new FacesMessage(ex.getMessage()));
        }
    }

    private void saveMessage() {
        LoginBean loginBean = new LoginBean();
        loginBean.saveMessage();
    }
}
