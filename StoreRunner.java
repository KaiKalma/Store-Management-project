import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    // Scanner input = new Scanner(System.in);
Candy c1 = new Candy("Reeses ", "Sweet ", 1.99, false, "Brown");
System.out.println(c1);
    //this is the same format I will use for all of my items
    //Each of these fills in all of the required variables
    //there is 3 types of chips and 3 types of candies.
    Chip c2 = new Chip("Lays ", "Barbaque ", 2.99, true);
System.out.println(c2);
    Candy c3 = new Candy("Skittles ", "Sweet ", 0.99, false, "Rainbow");
System.out.println(c3);
    Chip c4 = new Chip("Doritos ", "Cheese ", 1.99, false);
System.out.println(c4);
Candy c5 = new Candy("Gummy Bears ", "Sweet ", 0.99, true, "Rainbow");
System.out.println(c5);
    Chip c6 = new Chip("Lays ", "Sour Cream and Onion ", 0.99, true);
System.out.println(c6);
    
  }
}