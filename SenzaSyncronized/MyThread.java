/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concorrenza.SenzaSyncronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class MyThread implements Runnable{
    private int name;
    private MyResource mr;
    
    public MyThread(int name, MyResource mr){
        this.name = name;
        this.mr = mr;
    }

    @Override
    public void run() {
        mr.setResource(name);
    }
    
    
}
