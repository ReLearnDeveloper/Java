/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.ArrayList;
/**
 *
 * @author mtsguest
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Speakable> myPets = new ArrayList<Speakable>();
        
        Dog cocoPuff = new Dog();
        Dog caramel = new Dog();
        Dog shiloh = new Dog();
        
        Cat misty = new Cat();
        Cat oreo = new Cat();
        Cat pitipua = new Cat();
        
        Bird polly = new Bird();
        
        myPets.add(cocoPuff);
        myPets.add(caramel);
        myPets.add(shiloh);
        myPets.add(misty);
        myPets.add(polly);
        myPets.add(oreo);
        myPets.add(pitipua);
        
//        cocoPuff.speak();
//        caramel.speak();
        
        for (int i = 0; i < myPets.size(); i++)
        {
            System.out.println(myPets.get(i).speak());
        }






        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
