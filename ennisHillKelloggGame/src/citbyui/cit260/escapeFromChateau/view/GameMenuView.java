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
                + "\nP - Pick Item From Inventory"
                + "\nL - List Other Rooms"
                + "\nH - GoTo Other Room"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

    
  @Override
    public boolean doAction(String value) {
       value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "I": // save a game
                this.showInventory();
                break;
            case "P": // begin new game
                this.pickInventoryItem();
                break;
            case "L": // display help menu
                this.listRooms();
                break;
            case "G": // display action menu
                this.goToRoom();
                break;
                //TODO need "x"
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
    
    public void showInventory(){
         System.out.println("\n***showInventory");

    }
    
    public void pickInventoryItem(){
        System.out.println("\n*** pickInventoryItem");

    } 
    
    public void listRooms(){
       System.out.println("\n***listRooms");

    }
        
    public void goToRoom(){
       System.out.println("\n*** goToRoom");

    }
}
