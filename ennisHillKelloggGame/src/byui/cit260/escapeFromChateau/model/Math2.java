/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.model;

import java.io.Serializable;

/**
 *
 * @author amikellogg
 */
public class Math2 implements Serializable {
    
    //class instance variables
    private double stoneLength;
    private double stoneWidth;
    private double stoneHeight;

    public Math2() {
    }

    
    
    public double getStoneLength() {
        return stoneLength;
    }

    public void setStoneLength(double stoneLength) {
        this.stoneLength = stoneLength;
    }

    public double getStoneWidth() {
        return stoneWidth;
    }

    public void setStoneWidth(double stoneWidth) {
        this.stoneWidth = stoneWidth;
    }

    public double getStoneHeight() {
        return stoneHeight;
    }

    public void setStoneHeight(double stoneHeight) {
        this.stoneHeight = stoneHeight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.stoneLength) ^ (Double.doubleToLongBits(this.stoneLength) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.stoneWidth) ^ (Double.doubleToLongBits(this.stoneWidth) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.stoneHeight) ^ (Double.doubleToLongBits(this.stoneHeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Math2{" + "stoneLength=" + stoneLength + ", stoneWidth=" + stoneWidth + ", stoneHeight=" + stoneHeight + '}';
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
        final Math2 other = (Math2) obj;
        if (Double.doubleToLongBits(this.stoneLength) != Double.doubleToLongBits(other.stoneLength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.stoneWidth) != Double.doubleToLongBits(other.stoneWidth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.stoneHeight) != Double.doubleToLongBits(other.stoneHeight)) {
            return false;
        }
        return true;
    }
    
    
    
}
