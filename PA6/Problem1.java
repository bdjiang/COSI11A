//Brandon Jiang
//gagdude@brandeis.edu
//11/12/16
//To create an array and determine if the values are unique
//No bugs

import java.util.*;

public class Problem1 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    //Gathers information to create the array
    System.out.println("How many values would you like to enter?");
    int arrayLength = console.nextInt();
    int[] numbers = new int[arrayLength];
    System.out.println("Now enter the values");
    //Fills the array
    for(int i = 1; i <= arrayLength; i++) {
      System.out.print("Please enter the " + i + "th value: ");
      numbers[i-1] = console.nextInt();
    }
    System.out.println();
    if(isUnique(numbers) == false) {
      System.out.println("The values are not unique.");
    } else {
      System.out.println("The values are unique.");
    }
  }

  public static boolean isUnique(int[] numbers) {
    for(int i = 0; i < numbers.length; i++) {
      int value = numbers[i];
      for(int k = i + 1; k < numbers.length; k++) {
        if(value == numbers[k]) {
          return false;
        }
      }
    }
    return true;
  }
}
