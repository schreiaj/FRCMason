/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

import frcsim2013.strategies.*;
import frcsim2013.actions.Action;
import java.util.Hashtable;
import sim.engine.*;

/**
 *
 * @author aschreiber
 */
public class Team implements Steppable{

    Hashtable<String, Object> properties;
    Strategy strategy;
    
    public Team()
    {
        properties = new Hashtable<String, Object>();
        strategy = new ShootStrategy();
        properties.put("discs", new Integer(3));
        properties.put("max_discs", new Integer(4));
    }
    
    @Override
    public void step(SimState ss) {
        Action a = strategy.getNextAction(properties);
        if(a != null)
        {
            a.perform(properties);
            
        }
            
        
    }
}
