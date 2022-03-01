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
public class Concorrenza {
    public static void main(String[] args) throws InterruptedException{
        Persona[] lista = new Persona[15];
        for(int j=0;j<10;j++){
            Torta t = new Torta(10);
            System.out.println("--- GARA "+j+" ---");
            for(int i=0;i<15;i++){
                lista[i] = new Persona("P"+i,t);
            }

            for(int a=0;a<15;a++){
                lista[a].start();
            }
            for(int a=0;a<15;a++){
                lista[a].join();
            }
        }
    }
}
