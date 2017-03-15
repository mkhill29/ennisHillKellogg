/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import byui.cit260.escapeFromChateau.model.Direction;
import byui.cit260.escapeFromChateau.model.Map;
import byui.cit260.escapeFromChateau.model.Room;
import ennishillkellogggame.EnnisHillKelloggGame;

/**
 *
 * @author Kristine Hill
 */
public class MapControl {

    public boolean movement(Direction direction) {
        
        //First, grab the player's current location
        Room currentRoom = EnnisHillKelloggGame.getPlayer().getCurrentRoom();
        
        //Check the direction and make sure we're not at a "border" and trying to move off the map
        //If player is trying to move off map, return false
        if(direction == Direction.UP && currentRoom.getRow() == 0) {
            return false;
        }
        
        //Grab the new location from the map based on direction
        Map map = EnnisHillKelloggGame.getGame().getMap();
        if(direction == Direction.UP) {
            Room newRoom = map.getRoomAt(currentRoom.getRow() - 1, currentRoom.getColumn());
            //Update the player's location with the new location
            EnnisHillKelloggGame.getPlayer().setCurrentRoom(newRoom);
        }
        
        return true;
    }
}