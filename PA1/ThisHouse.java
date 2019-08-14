//Brandon Jiang
//gagdude@brandeis.edu
//9/2/16
//To write a nursery rhyme with as efficient coding as possible
//No bugs
public class ThisHouse {
  //puts the puzzle together; different methods are different pieces
  public static void main(String[] args) {
    first ();
    thisIs ();
    malt ();
    bottom1 ();
    thisIs ();
    rat ();
    bottom2 ();
    thisIs ();
    cat ();
    bottom3 ();
    thisIs ();
    dog ();
    bottom4 ();
    thisIs ();
    cow ();
    bottom5 ();
    thisIs ();
    maiden ();
    bottom6 ();
  }
  //adds two prases together, first line of poem
  public static void first () {
    thisIs ();
    house ();
    System.out.println ();
  }
  //different stanzas of the poem
  public static void bottom1 () {
    thatLay ();
    house ();
    System.out.println ();
  }
  public static void bottom2 () {
    thatAte ();
    bottom1 ();
  }
  public static void bottom3 () {
    thatKilled ();
    bottom2 ();
  }
  public static void bottom4 () {
    thatWorried ();
    bottom3 ();
  }
  public static void bottom5 () {
    thatTossed ();
    bottom4 ();
  }
  public static void bottom6 () {
    thatMilked ();
    bottom5 ();
  }
  //different phrases of the poem
  public static void thisIs () {
    System.out.print ("This is the");
  }
  public static void malt () {
    System.out.println (" malt");
  }
  public static void rat () {
    System.out.println (" rat,");
  }
  public static void cat () {
    System.out.println (" cat,");
  }
  public static void dog () {
    System.out.println (" dog,");
  }
  public static void cow () {
    System.out.println (" cow with the crumpled horn,");
  }
  public static void maiden () {
    System.out.println (" maiden all forlorn");
  }
  public static void thatLay () {
    System.out.print ("That lay in the");
  }
  public static void thatAte () {
    System.out.println ("That ate the malt");
  }
  public static void thatKilled () {
    System.out.println ("That killed the rat,");
  }
  public static void thatWorried () {
    System.out.println ("That worried the cat,");
  }
  public static void thatTossed () {
    System.out.println ("That tossed the dog,");
  }
  public static void thatMilked () {
    System.out.println ("That milked the cow with the crumpled horn,");
  }
  public static void house () {
    System.out.println (" house that Jack built.");
  }
}
