//Brandon Jiang
//gagdude@brandeis.edu
//9/29/16
//Given inputs of name, price, and quantity of items, output a bill with a tax rate of 6.25%
//No bugs

import java.util.*;

public class Problem4 {
  public static void main(String[] args) {
      //Requesting info for item 1
      System.out.println("Input name of item 1: ");
      Scanner console = new Scanner(System.in);
      String name1 = console.next();

      System.out.println("Input quantity of item 1: ");
      Scanner console1 = new Scanner(System.in);
      int quantity1 = console1.nextInt();

      System.out.println("Input price of item 1: ");
      Scanner console2 = new Scanner(System.in);
      double price1 = console2.nextDouble();

      //Requesting info for item 2
      System.out.println("Input name of item 2: ");
      Scanner console3 = new Scanner(System.in);
      String name2 = console3.next();

      System.out.println("Input quantity of item 2: ");
      Scanner console4 = new Scanner(System.in);
      int quantity2 = console4.nextInt();

      System.out.println("Input price of item 2: ");
      Scanner console5 = new Scanner(System.in);
      double price2 = console5.nextDouble();

      //Requesting info for item 3
      System.out.println("Input name of item 3: ");
      Scanner console6 = new Scanner(System.in);
      String name3 = console6.next();

      System.out.println("Input quantity of item 3: ");
      Scanner console7 = new Scanner(System.in);
      int quantity3 = console7.nextInt();

      System.out.println("Input price of item 3: ");
      Scanner console8 = new Scanner(System.in);
      double price3 = console8.nextDouble();

      //Defining strings for use in printf
      String item = "Item";
      String quantity = "Quantity";
      String price = "Price";
      String total = "Total";
      String subtotal = "Subtotal";
      String taxNumber = "6.25% sales tax";
      //Calculating values of subtotal, tax, and total price
      double itemTotal = itemPrice(quantity1, price1) + itemPrice(quantity2, price2) + itemPrice(quantity3, price3);
      double taxTotal = itemTotal*.0625;
      double finalPrice = taxTotal + itemTotal;

      System.out.println();
      System.out.println("Your bill");
      //The table giving summary of items, quantity, price, and total price for a specific item
      System.out.printf("%-30s %-10s %-10s %-10s\n", item, quantity, price, total);
      System.out.printf("%-30s %-10d %-10.2f %-10.2f\n", name1, quantity1, price1, itemPrice(quantity1, price1));
      System.out.printf("%-30s %-10d %-10.2f %-10.2f\n", name2, quantity2, price2, itemPrice(quantity2, price2));
      System.out.printf("%-30s %-10d %-10.2f %-10.2f\n\n", name3, quantity3, price3, itemPrice(quantity3, price3));
      //The summary values of the receipt; give subtotal, tax, and total price to be paid
      System.out.printf("%-52s %-10.2f\n", subtotal, itemTotal);
      System.out.printf("%-52s %-10.2f\n", taxNumber, taxTotal);
      System.out.printf("%-52s %-10.2f\n\n", total, finalPrice);

  }
  //Static method to calculate the total price of a specific item
  public static double itemPrice(int quantity, double price) {
    double sumPrice = quantity*price;
    return sumPrice;
  }
}
