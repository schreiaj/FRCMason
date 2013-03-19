/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.strategies;

import frcsim2013.actions.Load;
import frcsim2013.actions.Action;
import frcsim2013.actions.Shoot3;
import frcsim2013.util.RobotState;
import java.util.Hashtable;

/**
 *
 * @author aschreiber
 */
public class ShootStrategy extends Strategy{

    public ShootStrategy()
    {
        super();
        this.getActionsList().add(new Shoot3());
        this.getActionsList().add(new Load());
    }    

    @Override
    public void initialize(RobotState state) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
