//Brandon Jiang
//gagdude@brandeis.edu
//10/29/16
//To create a number guessing game where the computer guesses
//No bugs

import java.util.*;

public class Problem2 {
  public static final int MAX_NUM = 100;
  public static void main(String[] args) {
    //Intoduction to the game
    System.out.println("This program allows you to play a guessing game.");
    System.out.println("Think of a number between 1 and 100");
    System.out.println("and I will guess until I get it.");
    System.out.println("For each guess, tell me if the");
    System.out.println("right answer is higher or lower than your guess, or if it is correct.");
    Scanner console = new Scanner(System.in);
    Random rand = new Random();
    //Calls onto method which contains the entirety of the game
    guessingGame(console, rand);
  }
  public static void guessingGame(Scanner console, Random rand) {
    //Initializes quit, if it gets changed to 1 the game will quit (see below)
    int quit = 0;
    //Initializes number of games, as the user plays more the number gets added on
    int games = 0;
    //Initializes total guesses by the computer, gets added onto after every game
    int totalGuesses = 0;
    //Initializes the variable for most guesses in a game
    int maxGuess = 0;
    do {
      //Initializes the variable connect. If it changes to 1, the game will end
      int correct = 0;
      //Initializes number of guesses, which gets added on after every guess the computer makes
      int guess = 0;
      //Gives limits for maximum and minimum numbers in order for the computer to guess without repeating numbers
      int max = MAX_NUM + 1;
      int min = 1;
      //Computer begins by generating random number
      int number = rand.nextInt(MAX_NUM + 1);
      System.out.println("Think of a number...");
      do {
        System.out.println("My guess: " + number);
        String user = console.next();
        //Depending on if the user says their number is higher or lower, will calculate the number in between
        //It intelligently uses the number the user entered to only look at numbers below the max and above the min
        if(user.equals("higher")) {
          min = number;
          guess++;
          number = (max+number)/2;
        } else if(user.equals("lower")) {
          max = number;
          guess++;
          number = (min+number)/2;
          //If the user entered correct then the loop will end by changing correct to 1
        } else {
          guess++;
          correct = 1;
        }
      } while(correct != 1);
      System.out.println("I got it right in " + guess + " guesses");
      //Adds on to the total guesses by the guesses from the game just played
      totalGuesses = totalGuesses + guess;
      //Adds on to total number of games after every game
      games++;
      //Determines if the game just played warrants a new max guesses in a game
      //If yes, then it will switch to that number of guess. Otherwise stays the same
      if(guess > maxGuess) {
        maxGuess = guess;
      } else {
        maxGuess = maxGuess;
      }
      System.out.println();
      System.out.print("Do you want to play again? ");
      String user = console.next();
      //Changes the user's input to lowercase, so we can test their answer with the next line
      String lowerCase = user.toLowerCase();
      //Will check the first letter of their input, regardless of case (as it will have been converted to lowercase)
      char test = lowerCase.charAt(0);
      //If the word began with an "n," quit. If it began with a "y" (or any other letter), keep playing
      if(test == 'n') {
        quit = 1;
      } else if(test == 'y') {
        quit = 0;
      }
    } while(quit != 1);
    //Calculates the average number of guesses per game
    double averageGuesses = (double)totalGuesses/games;
    System.out.println("Overall results:");
    System.out.println("\ttotal games   = " + games);
    System.out.println("\ttotal guesses = " + totalGuesses);
    System.out.println("\tguesses/game  = " + averageGuesses);
    System.out.println("\tmax guesses   = " + maxGuess);
  }
}
