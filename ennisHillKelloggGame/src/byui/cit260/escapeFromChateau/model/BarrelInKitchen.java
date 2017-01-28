/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.model;

import java.io.Serializable;

/**
 *
 * @author Heidi Ennis
 */
public class BarrelInKitchen implements Serializable{

    private int radiusAtTopAndBottom;
    private int radiusAtMiddle;
    private int height;

    public BarrelInKitchen() {
    }
    
    

    public int getRadiusAtTopAndBottom() {
        return radiusAtTopAndBottom;
    }

    public void setRadiusAtTopAndBottom(int radiusAtTopAndBottom) {
        this.radiusAtTopAndBottom = radiusAtTopAndBottom;
    }

    public int getRadiusAtMiddle() {
        return radiusAtMiddle;
    }

    public void setRadiusAtMiddle(int radiusAtMiddle) {
        this.radiusAtMiddle = radiusAtMiddle;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.radiusAtTopAndBottom;
        hash = 97 * hash + this.radiusAtMiddle;
        hash = 97 * hash + this.height;
        return hash;
    }

    @Override
    public String toString() {
        return "BarrelInKitchen{" + "radiusAtTopAndBottom=" + radiusAtTopAndBottom + ", radiusAtMiddle=" + radiusAtMiddle + ", height=" + height + '}';
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
        final BarrelInKitchen other = (BarrelInKitchen) obj;
        if (this.radiusAtTopAndBottom != other.radiusAtTopAndBottom) {
            return false;
        }
        if (this.radiusAtMiddle != other.radiusAtMiddle) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }
    

    
}
