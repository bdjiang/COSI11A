//Brandon Jiang
//gagdude@brandeis.edu
//11/12/16
//To create an array and determine the longest increasing sequence
//No bugs

import java.util.*;

public class Problem2 {
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
    System.out.println("The longest sorted sequence is " + longestSortedSequence(numbers));
  }

  public static int longestSortedSequence(int[] numbers) {
    int count = 1;
    int masterCount = 0;
    int test;
    int number;
    for(int i = 1; i < numbers.length; i++) {
      //I test the value of an array against the value just before it, and if it's greater or equal to, add to the count
      //I'm counting equal to as part of the sorted sequence based off the answer Arya gave in the Latte forum
      test = numbers[i-1];
      number = numbers[i];
      if(number >= test) {
        count++;
      } else {
        //Otherwise I check the count, and if it's greater than the current longest sequence, I set it
        if(count > masterCount) {
          masterCount = count;
        }
        //Resets the count
        count = 1;
      }
    }
    //Added this because the masterCount was not updated if the array ended on a positive sequence
    //So it checks if the final values were a positive sequence, and if so, updates the masterCount
    //However, there is an error if the arrayLength was 1, so I had to cover for that as well
    if(numbers.length == 1){
      masterCount = 1;
    } else {
      //Here is where I update the masterCount if the final values followed an increasing trend
      if(numbers[numbers.length - 1] > numbers[numbers.length-2]) {
        masterCount = count;
      }
    }
    return masterCount;
  }
}
