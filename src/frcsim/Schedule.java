/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim;

import java.util.LinkedList;

/**
 *
 * @author aschreiber
 */
public class Schedule {
    private LinkedList<Match> matches;
    private int currentMatch;
    
    
    public Schedule() {
        matches = new LinkedList<Match>();
        currentMatch = 0;
    }
    
    public void addMatch(Match m)
    {
        matches.addLast(m);
    }
    
    public Match getNextMatch()
    {
        return matches.get(currentMatch);
    }
    
    public int runMatch()
    {
        currentMatch++;
        return currentMatch;
    }
    
    
    
}
