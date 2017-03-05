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
public class InventoryView extends View {

    public InventoryView() {
        super("\n"
                + "\nYou are in the Inventory Room"
                + "\nAnd in here you will be able to"
                + "\nSee the Inventory of the items"
                + "\n available to you."
                + "\n"
                + "\n------------------------------------"
                + "\n| Inventory Room Menu                        |"
                + "\n------------------------------------"
                + "\nI - Show Inventory"
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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
}
