/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo;

/**
 *
 * @author mtsguest
 */
public class Employee {
    
    private String firstName;
    private String lastName;
  //  private double hoursWorked;
    
    public Employee()
    {
        firstName = null;
        lastName = null;
    }
    public Employee(String aFirstName, String aLastName)
    {
        firstName = aFirstName;
        lastName = aLastName;
     //   hoursWorked = anHoursWorked;
    }
    
    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    
    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }
    
  /*  public void setHoursWorked(double anHours)
    {
        hoursWorked = anHours;
    }
    */
    
    public String getFirstName()
    {
       return firstName; 
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
   /* public double getHoursWorked()
    {
        return hoursWorked;
    }
    */
    
    public double weeklyPay(int hours)
    {
        return hours;
    }
    
}
