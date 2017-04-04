/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ennishillkellogggame;

import java.io.*;
import static byui.cit260.escapeFromChateau.control.GameControl.clues;
import byui.cit260.escapeFromChateau.model.Math3;
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
//import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Kristine Hill
 */
public class EnnisHillKelloggGame {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    //Heidi working on Page 9---- 3/22/2017
    private static PrintWriter logFile = null;
    
    

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        EnnisHillKelloggGame.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        EnnisHillKelloggGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        EnnisHillKelloggGame.inFile = inFile;
    }

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
        EnnisHillKelloggGame.player = player;
    }

    public static void setGame(Game game) {
        EnnisHillKelloggGame.currentGame = game;
    }

    public static Game getGame() {
        return EnnisHillKelloggGame.currentGame;
    }

//    public static void main(String[] args) {
//
//        // create StartProgramViewOrig and display the start program view
//        StartProgramView startProgramView = new StartProgramView();
//        startProgramView.display();
//    }

    /* @param args the command line arguments
     */
    //static variable below
    public static void main(String[] args) {

        EnnisHillKelloggGame.inFile = new BufferedReader(new InputStreamReader(System.in));
        EnnisHillKelloggGame.setOutFile(new PrintWriter(System.out, true));

        //Heidi working on Page 9---- 3/22/2017
        try {

            String filePath = "log.txt";
            EnnisHillKelloggGame.setLogFile(new PrintWriter(filePath));

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

        } catch (Exception e) {
            // create StartProgramViewOrig and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

            //return;
        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (EnnisHillKelloggGame.inFile != null) {
                    EnnisHillKelloggGame.inFile.close();
                }

                if (EnnisHillKelloggGame.outFile != null) {
                    EnnisHillKelloggGame.outFile.close();
                }

                if (EnnisHillKelloggGame.logFile != null) {
                    EnnisHillKelloggGame.outFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;

            }
        }
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
