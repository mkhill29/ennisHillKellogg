/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.MathTinyDoorControl;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Kristine Hill
 */
public class TinyDoorView extends View {

    private int minutesPerOunce;
    private int fuelCapacity;
    private int burnTime;

    public TinyDoorView() {

        Random r = new Random();

        minutesPerOunce = r.nextInt(10) + 1;
        fuelCapacity = r.nextInt(10) + 1;
        burnTime = r.nextInt(10) + 1;
    }

        @Override

        public void display() {
             this.displayMessage = "\n**********************************"
                    + "\nYou are much too large to pass                    "
                    + "\n through me! If you are clever, I may              "
                    + "\n reveal to you a secret latch that will            "
                    + "\n open a bigger door for you. You must              "
                    + "\n answer a tricky question before I tell            "
                    + "\n you the secret!                                   "
                    + "\n**                                                 "
                    + "\nIf your lantern burns one ounce of fuel            "
                    + "\n in 20 minutes, and it can hold 24 ounces          "
                    + "\n of fuel, how many times will you need to          "
                    + "\n fill it to have light for 16 hours?               "
                    + "\n***************************************************";
              
        String answer = getInput();
        
        boolean isCorrect = doAction(answer);

        if (isCorrect) {
            System.out.println("Nice job!");
        } else {
            System.out.println("Bad job!");
        }
    }
        @Override
        public String getInput() {
                boolean valid = false;
                String selection = null;                //value to be returned
                try {
                while (!valid) {                                   
                    // loop while an invalid value is entered
                    
                    
                    selection = this.keyboard.readLine();                 //get next line typed on keyboard
                    selection = selection.trim();  
                    
                    
                if (selection.length() < 1) { // value is blank
                  System.out.println("You must enter a value.");

                    continue;
                }
                      break; // end the loop
                } 
                  }  catch (Exception e) {
                    System.out.println("Error reading input: " + e.getMessage());
                  }                    
                   return selection; //return entered value
        }

        @Override
        public boolean doAction(String playerAnswer ) {
        MathTinyDoorControl mtdc = new MathTinyDoorControl();

            double correctAnswer = mtdc.calcFuelFills(minutesPerOunce, fuelCapacity, burnTime);
            double playerAnswerNumber = Double.parseDouble(playerAnswer);

            return (int) correctAnswer == (int) playerAnswerNumber;
        }
    }
