//Brandon Jiang
//gagdude@brandeis.edu
//9/19/16
//To tell user what ingredients will be needed for a specified number of cookies
//No bugs
//Importing all objects in util, need it for Scanner
import java.util.*;

public class Problem6 {
  public static void main (String[] args) {
    //Asking user how many cookies they desire
    System.out.println ("How many cookies do you want?");
    Scanner console = new Scanner (System.in);
    double cookies = console.nextInt ();
    //Calculating number of batches based on number of cookies
    double batches = cookies/48;
    //Calculating amount of each ingredient needed for the number of batches
    double sugar = batches*1.5;
    double butter = batches;
    double flour = batches*2.75;
    //Workaround to truncate decimal, by multiplying by 100 and casting to integer
    double sugar100 = sugar*100;
    double sugarFix = (int)sugar100;
    double sugarFinal = sugarFix/100;

    double butter100 = butter *100;
    double butterFix = (int)butter100;
    double butterFinal = butterFix/100;

    double flour100 = flour*100;
    double flourFix = (int)flour100;
    double flourFinal = flourFix/100;
    //Telling user how much of each ingredient they will need
    System.out.println ("You will need:");
    System.out.println (sugarFinal + " cups of sugar.");
    System.out.println (butterFinal + " cups of butter.");
    System.out.println (flourFinal + " cups of flour.");
  }
}
