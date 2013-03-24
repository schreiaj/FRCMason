/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim;

import frcsim.util.ScheduleLoader;
import frcsim.util.TeamLoader;
import sim.engine.*;
import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public class FRCSim2013 extends SimState {

    private LinkedList<Team> teams;

    public FRCSim2013(long seed) {
        super(seed);
        


    }

    @Override
    public void start() {
        super.start();
        teams = TeamLoader.loadTeams("test.teams");
        for (Team t : teams) {
            System.err.println(t);
        }
        
        LinkedList<Team> red = new LinkedList<Team>();
        LinkedList<Team> blue = new LinkedList<Team>();
        Schedule matchSchedule = ScheduleLoader.loadSchedule("test.schedule", teams);
        schedule.scheduleOnce(matchSchedule.getNextMatch());

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
