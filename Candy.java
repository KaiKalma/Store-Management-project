public class Candy extends Snack {

//new instance variables
private boolean isGummy;
private String color;

 //constuctor methods
  //no argument constructor
 /*
 *this no arguent constructor sets a basic set of variables for a new candy object.
 */
public Candy(){
  this.isGummy = true;
  this.color = "white";
}
  //parameterized construcotr
public Candy(String name, String flavor, double price, boolean isGummy, String color){
super(name, flavor, price);
  this.isGummy = isGummy;
  this.color = color;
}
//
    //accessor and mutator methods
    //this accessor method returns the diferent values for gummy and the color of candy.
    //
public boolean getIsGummy(){
  return isGummy;
}
public String getColor(){
  return color;
}

//
    //now we make it so we can update the different variables
//these are the mutator methods
//they set new variables for the gummy boolean and the color string.
/
public void setIsGummy(boolean isGummy){
  this.isGummy = isGummy;
}
public void setColor(String color){
  this.color = color;
}
//
    //toString method override
    //this takes the superclass variable and then adds extra information based on if its a candy or not.
    ///
public String toString(){
  return super.toString() + "Is your candy a gummy? " + isGummy + " |||" + " your candy is " + color;
}
  
}
