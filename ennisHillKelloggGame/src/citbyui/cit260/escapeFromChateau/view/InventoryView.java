/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.escapeFromChateau.view;

import byui.cit260.escapeFromChateau.control.GameControl;
import byui.cit260.escapeFromChateau.model.Item;
import byui.cit260.escapeFromChateau.model.Item.PlayerItem;
import byui.cit260.escapeFromChateau.model.Room;
import ennishillkellogggame.EnnisHillKelloggGame;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
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
                + "\nI - Show Inventory of things in Room"
                + "\nC - Create Inventory"
                + "\nY - List of Rooms"
                + "\nP - Print Inventory"
                + "\nX - Quit"
                + "\n------------------------------------");
    }

//    @Override
//    public boolean doAction(String value) {
//        value = value.toUpperCase(); // convert choice to upper case
//
//        switch (value) {
//            case "I":
//                this.console.println(PlayerItem.values()[0]);
//                this.console.println(PlayerItem.values()[1]);
//                this.console.println(PlayerItem.values()[2]);
//                this.console.println(PlayerItem.values()[3]);
//                this.console.println(PlayerItem.values()[4]);
//        
//                break;
//            case "C":
//                List<Item> itemList = createListOfItems();
//                    for (Item item : itemList) {
//                    this.console.println(item.getItem()+item.getMagicPower()+ item.getItemPoints());
//                     
//                break;
//                    
////            case "Y":
////                room<Room> roomName = createListOfRooms();
////                    for (Room room : roomName) {
////                    this.console.println(roomName);
////                    
////                    }
////                break;
//        } 
//            default:
//                ErrorView.display(this.getClass().getName(),
//                break;
//        }
//                             
//        return false;
//  }
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "I":
                this.console.println(PlayerItem.values()[0]);
                this.console.println(PlayerItem.values()[1]);
                this.console.println(PlayerItem.values()[2]);
                this.console.println(PlayerItem.values()[3]);
                this.console.println(PlayerItem.values()[4]);
                break;
            case "C":
                List<Item> itemList = createListOfItems();
                for (Item item : itemList) {
                    this.console.println(item.getItem() + item.getMagicPower() + item.getItemPoints());
                }
                break;
            case "Y":
                List<Room> roomName = createListOfRooms();
                for (Room room : roomName) {
                    this.console.println(roomName);
                }
                break;
            case "P":
                try {
                    printReport();
                } catch (IOException e) {
                    System.err.println("printReport() threw an exception!");
                }
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection ***");
                break;
        }

        return false;
    }

//    public Room<room> createListOfRooms() {
//
//        Room<room> roomName = new ArrayList<Room>();
//        roomName.add(new Room("Cell 1", "Cell 2"));
//
//        return roomName;
//    }
//
//
//    
//    I don't know what to do here with room -Tim McEwan
    public List<Item> createListOfItems() {

        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Rusty Nail", 100, "invisibility"));
        itemList.add(new Item("Wrinkled Apple", 200, "strong"));
        itemList.add(new Item("Barrel", 300, "smart"));
        itemList.add(new Item("Small vial of mysterious liquid", 400, "surprise"));
        itemList.add(new Item("Candle", 500, "powerful"));

        return itemList;
    }

    public List<Room> createListOfRooms() {

        List<Room> roomName = new ArrayList<>();

        Room a = new Room("guard shack");
        roomName.add(a);
        Room b = new Room("kitchen");
        roomName.add(b);

        roomName.add(new Room("Gate House", "0,0"));
        roomName.add(new Room("Main Hall", "0,1"));
        roomName.add(new Room("Warden's Office", "0,2"));
        roomName.add(new Room("Warden's Quarters", "0,3"));
        roomName.add(new Room("N Guard Tower", "0,4"));
        roomName.add(new Room("Kitchen", "1,0"));
        roomName.add(new Room("Pantry", "1,1"));
        roomName.add(new Room("Larder", "1,2"));
        roomName.add(new Room("Broom Closet", "1,3"));
        roomName.add(new Room("Armory", "1,4"));
        roomName.add(new Room("Cell 1", "2,0"));
        roomName.add(new Room("Cell 2", "2,1"));
        roomName.add(new Room("Cell 3", "2,2"));
        roomName.add(new Room("Storage Room", "2,3"));
        roomName.add(new Room("Guard Room", "2,4"));
        roomName.add(new Room("Cell 4", "3,0"));
        roomName.add(new Room("Cell 5", "3,1"));
        roomName.add(new Room("Cell 6", "3,2"));
        roomName.add(new Room("Dungeon", "3,3"));
        roomName.add(new Room("Uniform Closet", "3,4"));
        roomName.add(new Room("S Guard Tower", "4,0"));
        roomName.add(new Room("Guards Headquarters", "4,1"));
        roomName.add(new Room("W Barracks", "4,2"));
        roomName.add(new Room("E Barracks", "4,3"));
        roomName.add(new Room("E Guard Tower", "4,4"));

        return roomName;
    }
}
