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
public class Patrat extends Patrulater implements Definibila{
    private final String definition;

    public Patrat() {
        definition = super.getDefinition() + "cu unghiuri drepte si laturi egale ";
   
       }
    public String getDefinition() {
            return definition ;
    }

    @Override
    public String getDefinibila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
