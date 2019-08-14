//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//To find all exponents with base 2 up to 2^(value defined by user)
//No bugs

import java.util.*;

public class Problem3 {
  public static void main (String[] args) {
    //Prompting user to enter the number
    System.out.print("Please enter a number: ");
    Scanner console = new Scanner(System.in);
    int power = console.nextInt();
    //Repeats the powers of 2 up to the specific power
    for (int j = 0; j <= power; j++) {
      System.out.println(calcPower(j));
    }
  }
  //Static method to find exponent for 2 to the specified power
  public static int calcPower(int power) {
    int sum = 1;
    for(int i = 0; i < power; i++) {
      //Calculates exponent with base 2, by repeating a multiplication by 2 by the number of times defined by the user
      sum = 2*sum;
    }
      return sum;
  }
}
