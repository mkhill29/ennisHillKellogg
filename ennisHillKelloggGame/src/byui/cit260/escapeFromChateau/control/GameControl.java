/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import byui.cit260.escapeFromChateau.model.Game;
import byui.cit260.escapeFromChateau.model.Item;
import byui.cit260.escapeFromChateau.model.Map;
import byui.cit260.escapeFromChateau.model.Math3;
import byui.cit260.escapeFromChateau.model.Player;
import citbyui.cit260.escapeFromChateau.exceptions.GameControlException;
import citbyui.cit260.escapeFromChateau.exceptions.MapControlException;
import ennishillkellogggame.EnnisHillKelloggGame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

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

    public static void saveCurrentGame(Game currentGame, String filePath)
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void clues(Game currentGame) {
        System.out.println("\n*** getClues stub function called ***");
    }

    public static void createNewGame(Player player) throws Exception {
               
        Game game = new Game();
        //1st thing to do
        game.setPlayer(player);
        
        Map map = new Map();
        map.init(5, 5);
        
        player.setCurrentRoom(map.getRoomAt(0, 0));
        //TODO setup items in the map
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Rusty Nail", 100, "invisibility"));
        itemList.add(new Item("Wrinkled Apple", 200, "strong"));
        itemList.add(new Item("Barrel", 300, "smart"));
        itemList.add(new Item("Small vial of mysterious liquid", 400, "surprise"));
        itemList.add(new Item("Candle", 500, "powerful"));
        
        //TODO setup "puzzles/math problems" in the map
       // itemList.add(new Item(MathTwo));
        game.setMap(map);
        
        player.setCurrentRoom(map.getRoomAt(3, 0));
        
        EnnisHillKelloggGame.setGame(game);
    }
    
    public static void loadSavedGame(String filePath)
            throws GameControlException {
        Game currentGame = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            currentGame = (Game) input.readObject();  //read the game object from file
        }
        catch(Exception e) {
            
        }
    // close the output file
    EnnisHillKelloggGame.setGame(currentGame); // save in EnnisHillKelloggGame
    }
}
    