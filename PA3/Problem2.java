//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//To convert a user inputted name into piglatin
//No bugs

import java.util.*;

public class Problem2 {
  public static void main(String[] args) {
    //Storing user's name by prompting them to type it in
    System.out.println("What is your first name?");
    Scanner console = new Scanner(System.in);
    String firstName = console.next();
    System.out.println("What is your last name?");
    Scanner console1 = new Scanner(System.in);
    String lastName = console1.next();

    //Putting their inputted names into the piglatin converter
    String finalFirst = convert(firstName);
    String finalLast = convert(lastName);

    //Telling the user the final result
    System.out.println("Your piglatin name is " + finalFirst + " " + finalLast);
  }
  //This entire method converts a word to piglatin and returns it
  public static String convert(String input) {
    String lower = input.toLowerCase();
    //Isolating the first letter for later use
    String letter = lower.substring(0,1);
    //Erasing the first letter from the name
    String pig = lower.substring(1);
    //Isolating and making the first letter of the newly formed name uppercase
    String first = pig.substring(0,1).toUpperCase();
    //Combining the uppercase first letter, body of the name, the "old" first letter, and "ay"
    String end = first+pig.substring(1)+letter+"ay";
    return end;
  }
}
