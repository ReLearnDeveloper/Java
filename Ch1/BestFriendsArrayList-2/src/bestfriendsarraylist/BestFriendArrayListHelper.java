/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfriendsarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mtsguest
 */
public class BestFriendArrayListHelper {
    ArrayList<BestFriend> myBFFs;
    Scanner keyboard;
    
    public BestFriendArrayListHelper()
    {
        myBFFs = new ArrayList<BestFriend>();
        keyboard = new Scanner(System.in);
        
    }
    
    public void addAFriend()
    {
        //1. Ask & get user for firstName, lastName, nickName, cellPhone, email
        //2. Create a new BestFriend object called myFriend
        //3. Add the myFriend object to myBFFs arrayList
        
        
    }
    
    public void changeAFriend()
    {
        //1.  call search method
        //2.  if -1 give a message that says "Not found."  Otherwise:
        //3.  Get the object at the index returned from search
        //4.  Ask the user for new information
        //5.  Use the set to change the object
        //6.  Put the object back into the arrayList (set)
        
    }
    
    public void removeAFriend()
    {
         //1. call search method
        //2.  if -1 give a message that says "Not found."  Otherwise:
        //3.  Get the object at the index returned from search
        //4.  Are you sure you want to remove them?  
        //    If the user says YES, then remove the object from the arraylist
        //    otherwise leave the object in the arrayList
    }
    
    public void displayAFriend()
    {
        //1.  Ask user if they wish to display ALL or just 1
        //2.  If the user said ALL, then
        //        use a for-loop with myBFFs.size()
        //        & use the get method of the arrayList
        //        & print each object from arrayList
        //3.  else
        //       call search method
        //       if -1 give a message that says "Not found."  Otherwise:
        //       Get the object at the index returned from search & display it
    }
    
    public int searchAFriend()
    {
        //1. Ask the user for 3 values:  firstName, lastName, nickName
        //2. Instantiate a searchObject  (use overloaded constructor that has only 3 parameters)      
        // Sequentially search the arrayList for the searchObject:
        //3. Use a do-while loop to search for the object in the arrayList that matches the searchObject
        //       int i = -1;
        //       do {
        //                 i++;
        //             } while (i < myBFFs.size() && !(searchObject.equals(myBFFs.get(i)) );
        //
        //4. if (i < myBFFS.size() && searchObject.equals(myBFFs.get(i))
        //      return i;
        //   else
        //      return -1;
        return -1;
        
        
        
  
    }
    
}
