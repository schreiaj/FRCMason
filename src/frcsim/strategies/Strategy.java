/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.strategies;


import frcsim.Match;
import frcsim.actions.Action;
import frcsim.util.RobotState;
import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public abstract class Strategy {
    private LinkedList<Action> actions;   

    
    public LinkedList<Action> getActionsList()
    {
        return actions;
    }
    
    public void addAction(Action a)
    {
        actions.addLast(a);
    }
    
    
    public Strategy(double competency)
    {
        actions = new LinkedList<Action>();
    }
    
    // This is the function you need to override to initialize your robot state 
    // At the start of a match. It WILL modify state
    public abstract void initialize(RobotState state);
    
    public Action getNextAction(RobotState state, Match m){
        for(Action a: actions){
            if(a.canPerform(state, m))
                return a;
        }
        return null;
    }
}
