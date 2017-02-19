/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ennishillkellogggame;

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
        private static Game clues = null;

    public static Game getClues() {
        return clues;
    }

    public static void setClues(Game clues) {
        EnnisHillKelloggGame.clues = clues;
    }
        
        public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        EnnisHillKelloggGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        EnnisHillKelloggGame.player = player;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    public static Game clues() {
        return clues;
    }

    


 }