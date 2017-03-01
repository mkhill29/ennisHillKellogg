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
public class ActionMenuView extends View{
 
    protected String promptMessage;
    
    public ActionMenuView(){
            super("\n"
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
    
    public boolean doAction(String choice) {
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
        actionMenu.display();
    }
}
