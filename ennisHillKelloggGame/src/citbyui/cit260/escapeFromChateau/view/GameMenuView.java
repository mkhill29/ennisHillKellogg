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
public class GameMenuView {

    private String menu;
    private String promptMessage;

    
    public GameMenuView() {
        //constructor
        this.promptMessage();
        this.promptViewMap();
      

    }
    
    
    
    private void promptMessage() {
        System.out.println("\n*********************************"
                +"\nYou are in the Game Room"
                +"\nAnd in here you will be able to"
                +"\nSee the Inventory of the items"
                + "\n available to you and"
                + "\nthe Map of the Castle.");
    }
    
   public void displayViewMap() {
        //Math question to be inserted here like in order to find where you are, answer the following Math problem
        
           
        boolean done = false; // set flag to not done
        do {
            String gameMenuView = this.gameMenuViewOption();
            if (gameMenuViewOption.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do requested action and display the next view
            done = this.doAction(gameMenuView);
            
        }   while (!done);
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

    private boolean doAction(String gameMenuView) {
        return false;
      
    }

}

