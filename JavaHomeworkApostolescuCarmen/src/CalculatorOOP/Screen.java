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
public class Screen {
    
        private String ecran = "0"; 

    /**
     * Get the value of ecran
     *
     * @return the value of ecran
     */
    public String getEcran() {
        return ecran;
    }

    /**
     * Set the value of ecran
     *
     * @param ecran new value of ecran
     */
    public void setEcran(String ecran) {
        this.ecran = ecran;
        System.out.println(ecran);
    }

    /**
     * Methods clear screen value, cleaning ecran variable
     */
    
    public void clearScreen() {
        ecran = "0";
    }
    
    
    
}