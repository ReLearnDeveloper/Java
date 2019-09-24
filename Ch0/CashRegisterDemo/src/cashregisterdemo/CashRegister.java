/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregisterdemo;

/**
   CashRegister class
   Chapter 9, Programming Challenge 7
*/

public class CashRegister
{
   private final double TAX_RATE = 0.06;  // Sales tax rate
   private double retail;                 // Retail price
   private int quantity;                  // Quantity purchased
   
   /**
      Constructor
      @param item A RetailItem object representing the item
                  being purchased.
      @param q The quantity of items being purchased.
   */
   
   public CashRegister(RetailItem item, int q)
   {
      retail = item.getPrice();
      quantity = q;
   }
   
   /**
      The getSubtotal method calculates the subtotal
      of the sale.
      @return The subtotal amount.
   */
   
   public double getSubtotal()
   {
      return retail * quantity;
   }
   
   /**
      The getTax method calculates the sales tax
      for the sale.
      @return The sales tax amount.
   */
   
   public double getTax()
   {
      return getSubtotal() * TAX_RATE;
   }
   
   /**
      The getTotal method calculates the total
      of the sale.
      @return The total amount.
   */
   
   public double getTotal()
   {
      return getSubtotal() + getTax();
   }
}