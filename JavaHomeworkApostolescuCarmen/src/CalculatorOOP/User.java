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
    
        private static Calculator calculator = new Calculator();

    /**
     * Get the value of calculator
     *
     * @return the value of calculator
     */
    public static Calculator getCalculator() {
        return calculator;
    }

    /**
     * Set the value of calculator
     *
     * @param calculator new value of calculator
     */
    public static void setCalculator(Calculator calculator) {
        User.calculator = calculator;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        calculator.pushButtons(); 

    }
    
}