/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.InventoryControl;
import ennishillkellogggame.EnnisHillKelloggGame;
import java.util.Scanner;

/**
 *
 * @author Kristine Hill
 */
public class RoomMenuView extends View {

    protected String promptMessage;

    public RoomMenuView() {

        super("\n"
                + "\n----------------------------------------------------"
                + "\n|       Room Menu                                  |"
                + "\n----------------------------------------------------"
                + "\nL - Look around (room description and items in room)"
                + "\nP - Pick up item"
                + "\nF - View item features"
                + "\nA - Add item to inventory"
                + "\nU - Use item"
                + "\nI - View Current inventory"
                + "\nT -Tiny Door   "
                + "\nC - Close menu");
    }

    
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        switch (choice) {
            case "L": // look around
                this.lookAround();
                break;
            case "P": // Pick up item
                this.pickUpItem();
                break;
            case "F": // View item features
                this.viewItemFeatures();
                break;
            case "A": // Add item to inventory
                this.addItem();
                break;
            case "U": // Use item
                this.useItem();
                break;
            case "I": // View inventory
                this.viewInventory();
                break;
               case "C": // Close menu
                this.closeMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void lookAround() {
        this.console.println("*** lookAround function called ***");
    }

    private void pickUpItem() {
        this.console.println("*** pickUpItem function called *** ");
    }

    private void viewItemFeatures() {
        InventoryControl.viewItemFeatures(EnnisHillKelloggGame.getItemFeatures());
    }

    private void addItem() {
        this.console.println("*** addItem function called *** ");
    }

    private void useItem() {
        this.console.println("*** useItem function called ***");
    }

    private void viewInventory() {
        InventoryControl.viewInventory(EnnisHillKelloggGame.getInventory());
    }

    /* public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public String getPromptMessage() {
        return promptMessage;
    }
    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }*/
    private void closeMenu() {
        this.console.println("*** closeMenu function called ***");
    }

}
