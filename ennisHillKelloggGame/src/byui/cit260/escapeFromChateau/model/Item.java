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
public class Item implements Serializable {

    //class instance variables
    private String item;
    private String magicPower;

    public enum PlayerItem {
        Lantern("lantern"),
        Fork("fork"),
        Chickenbone("Chicken bone"),
        Old_soldiers_hat("Old soldiers hat"),
        Rusty_Bowl("RustyBowl");
        
        private final String item;

        PlayerItem(String item) {
            this.item = item;
        }

        public String getAmount() {
            return this.item;
        }
    }

    public Item() {
        
    }

    public String getItem() {
        return item;
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
        hash = 17 * hash + Objects.hashCode(this.item);
        hash = 17 * hash + Objects.hashCode(this.magicPower);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "use=" + item + ", magicPower=" + magicPower + '}';
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
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.magicPower, other.magicPower)) {
            return false;
        }
        return true;
    }

}
