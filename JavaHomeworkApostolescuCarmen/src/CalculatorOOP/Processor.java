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
public class Processor {
    
    private int operand1;      
    private int operand2;
    private char operand;

    /**
     * Get the value of operand
     *
     * @return the value of operand
     */
    public char getOperand() {
        return operand;
    }

    /**
     * Set the value of operand
     *
     * @param operand new value of operand
     */
    public void setOperand(char operand) {
        this.operand = operand;
    }


    /**
     * Get the value of operand2
     *
     * @return the value of operand2
     */
    public int getOperand2() {
        return operand2;
    }

    /**
     * Set the value of operand2
     *
     * @param operand2 new value of operand2
     */
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }


    /**
     * Get the value of operand1
     *
     * @return the value of operand1
     */
    public int getOperand1() {
        return operand1;
    }

    /**
     * Set the value of operand1
     *
     * @param operand1 new value of operand1
     */
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    /**
     * Clear operand1 , operand2 and operator
     */
    public void clear(){
    
    } 
    /**
     * Compute result of operation
     */
    public void compute(){
        
    }
}
