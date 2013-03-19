/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

import frcsim2013.events.Event;
import frcsim2013.util.RobotState;
import java.util.LinkedList;
import sim.engine.SimState;
import sim.engine.Steppable;
import sim.engine.Stoppable;

/**
 *
 * @author aschreiber
 */
public class Match implements Steppable, Stoppable{

    int secondsRemaining;
    LinkedList<RobotState> redAlliance, blueAlliance;
    LinkedList<Event> redEvents, blueEvents;
    
    
    public Match(int length, LinkedList<Team> red, LinkedList<Team> blue)
    {
        
        secondsRemaining = length;
        redAlliance = new LinkedList<RobotState>();
        blueAlliance = new LinkedList<RobotState>();
        for(Team t: red)
        {
            RobotState rs = new RobotState(t,this);
            t.getStrategy().initialize(rs);
            redAlliance.add(rs);
        }
        for(Team t: blue)
        {
            RobotState rs = new RobotState(t,this);
            t.getStrategy().initialize(rs);
            blueAlliance.add(rs);
        }
    }
    
    @Override
    public void step(SimState ss) {
              
    }

    @Override
    public void stop() {
    }
    
}
