/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import pwfms.Entity_instance;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@FacesConverter(value = "entity_instanceConverter")
public class Entity_instanceConverter implements Converter   {
     public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        int id = 0;
        try {
            id = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {

        }
        Entity_instance object = null;
        try {
            object = Entity_instance.getEntity_instanceByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(Entity_instanceConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return object;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Entity_instance) {
            Entity_instance o = (Entity_instance) object;
            return String.valueOf(o.getEntity_instance_id());
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: pwfms.Entity_instance");
        }
    }
}
