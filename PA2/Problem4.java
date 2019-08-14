//Brandon Jiang
//gagdude@brandeis.edu
//9/19/16
//To tell the user how many slices a pizza of a given diameter will yield
//No bugs
//Importing all objects in util, need it for Scanner
import java.util.*;

public class Problem4 {
  public static void main (String[] args) {
    //Prompting user to enter desired diameter
    System.out.println ("Welcome to Antonella's Pizza Place! What size do you want your pizza to be? (Enter a value of the diameter in inches)");
    Scanner console = new Scanner (System.in);
    double diameterPizza = console.nextDouble ();
    //Calculating number of slices that will be created (instructed in assignment PDF)
    double radiusPizza = diameterPizza/2;
    double areaPizza = radiusPizza*radiusPizza*3.14;
    double slicesPizza = areaPizza/14.125;
    //Workaround to truncate decimal, by multiplying by 100 and casting to integer
    double slicesPizza100 = slicesPizza*100;
    double slicesPizzafix = (int)slicesPizza100;
    double finalSlicesPizza = slicesPizzafix/100;
    //Telling user how many slices will be created
    System.out.println ("That will yield " + finalSlicesPizza + " slices of pizza.");
  }
}
