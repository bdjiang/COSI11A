//Brandon Jiang
//gagdude@brandeis.edu
//12/4/16
//To create a mad lib maker
//No bugs

import java.io.*;
import java.util.*;

public class madlib {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the game of Mad Libs.");
    System.out.println("I will ask you to provide various words");
    System.out.println("and phrases to fill in a story.");
    System.out.println("The result will be written to an output file.");
    System.out.println();
    String userInput;
    do {
      System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      userInput = console.next();
      if(userInput.equals("c") || userInput.equals("C")) {
        String fileName;
        File f;
        //Loop with error checking, loops until user types in a proper file name
        do {
          System.out.print("Input file name: ");
          fileName = console.next();
          f = new File(fileName);
          if(!f.exists()) {
            System.out.println("That file does not exist. Try again.");
          }
        } while(!f.exists());
        System.out.print("Output file name: ");
        File userFile = new File(console.next());
        //Runs the create() method using the input file and the output file user decided
        create(f, userFile);
      } else if(userInput.equals("v") || userInput.equals("V")) {
        //Loop with error checking, loops until user inputs proper file name
        File view;
        do {
          System.out.print("Input file name you wish to view: ");
          view = new File(console.next());
          if(!view.exists()) {
            System.out.println("That file does not exist. Try again.");
          }
        } while(!view.exists());
        //Runs the view() method
        view(view);
      } else if(userInput.equals("q") || userInput.equals("Q")) {
        //Sets userInput to quit, which ends the do-while loop
        userInput = "quit";
      } else {
        System.out.println("That's not a valid option");
      }
    } while(!userInput.equals("quit"));
  }

  public static void create(File input, File output) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    Scanner fileScan = new Scanner(input);
    PrintStream out = new PrintStream(output);

    while(fileScan.hasNextLine()) {
      String line = fileScan.nextLine();
      Scanner lineScan = new Scanner(line);
      while(lineScan.hasNext()) {
        String word = lineScan.next();
        //Determines if the next token is a placeholder for the mad lib
        if(word.startsWith("<") && word.endsWith(">")) {
          //Replaces the beginning < with nothing
          word = word.replace("<", "");
          //Replaces the ending > with a colon, to appear in the console
          word = word.replace(">", ":");
          //Replaces all hyphens with a space
          word = word.replace("-", " ");
          //vowelTest method explained below
          System.out.print("Please type " + vowelTest(word) + " " + word + " ");
          //Takes user input for the madlib
          String userLib = console.nextLine();
          //And prints it
          out.print(userLib + " ");
        } else {
          //Will print out the token if it's not a placeholder
          out.print(word+ " ");
        }
      }
      //Prints a line between every line (otherwise would be single line of text)
      out.println();
    }
  }
  public static void view(File input) throws FileNotFoundException {
    Scanner fileScan = new Scanner(input);
    //Simply prints the contents of a file
    while(fileScan.hasNextLine()) {
      System.out.println(fileScan.nextLine());
    }
  }
  //Tests if the prompt begins with a vowel or consonant, to determine a or an
  public static String vowelTest(String word) {
    if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' ||
       word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U') {
         return "an";
       } else {
         return "a";
       }
  }
}
