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
public class MyResource {
    private int a;
    
    public MyResource(int a){
        this.a=a;
    }

    public void setResource(int num){
        a = a+num;
        System.out.println("thread"+num+" a "+a);
    }
}
