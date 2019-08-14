//Brandon Jiang
//gagdude@brandeis.edu
//10/20/16
//To determine how many days until two people's birthdays, and which birthday is coming sooner
//No bugs

import java.util.*;

public class Problem6 {
  public static void main(String[] args) {
    //Grabbing inforamtion on person 1
    System.out.println("Enter the first person's birthday month (1-12)");
    Scanner console = new Scanner(System.in);
    int p1Month = console.nextInt();
    System.out.println("Enter the first person's birthday date");
    Scanner console1 = new Scanner(System.in);
    int p1Date = console1.nextInt();
    //Grabbing information on person 2
    System.out.println("Enter the second person's birthday month (1-12)");
    Scanner console2 = new Scanner(System.in);
    int p2Month = console2.nextInt();
    System.out.println("Enter the second person's birthday date");
    Scanner console3 = new Scanner(System.in);
    int p2Date = console3.nextInt();
    //Grabbing information for today's date
    System.out.println("Enter the current month (1-12)");
    Scanner console4 = new Scanner(System.in);
    int currentMonth = console4.nextInt();
    System.out.println("Enter the current date");
    Scanner console5 = new Scanner(System.in);
    int currentDate = console5.nextInt();
    //Assigning each date a unique number via the method below
    int birthday1 = numberDate(p1Month, p1Date);
    int birthday2 = numberDate(p2Month, p2Date);
    int today = numberDate(currentMonth, currentDate);

    int personOne = daysUntil(birthday1,today);
    int personTwo = daysUntil(birthday2,today);

    //Says how many days are until each person's birthday, and says happy birthday if their birthday is today
    System.out.println("There are " + personOne + " days until person 1's birthday!");
    if(personOne == 0) {
      System.out.println("Happy birthday person 1!");
    }
    System.out.println("There are " + personTwo + " days until person 2's birthday!");
    if(personTwo == 0) {
      System.out.println("Happy birthday person 2!");
    }

    //This determines which birthday is sooner, and if they are the same, sends a cute message
    if(personOne > personTwo) {
      System.out.println("Person 2's birthday is sooner!");
    } else if (personOne < personTwo) {
      System.out.println("Person 1's birthday is sooner!");
    } else {
      System.out.println("What are the odds? You both have the same birthday!");
    }
  }
  //Assigns each date of the year a unique number 1-365 based on when it occurs
  //(eg. January 1st would be 1, and December 31st is 365)
  public static int numberDate(int month, int date) {
    int numberDate;
    if(month == 1) {
      numberDate = date;
    } else if(month == 2) {
      numberDate = 31 + date;
    } else if(month == 3) {
      numberDate = 59 + date;
    } else if(month == 4) {
      numberDate = 90 + date;
    } else if(month == 5) {
      numberDate = 120 + date;
    } else if(month == 6) {
      numberDate = 151 + date;
    } else if(month == 7) {
      numberDate = 181 + date;
    } else if(month == 8) {
      numberDate = 212 + date;
    } else if(month == 9) {
      numberDate = 243 + date;
    } else if(month == 10) {
      numberDate = 273 + date;
    } else if(month == 11) {
      numberDate = 304 + date;
    } else {
      numberDate = 334 + date;
    }
    return numberDate;
  }
  //Determines the number of days until a birthday, using today's date
  public static int daysUntil(int bDay, int today) {
    int daysUntil = 0;
    //If the birthday has not yet occurred in the year, we simply subtract the today's date from the birthday's unique number
    if(bDay > today) {
      daysUntil = bDay - today;
      //If birthday has already occurred, it counts the days until the end of the year (365-today) then adds the days until the birthday
    } else if (today > bDay) {
      daysUntil = 365 - today + bDay;
    }
    //Note that daysUntil was initialized as 0, so if the birthday and today's date are equal it ill not satisfy the if statement
    //But, if they are equal, that means there are 0 days until the birthday!
    return daysUntil;
  }
}
