//Brandon Jiang
//gagdude@brandeis.edu
//9/19/16
//To determine what the user will get in change when putting a dollar into a vending machine
//No bugs
import java.util.*;

public class Problem3 {
  public static void main (String[] args) {
    //User prompt, and classifying their input
    System.out.println ("How much did the item cost? (Between 25 cents and a dollar, in 5 cent increments only)");
    Scanner console = new Scanner (System.in);
    int price = console.nextInt ();
    //Calculating total change
    int change = 100 - price;
    //Using mod to determine how many of each coin is needed
    int quarters = change/25;
    int dimes = change%25/10;
    int nickels = change%25%10/5;
    //Telling user what they will get in change
    System.out.println ("You gave me a dollar, so your change will be:");
    System.out.println (quarters + " quarters");
    System.out.println (dimes + " dimes");
    System.out.println (nickels + " nickels");
  }
}
