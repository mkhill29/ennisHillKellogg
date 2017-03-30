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
             
                printReport();

                
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

        /*  String[][] roomName =
             ( "Gate House", "Main Hall", "Warden's Office", "Warden's Quarters", "N. Guard Tower"
              "Kitchen", "Pantry", "Larder", "Broom Closet", "Armory"
              "Cell 1", "Cell 2", "Cell 3", "Storage Room", "Guard Room"
               "Cell 4", "Cell 5", "Cell 6", "Dungeon", "Uniform Closet"
               "S. Guard Tower", "Guards HeadQuarter", "W. Barracks", "E. Barracks", "E. Guard Tower")
      return roomName;*/
        
        return null;
    }
}
