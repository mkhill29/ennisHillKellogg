/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Heidi Ennis
 */
public class Room implements Serializable {

    /*private attributes;*/
    private String description;
    private Item item;
    private String portals;
    private int row;
    private int column;
    private boolean isVisited;
    private String roomType;
    private String name;

    public Room() {
    }

    String[] roomName
            = {"Gate House", "Main Hall", "Warden's Office", "Warden's Quarters", "N. Guard Tower"
                + "\nKitchen", "Pantry", "Larder", "Broom Closet", "Armory"
                + "\nCell 1", "Cell 2", "Cell 3", "Storage Room", "Guard Room"
                + "\nCell 4", "Cell 5", "Cell 6", "Dungeon", "Uniform Closet"
                + "\nS. Guard Tower", "Guards Head Quarter", "W. Barracks", "E. Barracks"

            };

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRoomName() {
        return roomName;
    }

    public void setRoomName(String[] roomName) {
        this.roomName = roomName;
    }

    public String getDiscription() {
        return description;
    }

    public void setDiscription(String discription) {
        this.description = discription;
    }

    public String getPortals() {
        return portals;
    }

    public void setPortals(String portals) {
        this.portals = portals;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.item);
        hash = 37 * hash + Objects.hashCode(this.portals);
        hash = 37 * hash + this.row;
        hash = 37 * hash + this.column;
        hash = 37 * hash + (this.isVisited ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.roomType);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Arrays.deepHashCode(this.roomName);
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
        final Room other = (Room) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.isVisited != other.isVisited) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.portals, other.portals)) {
            return false;
        }
        if (!Objects.equals(this.roomType, other.roomType)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Arrays.deepEquals(this.roomName, other.roomName)) {
            return false;
        }
        return true;
    }

}
