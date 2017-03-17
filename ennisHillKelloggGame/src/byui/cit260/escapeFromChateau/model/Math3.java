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
public class Math3 implements Serializable{
    
    //class instance variables
    private double triangleLockSideA;
    private double triangleLockSideB;
    private double trianlgeLockSideC;

    public Math3() {
    }

    public double getTriangleLockSideA() {
        return triangleLockSideA;
    }

    public void setTriangleLockSideA(double triangleLockSideA) {
        this.triangleLockSideA = triangleLockSideA;
    }

    public double getTriangleLockSideB() {
        return triangleLockSideB;
    }

    public void setTriangleLockSideB(double triangleLockSideB) {
        this.triangleLockSideB = triangleLockSideB;
    }

    public double getTrianlgeLockSideC() {
        return trianlgeLockSideC;
    }

    public void setTrianlgeLockSideC(double trianlgeLockSideC) {
        this.trianlgeLockSideC = trianlgeLockSideC;
        
    }
//I need to find out why this says Double.double twice 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.triangleLockSideA) ^ (Double.doubleToLongBits(this.triangleLockSideA) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.triangleLockSideB) ^ (Double.doubleToLongBits(this.triangleLockSideB) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.trianlgeLockSideC) ^ (Double.doubleToLongBits(this.trianlgeLockSideC) >>> 32));
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
        final Math3 other = (Math3) obj;
        if (Double.doubleToLongBits(this.triangleLockSideA) != Double.doubleToLongBits(other.triangleLockSideA)) {
            return false;
        }
        if (Double.doubleToLongBits(this.triangleLockSideB) != Double.doubleToLongBits(other.triangleLockSideB)) {
            return false;
        }
        if (Double.doubleToLongBits(this.trianlgeLockSideC) != Double.doubleToLongBits(other.trianlgeLockSideC)) {
            return false;
        }
        return true;
    }
}