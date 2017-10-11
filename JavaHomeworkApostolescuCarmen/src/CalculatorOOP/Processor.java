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
    private char operator;
    private int result = 0;
    
    public static void displayErr1() {
         System.out.println("Error, you introduced wrong data. I quit.");
         System.exit(0);
     }
    /**
     * Computes the final value of applying operator on the two operands
     */
    public void compute() {
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                displayErr1();
                 break;
        }
    }
    
    /**
     * Get the value of result
     *
     * @return the value of result
     */
    public int getResult() {
        return result;
    }

    /**
     * Set the value of result
     *
     * @param result new value of result
     */
    public void setResult(int result) {
        this.result = result;
    }
    
    /**
     * Get the value of operator
     *
     * @return the value of operator
     */
    public char getOperator() {
        return operator;
    }

    /**
     * Set the value of operator
     *
     * @param operator new value of operator
     */
    public void setOperator(char operator) {
        this.operator = operator;
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

}
