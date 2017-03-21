/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import byui.cit260.escapeFromChateau.exceptions.AntidoteException;

/**
 *
 * @author Kristine Hill
 */
public class MathAntidoteControl {

    public double calcHalfVolume(double width, double length, double height) throws AntidoteException {

        if (width < 0 || width > 99) { //width out of range?
            throw new AntidoteException("width out of bounds");
        }

        if (length < 0 || length > 99) { //length out of range?
            throw new AntidoteException("length out of bounds");
        }

        if (height < 0 || height > 99) { //height out of range?
            throw new AntidoteException("height out of bounds");
        }

        double halfVolume = (width * length * height) / 2;

        return halfVolume;
    }
}
