public class Candy extends Snack {

//new instance variables
private boolean isGummy;
private String color;

 //constuctor methods
  //no argument constructor
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

    //accessor and mutator methods
public boolean getIsGummy(){
  return isGummy;
}
public String getColor(){
  return color;
}


    //now we make it so we can update the different variables

public void setIsGummy(boolean isGummy){
  this.isGummy = isGummy;
}
public void setColor(String color){
  this.color = color;
}
    //toString method override
public String toString(){
  return super.toString() + "Is your candy a gummy? " + isGummy + " |||" + " your candy is " + color;
}
  
}