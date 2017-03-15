/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import java.util.Scanner;

/**
 *
 * @author amikellogg
 */
public class MathStoneView extends View {

    protected String promptMessage;

    public MathStoneView() {
        this.stoneMessage();
        this.stoneChallenge();
        this.inputNumbers();
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            //TO DO Put a case switch statement here

            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void stoneMessage() {
        System.out.println("\n**********************************"
                + "\nYou've come across a stone that"
                + "\n is in your path! The stone looks"
                + "\n big, so you must determine what"
                + "\n the surface area is to know how"
                + "\n big it really is in order to pass"
                + "\n by it successfully."
                + "\n*********************************"
        );
    }

    private void stoneChallenge() {
        System.out.println("\n**********************************"
                + "\nYou've been given three numbers:"
                + "\n 7, 5, 4. You must figure out what"
                + "\n value they belong to."
                + "\n*********************************"
        );
    }

    private void inputNumbers() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
