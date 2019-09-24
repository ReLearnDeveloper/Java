/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Owner
 */
/**
   This program demonstrates the Course class.
*/

public class CourseDemo
{
   public static void main(String[] args)
   {
      // Create an Instructor object.
      Instructor myInstructor =
          new Instructor("Kramer", "Shawn", "RH3010");
      
      // Create a TextBook object.
      Textbook myTextbook =
          new Textbook("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
                       
      // Create a Course object.
      Course myCourse = 
         new Course("Intro to Java", myInstructor,
                    myTextbook);
      
      // Display the course information.
      System.out.println(myCourse);
   }
}