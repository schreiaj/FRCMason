/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.actions;

import frcsim.Globals;
import frcsim.Match;
import frcsim.events.Event;
import frcsim.events.HighGoalTeleopScore;
import frcsim.events.NullEvent;
import frcsim.util.RobotState;
import sim.engine.SimState;

/**
 *
 * @author aschreiber
 */
public class TeleopShootThreePoint extends Action {

    public TeleopShootThreePoint(double shotTime) {
        this.secondsRemaining = shotTime;
        this.setDifficulty(Globals.getHighTeleShootDifficulty());
        this.setOnFail(NullEvent.class);
        this.setOnPass(HighGoalTeleopScore.class);
    }


    @Override
    public boolean canPerform(RobotState properties, Match m) {
        // We can't do this action if there's not time enough left in match
        // Or, I guess, if the robot doesn't have discs...
        return this.secondsRemaining <= m.getSecondsRemaining() && properties.get("discs") > 0;
    }

    @Override
    public void onStop(SimState ss, RobotState properties, Match m) {
        properties.decrement("discs");
        super.onStop(ss,properties,m);
    }
}
