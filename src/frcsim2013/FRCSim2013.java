/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

import frcsim2013.strategies.ShootStrategy;
import sim.engine.*;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public class FRCSim2013 extends SimState {

    private ArrayList<Team> teams;
    
    public FRCSim2013(long seed) {
        super(seed);
        LinkedList<Team> teams = new LinkedList<Team>();
        for(int i = 0; i < Globals.getTeams(); i++)
        {
            teams.add(new Team(ShootStrategy.class, 50));
        }
        
        
    }

    
    @Override
    public void start()
    {
        super.start();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        doLoop(FRCSim2013.class, args);
        System.exit(0);
    }
}
