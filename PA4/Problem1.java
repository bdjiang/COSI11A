//Brandon Jiang
//gagdude@brandeis.edu
//10/18/16
//To convert a binary number read as a string into its decimal value
//Bugs: No way to restrict user input to only binary. If a non-binary value is entered it assumes all digits not 1 is a 0

import java.util.*;

public class Problem1 {
  public static void main(String[] args) {
    System.out.println("Enter a binary number");
    Scanner console = new Scanner(System.in);
    String input = console.next();
    //Running method created that converts binary into a decimal number
    int decimal = convertBinary(input);
    System.out.println("In decimal form, that is " + decimal);
  }
  //Method to convert binary read as a string into decimal
  public static int convertBinary(String input) {
    double decimal = 0;
    for(int i = 0; i < input.length(); i++) {
        //If the digit is 1, then execute. Otherwise (it's a 0) do not
        if(input.charAt(i)=='1') {
          //Will add a value of 2^n where n begins as the highest (eg. in 1111, it would begin as 2^3)
          //And gradually decreasing, only adding the value of 2^n if digit is 1
          //RSubtract 1 from each one is because the highest n is the number of digits - 1, as the farthest right digit is 2^0
          decimal = decimal + Math.pow(2,input.length()-i-1);
        }
    }
    //Casting the value to an int to look clean (for some reason, loop would not run unless decimal was a double)
    int decimalValue = (int) decimal;
    return decimalValue;
  }
}
