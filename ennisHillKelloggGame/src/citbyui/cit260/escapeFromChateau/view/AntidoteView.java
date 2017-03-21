/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.MathAntidoteControl;
import byui.cit260.escapeFromChateau.exceptions.AntidoteException;
import byui.cit260.escapeFromChateau.exceptions.LoseGameException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kristine Hill
 */
public class AntidoteView extends View {

    private int width;
    private int height;
    private int length;

    public AntidoteView() {

        Random r = new Random();

        width = r.nextInt(10) + 1;
        height = r.nextInt(10) + 1;
        length = r.nextInt(10) + 1;
    }

    @Override

    public void display() {
        this.displayMessage = "\n************************************************"
                + "\nOh no! You are shrinking! The bottle of         "
                + "\nmysterious liquid contained poison. You will    "
                + "\ndisappear and die unless you can quickly figure "
                + "\nthe volume of water required to fill the room   "
                + "\nhalf full.                                      "
                + "\nThe formula is 1/2 Volume = width X length X height/2.   "
                + "\nYou have 3 minutes.                             "
                + "\n************************************************";

        this.displayMessage += ("\nThe room's width is " + width);
        this.displayMessage += ("\nThe room's length is " + length);
        this.displayMessage += ("\nThe room's height is " + height);
        this.displayMessage += ("\nPlease enter the answer: ");

        String answer = getInput();

        boolean isCorrect = doAction(answer);

        if (isCorrect) {
            System.out.println("Nice job!");
        } else {
            throw new LoseGameException("You drowned in the room");
        }

    }

    @Override

    public String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

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

    @Override
    public boolean doAction(String playerAnswer) {
        MathAntidoteControl mac = new MathAntidoteControl();

        try {
            double correctAnswer = mac.calcHalfVolume(width, length, height);
            double playerAnswerNumber = Double.parseDouble(playerAnswer);

            return (int) correctAnswer == (int) playerAnswerNumber;
        } catch (AntidoteException ae) {
            System.out.println(ae.getMessage());
        }
        
        return false;
    }

}
