/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.GameControl;
import ennishillkellogggame.EnnisHillKelloggGame;
import java.util.Scanner;

/**
 *
 * @author amikellogg
 */
public class HelpMenuView {

    private String menu;
    private String promptMessage;

    public HelpMenuView() {
        this.promptMessage = "\nPlease enter Menu Option:    ";

        System.out.println(
                menu = "\n"
                + "\n------------------------------------"
                + "\n| Help Menu                       |"
                + "\n------------------------------------"
                + "\nC - Clues"
                + "\nP - How to Play"
                + "\nM - About Movement"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

    public void displayHelpMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name***  don't need player's name for help menu
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) // user wants to quit
                return; // exit the game
            
            // do requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);

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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "C": // clues
                this.clues();
                break;
            case "P": // how to play
                this.howToPlay();
                break;
            case "M": // about movement
                this.aboutMovement();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void clues() {
        System.out.println("*** clues function called ***");
       
    }

    private void howToPlay() {
        System.out.println("*** beginNewGame function called ***");
    }

    private void aboutMovement() {
        System.out.println("*** loadSavedGame function called ***");
    }

    private void lookAround() {
        System.out.println("*** lookAround function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
        
         //display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
}
