//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//Have user input three numbers, which would then be factorialized
//No bugs

import java.util.*;

public class Problem5 {
  public static void main(String[] args) {
  //Prompting user to enter the numbers they would like to factorialize
  System.out.print("Enter the first number: ");
  Scanner console = new Scanner(System.in);
  int first = console.nextInt();
  System.out.print("Enter the second number: ");
  Scanner console1 = new Scanner(System.in);
  int second = console1.nextInt();
  System.out.print("Enter the third number: ");
  Scanner console2 = new Scanner(System.in);
  int third = console2.nextInt();

  //Executing the values they inputted into the calculateFactorial method
  calculateFactorial(first);
  calculateFactorial(second);
  calculateFactorial(third);
  }

  //Separate the calculating of the factorial into a separate method
  public static void calculateFactorial(int number) {
    //Declaring the first value of sum, which will be used in the loop to calculate factorial
    int sum = 1;
    for(int i = 1; i <= number; i++) {
      //Loop performs 1*2*3*4*5...*n
      sum = sum*i;
    }
    System.out.println(number + "! = " + sum);
  }
}
