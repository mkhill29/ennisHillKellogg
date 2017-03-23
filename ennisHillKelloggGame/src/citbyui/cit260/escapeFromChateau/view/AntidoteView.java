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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kristine Hill
 */
public class AntidoteView extends View {

    private int width;
    private int height;
    private int length;
    private String answer;

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
            System.out.println("Nice job!");
        }
            //throw new LoseGameException("You drowned in the room");
       // }
       }

    @Override

    public String getInput() {
        boolean valid = false;                                  // initialize to not valid
        String selection = null;                               // value to be returned
      try {
        while (!valid) {                                                   // loop while an invalid value is entered
            
            selection = this.keyboard.readLine();                         // get next line typed on keyboard
            selection = selection.trim();                                           // trim off leading and trailing blanks

            if (selection.length() < 1) {                                                               // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
}
            
            break; // end the loop
        } 
      } catch (Exception e) {
        System.out.println("Error reading input: " + e.getMessage());
      }
                     return selection; // return the name
      }

   @Override
          public boolean doAction(String playerAnswer ) {
        MathAntidoteControl mac = new MathAntidoteControl();

            double correctAnswer = 0;
        try {
            correctAnswer = mac.calcHalfVolume(width, length, height);
        } catch (AntidoteException ex) {
            Logger.getLogger(AntidoteView.class.getName()).log(Level.SEVERE, null, ex);
        }
            double playerAnswerNumber = Double.parseDouble(playerAnswer);
           
            return (int) correctAnswer == (int) playerAnswerNumber;

    }
    }

   

   
    

       
        

    


