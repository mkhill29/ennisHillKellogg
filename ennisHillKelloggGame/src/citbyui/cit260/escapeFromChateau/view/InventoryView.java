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
public class InventoryView {

    public void displayMainMenuView() {
        boolean done = false;  // set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
            {
                return; // exit the game
            }
            //do the reqested action and display the next view
            done = this.doAction(menuOption);
            
         } while (!done);
                 
    }
    
    private String getMenuOption() {
        System.out.println("\n***  getMenuOption() function called ***");
        return "N";
        
    }
private boolean doAction(String menuOption)  {
    System.out.println("\n*** doAction() function called ***)");
            return true;
            
}
}