/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concorrenza;

import static java.lang.Thread.sleep;

/**
 *
 * @author Paolo
 */
public class Torta {
    private int fette;
    
    public Torta(int fette){
        this.fette = fette;
    }
    
    public synchronized int getFette(){
        return fette;
    }
    
    public synchronized void takeFetta() throws Exception{
        if(fette>0)
            fette--;
        else throw new Exception(" fette finite");
        sleep((int)(Math.random()*200));
    }
}
