public class Chip extends Snack {
private boolean isLays;


//constuctor methods
  //no argument constructor
  //
 //this no arguent constructor sets a basic set of variables for a new chip object.
 //
public Chip(){
  this.isLays = false;

} 
//
//this parameterized constructor means that it will combine all the input to make a new object.
//
  //parameterized construcotr
public Chip(String name, String flavor, double price, boolean isLays){
  super(name, flavor, price);
  this.isLays = isLays;
}
  

     //accessor and mutator methods
//this is an accessor method
//this accessor method returns the boolean value for lays
//
public boolean getIsLays(){
  return isLays;
}
  //now we make it so we can update the different variables
//
//this is a mutator method because it changes the value of lays
//
public void setIsLays(boolean isLays){
  this.isLays = isLays;
}
  
  //this override takes the superclass variables and adds 2 new ones because of the new lays boolean
  //
    //toString method override
public String toString(){
  return super.toString() + "Is your chip brand lays? " + isLays ;
}



}