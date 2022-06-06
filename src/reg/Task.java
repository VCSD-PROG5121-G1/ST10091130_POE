/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reg;

import javax.swing.JOptionPane;
import static reg.Reg.Duration;
import static reg.Reg.counter;
import static reg.Reg.descript;
import static reg.Reg.limit;
import static reg.Reg.one;
import static reg.Reg.sumOfDuration;
import static reg.Reg.taskFirstName;
import static reg.Reg.taskLastName;
import static reg.Reg.taskName;
import static reg.Reg.tasksEnter;

/**
 *
 * @author Coudjoe Jr
 */
public class Task {
    public static boolean checkTaskDescription(){
        if (limit <= 50){
          return true;  
        }
        else{
            return false;
        }
    }
   
    
    public void createTaskID(){
        for(int counter = 0; counter < tasksEnter; counter++){
          String taskName =JOptionPane.showInputDialog(null, "Task " + (counter+1) + "\n" + " Enter the name of the task to be performed: ");
          
          String descript = JOptionPane.showInputDialog(null, "Write a short description of the task: ");
          if(descript.length() == limit == true){
              JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
          }
          else{
              JOptionPane.showMessageDialog(null, "Task successfully captured.");
              String taskFirstName = JOptionPane.showInputDialog(null, "Enter your first name: ");
              String taskLastName = JOptionPane.showInputDialog(null, "Enter your last name: ");
              int Duration = Integer.parseInt(JOptionPane.showInputDialog(" Enter the estimated duration of the task in hours"));
              sumOfDuration += Duration;                                        // sumOfDuration = sumOfDuration + Duration.
              JOptionPane.showMessageDialog(null, "TASK ID" + "\n" + taskName.substring(0, 2) + ":" + (counter+1) + ":" + taskFirstName.substring(0, 3));
    }
        }         
}
    
    public void printTaskDetails(){
        JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + one + "\n" + "Developer Details: " + taskFirstName + " " + taskLastName + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName + "\"\n" + "Task ID: " + taskName.substring(0, 2) + ":" + (counter+1) + ":" + taskFirstName.substring(0, 3) + "\n" + "Task Description: \"" + descript + "\"\n" + "Duration: " + Duration + "hrs");
               
    }
    
    public void returnTotalHours(){
        int Duration = Integer.parseInt(JOptionPane.showInputDialog(" Enter the estimated duration of the task in hours"));
        sumOfDuration += Duration; 
         JOptionPane.showMessageDialog(null, "The sum of the all durations is: " + sumOfDuration);
    }
}
