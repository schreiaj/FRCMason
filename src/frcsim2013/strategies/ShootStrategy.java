/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.strategies;

import frcsim2013.actions.Load;
import frcsim2013.actions.Action;
import frcsim2013.actions.Shoot3;
import java.util.Hashtable;

/**
 *
 * @author aschreiber
 */
public class ShootStrategy extends Strategy{

    public ShootStrategy()
    {
        super();
        actions.add(new Shoot3());
        actions.add(new Load());
    }    
}
