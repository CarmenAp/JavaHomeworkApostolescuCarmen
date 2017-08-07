/*
 *
 */
package StringsAndNumbers;

/**
 *
 * @author qqq
 */

/*2 Consider the following string:
 String hannah = "Did Hannah see bees? Hannah did.";     
 a What is the value displayed by the expression hannah.length()?  
 b What is the value returned by the method call hannah.charAt(12)?  
 c Write an expression that refers to the letter b in the string referred to by hannah
*/

public class Ex2 {
    
    private final String ex2Homework = "Did Hannah see bees? Hannah did."; 
    int lenEx2 = ex2Homework.length();
    //print command
    // System.out.println("the  expression length is:" + c);
    protected final char c = ex2Homework.charAt(12) ;
     //print command
     //  System.out.println("the value returned by the method call ex2Homework.charAt(12) is:" + c);
     
    protected final char c1 = ex2Homework.charAt(15);
    //print command
     //System.out.println("Initial text is: 'Did Hannah see bees? Hannah did.' " );
     //  System.out.println("the expression that refers to the letter b is : 'text'.charAt(15) -> " + c1);
}
