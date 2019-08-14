//Brandon Jiang
//gagdude@brandeis.edu
//10/17/16
//To create a set pattern, but I made it more modular
//No bugs

public class Problem2 {
  public static void main(String[] args) {
    //Running the method created to produce the pattern with 6 lines
    theMaker(6);
    }
    //This is what makes the pattern, the input "numero" is number of lines
    public static void theMaker(int numero) {
      //The big loop containing all the others creates each line
      for(int i = 0; i < numero; i++) {
        //This creates the first set of stars
        for(int j = numero-1-i; j > 0; j--) {
          System.out.print("*");
        }
        //This creates the first set of spaces
        for(int k = i; k >= 0; k--) {
          System.out.print(" ");
        }
        //This creates the set of forward slashes
        for(int l = 2*numero-2-2*i; l > 0; l--) {
          System.out.print("/");
        }
        //This creates the set of backward slashes
        for(int m = 1; m <= 2*i; m++) {
          System.out.print("\\");
        }
        //This creates the second set of spaces
        for(int k = i; k >= 0; k--) {
          System.out.print(" ");
        }
        //This creates the second set of stars
        for(int j = numero-1-i; j > 0; j--) {
          System.out.print("*");
        }
      System.out.println();
    }
  }
}
