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
public class Car {

    Car(String audi, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Car(String hunday, short s, java.awt.Color gray, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   /**
enumeration of accepted car colors
*/

public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };

public enum name {Audi, Hyundai, Kia, Logan, Toyota}; 
/**
Internal hidden fields / attributes
*/
private Color color;
String name;
private short speed;
Integer price;
/**
Constructors
*/
public Car(){
name = "Default car name";
speed = 90;
price= 0;
}
public Car(String carName, short carSpeed, Color carColor, int carPrice){
name = carName;
speed = carSpeed;
color = carColor;
price = carPrice;
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
public int getPrice(){
return(price); }

public void setName(String newName){
name = newName;
}
public void setColor(Color newColor){
color = newColor;
}
public void setSpeed(short newSpeed){
speed = newSpeed;
}
public void setPrice(int newPrice){
price = newPrice;
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
/**
Abstract method defined in Saleable interface implemented by class car
* is implemented here.
     * @return 
* @override Saleable.getSalePrice() method
*/
public int getSalePrice(){
return(12000);
}
/**
Abstract method defined in Rentable interface implemented by class car
* is implemented here.
     * @return 
* @override Rentable.getDailyRentPrice() method
*/
public int getDailyRentPrice() {
return(250);
}
}
    
