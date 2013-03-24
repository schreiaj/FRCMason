/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.strategies;


import frcsim.Globals;
import frcsim.actions.TeleopShootThreePoint;
import frcsim.util.RobotState;

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
