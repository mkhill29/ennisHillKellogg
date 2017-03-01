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
public class HelpMenuView extends View{

    
    protected String promptMessage;

    public HelpMenuView() {
 
            super("\n"
                + "\n------------------------------------"
                + "\n| Help Menu                       |"
                + "\n------------------------------------"
                + "\nC - Clues"
                + "\nP - How to Play"
                + "\nM - About Movement"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

   

    public boolean doAction(String choice) {
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
        helpMenu.display();
    }

    //void displayHelpMenuView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }
}
