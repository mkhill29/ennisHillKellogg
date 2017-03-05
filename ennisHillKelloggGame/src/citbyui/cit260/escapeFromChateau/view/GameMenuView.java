/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import ennishillkellogggame.EnnisHillKelloggGame;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @Heidi Ennis
 */
public class GameMenuView extends View {

    protected String promptMessage;

    public GameMenuView() {
        super("\n"
                + "\nYou are in the Game Room"
                + "\nAnd in here you will be able to"
                + "\nSee the Inventory of the items"
                + "\n available to you and"
                + "\nthe Map of the Castle."
                + "\n"
                + "\n------------------------------------"
                + "\n| Game Room Menu                        |"
                + "\n------------------------------------"
                + "\nI - Show Inventory"
                + "\nR - Show Rooms"
                + "\nA - Action Menu"
                + "\nN - See Antidotes"
                + "\nM - Math Stone Menu"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "I":
                InventoryView inventoryView = new InventoryView();
                inventoryView.display();
                break;
            case "R": 
                RoomMenuView roomMenuView = new RoomMenuView();
                roomMenuView.display();
                break;
            case "A": 
                ActionMenuView actionMenuView = new ActionMenuView();
                actionMenuView.display();
                break;
            case "N": 
                AntidoteView antidoteView = new AntidoteView();
                antidoteView.display();
                break;
            case "M": 
                MathStoneView mathStoneView = new MathStoneView();
                mathStoneView.display();
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

}
