/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import beans.ActivityBean;
import beans.Activity_data_elementBean;
import beans.Activity_document_typeBean;
import beans.Activity_entity_typeBean;
import beans.Activity_outcomeBean;
import beans.CompanyBean;
import beans.Company_processBean;
import beans.Data_elementBean;
import beans.Data_element_categoryBean;
import beans.Document_typeBean;
import beans.Entity_detailBean;
import beans.Entity_instanceBean;
import beans.Entity_typeBean;
import beans.Entity_type_data_elementBean;
import beans.OutcomeBean;
import beans.SectionBean;
import beans.TaskBean;
import beans.Task_activityBean;
import beans.Task_activity_deBean;
import beans.Task_activity_docBean;
import beans.Task_activity_entityBean;
import pwfms.PWFMPersistentManager;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class GeneralUtilities implements Serializable {

    public static void clearsession() {
        try {
            PWFMPersistentManager.instance().disposePersistentManager();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void flushandclearsession() {
        try {
            PWFMPersistentManager.instance().getSession().flush();
            PWFMPersistentManager.instance().getSession().clear();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("ddMMyyyyHmmss");
    }

    public static SimpleDateFormat simpleDateFormatDate() {
        return new SimpleDateFormat("yyyy-MM-ddd");
    }

    public String checkdoctype(String docurl) {
        if (docurl.toLowerCase().contains(".jpg") || docurl.toLowerCase().contains(".png") || docurl.toLowerCase().contains(".jpeg") || docurl.toLowerCase().contains(".gif")) {
            return "image";
        } else if (docurl.toLowerCase().contains(".pdf") || docurl.toLowerCase().contains(".PDF")) {
            return "pdf";
        } else if (docurl.toLowerCase().contains(".doc") || docurl.toLowerCase().contains(".docx")) {
            return "word";
        } else if (docurl.toLowerCase().contains(".xls") || docurl.toLowerCase().contains(".xlsx")) {
            return "excel";
        } else {
            return "";
        }
    }
    private final String currencyformat = "###,##0.0";

    public String getCurrencyformat() {
        return currencyformat;
    }

    public String convertYesNo(int value) {
        switch (value) {
            case 0:
                return "No";
            case 1:
                return "Yes";
            default:
                return "";
        }
    }

    public void refreshAllList() {
        try {
            PWFMPersistentManager.instance().getSession().clear();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        GeneralUtilities.clearsession();
        
        new CompanyBean().init();
        new CompanyBean().initializelist();
        new Entity_typeBean().init();
        new Entity_typeBean().initializelist();
        new Entity_instanceBean().init();
        new Entity_instanceBean().initializelist();
        new Data_elementBean().init();
        new Data_elementBean().initializelist();
        new Document_typeBean().init();
        new Document_typeBean().initializelist();
        new Entity_type_data_elementBean().init();
        new Entity_type_data_elementBean().initializelist();
        new Data_element_categoryBean().init();
        new Data_element_categoryBean().initializelist();
        new OutcomeBean().init();
        new OutcomeBean().initializelist();
        new Company_processBean().init();
        new Company_processBean().initializelist();
        new ActivityBean().init();
        new ActivityBean().initializelist();
        new Activity_outcomeBean().init();
        new Activity_outcomeBean().initializelist();
        new Activity_document_typeBean().init();
        new Activity_document_typeBean().initializelist();
        new Activity_entity_typeBean().init();
        new Activity_entity_typeBean().initializelist();
        new SectionBean().init();
        new SectionBean().initializelist();
        new Activity_data_elementBean().init();
        new Activity_data_elementBean().initializelist();
        new TaskBean().init();
        new TaskBean().initializelist();
        new Task_activityBean().init();
        new Task_activityBean().initializelist();
        new Task_activity_deBean().init();
        new Task_activity_deBean().initializelist();
        new Task_activity_docBean().init();
        new Task_activity_docBean().initializelist();
        new Entity_detailBean().init();
        new Entity_detailBean().initializelist();
        new Task_activity_entityBean().init();
        new Task_activity_entityBean().initializelist();
    }

}
