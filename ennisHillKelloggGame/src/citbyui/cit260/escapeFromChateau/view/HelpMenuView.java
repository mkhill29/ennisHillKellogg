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
        System.out.println("*** Here are some clues ***");
                break;
            case "P": // how to play
        System.out.println("*** Here's how to Play ***");
                break;
            case "M": // about movement
        System.out.println("*** Learn about Movement ***");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

       }
