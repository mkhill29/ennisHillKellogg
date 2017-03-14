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
    private int itemPoints;

    public Item(String itemDiscription, int itemPoints, String magicPower ) {
        itemDiscription = this.item;
        itemPoints = this.itemPoints;
        magicPower = this.magicPower;
    }

    public enum PlayerItem {
        Lantern("Lantern"),
        Fork("Fork"),
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

    /*public Item() {

    }*/

    public String getItem() {
        return item;
    }

    public String getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(String magicPower) {
        this.magicPower = magicPower;
    }

    public int getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(int itemPoints) {
        this.itemPoints = itemPoints;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.item);
        hash = 17 * hash + Objects.hashCode(this.magicPower);
        return hash;
    }

   /* @Override
    public String toString() {
        itemDiscription = this.item;
        itemPoints = this.itemPoints;
        magicPower = this.magicPower;
        //return "Item{" + "use=" + item + ", magicPower=" + magicPower + '}';
                return "Item{" + "itemDiscription=" + itemDiscription + ", itemPoints=" + itemPoints  + ", magicPower=" + magicPower};

    }*/

    /*@Override
    public String toString() {
        return "Item{" + "item=" + item + ", magicPower=" + magicPower + ", itemPoints=" + itemPoints + '}
        ;
    }*/

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
