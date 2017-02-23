/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import java.util.Scanner;

/**
 *
 * @author amikellogg
 */
public class ActionMenuView {
    
    private String menu;
    private String promptMessage;
    
    public ActionMenuView(){
        this.promptMessage = "\nPlease enter Menu Option:      ";
        
        System.out.println(
                menu = "\n"
                + "\n------------------------------------"
                + "\n| Actions Menu                       |"
                + "\n------------------------------------"
                + "\nE - Move East"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nB - Go Back"
                + "\nK - Pick Up Item"
                + "\nU - Use Item"
                + "\nB - Go Back"
                + "\nJ - Jump"
                + "\nShift + U - Climb Up"
                + "\nShift + D - Climb Down"
                + "\n------------------------------------");
    }
    
    public void displayActionMenuView(){
        
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
            case "E": // move east
                this.moveEast();
                break;
            case "N": // move north
                this.moveNorth();
                break;
            case "S": // move south
                this.moveSouth();
                break;
            case "W": // move west
                this.moveWest();
                break;
            case "B": // go back
                this.goBack();
                break;
            case "K": // pick up item
                this.pickUpItem();
                break;
            case "U": // use item
                this.useItem();
                break;
            case "J": // jump
                this.jump();
                break;
            case "Shift + U": // climb up
                this.climbUp();
                break;
            case "Shift + D": // climb down
                this.climbDown();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void moveEast() {
        System.out.println("*** moveEast function called ***");
       
    }

    private void moveNorth() {
        System.out.println("*** moveNorth function called ***");
    }

    private void moveSouth() {
        System.out.println("*** moveSouth function called ***");
    }

    private void moveWest() {
        System.out.println("*** moveWest function called ***");
    }

    private void goBack() {
        System.out.println("*** goBack function called ***");
    }
    
    private void pickUpItem() {
        System.out.println("*** pickUpItem function called ***");
    }
    
    private void useItem() {
        System.out.println("*** useItem function called ***");
    }
    
    private void jump() {
        System.out.println("*** jump function called ***");
    }
    
    private void climbUp() {
        System.out.println("*** climbUp function called ***");
    }
    
    private void climbDown() {
        System.out.println("*** climbDown function called ***");
    }
    
    private void displayActionMenu() {
        System.out.println("*** displayActionMenu function called ***");
        
         //display action menu
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.displayActionMenu();
    }
}
