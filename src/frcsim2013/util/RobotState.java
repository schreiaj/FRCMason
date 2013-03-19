/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.util;


import frcsim2013.Match;
import frcsim2013.Team;
import frcsim2013.actions.Action;
import java.util.HashMap;
import sim.engine.SimState;
import sim.engine.Steppable;

/**
 *
 * @author aschreiber
 */
public class RobotState implements Steppable{
    private HashMap<String, Integer> properties;
    private Team team;
    private Action inProcess;
    private Match m;

    public void setInProcess(Action inProcess) {
        this.inProcess = inProcess;
    }

    public Action getInProcess() {
        return inProcess;
    }
            
    public RobotState(Team team, Match m)
    {
        properties = new HashMap<String, Integer>();
        team = team;
        this.m = m;
    }
    
    public Team getTeam()
    {
        return team;
    }
    
    public Integer get(String s)
    {
        return properties.get(s);
    }
    
    public void put(String s, Integer o)
    {
        properties.put(s,o);
    }
    
    public void decrement(String s)
    {
        properties.put(s,properties.get(s)-1);
    }
    
       public void increment(String s)
    {
        properties.put(s,properties.get(s)+1);
    }

    @Override
    public void step(SimState ss) {
        // If we aren't doing anything let's do something! 
        if(inProcess == null)
        {
            inProcess = team.getStrategy().getNextAction(this, m);
        }
        inProcess.step(ss);
    }
}
