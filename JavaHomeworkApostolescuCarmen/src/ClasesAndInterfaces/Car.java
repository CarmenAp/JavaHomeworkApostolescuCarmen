/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAndInterfaces;

import static java.sql.DriverManager.println;

/**
 *
 * @author qqq
 */
public class Car {

    Car(String renault, short renaultSpeed, Color color) { 
    }

  
  /**
 @enum enumeration of accepted car colors
 */
 public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
 /**
 Internal hidden fields / attributes
 */
 private Color color;
 private String name;
 private short speed;
 private int price;
 private int rentPrice;
 /**
 Constructors
 */
 public Car(){
 name = "Default car name";
 speed = 90;
 }
 public Car(String carName, short carSpeed, Color carColor, int carSalePrice, int carRentPrice){
 name = carName;
 speed = carSpeed;
 color = carColor;
 price = carSalePrice;
 rentPrice = carRentPrice;
 }
 /*get-ers and set-ers*/
 public String getName(){
 return(name);
 }
 public Color getColor(){
 return(color);
 }
 public short getSpeed(){
 return(speed);
 }
 public void setName(String newName){
 name = newName; 

 }
public void setColor(Color newColor){
 color = newColor;
 }
 public void setSpeed(short newSpeed){
 speed = newSpeed;
 }
 /**
 The method increase actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void increaseSpeed(short newSpeed){
 if(newSpeed > speed){
 speed = newSpeed;
 }
 else if (newSpeed < speed){
 decreaseSpeed(newSpeed);
 }
 }
 /**
 The method decrease actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void decreaseSpeed(short newSpeed){
 if(newSpeed < speed){
 speed = newSpeed;
 }
 else if (newSpeed < speed){
 increaseSpeed(newSpeed);
 }
 }
 
 public int getSalePrice(){
     Cars anLogan= new Cars () ;
     Cars anMercedes= new Cars () ;
     Cars anRenault= new Cars () ;
     Cars carSale = new Cars ();
    
     int mercedesSalePrice = 20000;
     int renaultSalePrice = 12500;
     int loganSalePrice = 10000;
     
while ( anMercedes == carSale) {
    println ("For Mercedes car sale price is:");

        return (mercedesSalePrice); }

        
 while ( anRenault == carSale) {
    println ("For Renault car sale price is:");

        return (renaultSalePrice);  } 
        
  while ( anLogan == carSale) {
    println ("For Logan car sale price is:");
        return loganSalePrice;
      }
        return 0;
 }  
 
 public int getDailyRentPrice() {
     
 
     Cars anMercedes= new Cars () ;
     Cars anRenault= new Cars () ;
     Cars anLogan= new Cars () ;
     Cars carRent = new Cars ();
     
     int mercedesRentPrice = 125;
     int renaultRentPrice = 55;
     int loganRentPrice = 40;
     
    while ( anMercedes == carRent) {
    println ("For Mercedes car rent price is:");
        return (mercedesRentPrice); }
        
    while ( anRenault == carRent) {
    println ("For Renault car rent price is:");
        return (renaultRentPrice); }
        
    while ( anLogan == carRent) {
    println ("For Logan car rent price is:");

        return (loganRentPrice); }
        return 0;
     
 }
}


 
   
        

        

          
