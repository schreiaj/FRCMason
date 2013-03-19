/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.actions;

import java.util.Hashtable;

/**
 *
 * @author aschreiber
 */
public class Load extends Action{

    @Override
    public boolean perform(Hashtable properties) {
        if(!canPerform(properties))
            return false;
        properties.put("discs", ((Integer)properties.get("max_discs")));
        System.err.println("Loading discs!");
        return true;
    }

    @Override
    public boolean canPerform(Hashtable properties) {
        return ((Integer)properties.get("discs")) <= ((Integer)properties.get("max_discs"));
    }
    
}
