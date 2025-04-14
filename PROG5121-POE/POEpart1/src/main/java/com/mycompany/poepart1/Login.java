/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author RC_Student_lab
 */

public class Login {

    /**
     *
     * @param username
     * @return
     */
    public static boolean checkUserName(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean checkPasswordComplexity(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean checkPhoneNumber(String phonenumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String firstname;
    private String cellPhoneNumber;
    private String username;
    private String password;
    


    public Login(String firstname, String cellphoneNumber, String username, String password){
        this.firstname = firstname;
        this.cellPhoneNumber = cellphoneNumber;
        this.username = username;
        this.password = password;
  
    }

   

public class checkUserName {

    // Simulating a user database (username -> password)
    private static Map<String, String> userDatabase = new HashMap<>();

    // Example: Pre-registering some users
    static {
        userDatabase.put("ngc_1", "pass123");
        userDatabase.put("jane_smith", "mypassword");
    }


    public static boolean checkUserName(String username) {
        // Check if username length is valid
        if (username.length() <= 5) {
            System.out.println("Username must be 5 characters");
            return false;
        }

        // Check if username contains only valid characters (letters, digits, underscores, and dots)
        if (!username.matches("^[a-zA-Z0-9._]+$")) {
            System.out.println("Username can only contain letters, digits, underscores, and dots.");
            return false;

        }

        
        return true;
    }

    private boolean checkPasswordComplexity(String password1){
    
    
        if (password.length()<= 8){
            System.out.println("password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            return false;
        }
        String upperCasePattern = ".*[A-Z].*";
        String lowerCasePattern = ".*[a-z].*";
        String digitPattern = ".*[1-9].*";
        String specialCharacterPattern = ".*[!@#$%^&*].*";
        
        if (!password.matches(upperCasePattern)){
        System.out.println("password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        return false;
        }
        if (!password.matches(lowerCasePattern)){
        System.out.println("password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        return false;
        }
        if (!password.matches(digitPattern)){
            System.out.println("password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            return false;
        }
        if (!password.matches(specialCharacterPattern)){
        System.out.println("password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        return false;
        }
        return true;
                }
    {
        System.out.println("Enter Password");
        boolean isStrong = checkPasswordComplexity(password);
                System.out.println("Password successfully captured."+ isStrong);
            }
    
    //chatGPT
    
   public class checkPhoneNumber {

    public static boolean checkCellPhoneNumber(String number) {
        if (number == null || number.isEmpty()) {
            return false;
        }
        String cleaned = number.replaceAll("[\\s\\-()]", "");
        
        String regex = "^(0[6-8][0-9]{8}|\\+27[6-8][0-9]{8})$";

        return cleaned.matches(regex);
    }

    // Example 
    public static void main(String[] args) {
        System.out.println(checkCellPhoneNumber("0821234567"));     // true
        System.out.println(checkCellPhoneNumber("+27821234567"));   // true
        System.out.println(checkCellPhoneNumber("0123456789"));     // false
        System.out.println(checkCellPhoneNumber("+27123456789"));   // false
    }
public class RegsterUser {

    public static String registerUser(String username, String cellnumber, String password) {
        
        if (username == null || username.isEmpty()) {
            return "Username is not formatted, please ensure that your username contains an underscore and is no more then 5 characters";
        }
        if (cellnumber == null || !cellnumber.matches("[0-9]")) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
                    }
        if (password == null || password.length() < 6) {
            return "password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

      
        System.out.println("Saving user: " + username + ", " + cellnumber);

        return "Registration successful for user: " + username;
    }

    // Example 
    public static void main(String[] args) {
        String result = registerUser("ngc_1", "+27839739669", "pass123");
        System.out.println(result);

        String failResult = registerUser("", "0787610711", "123");
        System.out.println(failResult);
    }


public class UserLogin {

    
    private static Map<String, String> userDatabase = new HashMap<>();

    
    static {
        userDatabase.put("ngc_1", "pass123");
        userDatabase.put("jane_smith", "mypassword");
    }

 
     
    public static boolean loginUser(String username, String password) {
        
        if (userDatabase.containsKey(username)) {
          
            String storedPassword = userDatabase.get(username);
            return storedPassword.equals(password);
        }
        
        return false;
    }


   
    static {
        userDatabase.put("john_doe", "password123");
        userDatabase.put("jane_smith", "mypassword");
    }

    
    public static String returnLoginStatus(String username, String password) {
       
        if (!userDatabase.containsKey(username)) {
            return "Login failed: Username does not exist.";
        }

        
        String storedPassword = userDatabase.get(username);
        if (storedPassword.equals(password)) {
            return "Login successful for user: " + username;
        } else {
            return "Login failed: Incorrect password.";
        }
    
    }
}
}
   }
}
}
    
    


    
    
    

