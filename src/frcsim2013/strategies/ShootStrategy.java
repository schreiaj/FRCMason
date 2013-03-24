/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.strategies;


import frcsim2013.Globals;
import frcsim2013.actions.TeleopShootThreePoint;
import frcsim2013.util.RobotState;

/**
 *
 * @author aschreiber
 */
public class ShootStrategy extends Strategy{

    public ShootStrategy(double skill)
    {
        super(skill);
        this.addAction(new TeleopShootThreePoint(Globals.getAverageShootTime()));
    }    

    @Override
    public void initialize(RobotState state) {
    }
}
