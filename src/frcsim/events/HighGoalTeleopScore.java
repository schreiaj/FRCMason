/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.events;

import frcsim.Globals;

/**
 *
 * @author aschreiber
 */
public class HighGoalTeleopScore implements Event{
    public HighGoalTeleopScore()
    {
        
    }

    @Override
    public String toString()
    {
        return HighGoalTeleopScore.class.toString();
    }
    
    @Override
    public double getValue() {
        return Globals.getHighGoalTelePoint();
    }
}
