/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concorrenza;

/**
 *
 * @author Paolo
 */
public class Persona extends Thread{
    private Torta t;
    public Persona (String nome, Torta t){
        super(nome);
        this.t=t;
    }

    @Override
    public void run() {
        try {
            t.takeFetta();
            System.out.println(getName()+" ho preso una fetta");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
