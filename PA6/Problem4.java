//Brandon Jiang
//gagdude@brandeis.edu
//11/15/16
//To create an intelligent tic tac toe game with arrays
//User can write over spaces already used, and computer sometimes blocks user's 3 in a row over completing its own
//Computer is also not fully intelligent as it does not strategize unless there is a 2 in a row present
//The game repeats itself if the game is a tie

import java.util.*;

public class Problem4 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Welcome to tic-tac-toe!");
    System.out.println("You will be O, and I will be X");

    if(ticTacToe(console, rand) == 1) {
      System.out.println("You win!");
    } else if(ticTacToe(console, rand) == 3) {
      System.out.println("Computer wins!");
    } else if(ticTacToe(console, rand) == 2){
      System.out.println("Cat's game!");
    }

  }
  public static int ticTacToe(Scanner console, Random rand) {
    //Creation of the board, with [] to denote empty spaces
    String[][] board = new String[3][3];
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        board[i][j] = "[]";
      }
    }
    System.out.println("Would you like to go first? Type yes/no");
    String first = console.next();
    System.out.println("The board is displayed below. Boxes denote unmarked spaces");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("To choose where to go, type in top/middle/bottom or left/middle/right when prompted");
    if(first.equals("yes")) {
      System.out.println("Your move!");
      System.out.println("top/middle/bottom?");
      //Assigns userColumn and userRow based on where the user wanted to go
      int userColumn = 0;
      int userRow = 0;
      String userRowIn = console.next();
      if(userRowIn.equals("top")) {
        userRow = 0;
      } else if(userRowIn.equals("middle")) {
        userRow = 1;
      } else if(userRowIn.equals("bottom")) {
        userRow = 2;
      }
      System.out.println("left/middle/right?");
      String userColumnIn = console.next();
      if(userColumnIn.equals("left")) {
        userColumn = 0;
      } else if(userColumnIn.equals("middle")) {
        userColumn = 1;
      } else if(userColumnIn.equals("right")) {
        userColumn = 2;
      }
      //User is O, so will place that in wherever they indicated they wanted to go
      board[userRow][userColumn] = "O";
    }

    boolean end = false;
    int userWin = 0;
    //Loop begins immediately if computer goes first, otherwise this only begins after the first move by the user
    while(end == false) {
      System.out.println("My move! Here is the board now");
      //Computer will now check for 2 in a rows and block user or complete its own 3 in a row
      //Checks for all row 2 in a rows
      if(( board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("[]") )||( board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("[]") )) {
        board[0][2] = "X";
      } else if(( board[0][0].equals("X") && board[0][2].equals("X") && board[0][1].equals("[]") )||( board[0][0].equals("O") && board[0][2].equals("O") && board[0][1].equals("[]") )) {
        board[0][1] = "X";
      } else if(( board[0][1].equals("X") && board[0][2].equals("X") && board[0][0].equals("[]") )||( board[0][1].equals("O") && board[0][2].equals("O") && board[0][0].equals("[]") )) {
        board[0][0] = "X";
      }
      else if(( board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("[]") )||( board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("[]") )) {
        board[1][2] = "X";
      } else if(( board[1][0].equals("X") && board[1][2].equals("X") && board[1][1].equals("[]") )||( board[1][0].equals("O") && board[1][2].equals("O") && board[1][1].equals("[]") )) {
        board[1][1] = "X";
      } else if(( board[1][1].equals("X") && board[1][2].equals("X") && board[1][0].equals("[]") )||( board[1][1].equals("O") && board[1][2].equals("O") && board[1][0].equals("[]") )) {
        board[1][0] = "X";
      }
      else if(( board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("[]") )||( board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("[]") )) {
        board[2][2] = "X";
      } else if(( board[2][0].equals("X") && board[2][2].equals("X") && board[2][1].equals("[]") )||( board[2][0].equals("O") && board[2][2].equals("O") && board[2][1].equals("[]") )) {
        board[2][1] = "X";
      } else if(( board[2][1].equals("X") && board[2][2].equals("X") && board[2][0].equals("[]") )||( board[2][1].equals("O") && board[2][2].equals("O") && board[2][0].equals("[]") )) {
        board[2][0] = "X";
      }
      //Checks for all column 2 in a rows
      else if(( board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("[]") )||( board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("[]") )) {
        board[2][0] = "X";
      } else if(( board[0][0].equals("X") && board[2][0].equals("X") && board[1][0].equals("[]") )||( board[0][0].equals("O") && board[2][0].equals("O") && board[1][0].equals("[]") )) {
        board[1][0] = "X";
      } else if(( board[1][0].equals("X") && board[2][0].equals("X") && board[0][0].equals("[]") )||( board[1][0].equals("O") && board[2][0].equals("O") && board[0][0].equals("[]") )) {
        board[0][0] = "X";
      }
      else if(( board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("[]") )||( board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("[]") )) {
        board[2][1] = "X";
      } else if(( board[0][1].equals("X") && board[2][1].equals("X") && board[1][1].equals("[]") )||( board[0][1].equals("O") && board[2][1].equals("O") && board[1][1].equals("[]") )) {
        board[1][1] = "X";
      } else if(( board[1][1].equals("X") && board[2][1].equals("X") && board[0][1].equals("[]") )||( board[1][1].equals("O") && board[2][1].equals("O") && board[0][1].equals("[]") )) {
        board[0][1] = "X";
      }
      else if(( board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("[]") )||( board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("[]") )) {
        board[2][2] = "X";
      } else if(( board[0][2].equals("X") && board[2][2].equals("X") && board[1][2].equals("[]") )||( board[0][2].equals("O") && board[2][2].equals("O") && board[1][2].equals("[]") )) {
        board[1][2] = "X";
      } else if(( board[1][2].equals("X") && board[2][2].equals("X") && board[0][2].equals("[]") )||( board[1][2].equals("O") && board[2][2].equals("O") && board[0][2].equals("[]") )) {
        board[0][2] = "X";
      }
      //Checks for diagonal 2 in a rows
      else if(( board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("[]") )||( board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("[]") )) {
        board[2][2] = "X";
      } else if(( board[0][0].equals("X") && board[2][2].equals("X") && board[1][1].equals("[]") )||( board[0][0].equals("O") && board[2][2].equals("O") && board[1][1].equals("[]") )) {
        board[1][1] = "X";
      } else if(( board[1][1].equals("X") && board[2][2].equals("X") && board[0][0].equals("[]") )||( board[1][1].equals("O") && board[2][2].equals("O") && board[0][0].equals("[]") )) {
        board[0][0] = "X";
      }
      else if(( board[2][0].equals("X") && board[1][1].equals("X") && board[0][2].equals("[]") )||( board[2][0].equals("O") && board[1][1].equals("O") && board[0][2].equals("[]") )) {
        board[0][2] = "X";
      } else if(( board[2][0].equals("X") && board[0][2].equals("X") && board[1][1].equals("[]") )||( board[2][0].equals("O") && board[0][2].equals("O") && board[1][1].equals("[]") )) {
        board[1][1] = "X";
      } else if(( board[1][1].equals("X") && board[0][2].equals("X") && board[2][0].equals("[]") )||( board[1][1].equals("O") && board[0][2].equals("O") && board[2][0].equals("[]") )) {
        board[2][0] = "X";
      } else {
        //Otherwise chooses a random space to go
        boolean moveDone = false;
        while(moveDone == false) {
          int computerRow = rand.nextInt(3);
          int computerColumn = rand.nextInt(3);
          if(board[computerRow][computerColumn].equals("[]")) {
            board[computerRow][computerColumn] = "X";
            moveDone = true;
          }
        }
      }
      for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
          System.out.print(board[i][j] + "\t");
        }
        System.out.println();
      }
      //Checks if the computer won
      if(endCheck(board) == true) {
        userWin = 3;
        break;
      }
      if(tieCheck(board) == true) {
        userWin = 2;
        break;
      }
      //This is the same as the beginning, only it's now in the loop - user move
      System.out.println("Your move!");
      System.out.println("top/middle/bottom?");
      int userColumn = 0;
      int userRow = 0;
      String userRowIn = console.next();
      if(userRowIn.equals("top")) {
        userRow = 0;
      } else if(userRowIn.equals("middle")) {
        userRow = 1;
      } else if(userRowIn.equals("bottom")) {
        userRow = 2;
      }
      System.out.println("left/middle/right?");
      String userColumnIn = console.next();
      if(userColumnIn.equals("left")) {
        userColumn = 0;
      } else if(userColumnIn.equals("middle")) {
        userColumn = 1;
      } else if(userColumnIn.equals("right")) {
        userColumn = 2;
      }
      board[userRow][userColumn] = "O";
      //Checks to see if the user won
      if(endCheck(board) == true) {
        userWin = 1;
        break;
      }
      if(tieCheck(board) == true) {
        userWin = 2;
        end = true;
      }
    }
    //When the game is over, prints the board on last time
    System.out.println();
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + "\t");
      }
      System.out.println();
    }
    return userWin;
  }
  //Checks if the game is over via a win
  public static boolean endCheck(String[][] board) {
    boolean end = false;
    //checks all rows for 3 in a row
    for(int i = 0; i < 3; i++) {
      if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][2].equals("[]")) {
        end = true;
      }
    }
    //Checks all columns for 3 in a row
    for(int j = 0; j < 3; j++) {
      if(board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]) && !board[2][j].equals("[]")) {
        end = true;
      }
    }
    //Checks for diagonal 3 in a row
    if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[2][2].equals("[]")) {
      end = true;
    }
    //Checks for other diagonal 3 in a row
    if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[2][0].equals("[]")) {
      end = true;
    }
    return end;
  }
  public static boolean tieCheck(String[][] board) {
    if(!board[0][0].equals("[]") && !board[0][1].equals("[]") && !board[0][2].equals("[]") &&
      !board[1][0].equals("[]") && !board[1][1].equals("[]") && !board[1][2].equals("[]") &&
      !board[2][0].equals("[]") && !board[2][1].equals("[]") && !board[2][2].equals("[]")) {
      return true;
    } else {
      return false;
    }
  }
}
