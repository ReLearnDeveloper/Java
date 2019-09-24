/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfriendsarraylist;
import java.util.Scanner;
/**
 *
 * @author mtsguest
 */
public class BestFriendsArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        System.out.println("Welcome to the Best Friends' Contacts!");
        int menuOption;
        BestFriendArrayListHelper myHelper = new BestFriendArrayListHelper();
     
//put the following inside a do-while loop:
        {
            
            menuOption = displayMenu();
            switch (menuOption)
            {
                case 1:
                    System.out.println("calling add method");
                    myHelper.addAFriend();
                    break;
                case 2:
                    System.out.println("calling change method");
                    myHelper.changeAFriend();
                    break;
                case 3:
                    System.out.println("calling remove method");
                    myHelper.removeAFriend();
                    break;
                case 4:
                    System.out.println("calling display method");
                    myHelper.displayAFriend();
                    break;
                case 5:
                    System.out.println("Thanks for using BFF Contacts.");
                    break;
                default:
                    System.out.println("Sorry, you entered an invalid option.  Try Again.");
            }      
            
            
        }// loop if the option entered was not 5
        
     }
    
    public static int displayMenu()
    {
        int menuOption;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1. Add a Best Friend");
        System.out.println("2. Change a Best Friend");
        System.out.println("3. Remove a Best Friend");
        System.out.println("4. Display a Best Friend");
        System.out.println("5. Quit");
            
        menuOption = keyboard.nextInt();
        return menuOption;
    }
    
}
