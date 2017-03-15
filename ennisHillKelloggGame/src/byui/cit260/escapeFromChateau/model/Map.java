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
                Room hallway = new Room();
                hallway.setName("Hallway");
                hallway.setRow(r);
                hallway.setColumn(c);
                hallway.setDescription("You are in a boring hallway.");
                rooms[r][c] = hallway;
            }
        }
        
        Room cell = new Room();
        cell.setName("Prison Cell");
        cell.setRow(0);
        cell.setColumn(0);
        cell.setDescription("You are in a dark prison cell.");
        rooms[0][0] = cell;
        
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
