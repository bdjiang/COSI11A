//Brandon Jiang
//gagdude@brandeis.edu
//11/1/16
//To create a reverse hangman game where the computer guesses
//No bugs

import java.util.*;

public class Problem3 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("This program plays a game of reverse hangman.");
    System.out.println("You think up a word (by typing it on the computer) and I'll try to guess the letters.");
    hangman(rand, console);
  }
  public static void hangman(Random rand, Scanner console) {
    System.out.print("How many letters are in your word? ");
    int numberLetters = console.nextInt();
    System.out.print("Please enter the word for me to guess (letters only): ");
    String word = console.next();
    //These numbers will count how many times the computer has been correct versus how many guesses were wrong
    int correct = 0;
    int wrong = 0;
    //These are strings to be used as "banks" which will contain the letters used in the word, and not used in the word, respectively
    String wordLetters = "";
    String notLetters = "";

    //This while loop will only run when the computer has not lost (wrong<7) and the computer has not guessed the word
    //If one of the two conditions (computer lost, or computer guessed) is met, the loop ends
    while(wrong < 7 && correct < numberLetters) {
      //This tests if a letter is in the string designated for letters guessed that are in the word
      //If it is not, it prints a "-" and if it is, it will print the letter
      int contained = 0;
      //This goes letter by letter in the word given by the user
      for(int i = 0; i < numberLetters; i++) {
        for(int k = 0; k < wordLetters.length(); k++) {
          //Will make contained = 1 if the letter is in the word bank for letters guessed that are in the word
          if(word.charAt(i) == wordLetters.charAt(k)) {
            contained = 1;
            break;
          } else {
            contained = 0;
          }
        }
        //Going letter by letter, if the letter was in the word bank, it will print the letter
        if(contained == 1) {
          System.out.print(word.charAt(i));
          //Otherwise print the placeholder "-"
        } else {
          System.out.print("-");
        }
      }
      System.out.println();

      //Depending on how many incorrect guesses the computer has made, print a different hanged man image
      switch(wrong) {
        case 1:
          wrong(1);
          break;
        case 2:
          wrong(2);
          break;
        case 3:
          wrong(3);
          break;
        case 4:
          wrong(4);
          break;
        case 5:
          wrong(5);
          break;
        case 6:
          wrong(6);
          break;
        default:
          wrong(0);
      }

      //This makes sure the letter being guessed has not already been guessed
      int alreadyGuessed = 0;
      int alreadyGuessed2 = 0;
      char letter;
      do {
        //First generates a random number, and add 98 to match to an ASCII value
        int guess = rand.nextInt(25) + 98;
        letter = (char)guess;
        //Tests if the guessed character is in the string designated for all letters not in the word
        for(int i = 0; i < notLetters.length(); i++) {
          //Assigns alreadyGuessed to be 1 if the character has been guessed and is not in the word
          if(notLetters.charAt(i) == letter) {
            alreadyGuessed2 = 1;
            break;
          } else {
            alreadyGuessed2 = 0;
          }
        }
        //Tests if the guessed character is in the string designated for all letters in the word
        for(int i = 0; i < wordLetters.length(); i++) {
          //Assigns alreadyGuessed to be 1 if the character has been guessed and is in the word
          if(wordLetters.charAt(i) == letter) {
            alreadyGuessed = 1;
            break;
          } else {
            alreadyGuessed = 0;
          }
        }
      //If the value has already been guessed, the loop will repeat. Otherwise, continue with said letter
    } while(alreadyGuessed == 1 || alreadyGuessed2 == 1);

      System.out.println("I've got " + correct + " of the " + numberLetters + " letters so far");
      System.out.println("I guess: " + letter);
      System.out.print("Is that letter in the word (y or n)? ");
      String yesOrNo = console.next();

      if(yesOrNo.equals("y")) {
        //If the user says the letter is in the word, ask for how many
        System.out.print("How many of that letter are in the word? ");
        int letterCount = console.nextInt();
        //Counting total correct characters in the word. The loop ends when the computer has guessed all letters
        correct = correct + letterCount;
        //Adding the letter to the string designated for all letters in the word
        wordLetters = wordLetters + letter;
      } else {
        //Will add a strike against the computer. The game ends when the computer gets 7 wrong
        wrong++;
        //Adding the letter to the string designated for all letters not in the word
        notLetters = notLetters + letter;
      }
      System.out.println();
    }

    if(wrong == 7) {
      wrong(6);
      System.out.println("You beat me this time.");
    } else {
      System.out.println("The word was " + word + ". I won the game!");
    }
  }



  //This mathods determines what to print for various stages of the hanged man
  public static void wrong(int wrong) {
    switch(wrong) {
      case 1:
        System.out.print("+--+\n|  |\n|  0\n|\n|\n|\n+-----\n");
        break;
      case 2:
        System.out.print("+--+\n|  |\n|  0\n|  |\n|\n|\n+-----\n");
        break;
      case 3:
        System.out.print("+--+\n|  |\n|  0\n|  |\n|   \\\n|\n+-----\n");
        break;
      case 4:
        System.out.print("+--+\n|  |\n|  0\n|  |\n| / \\\n|\n+-----\n");
        break;
      case 5:
        System.out.print("+--+\n|  |\n|  0\n|  |\\\n| / \\\n|\n+-----\n");
        break;
      case 6:
        System.out.print("+--+\n|  |\n|  0\n| /|\\\n| / \\\n|\n+-----\n");
        break;
      default:
        System.out.print("+--+\n|  |\n|\n|\n|\n|\n+-----\n");
    }
  }
}
