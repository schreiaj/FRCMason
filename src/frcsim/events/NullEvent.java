/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim.events;

/**
 *
 * @author aschreiber
 */
public class NullEvent implements Event {

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "Nothing Happened";
    }
}
