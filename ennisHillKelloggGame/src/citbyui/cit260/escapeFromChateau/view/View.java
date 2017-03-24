/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import ennishillkellogggame.EnnisHillKelloggGame;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author amikellogg
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = EnnisHillKelloggGame.getInFile();
    protected final PrintWriter console = EnnisHillKelloggGame.getOutFile();

    public View() {

    }

    public View(String message) {

        this.displayMessage = message;
    }

    @Override

    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name***  don't need player's name for action menu
            String value = this.getInput();
            if (value.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do requested action and display the next view
            done = this.doAction(value);

        } while (!done);

    }

    /* @Override
    public String getInput() {
        boolean valid = false;                                            // initialize to not valid
        String selection = null;          // value to be returned
        try {
            while (!valid) {                                                       // loop while an invalid value is entered
                selection = this.keyboard.readLine();               // get next line typed on keyboard
                selection = selection.trim();

                if (selection.length() < 1) { // value is blank
                    System.out.println("\nInvalid value: value cannot be blank");
                    continue;
                    // trim off leading and trailing blanks
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return selection; // return the name
    }*/
    
     public String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            valid = true;
            //try{
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;

            }
            
          //  } catch( Exception e) {
           // break; // end the loop
                    
               //     }
        
        }
        return value; // return the value entered
    
     }
}

 
     