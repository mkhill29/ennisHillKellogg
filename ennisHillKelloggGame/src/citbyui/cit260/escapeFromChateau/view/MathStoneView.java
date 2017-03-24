/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.MathStone;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author amikellogg
 */
public class MathStoneView extends View {

    private int length;
    private int width;
    private int height;

    public MathStoneView() {

        Random r = new Random();

        length = r.nextInt(20) + 1;
        width = r.nextInt(20) + 1;
        height = r.nextInt(20) + 1;

    }

    @Override

    public void display() {
        this.displayMessage = "\n**********************************"
                + "\nYou've come across a stone that"
                + "\n is in your path! The stone looks"
                + "\n big, so you must determine what"
                + "\n the surface area is to know how"
                + "\n big it really is in order to pass"
                + "\n by it successfully."
                + "\n The equation for the surface area "
                + "\n of a rectangle is: "
                + "\n2*(length* width) + 2*(width * height) + 2*(length * height)"
                + "\n*********************************";

        this.displayMessage += ("\nThe stone's length is " + length);
        this.displayMessage += ("\nThe stone's width is " + width);
        this.displayMessage += ("\nThe stone's height is " + height);
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
       boolean valid = false;                                            // initialize to not valid
        String selection = null;                                        // value to be returned
       try {
           
               while (!valid) {       
                   
                   selection = this.keyboard.readLine();                  // get next line typed on keyboard
                    selection = selection.trim();                                        // trim off leading and trailing blanks

                    if (selection.length() < 1) {                                                                             // value is blank
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value.");
                        continue;
                  }
                  break; 
               }
               } catch (Exception e) {
                                                                                                                                         // loop while an invalid value is entered
            ErrorView.display(this.getClass().getName(),
                    "Error reading input" + e.getMessage());
                              
        }
        return selection; // return the value entered
    }
    

    @Override
   public boolean doAction(String playerAnswer) {
        MathStone ms = new MathStone();

        double correctAnswer = ms.surfaceArea(length, width, height);
        double playerAnswerNumber = Double.parseDouble(playerAnswer);

        return (int) correctAnswer == (int) playerAnswerNumber;
    
}
}
