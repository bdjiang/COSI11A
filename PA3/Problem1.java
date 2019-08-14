//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//To calculate batting average given times at bat and hits
//No bugs

import java.util.*;

public class Problem1 {
  public static void main(String[] args){
    //Asking user for number of times at bat
    System.out.println("Enter number of times at bat");
    Scanner console = new Scanner (System.in);
    //Calling their input timesAtBat
    double timesAtBat = console.nextInt();
    //Asking user for number of hits
    System.out.println("Enter number of hits earned");
    Scanner console1 = new Scanner (System.in);
    //Calling their input hitsEarned
    double hitsEarned = console1.nextInt();

    //Truncating the decimal
    System.out.printf("Your batting average is %.3f\n", calculateAverage(timesAtBat, hitsEarned));
    }
    //Method to calculate batting average
    public static double calculateAverage(double times, double hits) {
      double battingAverage = hits/times;
      return battingAverage;
    }
}
