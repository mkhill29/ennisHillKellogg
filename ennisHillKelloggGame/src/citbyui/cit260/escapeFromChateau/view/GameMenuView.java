/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.MapControl;
import byui.cit260.escapeFromChateau.model.Direction;
import byui.cit260.escapeFromChateau.model.Map;
import byui.cit260.escapeFromChateau.model.Room;
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
                + "\nC - Display Chateau Map"
                + "\nI - Show Inventory"
                + "\nR - Show Rooms"
                + "\nA - Action Menu"
                + "\nN - See Antidotes"
                + "\nM - Math Stone Menu"
                + "\nK - Math Lock Menu"
                + "\nY -Tiny Door Menu"
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
                break;
             case "K":
                MathLockView mathLockView = new MathLockView();
                mathLockView.display();
                break;
             case "Y": 
                TinyDoorView tinyDoorView = new TinyDoorView();
                tinyDoorView.display();
                break;
            case "V":
                viewCurrentRoom();
                break;
            case "C":
                displayChateau();
                break;
            case "U":
                moveUp();
                break;
            case "D":
                moveDown();
                break;
            case "L":
                moveLeft();
                break;
            case "T":
                moveRight();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void viewCurrentRoom() {
        Room room = EnnisHillKelloggGame.getPlayer().getCurrentRoom();

        this.console.println("You are at: (" + room.getRow() + ", " + room.getColumn() + ")");
        this.console.println(room.getDescription());
    }

    private void displayChateau() {

        //TODO iterate over all locations in the map and display the "first character of the name" in a "grid"
        Map map = EnnisHillKelloggGame.getCurrentGame().getMap();
       /* this.console.println("*************************************"
                + "\n   Map of Chateau de la Miserie    "
                + "\n***********************************"
                + "\n___0______1______2______3______4___");
        int i;

        for (int i = 0; i < roomName.length; i++) {
            this.console.println("|    " + ??????? +"   ");
            }
                for (int j = 0; j < roomName[i].length; j++) {
        }
        if (roomName.length > 3){ 
            this.console.println("|   " + ??????? + "   |");
                //how do I print out just the first letter? add a | to the last column?
        }
    

    */
    }

    private void moveUp() {
        MapControl mc = new MapControl();
        boolean success = mc.movement(Direction.UP);
        if (success) {
            this.console.println("You moved up one");
        } else {
            this.console.println("You cannot do that right now");
        }
    }

    private void moveLeft() {
        MapControl mc = new MapControl();
        boolean success = mc.movement(Direction.DOWN);
        if (success) {
            this.console.println("You moved down one");
        } else {
            this.console.println("You cannot do that right now");
        }
    }

    private void moveRight() {
        MapControl mc = new MapControl();
        boolean success = mc.movement(Direction.LEFT);
        if (success) {
            this.console.println("You moved left one");
        } else {
            this.console.println("You cannot do that right now");
        }
    }

    private void moveDown() {
        MapControl mc = new MapControl();
        boolean success = mc.movement(Direction.RIGHT);
        if (success) {
            this.console.println("You moved right one");
        } else {
            this.console.println("You cannot do that right now");
        }

    }
}
