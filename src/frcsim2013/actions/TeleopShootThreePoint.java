/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.actions;
import frcsim2013.Globals;
import frcsim2013.Match;
import frcsim2013.util.RobotState;

/**
 *
 * @author aschreiber
 */
public class TeleopShootThreePoint extends Action{

    public TeleopShootThreePoint(double shotTime)
    {
        this.secondsRemaining = shotTime;
        this.setDifficulty(Globals.getHighAutonShootDifficulty());
    }
    
    @Override
    public Action perform(RobotState properties, Match m) {
        
        this.secondsRemaining -= Globals.getTicsPerSecond();
        if(this.secondsRemaining <= 0)
        {
            this.onStop(properties, m);
            return null;
        }
        return this;
           
    }

    @Override
    public boolean canPerform(RobotState properties, Match m) {
        // We can't do this action if there's not time enough left in match
        // Or, I guess, if the robot doesn't have discs...
        return this.secondsRemaining <= m.getSecondsRemaining() && properties.get("discs") > 0;
    }  

    @Override
    public void onStop(RobotState properties, Match m) {

    }
    
}
