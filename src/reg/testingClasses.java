/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reg;

import javax.swing.JOptionPane;
import static reg.Reg.counter;
import static reg.Reg.found;
import static reg.Reg.limit;
import static reg.Reg.sumOfDuration;
import static reg.Reg.tasksEnter;

/**
 *
 * @author Coudjoe Jr
 */
public class testingClasses {
    public void populateArray(){
        
                
      int tasksEnter = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you wish to enter: "));
      String[] Developer = new String[tasksEnter];                      //Line 193 to 201 Arrays are populated.
     
      JOptionPane.showMessageDialog(null, Developer[tasksEnter]);
      
        }
    
    public void longestDuration(){
          int a = 0;
        while(a==tasksEnter){
                
      int tasksEnter = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you wish to enter: "));
      String[] tasks = new String[tasksEnter];
      String[] Developer = new String[tasksEnter];                      //Line 193 to 201 Arrays are populated.
      String[] taskName = new String[tasksEnter];
      String[] TaskID = new String[tasksEnter];
      int[] Duration = new int[tasksEnter];
      int[] Status = new int[tasksEnter];
      String[] descript = new String[tasksEnter];
      String[] taskFirstName = new String[tasksEnter];
      String[] taskLastName = new String[tasksEnter];
      
      if(tasksEnter==0){
          System.exit(0);           //when the user types 0 then the while loop ends.
      }
      
      for(int counter = 0; counter < tasksEnter; counter++){   //This is the for loop that allows the user to enter the number of tasks using loop counter.
          taskName[counter] = JOptionPane.showInputDialog(null, "Task " + (counter+1) + "\n" + " Enter the name of the task to be performed: ");
          descript[counter] = JOptionPane.showInputDialog(null, "Write a short description of the task: ");
          if(descript[counter].length() == limit == true){     // The number of characters in the decription should be less than the limit which is 50.
              JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
          }
          else{
              JOptionPane.showMessageDialog(null, "Task successfully captured.");    //From line 193 to 202 is where the user will enter the task details.
              Developer[counter] = JOptionPane.showInputDialog(null, "Enter your first name and last name: ");
              Duration[counter] = Integer.parseInt(JOptionPane.showInputDialog(" Enter the estimated duration of the task in hours"));
              sumOfDuration += Duration[counter];                                        // sumOfDuration = sumOfDuration + Duration.
              JOptionPane.showMessageDialog(null, "TASK ID" + "\n" + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3));
               Status[counter] = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a tas status " + "\n" + "1) To Do" + "\n" + "2) Done" + "\n" + "3) Doing"));
               String one = "To Do";
               String two = "Done";
               String three = "Doing";
               if(Status[counter] == 1){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + one + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");   // from line 204 to 211, this piece of code displays the Task details.
               }
               else if(Status[counter] == 2){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + two + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");
               }
               else if(Status[counter] == 3){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + three + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " +taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" +"Duration: " +Duration[counter] + "hrs");
               }
               
               JOptionPane.showMessageDialog(null, "The sum of the all durations is: " + sumOfDuration);
             
          }
    }
      int maxDuration = Duration[0];                        //Line 285 to 291 is code that displays details for task with the longest duration.
    for(int o = 0; o < Duration.length; o++){
        if(Duration[o] > maxDuration){
            maxDuration = Duration[o];
             JOptionPane.showMessageDialog(null, "The task with the longest duration is: " + Developer[o] + ", " + maxDuration + " hours");
        }
    } 
    }
    }
    
    public void searchTasks(){
                int a = 0;
        while(a==tasksEnter){
                
      int tasksEnter = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you wish to enter: "));
      String[] tasks = new String[tasksEnter];
      String[] Developer = new String[tasksEnter];                      //Line 193 to 201 Arrays are populated.
      String[] taskName = new String[tasksEnter];
      String[] TaskID = new String[tasksEnter];
      int[] Duration = new int[tasksEnter];
      int[] Status = new int[tasksEnter];
      String[] descript = new String[tasksEnter];
      String[] taskFirstName = new String[tasksEnter];
      String[] taskLastName = new String[tasksEnter];
      
      if(tasksEnter==0){
          System.exit(0);           //when the user types 0 then the while loop ends.
      }
      
      for(int counter = 0; counter < tasksEnter; counter++){   //This is the for loop that allows the user to enter the number of tasks using loop counter.
          taskName[counter] = JOptionPane.showInputDialog(null, "Task " + (counter+1) + "\n" + " Enter the name of the task to be performed: ");
          descript[counter] = JOptionPane.showInputDialog(null, "Write a short description of the task: ");
          if(descript[counter].length() == limit == true){     // The number of characters in the decription should be less than the limit which is 50.
              JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
          }
          else{
              JOptionPane.showMessageDialog(null, "Task successfully captured.");    //From line 193 to 202 is where the user will enter the task details.
              Developer[counter] = JOptionPane.showInputDialog(null, "Enter your first name and last name: ");
              Duration[counter] = Integer.parseInt(JOptionPane.showInputDialog(" Enter the estimated duration of the task in hours"));
              sumOfDuration += Duration[counter];                                        // sumOfDuration = sumOfDuration + Duration.
              JOptionPane.showMessageDialog(null, "TASK ID" + "\n" + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3));
               Status[counter] = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a tas status " + "\n" + "1) To Do" + "\n" + "2) Done" + "\n" + "3) Doing"));
               String one = "To Do";
               String two = "Done";
               String three = "Doing";
               if(Status[counter] == 1){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + one + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");   // from line 204 to 211, this piece of code displays the Task details.
               }
               else if(Status[counter] == 2){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + two + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");
               }
               else if(Status[counter] == 3){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + three + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " +taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" +"Duration: " +Duration[counter] + "hrs");
               }
               
               JOptionPane.showMessageDialog(null, "The sum of the all durations is: " + sumOfDuration);
             
          }
          
      }
        
         for(int i = 0; i < tasksEnter; i++ ){      //Line 240 to 250 code that searches for all the tasks with a task name and displays task name, developer and status.
         found = JOptionPane.showInputDialog(null, "Enter the name of the task that you want to find");
     if(found.equals(taskName[i])){
         JOptionPane.showMessageDialog(null,  """
                                                    Task found 
                                                    """ + taskName[i] + "\n" + Developer[i] + "\n" + Status[i]);
     }
     else{
             JOptionPane.showMessageDialog(null, "Task not found, Try again");
             }
    }
         
          for(int i = 0; i < tasksEnter; i++ ){   //Line 252 to 262 code that searches for al the tasks with a developer and displays the task name and task status.
         found = JOptionPane.showInputDialog(null, "Enter the name of the developer that you want to find");
     if(found.equals(Developer[i])){
         JOptionPane.showMessageDialog(null,  """
                                                    Task found 
                                                    """ + taskName[i] + "\n" + Developer[i] + "\n" + Status[i]);
     }
     else{
             JOptionPane.showMessageDialog(null, "Task not found, Try again");
             }
    }
    }
    
}

    public void DeleteTask(){
                int a = 0;
        while(a==tasksEnter){
                
      int tasksEnter = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you wish to enter: "));
      String[] tasks = new String[tasksEnter];
      String[] Developer = new String[tasksEnter];                      //Line 193 to 201 Arrays are populated.
      String[] taskName = new String[tasksEnter];
      String[] TaskID = new String[tasksEnter];
      int[] Duration = new int[tasksEnter];
      int[] Status = new int[tasksEnter];
      String[] descript = new String[tasksEnter];
      String[] taskFirstName = new String[tasksEnter];
      String[] taskLastName = new String[tasksEnter];
      
      if(tasksEnter==0){
          System.exit(0);           //when the user types 0 then the while loop ends.
      }
      
      for(int counter = 0; counter < tasksEnter; counter++){   //This is the for loop that allows the user to enter the number of tasks using loop counter.
          taskName[counter] = JOptionPane.showInputDialog(null, "Task " + (counter+1) + "\n" + " Enter the name of the task to be performed: ");
          descript[counter] = JOptionPane.showInputDialog(null, "Write a short description of the task: ");
          if(descript[counter].length() == limit == true){     // The number of characters in the decription should be less than the limit which is 50.
              JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
          }
          else{
              JOptionPane.showMessageDialog(null, "Task successfully captured.");    //From line 193 to 202 is where the user will enter the task details.
              Developer[counter] = JOptionPane.showInputDialog(null, "Enter your first name and last name: ");
              Duration[counter] = Integer.parseInt(JOptionPane.showInputDialog(" Enter the estimated duration of the task in hours"));
              sumOfDuration += Duration[counter];                                        // sumOfDuration = sumOfDuration + Duration.
              JOptionPane.showMessageDialog(null, "TASK ID" + "\n" + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3));
               Status[counter] = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a tas status " + "\n" + "1) To Do" + "\n" + "2) Done" + "\n" + "3) Doing"));
               String one = "To Do";
               String two = "Done";
               String three = "Doing";
               if(Status[counter] == 1){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + one + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");   // from line 204 to 211, this piece of code displays the Task details.
               }
               else if(Status[counter] == 2){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + two + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");
               }
               else if(Status[counter] == 3){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + three + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " +taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" +"Duration: " +Duration[counter] + "hrs");
               }
               
               JOptionPane.showMessageDialog(null, "The sum of the all durations is: " + sumOfDuration);
             
          }
          
      }
       int DeleteOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to delete a task: " + "\n" + "1) yes" + "\n" + "2) no"));
            if(DeleteOption == 1){      //The code in line 264 to 283 deletes a task using a task name.
                String[]newTasksName = new String[taskName.length-1];
                String taskToRemove = JOptionPane.showInputDialog(null, "Enter the name of the task to be removed: ");
                
                int indexLess = 0;
                
                for(int i = 0; i < taskName.length - 1; i++){
                    if(taskName[counter].equalsIgnoreCase(taskToRemove)){
                   newTasksName[indexLess] = taskName[i];
                   indexLess++;
                           JOptionPane.showMessageDialog(null, "Entry " + taskName[counter] + " Task deleted");
                           }
                    else{   
                        JOptionPane.showMessageDialog(null, "Invalid Task name!!!");
                    }
                    
                }
                
                
            }
    }
}
   
   public void DisplayReport(){
        int a = 0;
        while(a==tasksEnter){
                
      int tasksEnter = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you wish to enter: "));
      String[] tasks = new String[tasksEnter];
      String[] Developer = new String[tasksEnter];                      //Line 193 to 201 Arrays are populated.
      String[] taskName = new String[tasksEnter];
      String[] TaskID = new String[tasksEnter];
      int[] Duration = new int[tasksEnter];
      int[] Status = new int[tasksEnter];
      String[] descript = new String[tasksEnter];
      String[] taskFirstName = new String[tasksEnter];
      String[] taskLastName = new String[tasksEnter];
      
      if(tasksEnter==0){
          System.exit(0);           //when the user types 0 then the while loop ends.
      }
      
      for(int counter = 0; counter < tasksEnter; counter++){   //This is the for loop that allows the user to enter the number of tasks using loop counter.
          taskName[counter] = JOptionPane.showInputDialog(null, "Task " + (counter+1) + "\n" + " Enter the name of the task to be performed: ");
          descript[counter] = JOptionPane.showInputDialog(null, "Write a short description of the task: ");
          if(descript[counter].length() == limit == true){     // The number of characters in the decription should be less than the limit which is 50.
              JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
          }
          else{
              JOptionPane.showMessageDialog(null, "Task successfully captured.");    //From line 193 to 202 is where the user will enter the task details.
              Developer[counter] = JOptionPane.showInputDialog(null, "Enter your first name and last name: ");
              Duration[counter] = Integer.parseInt(JOptionPane.showInputDialog(" Enter the estimated duration of the task in hours"));
              sumOfDuration += Duration[counter];                                        // sumOfDuration = sumOfDuration + Duration.
              JOptionPane.showMessageDialog(null, "TASK ID" + "\n" + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3));
               Status[counter] = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a tas status " + "\n" + "1) To Do" + "\n" + "2) Done" + "\n" + "3) Doing"));
               String one = "To Do";
               String two = "Done";
               String three = "Doing";
               if(Status[counter] == 1){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + one + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");   // from line 204 to 211, this piece of code displays the Task details.
               }
               else if(Status[counter] == 2){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + two + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " + taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" + "Duration: " + Duration[counter] + "hrs");
               }
               else if(Status[counter] == 3){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + three + "\n" + "Developer Details: " + Developer[counter] + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName[counter] + "\"\n" + "Task ID: " +taskName[counter].substring(0, 2) + ":" + (counter+1) + ":" + Developer[counter].substring(0, 3) + "\n" + "Task Description: \"" + descript[counter] + "\"\n" +"Duration: " +Duration[counter] + "hrs");
               }
               
               JOptionPane.showMessageDialog(null, "The sum of the all durations is: " + sumOfDuration);
             
          }
          
      }
       for(int y = 0; y < tasksEnter; y++){          //Line 293 to 295 is code that displays a report that lists the full details of all captured tasks.
        JOptionPane.showMessageDialog(null, "Task Report" + "\n" +  "Task Status: " + Status[y] + "\n" + "Developer Details: " + Developer[y] + "\n" + "Task Number: " + (y+1) + "\n" + "Task Name: \"" + taskName[y] + "\"\n" + "Task ID: " + taskName[y].substring(0, 2) + ":" + (y+1) + ":" + Developer[y].substring(0, 3) + "\n" + "Task Description: \"" + descript[y] + "\"\n" + "Duration: " + Duration[y] + "hrs");
    }
   } 
   }
}
