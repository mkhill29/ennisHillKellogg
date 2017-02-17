/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import byui.cit260.escapeFromChateau.model.Game;
import byui.cit260.escapeFromChateau.model.Player;
import ennishillkellogggame.EnnisHillKelloggGame;

/**
 *
 * @author Kristine Hill
 */
public class GameControl {

    public static Player createPlayer(String name) {
     
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        EnnisHillKelloggGame.setPlayer(player); // save the player
        
        return player;
    }

    public static void saveCurrentGame(Game currentGame) {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static void clues(Game currentGame) {
        System.out.println("\n*** openClues stub function called ***");
    }
    
}
    