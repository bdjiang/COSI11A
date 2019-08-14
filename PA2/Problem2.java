//Brandon Jiang
//gagdude@brandeis.edu
//9/19/16
//To convert farenheit into celsius
//No bugs
//Importing all objects in util, need it for Scanner
import java.util.*;

public class Problem2 {
  public static void main (String[] args) {
    //Asking for user to input the temperature in farenheit
    System.out.println ("Enter a whole number temperature in Farenheit:");
    Scanner console = new Scanner (System.in);
    double degreesF = console.nextInt ();
    //Converting the temperature into celsius
    double degreesC = 5*(degreesF-32)/9;
    //Workaround to truncate decimal, by multiplying by 10 and casting to an integer
    double degreesC10 = degreesC*10;
    double degreesCFix = (int)degreesC10;
    double finalDegreesC = degreesCFix/10;
    //Telling user the final answer
    System.out.println ("That is " + finalDegreesC + " degrees in Celsius.");
  }
}
