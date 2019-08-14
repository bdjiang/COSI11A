//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//To display the fibonacci sequence up to the nth term, where n is defined by the user
//No bugs

import java.util.*;

public class Problem6 {
  public static void main(String[] args) {
    //Asking user how many numbers of the fibonacci sequence they would like
    System.out.print("Please enter an integer: ");
    Scanner console = new Scanner(System.in);
    int k = console.nextInt();
    //First two numbers of the sequence are defined
    int f1 = 0;
    int f2 = 1;
    System.out.println("Fibonacci sequence up to the " + k + "th term is ");

    for(int i = 0; i < k;i++) {
      //Begin with first term of fibonacci
      int sum = f1;
      System.out.print(sum + " ");
      //Define new sum for next round of loop
      sum = f1+f2;
      //Redefine f1 and f2 as new numbers, as the fibonacci sequence utilizes only the preceding 2 numbers to calculate the next one
      f1=f2;
      f2=sum;
    }
    //This is simply so the next console line does not begin immediately after the fibonacci sequence
    System.out.println();
  }
}
