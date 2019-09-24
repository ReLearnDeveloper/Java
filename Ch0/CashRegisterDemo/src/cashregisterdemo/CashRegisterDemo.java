/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregisterdemo;

/**
 *
 * @author Cristy
 */


import java.util.Scanner;
import java.text.DecimalFormat;

/**
   Demo program for the CashRegister class
   Chapter 9, Programming Challenge 7
*/

public class CashRegisterDemo
{
   public static void main(String[] args)
   {
      final int STARTING_UNITS = 50;   // Starting number of items
      final double ITEM_PRICE = 0.75;  // The price of the item
      String product = "Candy Bar";    // The item being purchased
      int quantity;                    // Quantity being purchased

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create a DecimalFormat object.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Create a RetailItem object.
      RetailItem item = new RetailItem("Candy bar", STARTING_UNITS,
                                       ITEM_PRICE);
      
      // Display the starting data for this item.
      System.out.println("Item being purchased: " + item.getDescription());
      System.out.println("Units on hand: " + item.getUnitsOnHand());
      System.out.println("Price: $" + dollar.format(item.getPrice()));
      
      // Get the quantity.
      System.out.print("How many candy bars are you buying? ");
      quantity = keyboard.nextInt();
      
      // Is the customer trying to buy more than we have?
      if (quantity > item.getUnitsOnHand())
      {
         System.out.println("Sorry, we only have " +
                            item.getUnitsOnHand() +
                            " in stock.");
      }
      else
      {
         // Create a CashRegister object.
         CashRegister reg = new CashRegister(item, quantity);
      
         // Display the sales data.
         System.out.println("Subtotal : $" +
                            dollar.format(reg.getSubtotal()));
         System.out.println("Sales tax : $" +
                            dollar.format(reg.getTax()));
         System.out.println("Total : $" +
                            dollar.format(reg.getTotal()));

         // Update the units on hand to account for the quantity
         // just purchased.
         item.setUnitsOnHand(item.getUnitsOnHand() - quantity);
      
         // Display the ending units on hand.
         System.out.println("Units on hand: " + item.getUnitsOnHand());
      }
   }
}
