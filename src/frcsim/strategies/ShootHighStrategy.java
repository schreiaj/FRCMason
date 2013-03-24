/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.strategies;


import frcsim.Globals;
import frcsim.actions.DoNothing;
import frcsim.actions.LoadDics;
import frcsim.actions.TeleopShootThreePoint;
import frcsim.util.RobotState;

/**
 *
 * @author aschreiber
 */
public class ShootHighStrategy extends Strategy{

    public ShootHighStrategy(double skill)
    {
        super(skill);
        this.addAction(new TeleopShootThreePoint(Globals.getAverageShootTime()));
        this.addAction(new LoadDics(10.0));
        this.addAction(new DoNothing());
    }    

    @Override
    public void initialize(RobotState state) {
        state.put("discs", 3);
    }
}
