/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

import frcsim2013.strategies.*;
import frcsim2013.actions.Action;
import java.util.Hashtable;
import sim.engine.*;

/**
 *
 * @author aschreiber
 */
public class Team {

    private Strategy strategy;
    private double skill;

    public double getSkill() {
        return skill;
    }

    public void setSkill(double skill) {
        this.skill = skill;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setCompetentency(double competentency) {
        this.competentency = competentency;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public double getCompetentency() {
        return competentency;
    }
    // This is how good teams are at executing on their strategy. On a scale of 0-100. 
    // We use competency + randomDraw (from Mason's generator) and compare it to difficulty of action
    // We then will trigger off a EventTriggeredOnPass or EventTriggeredOnFail for that action
    private double competentency;

    public Team(Strategy s, double skill) {
        strategy = s;
        competentency = skill;
    }
}
