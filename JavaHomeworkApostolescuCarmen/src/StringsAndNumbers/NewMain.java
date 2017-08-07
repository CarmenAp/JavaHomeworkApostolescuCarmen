/*
 * 
 */
package StringsAndNumbers;

/**
 *
 * @author qqq
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       
        String ex1Homework = "Able was I ere I saw Elba.";
        int len = ex1Homework.length();
        System.out.println("Ex1Homework initial text is: 'Able was I ere I saw Elba.' " );
        System.out.println("the initial capacity of ex1Homework text is:" + len);
        System.out.println("Ex2Homework initial text is: 'Did Hannah see bees? Hannah did.' " );
        
    Ex2 anEx2= new Ex2();
        System.out.println("the  expression length is:" + anEx2.lenEx2 );
        System.out.println("the value returned by the method call ex2Homework.charAt(12) is:" + anEx2.c);
        System.out.println("the expression that refers to the letter b is : 'text'.charAt(15) -> result letter " + anEx2.c1);
    
    Ex3 anEx3=new Ex3();    
        System.out.println ("The new string is:" + anEx3.newStringEx3Homework );
        System.out.println("The new returned string lenght is:" +  anEx3.lenghtNewStringEx3Homework);
        
    Ex4 anEx4= new Ex4();
        System.out.println ( "Hi,".concat("mom.") + "-> First concat" );
        System.out.println(anEx4.hi + anEx4.mom + "-> Second concat"); 
        
   Ex5 anEx5= new Ex5();
       System.out.println("My initials from full name are:" + anEx5.neww + anEx5.neww1);
       
    Ex6 anEx6=new Ex6();
        System.out.println ("The derived classes from Number are:Byte, Integer, Double, Short, Float, Long");
    }
    
}
