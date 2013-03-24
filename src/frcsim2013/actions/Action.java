/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.actions;

import frcsim2013.Match;
import frcsim2013.events.Event;
import frcsim2013.util.RobotState;
import sim.engine.Steppable;
/**
 *
 * @author aschreiber
 */
public abstract class Action{
    public double secondsRemaining;
    private double difficulty;
    private Event onPass, onFail;
    public abstract Action perform(RobotState properties, Match m);
    public abstract boolean canPerform(RobotState properties, Match m);  
    public abstract void onStop(RobotState properties, Match m);

    public double getSecondsRemaining() {
        return secondsRemaining;
    }

    public void setSecondsRemaining(double secondsRemaining) {
        this.secondsRemaining = secondsRemaining;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public Event getOnPass() {
        return onPass;
    }

    public void setOnPass(Event onPass) {
        this.onPass = onPass;
    }

    public Event getOnFail() {
        return onFail;
    }

    public void setOnFail(Event onFail) {
        this.onFail = onFail;
    }
    
    
}
