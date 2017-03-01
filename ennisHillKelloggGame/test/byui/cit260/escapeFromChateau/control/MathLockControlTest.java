/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heidi Ennis
 */
public class MathLockControlTest {

    public MathLockControlTest() {
    }

    /**
     * Test of halfTotalParimeter method, of class MathLockControl.
     */
    @Test
    public void testHalfTotalPerimeter() {

        System.out.println("\tTest case #1");
        /**
         * ****************************
         * Test Case #1
         ***************************
         */
   
        double triangleLockSideA = 3.0;

        double triangleLockSideB = 4.0;

        double triangleLockSideC = 5.0;

        double expResult = 6.0; //Expected output returned value

        //Create instance of MathLockControl class 
        MathLockControl instance = new MathLockControl();

        //Call function to run test
        double result = instance.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);

        //Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        /**
         * ****************************
         * Test Case #2
         ***************************
         */
        System.out.println("\tTest case #2");

        //Input values for Test Case #2
        triangleLockSideA = -3.0;

        triangleLockSideB = 4.0;

        triangleLockSideC = 5.0;

        expResult = -1.0; //Expected output returned value

        //Call function to run test
        result = instance.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);

        //Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /**
         * ****************************
         * Test Case #3
         ***************************
         */
        System.out.println("\tTest case #3");

        //Input values for Test Case #3
        triangleLockSideA = 2.0;

        triangleLockSideB = -1.0;

        triangleLockSideC = 5.0;

        expResult = -1.0; //Expected output returned value

        //Call function to run test
        result = instance.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);

        //Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /**
         * ****************************
         * Test Case #4 
         ******************************
              */
        System.out.println("\tTest case #4");

        //Input values for Test Case #4
        triangleLockSideA = 2.0;

        triangleLockSideB = 5.0;

        triangleLockSideC = -1;

        expResult = -1.0; //Expected output returned value

        //Call function to run test
        result = instance.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);

        //Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /**
         * ****************************
         * Test Case #5 ***************************
         */
        System.out.println("\tTest case #5");

        //Input values for Test Case #5
        triangleLockSideA = 0;

        triangleLockSideB = 2.0;

        triangleLockSideC = 1;

        expResult = -1.0; //Expected output returned value

        //Call function to run test
        result = instance.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);

        //Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /**
         * ****************************
         * Test Case #6 
         ***************************
         */
        System.out.println("\tTest case #6");

        //Input values for Test Case #6
        triangleLockSideA = 3;

        triangleLockSideB = 150;

        triangleLockSideC = 1;

        expResult = -1.0; //Expected output returned value

        //Call function to run test
        result = instance.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);

        //Compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);

    }

}
