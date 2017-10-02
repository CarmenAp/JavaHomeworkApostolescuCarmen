/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author qqq
 */ 
 
    public class JFrame  
            
    {

    public  JFrame(String calculator_OOP) {
    JFrame frame = new JFrame("Calculator OOP");   
     //make sure the program exits when the frame closes zzz
    // Size the frame.
    frame.pack(300,300);
    // Show it.
    frame.setVisible(true);
     //This will center the JFrame in the middle of the screen
    frame.setLocationRelativeTo(null);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        
        JTextField numberCalc;
        numberCalc = new JTextField();
        numberCalc.setHorizontalAlignment(JTextField.RIGHT);
        numberCalc.setEditable(false);
        
        frame.add(numberCalc, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel();
               
        //Make a Grid that has three rows and four columns
        buttonPanel.setLayout(new GridLayout(4,3));   
        frame.add(buttonPanel, BorderLayout.CENTER);
    
        final JTextField tf=new JTextField(); 
         // Text area to display file
  
        tf.setBounds(50,50, 150,20); 
       // work in progress
      // layout.getContentPane().add(tf); 
}

    private void pack(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JTextField numberCalc, String NORTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JPanel buttonPanel, String CENTER) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}


   
    