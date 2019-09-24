/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo;
import java.util.Scanner;

/**
 *
 * @author mtsguest
 */
public class EmployeeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myKeyboard = new Scanner(System.in);
        int hoursWorked;
         
        Employee [] myEmployees = new Employee[5];
        
        HourlyEmployee pluto = new HourlyEmployee("Pluto", "Woof", 2.75);
        HourlyEmployee minnie = new HourlyEmployee("Minnie", "Mouse", 4.50);
        
        SalariedEmployee mickey = new SalariedEmployee("Mikey", "Mouse", 100000.75);
        SalariedEmployee goofy = new SalariedEmployee("Goofy", "Dog", 85000.35);
        
        Manager walt = new Manager("Walt", "Disney", 500000, 47000);
        
        myEmployees[0]= walt;
        myEmployees[1] = mickey;
        myEmployees[2] = goofy;
        myEmployees[3] = minnie;
        myEmployees[4] = pluto;
        
        for (int i = 0; i< myEmployees.length; i++)
        {
            System.out.println("How many hours did " + myEmployees[i].getFirstName() + " work this past week?");
            hoursWorked = myKeyboard.nextInt();
            
            System.out.println("The weekly pay for " + myEmployees[i].getFirstName() + " is " + myEmployees[i].weeklyPay(hoursWorked));
            
        
        }
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
