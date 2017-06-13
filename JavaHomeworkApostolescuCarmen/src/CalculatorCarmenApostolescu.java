/*
 *This aplication can be used to calculate the sum, diference, multiplication
 * or division of two number
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*The Java.io.BufferedReader class reads text from a character-input stream,
   *buffering characters 
 *The Java.io.InputStreamReader class is a bridge from byte to character streams.
   *It reads bytes and decodes them into characters using a specified charset.
 *IOException is a class of Exception that was raised due to all Input/Output
   *(I/O meanse Input/Output)  contingencies 
*/

/**
 * @author qqq
 */

public class CalculatorCarmenApostolescu {
    
       /**
       *
       * @param args
       * @throws IOException
       */
    
    public static void main(String[] args) throws IOException {
        
       // Declarare variabile
      int a, b ;
      int rezultat  ;
      String s ;
      String operatieSelectata;
      
        // Pregatim citirea datelor de la tastatura
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Please introduce your first number");
       
        /**
        * Citirea datelor de la tastatura se realizeaza cu readLine.
        * Pentru citire trebuie construit un obiect BufferedReader
        * dintr-un obiect InputStreamReader care la randul sau
        * este construit din System.in. 
        */
       
       // Citim valoarea variabilei a
      System.out.print("a = ");
      s = br.readLine();
      a = Integer.parseInt(s);
      
      System.out.println("Please select operator(+/-/*//)");
      operatieSelectata = br.readLine();
       
      System.out.println("Please introduce your second number") ; 
       
       // Citim valoarea variabilei b
      System.out.print("b = ");
      s = br.readLine();
      b = Integer.parseInt(s);
       
        switch (operatieSelectata) {
            case "+":
                System.out.println("Result is: " + (a + b));
                break;
            case "-":
                System.out.println("Result is: " + (a - b));
                break;
            case "/":
                System.out.println("Result is: " + (a / b));
                break;
            case "*":
                System.out.println("Result is: " + (a * b));
                break;
                default : 
                System.out.print("Sorry, you introduced wrong data. I quit :)");
                    break;
         
        }
 
}
    }
    




