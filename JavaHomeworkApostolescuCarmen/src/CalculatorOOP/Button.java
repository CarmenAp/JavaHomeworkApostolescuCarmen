/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author qqq
 */
public class Button  {
    
    private String symbol;

    /**
     * Get the value of symbol
     *
     * @return the value of symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Set the value of symbol
     *
     * @param symbol new value of symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Button(String symbol) {
        this.symbol = symbol;
    }
    
    /**
     * Method pushButton display on the screen symbol
     * and send it to the processor
     */
    
    public void pushButton(){
    }
                
    private static class ActionListenerImpl implements ActionListener {

        public ActionListenerImpl() {
}

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    }            
               
               


   
    


     

              

 

   

 
       
