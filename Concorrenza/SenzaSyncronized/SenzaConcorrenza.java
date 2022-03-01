/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concorrenza.SenzaSyncronized;

/**
 *
 * @author Paolo
 */
public class SenzaConcorrenza {
    public static void main(String[] arts) throws InterruptedException{
        Thread[] myT = new Thread[5];
        MyResource mr = new MyResource(10);
        for(int i=0;i<5;i++){
            myT[i] = new Thread(new MyThread(i,mr));
            myT[i].start();
        }
    }
}
