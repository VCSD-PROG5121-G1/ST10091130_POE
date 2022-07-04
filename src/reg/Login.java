/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reg;

import javax.swing.JOptionPane;
import static reg.Reg.firstName;
import static reg.Reg.lastname;
import static reg.Reg.password;
import static reg.Reg.username;

/**
 *
 * @author Coudjoe Jr
 */

public class Login {
     public boolean checkUserName(){                                                 //This method makes sure that username contains "_" and is no more than 5 characters.
         boolean a = false;
        boolean b = true;
        //This method makes sure that username contains "_" and is no more than 5 characters.
        if(!(username.contains("_") && username.length() < 6)){
            
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
       
        return a;
        }
    else{
            
        JOptionPane.showMessageDialog(null, "Username successfully captured.");
       return b;
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
           
       }
       else{
           JOptionPane.showMessageDialog(null, "invalid data!");
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
}
