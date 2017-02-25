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
public class MathStoneView {
    private String promptMessage;
    
    public MathStoneView(){
        this.stoneMessage();
        this.stoneChallenge();
        this.inputNumbers();
    }

    private void stoneMessage() {
        System.out.println("\n**********************************"
                           +"\nYou've come across a stone that"
                           +"\n is in your path! The stone looks"
                           +"\n big, so you must determine what"
                           +"\n the surface area is to know how"
                           +"\n big it really is in order to pass"
                           +"\n by it successfully."
                           +"\n*********************************"
      );
    }

    private void stoneChallenge() {
        System.out.println("\n**********************************"
                           +"\nYou've been given three numbers:"
                           +"\n 7, 5, 4. You must figure out what"
                           +"\n value they belong to."
                           +"\n*********************************"
      ); 
    }

    private String inputNumbers() {
        this.promptMessage = ("\nLength: "
                             +"\nWidth: " 
                             +"\nHeight: ");
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end the loop
        }

        return value; // return the value entered
    }
    
}
