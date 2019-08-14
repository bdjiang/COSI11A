//Brandon Jiang
//gagdude@brandeis.edu
//9/19/16
//To input a 4 digit number and return it one digit per line
//No bugs
//Importing all objects in util, need it for Scanner
import java.util.*;

public class Problem1 {
  public static void main (String[] args) {
    //Prompting the user to type, and classifying their input
    System.out.println ("Enter a four-digit positive number:");
    Scanner console = new Scanner (System.in);
    int number = console.nextInt ();
    //First digit
    System.out.println (number/1000);
    //Second digit
    System.out.println (number%1000/100);
    //Third digit
    System.out.println (number%1000%100/10);
    //Fourth digit
    System.out.println (number%1000%100%10);
  }
}
