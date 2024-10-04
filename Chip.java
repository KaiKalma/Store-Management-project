public class Chip extends Snack {
private boolean isLays;


//constuctor methods
  //no argument constructor
public Chip(){
  this.isLays = false;

} 
  //parameterized construcotr
public Chip(String name, String flavor, double price, boolean isLays){
  super(name, flavor, price);
  this.isLays = isLays;
}
  

     //accessor and mutator methods

public boolean getIsLays(){
  return isLays;
}
  //now we make it so we can update the different variables


public void setIsLays(boolean isLays){
  this.isLays = isLays;
}
    //toString method override
public String toString(){
  return super.toString() + "Is your chip brand lays? " + isLays ;
}



}