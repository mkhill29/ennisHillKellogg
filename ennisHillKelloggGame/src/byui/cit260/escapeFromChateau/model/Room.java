/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Heidi Ennis
 */
public class Room implements Serializable {

    private String discription;
    private String itemsAvailable;
    private String portals;
    private int row;
    private int column;
    private boolean isVisited;
    private String roomType;

    public Room() {
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(String itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.discription);
        hash = 53 * hash + Objects.hashCode(this.itemsAvailable);
        hash = 53 * hash + Objects.hashCode(this.portals);
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        hash = 53 * hash + (this.isVisited ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.roomType);
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
        if (!Objects.equals(this.discription, other.discription)) {
            return false;
        }
        if (!Objects.equals(this.itemsAvailable, other.itemsAvailable)) {
            return false;
        }
        if (!Objects.equals(this.portals, other.portals)) {
            return false;
        }
        if (!Objects.equals(this.roomType, other.roomType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Room{" + "discription=" + discription + ", itemsAvailable=" + itemsAvailable + ", portals=" + portals + ", row=" + row + ", column=" + column + ", isVisited=" + isVisited + ", roomType=" + roomType + '}';
    }

   
  
    
    
}
