/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frcsim2013.actions;

import java.util.Hashtable;

/**
 *
 * @author aschreiber
 */
public abstract class Action {
    public abstract boolean perform(Hashtable properties);
    public abstract boolean canPerform(Hashtable properties);
    public int secondsToPerform;
}
