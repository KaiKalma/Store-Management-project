public class Snack{
  //instance variables
private String name;
private String flavor;
private double price;

  //constuctor methods
  //no argument constructor
public Snack(){
  this.name = "no name";
  this.flavor = "plain";
  this.price = 1.11;
}
  //parameterized construcotr
  
public Snack(String name, String flavor, double price ){
  this.name = name;
  this.flavor = flavor;
  this.price = price;
}
  //accessor and mutator methods
public String getName(){
  return name;
}
  public String getFlavor(){
  return flavor;
}
   public double getPrice(){
  return price;
}

  //now we make it so we can update the different variables
public void setName(String name){
  this.name = name;
}
public void setFlavor(String flavor){
  this.flavor = flavor;
}
  public void setPrice(double price){
  this.price = price;
}

  //toString method override
public String toString(){
  
  return name + " SNACK INFO----> " + " Snack Flavor " + flavor + "|||" + " Your Total For This Snack Is: " + price + " ||| " ;
}

  //other methods





  
}