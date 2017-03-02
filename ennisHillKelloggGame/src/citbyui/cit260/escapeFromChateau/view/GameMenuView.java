/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.InventoryControl;
import ennishillkellogggame.EnnisHillKelloggGame;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @Heidi Ennis
 */
public class GameMenuView extends View {

    protected String promptMessage;
    /*public GameMenuView() {
        //constructor
        this.promptMessage();
        this.promptViewMap();
      

    }*/
    public GameMenuView() {
        super("\n"
                + "\nYou are in the Game Room"
                + "\nAnd in here you will be able to"
                + "\nSee the Inventory of the items"
                + "\n available to you and"
                + "\nthe Map of the Castle.");
         //public void displayGameMenuView() {
        //Math question to be inserted here like in order to find where you are, answer the following Math problem
        boolean done = false; // set flag to not done
        do {
            String menuOption = this.menuOption();
            if (menuOption.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    /*private void ViewInventory(); static {
        
    }
    
    
    private void RoomMenu(); {
        
        
    }
      private void closeMenu();  static {
        System.out.println("*** closeMenu function called ***");

    }
     */
    private void promptViewMap() {

    }

    private String gameMenuViewOption() {
        return null;

    }

    public boolean doAction(String gameMenuView) {
        return false;

    }

    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();

        mainMenu.display();

    }

    void displayGameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
