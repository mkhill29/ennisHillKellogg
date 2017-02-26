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
public class RoomMenuView {
    
    private String menu;
    private String promptMessage;
    
    public RoomMenuView(){
        
        this.promptMessage = "\nChoose a menu option";
        //display when view is created
        System.out.println(
                    menu = "\n"
                    + "\n----------------------------------------------------"       
                    + "\n|       Room Menu                                  |"
                    + "\n----------------------------------------------------"
                    + "\nL - Look around (room description and items in room)"
                    + "\nP - Pick up item"
                    + "\nF - View item features"
                    + "\nA - Add item to inventory"
                    + "\nU - Use item"
                    + "\nI - View inventory"
                    + "\nC - Close menu");
    }
    
    public void displayRoomMenuView(){
        
        boolean done = false; // set flag to not done
        do {
            String roomMenuOption = this.getRoomMenuOption();
            if (roomMenuOption.toUpperCase().equals("X")) // user wants to quit
            {
                return; // exit the game
            }
            // do requested action and display the next view
            done = this.doAction(roomMenuOption);
            
        }   while (!done);
        
    }

    private String getRoomMenuOption() {
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void lookAround() {
        System.out.println("*** lookAround function called ***");
    }

    private void pickUpItem() {
        System.out.println("*** pickUpItem function called *** ");
    }

    private void viewItemFeatures() {
        InventoryControl.viewItemFeatures(EnnisHillKelloggGame.getItemFeatures());
    }

    private void addItem() {
        System.out.println("*** addItem function called *** ");
    }

    private void useItem() {
        System.out.println("*** useItem function called ***");
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
        System.out.println("*** closeMenu function called ***");
    }
    
}
