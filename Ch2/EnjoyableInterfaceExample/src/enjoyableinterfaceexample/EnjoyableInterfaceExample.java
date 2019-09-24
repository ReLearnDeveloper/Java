/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enjoyableinterfaceexample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mtsguest
 */
public class EnjoyableInterfaceExample {

    /**
     * @param args the command line arguments
     */
    ArrayList<Enjoyable> myFun = new ArrayList<Enjoyable>();
    Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
       EnjoyableInterfaceExample myEnjoy = new EnjoyableInterfaceExample();
       myEnjoy.createFun();
       myEnjoy.summarizeFun();
        
        
    }
    
    public void createFun()
    {
        String name;
        String type;
        String location;
        int priceRange;
                
        int runtime;
        String genre;
        
        String waterType;
        boolean heated;
        //***************Restaurant *************************//
        System.out.println("What is your favorite restaurant? ");
        name = keyboard.nextLine();
        
        System.out.println("What type of food does it serve? ");
        type = keyboard.nextLine();
        
        System.out.println("Where is it located? ");
        location = keyboard.nextLine();
        
        System.out.println("What is the price range? (1=low, 2=med, 3= high");
        priceRange = keyboard.nextInt();
        keyboard.nextLine();
        
        Restaurant myFavRest = new Restaurant(name, type, location, priceRange);
        myFun.add(myFavRest);
        
        //****************** TV Program ***************************//
        System.out.println("What is the name of your favorite TV program? ");
        name = keyboard.nextLine();
        
        System.out.println("What is the duration of your fav TV pgm (in minutes)");
        runtime = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("What is the genre of your fav TV pgm? ");
        genre = keyboard.nextLine();
        
        TVProgram myFavTVPgm = new TVProgram(name, runtime, genre);
        myFun.add(myFavTVPgm);
        
        
        //*****************  Pool ****************************//
        System.out.println("What is the location of your favorite pool?");
        location = keyboard.nextLine();
        
        System.out.println("What is water type of your fav pool? ");
        waterType = keyboard.nextLine();
        
        System.out.println("Is your favorite pool heated (true or false)?");
        heated = keyboard.nextBoolean();
        
        Pool myFavPool = new Pool(location, waterType, heated);
        myFun.add(myFavPool);
        
        
    }
    
    public void summarizeFun()
    {
        
    }
    
    
    
    
    
    
}
