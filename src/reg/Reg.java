/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reg;
import javax.swing.JOptionPane;


/**
 *
 * @author Coudjoe Jr
 */


public class Reg {
static String firstName, lastname, username, password, taskFirstName, taskLastName, taskName, descript, one, two, three;
static int option, Duration, counter = 0, tasksEnter;
static int limit = 50;
static int sumOfDuration = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
     
     firstName = JOptionPane.showInputDialog("Enter your first name: ");
     lastname = JOptionPane.showInputDialog("Enter your last name: ");
     username = JOptionPane.showInputDialog("Enter your username: ");
     password = JOptionPane.showInputDialog("Enter your password: ");
     
     if(!(username.contains("_") && username.length() < 6)){
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
       }
    else{
        JOptionPane.showMessageDialog(null, "Username successfully captured.");
       
    }
     
      boolean hasNum = false; boolean hasCap = false; boolean hasLow = false; char c;
      for(int i = 0; i < password.length(); i++){
       c = password.charAt(i);
       if(Character.isDigit(c)){
           hasNum = true;
       }
       else if(Character.isUpperCase(c)){
           hasCap = true;
       }
       else if(Character.isLowerCase(c)){
           hasLow = true;
       }
       
   }
      
     if(hasNum && hasCap && hasLow == true && password.length() > 7){
           JOptionPane.showMessageDialog(null,"\n" + "Password successfully captured.");
       }
       else{
           JOptionPane.showMessageDialog(null,"\n" + "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special case");
       }
     
     if(username.contains("_") && username.length() < 6 && hasNum && hasCap && hasLow == true && password.length() > 7){   
        Login(username, password, firstName, lastname);
     }
      
     
    
     
             
    }

    private static void Login(String username, String password, String firstName, String lastname) {                //This Login() method will be called only once both username and password meets the requirements.
     String password1;
     String username1;
     
     username1 = JOptionPane.showInputDialog("OK NOW LETS LOGIN" + "\n" + "Enter your username: ");
     password1 = JOptionPane.showInputDialog("Enter your password: ");
     
     if(username1.equals(username) && password1.equals(password)){
         JOptionPane.showMessageDialog(null, "You have logged in");
         JOptionPane.showMessageDialog(null, "Welcome " + firstName + " , " + lastname + " it is great to see you again" );
         EasyKanban(option);
           
       }
       else{ 
           JOptionPane.showMessageDialog(null, "invalid data!");
           JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
       }
    
    }
    
    
    public void checkUserName(){                                                 //This method makes sure that username contains "_" and is no more than 5 characters.
        if(!(username.contains("_") && username.length() < 6)){
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
       }
    else{
        JOptionPane.showMessageDialog(null, "Username successfully captured.");
       
    }  
    }
    
    
    public void checkPasswordComplexity(){                                       //This method makes sure that the password meets all 4 of the password complexities.
        boolean hasNum = false; boolean hasCap = false; boolean hasLow = false; char c;
      for(int i = 0; i < password.length(); i++){
       c = password.charAt(i);
       if(Character.isDigit(c)){
           hasNum = true;
       }
       else if(Character.isUpperCase(c)){
           hasCap = true;
       }
       else if(Character.isLowerCase(c)){
           hasLow = true;
       }
       
   }
     if(hasNum && hasCap && hasLow == true && password.length() > 7){
           JOptionPane.showMessageDialog(null,"\n" + "Password successfully captured.");
       }
       else{
           JOptionPane.showMessageDialog(null,"\n" + "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special case");
       }  
    }
    
    
    public void loginUser(){                                                     //This method makes sure that the username and password from register matches the username and password when you login.
     String password1;
     String username1;
     
     username1 = JOptionPane.showInputDialog("OK NOW LETS LOGIN" + "\n" + "Enter your username: ");
     password1 = JOptionPane.showInputDialog("Enter your password: ");
     
     if(username1.equals(username) && password1.equals(password)){
         JOptionPane.showMessageDialog(null, "You have logged in");
         JOptionPane.showMessageDialog(null, "Welcome " + firstName + " , " + lastname + " it is great to see you again" ); 
       }
       else{
           JOptionPane.showMessageDialog(null, "invalid data!");
           JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
       } 
    }
    
    
    public void returnLoginStatus(String username1, String password1){           //This method returns the necessary messaging for a successful login or a failed login.
       if(username1.equals(username) && password1.equals(password)){
         JOptionPane.showMessageDialog(null, "You have logged in");
         JOptionPane.showMessageDialog(null, "Welcome " + firstName + " , " + lastname + " it is great to see you again" );  
       }
       else{
           JOptionPane.showMessageDialog(null, "invalid data!");
           JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
       }  
    }
    
    
    public static void EasyKanban(int option){
      JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
      
      option = Integer.parseInt(JOptionPane.showInputDialog(null, "choose one of the following features:" + "\n" + "1) Add tasks" + "\n" + "2) Show report" + "\n" + "3) Quit"));
      if(option == 1){
          Task();
      }
      else if(option == 2){
          JOptionPane.showMessageDialog(null, "Coming soon");
      }
      else{
          System.exit(0);
      }
    }
    
    public static boolean isFifty(int limit){
        if (limit <= 50){
          return true;  
        }
        else{
            return false;
        }
    }
    
    public static void Task(){
      int tasksEnter = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you wish to enter: "));
      String[] tasks = new String[tasksEnter];
      
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
               int Status = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a tas status " + "\n" + "1) To Do" + "\n" + "2) Done" + "\n" + "3) Doing"));
               String one = "To Do";
               String two = "Done";
               String three = "Doing";
               if(Status == 1){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + one + "\n" + "Developer Details: " + taskFirstName + " " + taskLastName + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName + "\"\n" + "Task ID: " + taskName.substring(0, 2) + ":" + (counter+1) + ":" + taskFirstName.substring(0, 3) + "\n" + "Task Description: \"" + descript + "\"\n" + "Duration: " + Duration + "hrs");
               }
               else if(Status == 2){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + two + "\n" + "Developer Details: " + taskFirstName + " " + taskLastName + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName + "\"\n" + "Task ID: " + taskName.substring(0, 2) + ":" + (counter+1) + ":" + taskFirstName.substring(0, 3) + "\n" + "Task Description: \"" + descript + "\"\n" + "Duration: " + Duration + "hrs");
               }
               else if(Status == 3){
                   JOptionPane.showMessageDialog(null, "FULL DETAILS: " + "\n" + "Task Status: " + three + "\n" + "Developer Details: " + taskFirstName + " " + taskLastName + "\n" + "Task Number: " + (counter+1) + "\n" + "Task Name: \"" + taskName + "\"\n" + "Task ID: " +taskName.substring(0, 2) + ":" + (counter+1) + ":" + taskFirstName.substring(0, 3) + "\n" + "Task Description: \"" + descript + "\"\n" +"Duration: " +Duration + "hrs");
               }
               
               JOptionPane.showMessageDialog(null, "The sum of the all durations is: " + sumOfDuration);
             
          }
          
        
        
             
          
         
      }
    }
}
