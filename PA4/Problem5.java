//Brandon Jiang
//gagdude@brandeis.edu
//10/18/16
//To convert a number into Roman numerals
//No bugs

import java.util.*;

public class Problem5 {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner console = new Scanner(System.in);
    int number = console.nextInt();
    //By rule, the largest Roman numeral is 4999 (although it is technically possible to go higher)
    if(number >= 5000) {
      System.out.println("That is out of Roman numeral range.");
      //Roman numerals do not cover anything below 1
    } else if(number <= 0) {
      System.out.println("That is out of Roman numeral range.");
      //So, if the number is 1-4999, execute the conversion
    } else {
      System.out.print(number + " in Roman numerals is ");
      toRoman(number);
      System.out.println();
    }
  }
  public static void toRoman(int number) {
    //This is how I determine how many of each character(s) is necessary in the Roman numeral form
    int M = number/1000;
    int CM = number%1000/900;
    int D = number%1000%900/500;
    int CD = number%1000%900%500/400;
    int C = number%1000%900%500%400/100;
    int XC = number%1000%900%500%400%100/90;
    int L = number%1000%900%500%400%100%90/50;
    int XL = number%1000%900%500%400%100%90%50/40;
    int X = number%1000%900%500%400%100%90%50%40/10;
    int IX = number%1000%900%500%400%100%90%50%40%10/9;
    int V = number%1000%900%500%400%100%90%50%40%10%9/5;
    int IV = number%1000%900%500%400%100%90%50%40%10%9%5/4;
    int I = number%1000%900%500%400%100%90%50%40%10%9%5%4;

    //Print that character by the number of times as determined by the block of code above
    //Roman numerals are read right to left biggest number to smallest
    for (int m = 1; m <= M; m++) {
      System.out.print("M");
    }

    for (int cm = 1; cm <= CM; cm++) {
      System.out.print("CM");
    }

    for (int d = 1; d <= D; d++) {
      System.out.print("D");
    }

    for (int cd = 1; cd <= CD; cd++) {
      System.out.print("CD");
    }

    for (int c = 1; c <= C; c++) {
      System.out.print("C");
    }

    for (int xc = 1; xc <= XC; xc++) {
      System.out.print("XC");
    }

    for (int l = 1; l <= L; l++) {
      System.out.print("L");
    }

    for (int xl = 1; xl <= XL; xl++) {
      System.out.print("XL");
    }

    for (int x = 1; x <= X; x++) {
      System.out.print("X");
    }

    for (int ix = 1; ix <= IX; ix++) {
      System.out.print("IX");
    }

    for (int v = 1; v <= V; v++) {
      System.out.print("V");
    }

    for (int iv = 1; iv <= IV; iv++) {
      System.out.print("IV");
    }

    for (int i = 1; i <= I; i++) {
      System.out.print("I");
    }
  }
}
