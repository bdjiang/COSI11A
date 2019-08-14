//Brandon Jiang
//gagdude@brandeis.edu
//11/12/16
//To create a price is right game
//No bugs

import java.util.*;

public class Problem3 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    //Gathers information to create the array
    System.out.println("How many people are playing?");
    int players = console.nextInt();
    int[] guesses = new int[players];
    //Fills the array with guesses
    for(int i = 0; i < players; i++) {
      System.out.println("Enter the " + (i + 1) + "th player's guess for the price");
      guesses[i] = console.nextInt();
    }
    //Prompts for actual price of the item
    System.out.println("What is the actual price of the item?");
    int price = console.nextInt();
    //Declares no winner if everyone was too high
    if(priceIsRight(guesses, price) == 0) {
      System.out.println("Nobody wins!");
    } else {
      System.out.println("The closest guess was $" + priceIsRight(guesses, price));
    }

  }
  public static int priceIsRight(int[] guesses, int price) {
    //This value will be the least difference between guess and actual price
    //Begins equal to price because that is the greatest possible difference
    int minDifference = price;
    int difference;
    for(int i = 0; i < guesses.length; i++) {
      //Effectively ignores all guesses greater than the price
      if(guesses[i] <= price) {
        //Determines the difference between guess and price
        difference = price - guesses[i];
        //If the guess was closer than the previous best guess, will set the new best guess
        if(difference < minDifference) {
          minDifference = difference;
        }
      }
    }
    return price - minDifference;
  }
}
