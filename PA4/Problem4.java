//Brandon Jiang
//gagdude@brandeis.edu
//10/22/16
//To determine the day of the week a certain date past 1/1/1601 falls under
//No bugs

import java.util.*;

public class Problem4 {
  public static void main(String[] args) {
    System.out.println("Enter a date, starting with the month (1-12)");
    Scanner console = new Scanner(System.in);
    int month = console.nextInt();

    System.out.println("Now enter the day of the month");
    Scanner console1 = new Scanner(System.in);
    int day = console1.nextInt();

    System.out.println("Finally, enter a year from 1601 on");
    Scanner console2 = new Scanner(System.in);
    int year = console2.nextInt();

    //Tells user what the day is, by using a method that determines number of days passed since 1/1/1601
    //And a method that uses that number to find the day of the week
    System.out.println("That day is a " + findDay(daysSince(month, day, year)));
    }
  public static int daysSince(int month, int day, int year) {
    //Finding number of years passed since 1601
    int yearNum = year - 1601;
    //Finding leap years passed since 1601, using the standard "every 4 years" rule
    int leapYears = yearNum/4;
    //If the year is divisible by 100, it's not a leap year (fun fact!)
    int fakeYears = yearNum/100;
    //However, if it is divisible by 400, it still is a leap year
    int kindaFakeYears = yearNum/400;
    //Uses these values accordingly to find the true number of leap years passed
    int realLeapYears = leapYears - fakeYears + kindaFakeYears;
    //Finding number of normal years passed since 1601
    int normYears = yearNum - realLeapYears;
    //Calculating days passed since 1601 to the beginning of the year user entered
    int yearDaysSince = (normYears*365)+(realLeapYears*366);
    int numberDate;
    //Determines if the year was a leap year, and calculates days passed since the beginning of the year
    if(year%4 != 0 || year%400 == 0) {
      if(month == 1) {
        numberDate = day;
      } else if(month == 2) {
        numberDate = 31 + day;
      } else if(month == 3) {
        numberDate = 59 + day;
      } else if(month == 4) {
        numberDate = 90 + day;
      } else if(month == 5) {
        numberDate = 120 + day;
      } else if(month == 6) {
        numberDate = 151 + day;
      } else if(month == 7) {
        numberDate = 181 + day;
      } else if(month == 8) {
        numberDate = 212 + day;
      } else if(month == 9) {
        numberDate = 243 + day;
      } else if(month == 10) {
        numberDate = 273 + day;
      } else if(month == 11) {
        numberDate = 304 + day;
      } else {
        numberDate = 334 + day;
      }
    } else {
      if(month == 1) {
        numberDate = day;
      } else if(month == 2) {
        numberDate = 31 + day;
      } else if(month == 3) {
        numberDate = 60 + day;
      } else if(month == 4) {
        numberDate = 91 + day;
      } else if(month == 5) {
        numberDate = 121 + day;
      } else if(month == 6) {
        numberDate = 152 + day;
      } else if(month == 7) {
        numberDate = 182 + day;
      } else if(month == 8) {
        numberDate = 213 + day;
      } else if(month == 9) {
        numberDate = 244 + day;
      } else if(month == 10) {
        numberDate = 274 + day;
      } else if(month == 11) {
        numberDate = 305 + day;
      } else {
        numberDate = 335 + day;
      }
    }
    //Uses these totals to find total days passed since 1/1/1601 to the date the user entered
    int totalDaysSince = yearDaysSince + numberDate;
    return totalDaysSince;
  }
  //Determines day of the week by assiging each day to the modulo of 7
  public static String findDay(int daysSince) {
    int numberOfWeek = daysSince%7;
    if(numberOfWeek == 1) {
      return "Monday";
    } else if(numberOfWeek == 2) {
      return "Tuesday";
    } else if(numberOfWeek == 3) {
      return "Wednesday";
    } else if(numberOfWeek == 4) {
      return "Thursday";
    } else if(numberOfWeek == 5) {
      return "Friday";
    } else if(numberOfWeek == 6) {
      return "Saturday";
    } else {
      return "Sunday";
    }
  }
}
