/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

/**
 *
 * @author Heidi Ennis
 */
public class MathLockControl {

    public double halfTotalParimeter(double triangleLockSideA, double triangleLockSideB, double triangleLockSideC) {

        if (triangleLockSideA > 99 || triangleLockSideA < 0) {  //width out of range?
            return -1;
        }

        if (triangleLockSideB < 0 || triangleLockSideB > 99) { //length out of range?

            return -1;
        }

        if (triangleLockSideC < 0 || triangleLockSideC > 99) { //length out of range?

            return -1;
        }
        double halfParimeter = (triangleLockSideA + triangleLockSideB + triangleLockSideC) / 2;

        return halfParimeter;
    }
}
