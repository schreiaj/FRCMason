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
public class Shoot3 extends Action{

    @Override
    public boolean perform(Hashtable properties) {
        if(!canPerform(properties))
        {
            return false;
        }
        System.err.println("Shooting one!");
        properties.put("discs",(Integer)properties.get("discs")-1);
        return true;
    }

    @Override
    public boolean canPerform(Hashtable properties) {
        return ((Integer)properties.get("discs")) > 0;
    }
    
}
