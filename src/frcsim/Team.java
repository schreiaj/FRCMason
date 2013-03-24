/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim;

import frcsim.strategies.Strategy;

/**
 *
 * @author aschreiber
 */
public class Team {

    private Strategy strategy;
    private double skill;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Team(String name, Class<?> s, double skill) {
        try {
            strategy = (Strategy) s.getConstructors()[0].newInstance(skill);
        } catch (Exception e) {
            System.err.print(e);
            System.exit(-1);
        }
        this.name = name;
        competentency = skill;
    }

    public String toString() {
        return ("Team " + this.name + " is " + this.competentency + "% good at playing " + this.strategy.getClass() + " strategy.");
    }
}
