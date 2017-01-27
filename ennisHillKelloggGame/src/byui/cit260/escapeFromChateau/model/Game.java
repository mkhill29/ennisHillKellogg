/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.model;

import java.io.Serializable;


/**
 *
 * @author Kristine Hill
 */
public class Game implements Serializable{
    
    // Class instance variable
    private double totalCaptures;
    private double escapesRemaining;

    public Game() {
    }
    
    

    public double getTotalCaptures() {
        return totalCaptures;
    }

    public void setTotalCaptures(double totalCaptures) {
        this.totalCaptures = totalCaptures;
    }

    public double getEscapesRemaining() {
        return escapesRemaining;
    }

    public void setEscapesRemaining(double escapesRemaining) {
        this.escapesRemaining = escapesRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalCaptures) ^ (Double.doubleToLongBits(this.totalCaptures) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.escapesRemaining) ^ (Double.doubleToLongBits(this.escapesRemaining) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalCaptures=" + totalCaptures + ", escapesRemaining=" + escapesRemaining + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalCaptures) != Double.doubleToLongBits(other.totalCaptures)) {
            return false;
        }
        if (Double.doubleToLongBits(this.escapesRemaining) != Double.doubleToLongBits(other.escapesRemaining)) {
            return false;
        }
        return true;
    }
    
    
    
}
