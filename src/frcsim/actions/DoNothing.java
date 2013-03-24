/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.actions;

import frcsim.Match;
import frcsim.util.RobotState;
import sim.engine.SimState;

/**
 *
 * @author aschreiber
 */
public class DoNothing extends Action {

    @Override
    public Action perform(SimState ss, RobotState properties, Match m) {
        return null;
    }

    @Override
    public boolean canPerform(RobotState properties, Match m) {
        return true;
    }

    @Override
    public void onStop(SimState ss, RobotState properties, Match m) {
    }
}
