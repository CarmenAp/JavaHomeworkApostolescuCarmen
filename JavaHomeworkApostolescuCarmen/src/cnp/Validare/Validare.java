/*
 * 
 */
package cnp.Validare;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author qqq
 */
public class Validare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
      
         System.out.println("Introduceti CNP:");
         Scanner scan = new Scanner(System.in);
       String cnp = scan.next();
             
           //verificam dc lungimea sirului este de 13
      boolean verifyCnp;     
     
     Integer lungimeSirCNP = cnp.length();
      if (  lungimeSirCNP != 13   ) {
          System.out.println("CNP should be exactly 13 digits long !!!");
      } else {
      
     
     //create a pattern for CNP
     //               first dec   month 31day/31 day                 month 30day/30day        february month /28 or 29 day  year   4aleator decimals                  
    String regexCNP = "[1-2]((0[13578]| 1[02])(0[19]|[12]\\d\3[01])|(0[469]|11)(0[1-9]|[12]\\d|30)|02(0[1-9]|[12]\\d))(19[0-9]{2})(\\d{4})"; 
            
            
     Pattern pattern = Pattern.compile(regexCNP); 
     Matcher matcher = pattern.matcher(cnp);
      if(matcher.matches()){
     System.out.println("CNP valid !!!");
    }
      else{
         System.out.println("CNP invalid !!!");  
      }}}}
    

     
     
    
