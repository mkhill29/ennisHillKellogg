/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ennishillkellogggame;

import byui.cit260.escapeFromChateau.model.BarrelInKitchen;
import byui.cit260.escapeFromChateau.model.Game;
import byui.cit260.escapeFromChateau.model.Map;
import byui.cit260.escapeFromChateau.model.Math;
import byui.cit260.escapeFromChateau.model.Player;
import byui.cit260.escapeFromChateau.model.Character;
import byui.cit260.escapeFromChateau.model.Item;
import byui.cit260.escapeFromChateau.model.Math2;

/**
 *
 * @author Kristine Hill
 */
public class EnnisHillKelloggGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BarrelInKitchen barrelinkitchenOne = new BarrelInKitchen();
        
        Player playerOne = new Player();
       

        playerOne.setName("Fred Flintstone");
        playerOne.setInventory(7.00);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        Game gameOne = new Game();

        gameOne.setTotalCaptures(1);
        gameOne.setEscapesRemaining(9);

        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRoomName("Dungeon");
        mapOne.setColumnCount(4);
        mapOne.setRowCount(4);
        
        String roomInfo = mapOne.toString();
        System.out.println(roomInfo);
        
        
        Math mathAntidote = new Math();
        
        mathAntidote.setRoomHeight(6);
        mathAntidote.setRoomLength(9);
        mathAntidote.setRoomWidth(12);
        
        String mathInfo = mathAntidote.toString();
        System.out.println(mathInfo);       
        
        Character characterPrisoner = new Character();
        
        characterPrisoner.setCharacterType(playerInfo);
        characterPrisoner.setCharacterLocation(roomInfo);
        
        String characterInfo = characterPrisoner.toString();
        System.out.println(characterInfo);
       
        Item itemOne = new Item();
        
        itemOne.setUse(playerInfo);
        itemOne.setMagicPower(mathInfo);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Math2 mathStone = new Math2();
        
        mathStone.setStoneLength(5);
        mathStone.setStoneWidth(4);
        mathStone.setStoneHeight(7);
        String mathTwo = mathStone.toString();
        System.out.println(mathTwo);
        
    }
}
