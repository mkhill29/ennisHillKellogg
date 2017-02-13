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
 * @author Kristine Hill
 */
public class Math implements Serializable {

    //class instance variables
    private double roomWidth;
    private double roomLength;
    private double roomHeight;

    public Math() {
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(double roomLength) {
        this.roomLength = roomLength;
    }

    public double getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(double roomHeight) {
        this.roomHeight = roomHeight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.roomWidth) ^ (Double.doubleToLongBits(this.roomWidth) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.roomLength) ^ (Double.doubleToLongBits(this.roomLength) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.roomHeight) ^ (Double.doubleToLongBits(this.roomHeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Math{" + "roomWidth=" + roomWidth + ", roomLength=" + roomLength + ", roomHeight=" + roomHeight + '}';
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
        final Math other = (Math) obj;
        if (Double.doubleToLongBits(this.roomWidth) != Double.doubleToLongBits(other.roomWidth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.roomLength) != Double.doubleToLongBits(other.roomLength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.roomHeight) != Double.doubleToLongBits(other.roomHeight)) {
            return false;
        }
        return true;
    }

}
