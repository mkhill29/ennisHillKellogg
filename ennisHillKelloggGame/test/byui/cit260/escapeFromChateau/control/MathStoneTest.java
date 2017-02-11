/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amikellogg
 */
public class MathStoneTest {
    
    public MathStoneTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSurfaceArea() {
         System.out.println("surfaceArea"); 
        /******************************
         * Test Case #1
         *****************************/
        
        System.out.println("\tTest case #1");
        
        //Input values for Test Case #1
        double length = 5.0;
                
        double width = 4.0;
                
        double height = 7.0;
                
        double expResult = 166.0; //Expected output returned value
                
                
        //Create instance of MathStone class 
        
        MathStone instance = new MathStone();
        
        //Call function to run test
        
       double result = instance.surfaceArea(length, width, height);
        
        //Compare expected return value with actual value returned
        
        assertEquals(expResult, result, 0.0001);
        
        /******************************
         * Test Case #2
         *****************************/
        
        System.out.println("\tTest case #2");
        
        //Input values for Test Case #2
        
        width = 4.0;
                
        length = 7.0;
                
        height = 5.0;
                
        expResult = 166.0; //Expected output returned value
                
               
        
        //Call function to run test
        
       result = instance.surfaceArea(length, width, height);
        
        //Compare expected return value with actual value returned
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /******************************
         * Test Case #3
         *****************************/
        
        System.out.println("\tTest case #3");
        
        //Input values for Test Case #3
        
        width = 7.0;
                
        length = 5.0;
                
        height = 4.0;
                
        expResult = 166.0; //Expected output returned value
                
  
        
        //Call function to run test
        
      result = instance.surfaceArea(length, width, height);
        
        //Compare expected return value with actual value returned
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /******************************
         * Test Case #4
         *****************************/
        
        System.out.println("\tTest case #4");
        
        //Input values for Test Case #4
        
         width = 5.0;
                
         length = 7.0;
                
        height = 4.0;
                
         expResult = 166.0; //Expected output returned value
                
                
    
        
        //Call function to run test
        
       result = instance.surfaceArea(length, width, height);
        
        //Compare expected return value with actual value returned
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /******************************
         * Test Case #5
         *****************************/
        
        System.out.println("\tTest case #5");
        
        //Input values for Test Case #5
        
         width = 4.0;
                
        length = 5.0;
                
         height = 7.0;
                
         expResult = 166.0; //Expected output returned value
                
                
        
        //Call function to run test
        
        result = instance.surfaceArea(length, width, height);
        
        //Compare expected return value with actual value returned
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
       /******************************
         * Test Case #6
         *****************************/
        
        System.out.println("\tTest case #6");
        
        //Input values for Test Case #6
        
         width = 7.0;
                
         length = 4.0;
                
         height = 5.0;
                
         expResult = 166.0; //Expected output returned value
 
        
        //Call function to run test
        
        result = instance.surfaceArea(length, width, height);
        
        //Compare expected return value with actual value returned
        
        assertEquals(expResult, result, 0.0001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
      
 
    }
}
