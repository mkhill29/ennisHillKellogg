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
public class Math4 implements Serializable {

    //class instance variables
    private double ouncesPerMinute;
    private double fuelCapacity;
    private double burnTime;

    public Math4() {
    }

    public double getOuncesPerMinute() {
        return ouncesPerMinute;
    }

    public void setOuncesPerMinute(double ouncesPerMinute) {
        this.ouncesPerMinute = ouncesPerMinute;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(double burnTime) {
        this.burnTime = burnTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.ouncesPerMinute) ^ (Double.doubleToLongBits(this.ouncesPerMinute) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.fuelCapacity) ^ (Double.doubleToLongBits(this.fuelCapacity) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.burnTime) ^ (Double.doubleToLongBits(this.burnTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Math4{" + "ouncesPerMinute=" + ouncesPerMinute + ", fuelCapacity=" + fuelCapacity + ", burnTime=" + burnTime + '}';
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
        final Math4 other = (Math4) obj;
        if (Double.doubleToLongBits(this.ouncesPerMinute) != Double.doubleToLongBits(other.ouncesPerMinute)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelCapacity) != Double.doubleToLongBits(other.fuelCapacity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.burnTime) != Double.doubleToLongBits(other.burnTime)) {
            return false;
        }
        return true;
    }

}
