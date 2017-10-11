/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qqq
 */
public class Calculator {

    private Screen ecran = new Screen();
    private PushButton button0 = new PushButton('0');
    private PushButton button1 = new PushButton('1');
    private PushButton button2 = new PushButton('2');

    private Processor processor = new Processor();

    /**
     * Get the value of processor
     *
     * @return the value of processor
     */
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Set the value of processor
     *
     * @param processor new value of processor
     */
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    /**
     * Get the value of button2
     *
     * @return the value of button2
     */
    public PushButton getButton2() {
        return null;
        
    }

    /**
     * Set the value of button2
     *
     * @param button2 new value of button2
     */
    public void setButton2(PushButton button2) {
        this.button2 = button2;
    }

    /**
     * Get the value of button1
     *
     * @return the value of button1
     */
    public PushButton getButton1() {
        return null;
       
    }

    /**
     * Set the value of button1
     *
     * @param button1 new value of button1
     */
    public void setButton1(PushButton button1) {
        this.button1 = button1;
    }

    /**
     * Get the value of button0
     *
     * @return the value of button0
     */
    public PushButton getButton0() {
        
        return null;
    }

    /**
     * Set the value of button0
     *
     * @param button0 new value of button0
     */
    public void setButton0(PushButton button0) {
        this.button0 = button0;
    }

    /**
     * Get the value of ecran
     *
     * @return the value of ecran
     */
    public Screen getEcran() {
        return ecran;
    }

    /**
     * Set the value of ecran
     *
     * @param ecran new value of ecran
     */
    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }
    
    
    
    /**
     * Pushing the button of calculator
     */
    public void pushButtons() {
       
       
        System.out.println("Please introduce first number");
   
            String input ;
            int operand1 = 0;
try{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    input = bufferedReader.readLine();
    operand1 = Integer.parseInt(input);
        
} catch (NumberFormatException ex) {
    System.out.println("Not a number!");
    return;
}       catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        processor.setOperand1(operand1);
          
        System.out.println("Please introduce operation");
        Scanner scanner2 = new Scanner(System.in);
        String stringOperation = scanner2.nextLine();
        char operation = stringOperation.charAt(0);
        processor.setOperator(operation);
      
        
        System.out.println("Please introduce second number");
     
         String input1 ;
            int operand2 = 0;
try{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    input1 = bufferedReader.readLine();
    operand2 = Integer.parseInt(input1);
        
} catch (NumberFormatException ex) {
    System.out.println("Not a number!");
    return;
}
catch (IOException e) {            
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        }
        
        processor.setOperand2(operand2);
       
        
        System.out.println("Result:");
        
        processor.compute();   
        
       ecran.setEcran(Integer.toString(processor.getResult()));
        
    }

      public static void closeCalculator(String s) {
        if (s.matches(".*[a-z].*")) {
            System.out.println("Invalid action!You can use only numbers. Take it from the beginning.");
            
        }
    } }