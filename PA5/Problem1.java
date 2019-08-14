//Brandon Jiang
//gagdude@brandeis.edu
//10/29/16
//To create a rock-paper-scissors game with multiple game modes
//No bugs

import java.util.*;

public class Problem1 {
  public static void main(String[] args) {
    System.out.println("Welcome to rock paper scissors! Which mode would you like to play?");
    System.out.println("Choose either(enter word exactly as displayed):\nRegular \tSmart");
    Scanner console = new Scanner(System.in);
    String mode = console.next();
    Random rand = new Random();
    //Depending on what the user chose, will execute a method that contains the game of their choosing
    if(mode.equals("Regular")) {
      regular(console, rand);
    } else if(mode.equals("Smart")) {
      smart(console, rand);
    } else {
      System.out.println("Not a valid choice (remember to type the word exactly as it appears)");
    }
  }
  //Regular game mode where computer gives a random answer
  public static void regular(Scanner console, Random rand) {
    //Initiates a few variables that will be displayed at the end of the game
    int draw = 0;
    int win = 0;
    int lose = 0;
    int quit = 0;
    //Do-while loop to continuously play the game until user ends
    do {
      //Determines computer's answer. 1=rock, 2=paper, 3=scissors
      int computer = rand.nextInt(4);
      System.out.println("Rock, Paper, Scissors? (type in your choice exactly as it appears)");
      System.out.println("Or type anything else to quit");
      String user = console.next();
      //Tests all possibilities of if the user were to enter rock, and adds onto the end game variables accordingly
      if(user.equals("Rock")) {
        if(computer == 1) {
          System.out.println("The computer chose rock. It's a draw!");
          draw++;
        } else if(computer == 2) {
          System.out.println("The computer chose paper. You lose!");
          lose++;
        } else {
          System.out.println("The computer chose scissors. You win!");
          win++;
        }
        //Tests all possibilities of if the user were to enter paper, and adds onto the end game variables accordingly
      } else if(user.equals("Paper")) {
        if(computer == 1) {
          System.out.println("The computer chose rock. You win!");
          win++;
        } else if(computer == 2) {
          System.out.println("The computer chose paper. It's a draw!");
          draw++;
        } else {
          System.out.println("The computer chose scissors. You lose!");
          lose++;
        }
        //Tests all possibilities of if the user were to enter scissors, and adds onto the end game variables accordingly
      } else if(user.equals("Scissors")) {
        if(computer == 1) {
          System.out.println("The computer chose rock. You lose!");
          lose++;
        } else if(computer == 2) {
          System.out.println("The computer chose paper. You win!");
          win++;
        } else {
          System.out.println("The computer chose scissors. It's a draw!");
          draw++;
        }
        //The user enters anything else to quit
      } else {
        quit = 1;
      }
      //When quit becomes assigned to 1, the do-while loop will end
    } while (quit != 1);
    System.out.println("You won " + win + " times!");
    System.out.println("You lost " + lose + " times!");
    System.out.println("You tied " + draw + " times!");
  }

  //"Smart" game mode where it uses the most popular answer by the user against them
  public static void smart(Scanner console, Random rand) {
    //Initiates a few variables that will be displayed at the end of the game
    int draw = 0;
    int win = 0;
    int lose = 0;
    int quit = 0;
    int computer;
    int rock = 0;
    int paper = 0;
    int scissors = 0;
    do {
      //If the user has entered all 3 answers the same number of times, generate random answer
      //If the user has chosen a specific answer more times than the rest, the computer will counter it
      //Otherwise, just generate a random answer
      if(rock == paper && paper == scissors && scissors == rock) {
        computer = rand.nextInt(4);
      } else if(rock > paper && rock > scissors) {
        computer = 2;
      } else if(paper > rock && paper > scissors) {
        computer = 3;
      } else if(scissors > rock && scissors > paper) {
        computer = 1;
      } else {
        computer = rand.nextInt(4);
      }
      System.out.println("Rock, Paper, Scissors? (type in your choice exactly as it appears)");
      System.out.println("Or type anything else to quit");
      String user = console.next();
      //Tests all possibilities of if the user were to enter rock, and adds onto the end game variables accordingly
      if(user.equals("Rock")) {
        //Will add one to the rock count
        rock++;
        if(computer == 1) {
          System.out.println("The computer chose rock. It's a draw!");
          draw++;
        } else if(computer == 2) {
          System.out.println("The computer chose paper. You lose!");
          lose++;
        } else {
          System.out.println("The computer chose scissors. You win!");
          win++;
        }
        //Tests all possibilities of if the user were to enter paper, and adds onto the end game variables accordingly
      } else if(user.equals("Paper")) {
        //Will add one to the paper count
        paper++;
        if(computer == 1) {
          System.out.println("The computer chose rock. You win!");
          win++;
        } else if(computer == 2) {
          System.out.println("The computer chose paper. It's a draw!");
          draw++;
        } else {
          System.out.println("The computer chose scissors. You lose!");
          lose++;
        }
        //Tests all possibilities of if the user were to enter scissors, and adds onto the end game variables accordingly
      } else if(user.equals("Scissors")) {
        //Will add one to the scissors count
        scissors++;
        if(computer == 1) {
          System.out.println("The computer chose rock. You lose!");
          lose++;
        } else if(computer == 2) {
          System.out.println("The computer chose paper. You win!");
          win++;
        } else {
          System.out.println("The computer chose scissors. It's a draw!");
          draw++;
        }
        //The user enters anything else to quit
      } else {
        quit = 1;
      }
    //When quit becomes assigned to 1, the do-while loop will end
    } while(quit !=1);
    System.out.println("You won " + win + " times!");
    System.out.println("You lost " + lose + " times!");
    System.out.println("You tied " + draw + " times!");
  }
}
