/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.actions;

import frcsim.Globals;
import frcsim.Match;
import frcsim.Team;
import frcsim.events.Event;
import frcsim.util.RobotState;
import sim.engine.SimState;

/**
 *
 * @author aschreiber
 */
public abstract class Action {

    public double secondsRemaining;
    private double difficulty;
    private Class<?> onPass, onFail;

    public Action perform(SimState ss, RobotState properties, Match m) {
        this.secondsRemaining -= Globals.getSecondsPerTic();
        if (this.secondsRemaining <= 0) {
            this.onStop(ss, properties, m);
            return null;
        }
        return this;
    }

    public abstract boolean canPerform(RobotState properties, Match m);

    public void onStop(SimState ss, RobotState properties, Match m) {
        try {
            if (this.succeed(ss, properties.getTeam())) {
                m.addRobotEvent(properties, (Event) this.getOnPass().newInstance());
            } else {
                m.addRobotEvent(properties, (Event) this.getOnFail().newInstance());
            }
        } catch (Exception e) {
            System.err.println(e);
            System.exit(-1);
        }
    }

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

    public Class<?> getOnPass() {
        return onPass;
    }

    public void setOnPass(Class<?> onPass) {
        this.onPass = onPass;
    }

    public Class<?> getOnFail() {
        return onFail;
    }

    public void setOnFail(Class<?> onFail) {
        this.onFail = onFail;
    }

    // The action succeeds if the teams skill * next double beats the skill required. 
    public boolean succeed(SimState ss, Team t) {
        double attemptSkill = t.getCompetentency() * ss.random.nextDouble();
        System.err.println(t.getName() + (attemptSkill >=this.difficulty?" did ":" failed ") + this.getClass().getSimpleName() + " with skill " + attemptSkill);
        return attemptSkill >= this.difficulty;
    }
}
