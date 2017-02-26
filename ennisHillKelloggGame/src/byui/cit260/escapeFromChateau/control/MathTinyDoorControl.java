/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

/**
 *
 * @author Kristine Hill
 */
public class MathTinyDoorControl {

    public double calcFuelFills(double minutesPerOunce, double fuelCapacity, double burnTime) {

        if (minutesPerOunce <= 0 || minutesPerOunce > 99) {
            return -1;
        }
        if (fuelCapacity <= 0 || fuelCapacity > 99) {
            return -1;
        }
        if (burnTime < 0 || burnTime > 99) {
            return -1;
        }
        

        double fills = (burnTime * 60) / (minutesPerOunce * fuelCapacity);

        return fills;
        
        

    }

}
