/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.strategies;


import frcsim2013.actions.Action;
import frcsim2013.actions.TeleopShootThreePoint;
import frcsim2013.events.HighGoalTeleopScore;
import frcsim2013.util.RobotState;
import java.util.Hashtable;

/**
 *
 * @author aschreiber
 */
public class ShootStrategy extends Strategy{

    public ShootStrategy(double shootTime)
    {
        super();
        this.addAction(new TeleopShootThreePoint(shootTime));
    }    

    @Override
    public void initialize(RobotState state) {
    }
}
