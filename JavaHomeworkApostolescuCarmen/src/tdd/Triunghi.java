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
public class Triunghi  extends Plana {
    
    private final String definition;

    public Triunghi() {
        definition = super.getDefinition() + "cu trei laturi care se intalnesc doua cate doua si formeaza trei unghiuri interne ";
   
      
}
     @Override
    public String getDefinition() {
            return definition ;
    }
    
}
