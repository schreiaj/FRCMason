/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.util;

import frcsim.Globals;
import frcsim.Match;
import frcsim.Schedule;
import frcsim.Team;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public class ScheduleLoader {

    public static Schedule loadSchedule(String file, LinkedList<Team> teams) {
        Schedule s = new Schedule();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while ((str = br.readLine()) != null) {
                LinkedList<Team> red = new LinkedList<Team>();
                LinkedList<Team> blue = new LinkedList<Team>();
                String split[] = str.split(" ");
                LinkedList<Team> loading = red;
                for (String team : split) {
                    if (team.equals("|")) {
                        loading = blue;
                        continue;
                    }
                    loading.add(TeamLoader.findTeamByName(team, teams));
                }
                
                s.addMatch(new Match(Globals.getMatchLength(), red, blue));
            }
        } catch (Exception e) {
            System.err.println(e);
            System.exit(-1);
        }
        return s;
    }
}
