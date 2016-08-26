/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsObserver;

import java.util.Observable;

/**
 *
 * @author kann
 */
public interface RandomUserObserver {
    
    public void update(Observable o, Object arg);
    
}
