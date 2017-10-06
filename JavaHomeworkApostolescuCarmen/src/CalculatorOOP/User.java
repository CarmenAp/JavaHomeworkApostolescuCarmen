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
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Computer displays 0 value by default;
        System.out.println("0");
    }

    private Calculator calculatorOOP;

    /**
     * Get the value of calculatorOOP
     *
     * @return the value of calculatorOOP
     */
    public Calculator getCalculatorOOP() {
        return calculatorOOP;
    }

    /**
     * Set the value of calculatorOOP
     *
     * @param calculatorOOP new value of calculatorOOP
     */
    public void setCalculatorOOP(Calculator calculatorOOP) {
        this.calculatorOOP = calculatorOOP;
    }
    
}
