/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poepart1.Login;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
  
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        boolean expResult = false;
        boolean result= Login.checkUserName(username);
        assertEquals(expResult, result);
       
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testcheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean  result = Login.checkPasswordComplexity(password);
        assertEquals(expResult, result);
       
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testcheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String phonenumber = "";
        boolean expResult = false;
        boolean  result = Login.checkPhoneNumber(phonenumber);
        assertEquals(expResult, result);
       
        Object fail = fail("The test case is a prototype.");
    
}
}
