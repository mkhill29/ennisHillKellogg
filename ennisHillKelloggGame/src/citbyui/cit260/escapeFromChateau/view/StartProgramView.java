/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.GameControl;
import byui.cit260.escapeFromChateau.model.Player;
import java.util.Scanner;

/**
 *
 * @author Heidi Ennis
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println(
                "\n***************************************"
                + "\n*                                   *"
                + "\n* Welcome to our new game!          *"
                + "\n* In this game you will play a      *"
                + "\n* game of fun and action and        *"
                + "\n* escape adventure.                 *"
                + "\n* You will look for clues and       *"
                + "\n* places to let you get to a new    *"
                + "\n*  place in the                     *"
                + "\n* castle.  You will try to find     *"
                + "\n* tools to help you get out of the  *"
                + "\n* cell or room you are in.          *"
                + "\n* You may find a friend to help you *"
                + "\n* get out. You must watch out for   *"
                + "\n* the warden! If he catches you,    *"
                + "\n* you will be beaten and returned   *"
                + "\n* to your cell.                     *"
        );
    }

    public void displayStartProgramView() {
        /*
        do
            prompt for and get playersName
            if playersName == 'Q' then
                return
               
            do requested action and display next view
        
        while the view is not done
         */
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {
        /*
        WHILE valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from keyboard
            Trim front and trailing blanks off of the name
        
            IF the length of the value is blank THEN
                DISPLAY "Invalid value: The value cannot be blank"
                CONTINUE
            ENDIF

            BREAK

        ENDWHILE
        RETURN name
         */

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
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

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }

        // display next view
        this.displayNextView(player);
        return true; // success!
    }

    private void displayNextView(Player player) {

        // display a custom welcome message
        System.out.println("\n================================================="
                + "\n Welcome to Chateau de la Misèrie, " + player.getName() + "."
                + "\n You will probably die here unless you manage to escape!"
                + "\n=========================================================="
        );
        // Create MainMenuView object
        MainMenuView2 mainMenuView = new MainMenuView2();

        // Display the main menu view
        mainMenuView.displayMainMenuView();
       
    }

}
