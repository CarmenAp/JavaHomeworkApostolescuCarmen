/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author qqq
 */
public class Button extends JFrame  {

    private static void add(JButton) {
       
    
    
     JButton button1=new JButton("1"); 
     JButton button2=new JButton("2"); 
     JButton button3=new JButton("3"); 
     JButton button4=new JButton("4"); 
     JButton button5=new JButton("5"); 
     JButton button6=new JButton("6"); 
     JButton button7=new JButton("7"); 
     JButton button8=new JButton("8"); 
     JButton button9=new JButton("9"); 
     JButton button0=new JButton("0"); 
     JButton buttonSum=new JButton("+"); 
     JButton buttonDif=new JButton("-"); 
     JButton buttonOr=new JButton("*"); 
     JButton buttonDiv=new JButton("/"); 
     JButton buttonEql=new JButton("=");
     JButton buttonClear=new JButton("C");  }
  

    public Button(String calculator_OOP) {
        super(calculator_OOP);
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button0);
        add(buttonSum);
        add(buttonDif);
        add(buttonOr);
        add(buttonDiv);
        add(buttonEql);
        add(buttonClear);

        
      button1.addActionListener((ActionEvent evt) -> {
                int valueButton1=Integer.parseInt(button1.getText());
                
            button2.addActionListener((ActionEvent evt1) -> {
                int valueButton2=Integer.parseInt(button2.getText());
                    
             button3.addActionListener((ActionEvent evt2) -> {
                int valueButton3=Integer.parseInt(button3.getText());
                
            button4.addActionListener((ActionEvent evt3) -> {
                int valueButton4=Integer.parseInt(button4.getText());       
             
                 button5.addActionListener((ActionEvent evt4) -> {
                int valueButton5=Integer.parseInt(button5.getText());
                
            button6.addActionListener((ActionEvent evt5) -> {
                int valueButton6=Integer.parseInt(button6.getText());
                    
             button7.addActionListener((ActionEvent evt6) -> {
                int valueButton7=Integer.parseInt(button7.getText());
                
            button8.addActionListener((ActionEvent evt7) -> {
                int valueButton8=Integer.parseInt(button8.getText());  
                    
               button9.addActionListener((ActionEvent evt8) -> {
                int valueButton9=Integer.parseInt(button9.getText());
                
            button0.addActionListener((ActionEvent evt9) -> {
                int valueButton0=Integer.parseInt(button0.getText());    
            buttonSum.addActionListener((ActionEvent evt10) -> {
                sumButton.setActionCommand("+"); )  }     
                                                            
            buttonDif.addActionListener((ActionEvent evt11) -> {
             int valueButtonDif=Integer.parseInt(buttonDif.getText());) }
                                                                
             buttonOr.addActionListener((ActionEvent evt12) -> {
             int valueButtonOr=Integer.parseInt(buttonOr.getText());) }
                
             buttonDiv.addActionListener((ActionEvent evt13) -> {
             int valueButtonDiv=Integer.parseInt(buttonDiv.getText());) }
               
              buttonEql.addActionListener((ActionEvent evt14) -> {
             int valueButtonEql=Integer.parseInt(buttonEql.getText()); )  } 

             buttonClear.addActionListener((ActionEvent evt15) -> {
             int num = 0 ; 
             buttonClear.setText ("") )  } 
                    
String txt =evt.getActionCommand(); 
String calcval =CalcTF.getText(); 
if (txt.equals("0")) 
CalcTF.setText(calcval +"0"); 
if (txt.equals("1")) 
CalcTF.setText(calcval +"1"); 
if (txt.equals("2")) 
CalcTF.setText(calcval +"2"); 
if (txt.equals("3")) 
CalcTF.setText(calcval +"3"); 
if (txt.equals("4")) 
CalcTF.setText(calcval +"4"); 
if (txt.equals("5")) 
CalcTF.setText(calcval +"5"); 
if (txt.equals("6")) 
CalcTF.setText(calcval +"6"); 
if (txt.equals("7")) 
CalcTF.setText(calcval +"7"); 
if (txt.equals("8")) 
CalcTF.setText(calcval +"8"); 
if (txt.equals("9")) 
CalcTF.setText(calcval +"9");
               
 private void CalcTFActionPerformed(java.awt.event.ActionEvent evt) { 
r1=Integer.parseInt(CalcTF.getText()); 
option = buttonSum.getText(); 
buttonSum.setText(""); 
} 

private void buttonEqlActionPerformed(java.awt.event.ActionEvent evt) { 
r2=Integer.parseInt(CalcTF.getText()); 
if (option.equals("+")) 
result=r1+r2; 
if (option.equals("-")) 
result=r1-r2; 
if (option.equals("*")) 
result=r1*r2; 
if (option.equals("/")) 
result=r1/r2; 
CalcTF.setText(result+" "); 
} 

private void buttonDifActionPerformed(java.awt.event.ActionEvent evt) { 
r1=Integer.parseInt(CalcTF.getText()); 
option = buttonDif.getText(); 
CalcTF.setText(""); 
} 

private void buttonOrActionPerformed(java.awt.event.ActionEvent evt) { 
r1=Integer.parseInt(CalcTF.getText()); 
option = buttonOr.getText(); 
CalcTF.setText(""); 
} 

private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) { 
r1=Integer.parseInt(CalcTF.getText()); 
option = buttonDiv.getText(); 
CalcTF.setText(""); 
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
               
               


   
    


     

              

 

   

 
       
