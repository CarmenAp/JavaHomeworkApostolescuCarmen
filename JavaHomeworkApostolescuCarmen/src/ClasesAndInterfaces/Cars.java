/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAndInterfaces;

/**
 *
 * @author qqq
 */
public class Cars {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        
       Car mercedes ;
       short mercedesSpeed = 230;    
        mercedes = new Car("Mercdes", mercedesSpeed , Car.Color.YELLOW  );
       
       Car renault ;
       short renaultSpeed = 120;
       int renaultRentPrice = 55;
       renault = new Car("Renault", renaultSpeed , Car.Color.WHITE  );
        
       short loganSpeed = 160;
        Car logan = new Car("Logan", loganSpeed , Car.Color.GREEN );
    }
}
       
    


 
