/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

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
    LinkedList<Team> redAlliance, blueAlliance;
    
    
    public Match(int length, LinkedList<Team> red, LinkedList<Team> blue)
    {
        
        secondsRemaining = length;
        redAlliance = red;
        blueAlliance = blue;
    }
    
    @Override
    public void step(SimState ss) {
        if(secondsRemaining <= 0)
        {
            this.stop();
            return;
        }
        for(Team t: redAlliance)
        {
            t.step(ss);
        }
        for(Team t:blueAlliance)
        {
            t.step(ss);
        }
        secondsRemaining--;
        
        
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
