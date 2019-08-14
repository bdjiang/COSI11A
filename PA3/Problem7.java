//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//To display a grid of integers from 1 to (rows * columns) in column major order
//No bugs

import java.util.*;

public class Problem7 {
  public static void main(String[] args) {
    //Prompting user to input number of rows and columns
    System.out.print("Enter number of rows: ");
    Scanner console = new Scanner(System.in);
    int r = console.nextInt();
    System.out.print("Enter number of columns: ");
    Scanner console1 = new Scanner(System.in);
    int c = console1.nextInt();

    //Nested loop. The outer one repeats the inner one to create multiple rows
    for (int j = 1; j <= r; j++) {
      //Declaring the variable sum to be equal to j, or the number of the row
      int sum = j;
      //For loop to create contents of each row
      for(int i = 1; i <= c; i++) {
        //Begin by printing sum, which is row number
        System.out.print(sum + "\t");
        //Then, add the number of rows to sum as the number increases reading from left to right by the number of rows
        sum = sum + r;
      }
      //After completing the row, move cursor to next line to complete next row
      System.out.println();
    }
  }
}
