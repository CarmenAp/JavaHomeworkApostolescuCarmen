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
public class Patrulater  extends Plana {
    private final String definition;

    public Patrulater() {
        definition = super.getDefinition() + "cu patru laturi, ";
   
      
        
    }

    public String getDefinition() {
       return definition;
    }
    
}
