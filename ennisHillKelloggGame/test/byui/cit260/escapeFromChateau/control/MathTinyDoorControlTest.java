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
 * @author Kristine Hill
 */
public class MathTinyDoorControlTest {
    
    public MathTinyDoorControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcFuelFills() {
        
        System.out.println("calcFuelFills");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("\tTest case #1");
        
        //Input values for test case 1
        
        double ouncesPerMinute = 20.0;
        double fuelCapacity = 24.0;
        double burnTime = 16.0;        
        double expResult = 2.0; //Expected output return value
        
        //Create instance of MathTinyDoorControl Class
        
        MathTinyDoorControl instance = new MathTinyDoorControl();
        
        //call function to run test
        double result = instance.calcFuelFills(ouncesPerMinute, fuelCapacity, burnTime);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    /********************************
         * Test Case #2
         *******************************/
    
        System.out.println("\tTest case #2");
        
        //Input values for test case 2
        
        ouncesPerMinute = -20.0;
        fuelCapacity = 24.0;
        burnTime = 16.0;
        
        expResult = -1.0; //Expected output return value
        
               
        //call function to run test
        result = instance.calcFuelFills(ouncesPerMinute, fuelCapacity, burnTime);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);   
    
        /********************************
         * Test Case #3
         *******************************/
    
        System.out.println("\tTest case #3");
        
        //Input values for test case 3
        
        ouncesPerMinute = 20.0;
        fuelCapacity = -24.0;
        burnTime = 16.0;
        
        expResult = -1.0; //Expected output return value
        
               
        //call function to run test
        result = instance.calcFuelFills(ouncesPerMinute, fuelCapacity, burnTime);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /********************************
         * Test Case #4
         *******************************/
    
        System.out.println("\tTest case #4");
        
        //Input values for test case 4
        
        ouncesPerMinute = 20.0;
        fuelCapacity = 24.0;
        burnTime = -16.0;
        
        expResult = -1.0; //Expected output return value
        
               
        //call function to run test
        result = instance.calcFuelFills(ouncesPerMinute, fuelCapacity, burnTime);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /********************************
         * Test Case #5
         *******************************/
    
        System.out.println("\tTest case #5");
        
        //Input values for test case 5
        
        ouncesPerMinute = 0.0;
        fuelCapacity = 24.0;
        burnTime = 16.0;
        
        expResult = -1.0; //Expected output return value
        
               
        //call function to run test
        result = instance.calcFuelFills(ouncesPerMinute, fuelCapacity, burnTime);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);  
        
        /********************************
         * Test Case #6
         *******************************/
    
        System.out.println("\tTest case #6");
        
        //Input values for test case 6
        
        ouncesPerMinute = 20.0;
        fuelCapacity = 240.0;
        burnTime = 16.0;
        
        expResult = 0.2; //Expected output return value  WHY IS THIS NOT RETURNING -1 AS AN INVALID INPUT???
        
               
        //call function to run test
        result = instance.calcFuelFills(ouncesPerMinute, fuelCapacity, burnTime);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);   
}
}
