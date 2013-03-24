/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim;

import frcsim.events.Event;
import frcsim.util.RobotState;
import java.util.LinkedList;
import sim.engine.SimState;
import sim.engine.Steppable;
import sim.engine.Stoppable;

/**
 *
 * @author aschreiber
 */
public class Match implements Steppable, Stoppable {

    private int secondsRemaining;

    public void addRobotEvent(RobotState rs, Event e) {
        if (redAlliance.contains(rs)) {
            redEvents.addLast(e);
        }
        if (blueAlliance.contains(rs)) {
            blueEvents.addLast(e);
        }
    }

    public int getSecondsRemaining() {
        return secondsRemaining;
    }

    public void setSecondsRemaining(int secondsRemaining) {
        this.secondsRemaining = secondsRemaining;
    }
    LinkedList<RobotState> redAlliance, blueAlliance;
    LinkedList<Event> redEvents, blueEvents;

    public Match(int length, LinkedList<Team> red, LinkedList<Team> blue) {

        secondsRemaining = length;
        redAlliance = new LinkedList<RobotState>();
        blueAlliance = new LinkedList<RobotState>();
        redEvents = new LinkedList<Event>();
        blueEvents = new LinkedList<Event>();

        for (Team t : red) {
            RobotState rs = new RobotState(t, this);
            t.getStrategy().initialize(rs);
            redAlliance.add(rs);
        }
        for (Team t : blue) {
            RobotState rs = new RobotState(t, this);
            t.getStrategy().initialize(rs);
            blueAlliance.add(rs);
        }
    }

    @Override
    public void step(SimState ss) {

        if (this.secondsRemaining <= 0) {

            this.stop();
            return;
        }
        for (RobotState rs : redAlliance) {
            rs.step(ss);
        }
        for (RobotState rs : blueAlliance) {
            rs.step(ss);
        }
        secondsRemaining -= Globals.getSecondsPerTic();
        ss.schedule.scheduleOnce(this);
    }
    
    public double getRedScore()
    {
        double redScore = 0;
        for(Event e: redEvents)
        {
            redScore+=e.getValue();
        }
        return redScore;
    }
    
    public double getBlueScore()
    {
        double blueScore = 0;
        for(Event e: blueEvents)
        {
            blueScore+=e.getValue();
        }
        return blueScore;
    }

    @Override
    public void stop() {
        System.err.println("Match has ended: " + this.getRedScore() + " to " + this.getBlueScore());

    }
}
