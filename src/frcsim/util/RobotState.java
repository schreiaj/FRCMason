/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.util;


import frcsim.Match;
import frcsim.Team;
import frcsim.actions.Action;
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
        this.team = team;
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
       // Ok, let's do something.
        if(inProcess == null)
        {
            inProcess = team.getStrategy().getNextAction(this, m);
        }
        // Because perform returns the action or null we don't have to check if
        // it is done.
        inProcess = inProcess.perform(ss,this, m);
    }
}
