/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author qqq
 */
public class DisplayShapes {
     public static void main(String[] args) {
        
        Patrat patrat = new Patrat();
        System.out.println("Def patrat :" + patrat.getDefinition());
        Dreptunghi  dreptunghi= new Dreptunghi();
        System.out.println("Def dreptunghi :" + dreptunghi.getDefinition());
        Triunghi triunghi = new Triunghi();
        System.out.println("Def triunghi :" + triunghi.getDefinition());
        Cerc cerc = new Cerc();
        System.out.println("Def cerc :" + cerc.getDefinition());
    }
    
}
