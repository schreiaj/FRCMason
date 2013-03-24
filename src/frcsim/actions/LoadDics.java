/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.actions;

import frcsim.Globals;
import frcsim.Match;
import frcsim.events.HighGoalTeleopScore;
import frcsim.events.HumanLoadedDiscs;
import frcsim.events.NullEvent;
import frcsim.util.RobotState;
import sim.engine.SimState;

/**
 *
 * @author aschreiber
 */
public class LoadDics extends Action {

    public LoadDics(double loadTime) {
        this.secondsRemaining = loadTime;
        this.setDifficulty(Globals.getHumanLoadDifficulty());
        this.setOnFail(NullEvent.class);
        this.setOnPass(HumanLoadedDiscs.class);
    }

    @Override
    public boolean canPerform(RobotState properties, Match m) {
        return properties.get("discs") < 4;
    }

    @Override
    public void onStop(SimState ss, RobotState properties, Match m) {
        if (super.succeed(ss, properties.getTeam())) {
            properties.put("discs", 4);

        }
        super.onStop(ss, properties, m);
    }
}
