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
public class StartProgramView extends View {

    protected String promptMessage;

    public StartProgramView() {
        
       super ("\nPlease enter your name: ");
        //display the banner when view is created
        this.displayBanner();
    }
        
    private void displayBanner() {

        this.console.println(
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
                + "\n*************************************"
        );
    }

   

    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { // if unsuccessful
            ErrorView.display(this.getClass().getName(),
                    "\nError creating the player.");
            return false;
        }

        // display next view
        this.displayNextView(player);
        return true; // success!
    }

    private void displayNextView(Player player) {

        // display a custom welcome message
        this.console.println("\n================================================="
                + "\n Welcome to Chateau de la Misèrie, " + player.getName() + "."
                + "\n You will probably die here unless you manage to escape!"
                + "\n=========================================================="
        );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.display();

    }

}
