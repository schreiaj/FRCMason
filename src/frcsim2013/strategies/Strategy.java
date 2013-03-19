/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.strategies;

import frcsim2013.actions.Action;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public abstract class Strategy {
    public LinkedList<Action> actions;   
    
    public Strategy()
    {
        actions = new LinkedList<Action>();
    }
    
    public Action getNextAction(Hashtable properties){
        for(Action a: actions){
            if(a.canPerform(properties))
                return a;
        }
        return null;
    }
}
