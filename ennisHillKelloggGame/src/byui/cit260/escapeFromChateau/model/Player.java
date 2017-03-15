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
public class Player implements Serializable {

    // class instance variables
    private String name;
    private double inventory;
    private Room currentRoom;

    private Player player;

    public Player() {
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInventory() {
        return inventory;
    }

    public void setInventory(double inventory) {
        this.inventory = inventory;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.inventory) ^ (Double.doubleToLongBits(this.inventory) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", inventory=" + inventory + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.inventory) != Double.doubleToLongBits(other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
