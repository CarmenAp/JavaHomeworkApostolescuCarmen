/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

/**
 *
 * @author qqq
 */
public class PushButton  {
    
    private char symbol;

    public PushButton(char symbol) {
        this.symbol = symbol;
    }
    
    /**
     * Get the value of symbol
     *
     * @return the value of symbol
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Set the value of symbol
     *
     * @param symbol new value of symbol
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    
    
}