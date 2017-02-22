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
 * @author Heidi Ennis
 */
public class MainMenuView2 {

    private String menu;
    private String promptMessage;

    public MainMenuView2() {
        this.promptMessage = "\nPlease enter Menu Option:    ";

        System.out.println(
                menu = "\n"
                + "\n------------------------------------"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nS - Save"
                + "\nB - Begin New Game"
                + "\nL - Load Saved Game"
                + "\nH - Help"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

    public void displayMainMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);

    }

    private String getMenuOption() {
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "S": // save a game
                this.saveCurrentGame();
                break;
            case "B": // begin new game
                this.beginNewGame();
                break;
            case "L": // load game
                this.loadSavedGame();
                break;
            case "H": // display help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void saveCurrentGame() {
        // save current game
        GameControl.saveCurrentGame(EnnisHillKelloggGame.getCurrentGame());
    }

    private void beginNewGame() {
        GameControl.createNewGame(EnnisHillKelloggGame.getPlayer());

        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadSavedGame() {
        GameControl.loadSavedGame(EnnisHillKelloggGame.getSavedGame());
        
     
    }

    private void displayHelpMenu() {
        System.out.println("*** help function called ***");
    }

}
