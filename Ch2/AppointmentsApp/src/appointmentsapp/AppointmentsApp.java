/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentsapp;

/**
 *
 * @author Cristy
 */
public class AppointmentsApp {
    public Appointment[] myAppointments;
    public int currentSize = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         AppointmentsApp myApp = new AppointmentsApp();
         
        //call 2 methods:
        //  myApp.makeAppointments();
        //  myApp.checkAppointments();

    }
    
    //In the makeAppointments method, do the following:
        /**
        * 
        * 
        * How many appointments do you wish to make? 3
        * 
        * Use the number entered by user to instantiate the array of appointments to that size.
        * 
        * Create a menu for-loop as follows:
            Please make a selection:
            1. One Time Appointment
            2. Daily Appointment 
            3. Monthly Appointment 
            * 
            * For Each option, call a specific method that will request the appropriate data from the user, 
            * and then instantiate the appropriate class/subclass in the Appointment hierarchy
            * For each appointment made, you will add it to the global array of appointments at the currentSize,
            * and increment a currentSize global variable that keeps track of the next empty slot in the array.
            * 
            * 
            * 
            * 
            * 
    //In the checkAppointments method, do the following:
        * Inside a do-while loop, ask the user the following questions:
            * What is the date you wish to look up in your Appointments' Calendar? 
                    Enter the month: 03
                    Enter the day: 15
                    Enter the year: 2017
                
                * (Display the result in the following format:)   
                * 
                * On 3 / 15 / 2017 you have the following appointments: 
                    Dentist appointment with Dr. Smith at 13:30
                    Piano Lessons with Ms. Katie at 17:30
                    Athletic Training with Ms. Jones at 10:00

                Do you wish to look up another date? 
                   (If they answer NO, exit the program with message)
                  “Thank  you for using your appointment calendar.”

                    (If they answer YES, continue to loop.


        */
        
        
        
    }
    
}
