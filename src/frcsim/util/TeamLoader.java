/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.util;

import frcsim.Team;
import frcsim.strategies.Strategy;
import java.io.*;
import java.lang.ClassLoader;
import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public class TeamLoader {

    public static LinkedList<Team> loadTeams(String file) {
        LinkedList<Team> teams = new LinkedList<Team>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while((str = br.readLine())!=null)
            {
                String[] sa = str.split(" ");
                Class<?> strat = Class.forName("frcsim.strategies."+sa[1]);
                teams.addLast(new Team(sa[0], strat , Double.parseDouble(sa[2])));
            }
        } catch (Exception e) {
            System.err.println(e);
            System.exit(-1);
        }
        return teams;
    }
}
