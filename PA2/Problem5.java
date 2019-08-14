//Brandon Jiang
//gagdude@brandeis.edu
//9/19/16
//To determine pizzas required for a party with a given number of guests, and specified pizza diameter
//No bugs
import java.util.*;

public class Problem5 {
  public static void main (String[] args) {
    //Asking user how many people will be at the party
    System.out.println ("How many people will be at the party?");
    Scanner console = new Scanner (System.in);
    int People = console.nextInt ();
    //Calculating how many slices will be eaten
    int TotalSlices = People*4;
    //Asking user what diamter they would like the pizza to be
    System.out.println ("What size pizza do you want? (Enter diameter of pizza in inces)");
    Scanner console1 = new Scanner (System.in);
    double DiameterPizza = console1.nextInt ();
    //Calculating area of pizza
    double RadiusPizza = DiameterPizza/2;
    double AreaPizza = RadiusPizza*RadiusPizza*3.14;
    //Calculating number of slices
    double Slices = AreaPizza/14.125;
    //Calculating how many pizzas will be required to satisfy the guests
    double NumberPizzas = TotalSlices/Slices;
    int NumberPizzasRd = (int)NumberPizzas;
    int TotalNumber = NumberPizzasRd + 1;
    //Telling user how many pizzas will be required
    System.out.println ("You will need " + TotalNumber + " pizzas to satisfy your guests.");
  }
}
