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

/**
 *
 * @author Kristine Hill
 */
public class EnnisHillKelloggGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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

        itemOne.setUse("Lantern");
        itemOne.setMagicPower("MagicPowers");

        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);

        Math2 mathStone = new Math2();

        mathStone.setStoneLength(5);
        mathStone.setStoneWidth(4);
        mathStone.setStoneHeight(7);
        String mathTwo = mathStone.toString();
        System.out.println(mathTwo);

        Room roomOne = new Room();

        roomOne.setDiscription("8X8ftroom, one barred window, sink and bed");
        roomOne.setItemsAvailable("Toilet paper, blanket, chair");
        roomOne.setPortals("Barred Door, Barred Window");
        roomOne.setRow(1);
        roomOne.setColumn(2);
        roomOne.setIsVisited(true);
        roomOne.setRoomType("cell");

        String roomOneInfo = roomOne.toString();
        System.out.println(roomOneInfo);

        MathTwo barrelinkitchenOne = new MathTwo();

      

        String barrelInKitchenOneInfo = barrelinkitchenOne.toString();
        System.out.println(barrelInKitchenOneInfo);

        
        Math4 mathTinyDoor = new Math4();

        mathTinyDoor.setOuncesPerMinute(20);
        mathTinyDoor.setFuelCapacity(24);
        mathTinyDoor.setBurnTime(16);

        String mathFour = mathTinyDoor.toString();
        System.out.println(mathFour);
    }

}
