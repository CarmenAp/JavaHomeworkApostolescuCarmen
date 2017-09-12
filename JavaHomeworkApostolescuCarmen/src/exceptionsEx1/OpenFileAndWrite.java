/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsEx1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author qqq
 */
public class OpenFileAndWrite {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
       throws FileNotFoundException, IOException { 
     
try{
    
    File startText = new File ("C://Users//qqq//Desktop//test.txt");
    //create file 
    if(startText.createNewFile()){
        System.out.println("File is created!");
    }else {
        System.out.println("File already exists!");
    }
    
    
    FileOutputStream is= new FileOutputStream(startText);
    OutputStreamWriter osw =new  OutputStreamWriter (is);
    try (Writer w = new BufferedWriter(osw)) {
        w.write("test");
    } 
    System.out.println("Done");
}
  catch(IOException e)  {
      System.err.println("Problem writing on the file");
  } 
    }
    }

 
   
    
    
    
    

