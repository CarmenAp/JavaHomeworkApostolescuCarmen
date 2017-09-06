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
public class Plana extends FigGeometrica {
    private final String definition ;
    public Plana() {
        definition = super.getDefinition() + "plana ";
    }
    @Override
    public String getDefinition() {
            return definition ;
    }
    
}
