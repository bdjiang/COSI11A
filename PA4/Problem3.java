//Brandon Jiang
//gagdude@brandeis.edu
//10/20/16
//To perform a set of actions on a number until it reaches 1, then print out number of times it was acted on
//No bugs

import java.util.*;

public class Problem3 {
  public static void main(String[] args) {
    System.out.println("Enter a positive integer");
    Scanner console = new Scanner(System.in);
    int number = console.nextInt();
    //Will execute the actions on the number only if it is 1 or greater, otherwise spits out an error
    if(number < 1) {
      System.out.println("Error");
    } else {
      pattern(number);
    }
  }
  public static void pattern(int number) {
    //Times is the number of times the number is acted on.
    //Begins as 0 since if the loop never completes, the number was already 1 and nothing will be done to it
    int times = 0;
    //The update statement simply changes i to whatever number has been changed to
    for(int i = number; i > 1; i = number) {
      //This determines if the number is odd or even
      int test = number%2;
      //Will perform the operation defined on an even number
      if(test == 0) {
        number = number/2;
        System.out.println("Next value is: " + number);
        //Will perform the operation defined on an odd number
      } else if(test == 1) {
        number = number*3 + 1;
        System.out.println("Next value is: " + number);
      }
      //This is the number of times an operation is performed
      times++;
    }
    System.out.println("Number of operations performed: " + times);
  }
}
