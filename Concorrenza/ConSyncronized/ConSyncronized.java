/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concorrenza.ConSyncronized;

/**
 *
 * @author Paolo
 */
public class ConSyncronized {
    public static void main(String[] arts){
        Thread[] myT = new Thread[20];
        MyResource mr = new MyResource(10);
        for(int i=0;i<20;i++){
            myT[i] = new Thread(new MyThread(i,mr));
            myT[i].start();
        }
    }    
}
