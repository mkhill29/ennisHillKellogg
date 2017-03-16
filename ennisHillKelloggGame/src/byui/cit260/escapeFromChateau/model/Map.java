/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Kristine Hill
 */
public class Map implements Serializable {

    //class instance variables
    private int rowCount;
    private int columnCount;
    private Room[][] rooms;

    public Map() {
    }
    
    public void init(int rows, int cols) {
        rowCount = rows;
        columnCount = cols;
        
        rooms = new Room[rowCount][columnCount];
        
        for(int r = 0; r < rowCount; r++) {
            for(int c = 0; c < columnCount; c++) {
                Room mainHall = new Room();
                mainHall.setName("Hallway");
                mainHall.setRow(r);
                mainHall.setColumn(c);
                mainHall.setDescription("You are in a boring hallway.");
                rooms[r][c] = mainHall;
            }
        }
        
        Room cell1 = new Room();
        cell1.setName("Prison Cell1");
        cell1.setRow(0);
        cell1.setColumn(0);
        cell1.setDescription("You are in a dark prison cell.");
        rooms[0][0] = cell1;
        
         Room cell2 = new Room();
        cell2.setName("Prison Cell2");
        cell2.setRow(0);
        cell2.setColumn(0);
        cell2.setDescription("You are still in a dark prison cell.");
        rooms[0][0] = cell2;
        
        Room cell3 = new Room();
        cell3.setName("Prison Cell3");
        cell3.setRow(0);
        cell3.setColumn(0);
        cell3.setDescription("You are in a dark prison cell, still!");
        rooms[0][0] = cell3;
        
        
        Room cell4 = new Room();
        cell4.setName("Prison Cell4");
        cell4.setRow(0);
        cell4.setColumn(0);
        cell4.setDescription("You are in a dark prison cell, for the 4th time!");
        rooms[0][0] = cell4;
        
         Room cell5 = new Room();
        cell5.setName("Prison Cell5");
        cell5.setRow(0);
        cell5.setColumn(0);
        cell5.setDescription("You are in a dark prison cell, for the 5th time!");
        rooms[0][0] = cell5;
        
        
         Room cell6 = new Room();
        cell6.setName("Prison Cell6");
        cell6.setRow(0);
        cell6.setColumn(0);
        cell6.setDescription("You are in a dark prison cell, for the 6th time!");
        rooms[0][0] = cell6;
        
        Room guardTower = new Room();
        guardTower.setName("Guard Tower");
        guardTower.setRow(0);
        guardTower.setColumn(0);
        guardTower.setDescription("You are in the Guard Tower now.");
        rooms[0][0] = guardTower;
        
        Room gateHouse = new Room();
        gateHouse.setName("Gate House");
        gateHouse.setRow(0);
        gateHouse.setColumn(0);
        gateHouse.setDescription("You are in the Gate House now.");
        rooms[0][0] = gateHouse;
        
        Room mainHall = new Room();
        mainHall.setName("Main Hall");
        mainHall.setRow(0);
        mainHall.setColumn(0);
        mainHall.setDescription("You are in the Main Hall.");
        rooms[0][0] = mainHall;
        
        Room wardensOffice = new Room();
        wardensOffice.setName("wardensOffice");
        wardensOffice.setRow(0);
        wardensOffice.setColumn(0);
        wardensOffice.setDescription("You are in the wardensOffice.");
        rooms[0][0] = wardensOffice;
        
        Room wardensQuarters = new Room();
        wardensQuarters.setName("wardensQuarters");
        wardensQuarters.setRow(0);
        wardensQuarters.setColumn(0);
        wardensQuarters.setDescription("You are in the wardensQuarters.");
        rooms[0][0] = wardensQuarters;
        
        
        Room nGuardTower = new Room();
        nGuardTower.setName("nGuardTower");
        nGuardTower.setRow(0);
        nGuardTower.setColumn(0);
        nGuardTower.setDescription("You are in the nGuardTower.");
        rooms[0][0] = nGuardTower;
        
                Room Kitchen = new Room();
        Kitchen.setName("Kitchen");
        Kitchen.setRow(0);
        Kitchen.setColumn(0);
        Kitchen.setDescription("You are in the Kitchen.");
        rooms[0][0] = Kitchen;
        
        Room Pantry = new Room();
        Pantry.setName("Pantry");
        Pantry.setRow(0);
        Pantry.setColumn(0);
        Pantry.setDescription("You are in the Pantry.");
        rooms[0][0] = Pantry;
        
        Room Larder = new Room();
        Larder.setName("Larder");
        Larder.setRow(0);
        Larder.setColumn(0);
        Larder.setDescription("You are in the Larder.");
        rooms[0][0] = Larder;
        
        Room broomCloset = new Room();
        broomCloset.setName("broomCloset");
        broomCloset.setRow(0);
        broomCloset.setColumn(0);
        broomCloset.setDescription("You are in the broomCloset.");
        rooms[0][0] = broomCloset;
        
        Room Armory = new Room();
        Armory.setName("Armory");
        Armory.setRow(0);
        Armory.setColumn(0);
        Armory.setDescription("You are in the Armory.");
        rooms[0][0] = Armory;
        
        Room storageRoom = new Room();
        storageRoom.setName("storageRoom");
        storageRoom.setRow(0);
        storageRoom.setColumn(0);
        storageRoom.setDescription("You are in the storageRoom.");
        rooms[0][0] = storageRoom;
        
        Room dungeon = new Room();
        dungeon.setName("dungeon");
        dungeon.setRow(0);
        dungeon.setColumn(0);
        dungeon.setDescription("You are in the dungeon.");
        rooms[0][0] = dungeon;
        
           
        Room uniformCloset = new Room();
        uniformCloset.setName("dungeon");
        uniformCloset.setRow(0);
        uniformCloset.setColumn(0);
        uniformCloset.setDescription("You are in the dungeon.");
        rooms[0][0] = uniformCloset;
        
               
        Room sGuardTower = new Room();
        sGuardTower.setName("sGuardTower");
        sGuardTower.setRow(0);
        sGuardTower.setColumn(0);
        sGuardTower.setDescription("You are in the sGuardTower.");
        rooms[0][0] = sGuardTower;
        
               
        Room GuardTowerheadquarters = new Room();
        GuardTowerheadquarters.setName("GuardTowerheadquarters");
        GuardTowerheadquarters.setRow(0);
        GuardTowerheadquarters.setColumn(0);
        GuardTowerheadquarters.setDescription("You are in the GuardTowerheadquarters.");
        rooms[0][0] = GuardTowerheadquarters;
        
               
        Room wBarracks = new Room();
        wBarracks.setName("wBarracks");
        wBarracks.setRow(0);
        wBarracks.setColumn(0);
        wBarracks.setDescription("You are in the EastBarracks.");
        rooms[0][0] = wBarracks;
        
               
        Room eBarracks = new Room();
        eBarracks.setName("wBarracks");
        eBarracks.setRow(0);
        eBarracks.setColumn(0);
        eBarracks.setDescription("You are in the East Barracks.");
        rooms[0][0] = eBarracks;
        //TODO fill up the rest of the rooms
    }

    public Room getRoomAt(int row, int col) {
        return rooms[row][col];
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.rowCount;
        hash = 41 * hash + this.columnCount;
        hash = 41 * hash + Arrays.deepHashCode(this.rooms);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.rooms, other.rooms)) {
            return false;
        }
        return true;
    }

}
