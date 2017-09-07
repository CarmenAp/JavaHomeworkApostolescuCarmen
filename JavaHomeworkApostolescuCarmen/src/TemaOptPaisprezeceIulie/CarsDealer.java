/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaOptPaisprezeceIulie;

/**
 *
 * @author qqq
 */
public class CarsDealer extends Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     System.out.println("List of the cars:Audi, Hyundai, Kia, Logan, Toyota") ;
    
     
     Car audi ;
     short speedAudi=180;
     int priceAudi= 25000;
     audi = new Car("Audi",  speedAudi,Car.Color.BLACK, priceAudi);
     
     // Car(carName,  carSpeed, carColor, int carPrice)
     
     Car hyundai;
     short speedHyundai=140;
     int priceHyundai= 12000;
     hyundai =new Car("Hyndai", speedHyundai, Car.Color.RED, priceHyundai );
     
     Car kia;
     short speedKia=140;
     int priceKia= 250;
     kia= new Car("Kia", speedKia , Car.Color.GREEN, priceKia  );   
     
     Car logan;
     short speedLogan=120;
     int priceLogan= 250;
     logan = new Car("Logan", speedLogan, Car.Color.YELLOW, priceLogan );
     
     
     Car toyota;
     short speedToyota=160;
     int priceToyota= 250;
     toyota = new Car("Toyota", speedToyota, Car.Color.RED, priceToyota );
     
    switch ( priceAudi ) {
         case 12000 : System.out.println(  " Audi = solded"); break;
         case 250 : System.out.println( "Audi = rented"); break;
         default: System.out.println(  "Audi = in parking area"); break;      
         }  
    switch ( priceHyundai ) {
         case 12000 : System.out.println(  "Hyundai = solded"); break;
         case 250 : System.out.println( "Hyundai = rented"); break;
         default: System.out.println(  "Hyundai = in parking area"); break;      
         }  
    switch ( priceKia ) {
         case 12000 : System.out.println(  " Kia = solded"); break;
         case 250 : System.out.println( "Kia = rented"); break;
         default: System.out.println(  "Kia = in parking area"); break;      
         }  
     switch ( priceLogan ) {
         case 12000 : System.out.println(  " Logan = solded"); break;
         case 250 : System.out.println( "Logan = rented"); break;
         default: System.out.println(  "Logan = in parking area"); break;      
         }  
    switch ( priceToyota ) {
         case 12000 : System.out.println(  " Toyota = solded"); break;
         case 250 : System.out.println( "Toyota= rented"); break;
         default: System.out.println(  "Toyota = in parking area"); break;      
         }
    
    
    
}
}
    

