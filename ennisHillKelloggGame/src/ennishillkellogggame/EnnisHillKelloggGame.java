/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ennishillkellogggame;

import static byui.cit260.escapeFromChateau.control.GameControl.clues;
import byui.cit260.escapeFromChateau.model.MathTwo;
import byui.cit260.escapeFromChateau.model.Game;
import byui.cit260.escapeFromChateau.model.Map;
import byui.cit260.escapeFromChateau.model.Math;
import byui.cit260.escapeFromChateau.model.Player;
import byui.cit260.escapeFromChateau.model.Character;
import byui.cit260.escapeFromChateau.model.Item;
import byui.cit260.escapeFromChateau.model.Math2;
import byui.cit260.escapeFromChateau.model.Math4;
import byui.cit260.escapeFromChateau.model.Room;
import citbyui.cit260.escapeFromChateau.view.StartProgramView;

/**
 *
 * @author Kristine Hill
 */
public class EnnisHillKelloggGame {

    private static Game currentGame = null;
    private static Player player = null;
    private static Game savedGame = null;
    private static Item itemFeatures = null;
    private static Item inventory = null;

    public static Item getItemFeatures() {
        return itemFeatures;
    }

    public static void setItemFeatures(Item itemFeatures) {
        EnnisHillKelloggGame.itemFeatures = itemFeatures;
    }

    public static Item getInventory() {
        return inventory;
    }
    
    public static void setInventory(Item inventory) {
        EnnisHillKelloggGame.inventory = inventory;
    }

    public static void setPlayer(Player player) {
        
    

}

    
     /* @param args the command line arguments
 */
    public static void main(String[] args) {

        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

    public static Game getCurrentGame() {
       return currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static Game getSavedGame() {
        return savedGame;
    }
}