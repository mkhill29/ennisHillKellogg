/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import citbyui.cit260.escapeFromChateau.exceptions.MathLockControlException;

/**
 *
 * @author Heidi Ennis
 */
public class MathLockControl {

    public static void halfTotalPerimeter(double triangleLockSideA, double triangleLockSideB, double triangleLockSideC) 
                            throws MathLockControlException { 
        if (triangleLockSideA > 99 || triangleLockSideA <= 0) {  //width out of range?
         throw new MathLockControlException("Number cannot be between 1 and 99!");
        }

        if (triangleLockSideB <= 0 || triangleLockSideB > 99) { //length out of range?
              }

        if (triangleLockSideC < 0 || triangleLockSideC > 99) { //length out of range?

        }
        }
        
        double halfPerimeter = (triangleLockSideA + triangleLockSideB + triangleLockSideC) / 2;

        return halfPerimeter;
    }
}
