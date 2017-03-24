/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.MathLockControl;
import citbyui.cit260.escapeFromChateau.exceptions.MathLockControlException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Heidi Ennis
 */
public class MathLockView extends View {

    private int triangleLockSideA;
    private int triangleLockSideB;
    private int triangleLockSideC;

    public MathLockView() {

        Random r = new Random();

        triangleLockSideA = r.nextInt(10) + 1;
        triangleLockSideB = r.nextInt(10) + 1;
        triangleLockSideC = r.nextInt(10) + 1;
    }

    @Override
    public void display() {
        this.displayMessage = "\n************************************************"
                + "\nTo enter the Armory, you must enter a four digit code into the key pad. "
                + "\nThe code can only be obtained by answering a math question. "
                + "\nFor example, If a triangle has one side that is 12 feet and one side "
                + "\nthat by is 9 feet, and one side that is 22 feet, long, then you need to  "
                + "\ncalculate half of the perimeter."
                + "\n************************************************";

        this.displayMessage += ("\nThe lock's sideA is " + triangleLockSideA);
        this.displayMessage += ("\nThe lock's sideB is " + triangleLockSideB);
        this.displayMessage += ("\nThe room's sideC is " + triangleLockSideC);
        this.displayMessage += ("\nPlease enter the answer: ");

        String answer = getInput();

        boolean isCorrect = doAction(answer);

        if (isCorrect) {
            this.console.println("Nice job!");
        } else {
            this.console.println("Bad job!");
        }

    }

    @Override
    public String getInput() {
         boolean valid = false;                                                             // initialize to not valid
        String selection = null;                                                                    // value to be returned
      try { 

        while (!valid) {     
            
            selection = keyboard.readLine();                    // get next line typed on keyboard
            selection = selection.trim();                                               // trim off leading and trailing blanks

             if (selection.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value.");
                continue;
             }
       break;
        }
      
    } catch (Exception e) {
                                                                                          // loop while an invalid value is entered
            ErrorView.display(this.getClass().getName(),
                    "Error reading input:" + e.getMessage());

             }
            
         return selection; // return the value entered
    }

    @Override
    public boolean doAction(String playerAnswer) {
        MathLockControl mac = new MathLockControl();
        double correctAnswer = 0;
        try {
            correctAnswer = mac.halfTotalPerimeter(triangleLockSideA, triangleLockSideB, triangleLockSideC);
        } catch (MathLockControlException mlce) {
            mlce.printStackTrace();

        }
        double playerAnswerNumber = Double.parseDouble(playerAnswer);

        // return (int) correctAnswer == (int) playerAnswerNumber;
        return correctAnswer == playerAnswerNumber;

    }

}
