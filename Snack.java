public class Snack{
  //instance variables
private String name;
private String flavor;
private double price;

  //constuctor methods
  //no argument constructor
  //these set the basic information for a snack. 
  //
public Snack(){
  this.name = "no name";
  this.flavor = "plain";
  this.price = 1.11;
}
//
  //parameterized construcotr
  //this sets the variables that a snack includes, and will be combined with the other ones from candy and chips.
  //
public Snack(String name, String flavor, double price ){
  this.name = name;
  this.flavor = flavor;
  this.price = price;
}



//
  //parameterized construcotr
  //this is my second one for snacks that do not include a flavor. This includes snacks like water, ice, or flavorless gum.
  //
public Snack(String name, double price ){
  this.name = name;
  this.price = price;
}

  //parameterized construcotr
  //this sets the variables that a snack that is completely free. This is for my friends and my pets who do not need to pay.
  //
public Snack(String name, String flavor){
  this.name = name;
  this.flavor = flavor;
}


  //
  //accessor and mutator methods
  //this allows you to access the name flavor and price
  //it returns the values when called.
  //
public String getName(){
  return name;
}
  public String getFlavor(){
  return flavor;
}
   public double getPrice(){
  return price;
}
//
  //now we make it so we can update the different variables
  //this is how we edit all of the variables for a snack
  //
public void setName(String name){
  this.name = name;
}
public void setFlavor(String flavor){
  this.flavor = flavor;
}
  public void setPrice(double price){
  this.price = price;
}
//
  //toString method override
  //this string is the super string and is used for every single object
  //
public String toString(){
  
  return name + " SNACK INFO----> " + " Snack Flavor " + flavor + "|||" + " Your Total For This Snack Is: " + price + " ||| " ;
}






  
}