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
public class Cerc extends Plana {
      private final String definition;

    public Cerc() {
        definition = super.getDefinition() + "formata din multimea tuturor punctelor egal departate de un punct fix ";
   
    }
    public String getDefinition() {
            return definition ;
    }
    
}
