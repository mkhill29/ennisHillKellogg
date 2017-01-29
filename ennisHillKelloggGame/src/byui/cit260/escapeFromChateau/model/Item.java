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
 * @author amikellogg
 */
public class Item implements Serializable{
    
    //class instance variables
    private String use;
    private String magicPower;

    public Item() {
    }

    
    
    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(String magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.use);
        hash = 17 * hash + Objects.hashCode(this.magicPower);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "use=" + use + ", magicPower=" + magicPower + '}';
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.use, other.use)) {
            return false;
        }
        if (!Objects.equals(this.magicPower, other.magicPower)) {
            return false;
        }
        return true;
    }
    
    
}
