/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013;

import sim.engine.*;

import java.util.ArrayList;

/**
 *
 * @author aschreiber
 */
public class FRCSim2013 extends SimState {

    private ArrayList<Team> teams;
    
    public FRCSim2013(long seed) {
        super(seed);
        
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
