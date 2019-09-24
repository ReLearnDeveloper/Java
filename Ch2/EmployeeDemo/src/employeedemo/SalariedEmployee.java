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
public class SalariedEmployee extends Employee{
    
    private double annualSalary;
    
    public SalariedEmployee(String aFirstName, String aLastName, double anAnnualSalary)
    {
        super(aFirstName, aLastName);
        annualSalary = anAnnualSalary;
        
    }
    
    public void setAnnualSalary(double anAnnualSalary)
    {
        annualSalary = anAnnualSalary;
    }
    
    public double getAnnualSalary()
    {
        return annualSalary;
    }
    
    public double weeklyPay(int hours)
    {
         final int WEEKS_PER_YEAR = 52;
         double pay = annualSalary/ WEEKS_PER_YEAR;
         return pay;
    }
            
            
            
            
            
    
    
    
}
