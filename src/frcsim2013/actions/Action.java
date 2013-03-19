/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.actions;

import frcsim2013.Match;
import frcsim2013.util.RobotState;
import sim.engine.Steppable;
/**
 *
 * @author aschreiber
 */
public abstract class Action implements Steppable{
    double secondsRequired;
    public abstract boolean perform(RobotState properties, Match m);
    public abstract boolean canPerform(RobotState properties, Match m);   
}
