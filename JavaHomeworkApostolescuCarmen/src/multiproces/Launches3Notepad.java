/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiproces;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qqq
 */
public class Launches3Notepad {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  throws IOException {
     
     try{ 
     ProcessBuilder pb;        
     // Process builder used to start 3 processes multithreading.SayHello with parameter
    pb= new ProcessBuilder("Notepad");
    Process p1 = pb.start();    
    Process p2 = pb.start(); 
    Process p3 = pb.start(); 
    }
     catch (IOException ex) {  
         Logger.getLogger(Launches3Notepad.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);        } 
    }
}


