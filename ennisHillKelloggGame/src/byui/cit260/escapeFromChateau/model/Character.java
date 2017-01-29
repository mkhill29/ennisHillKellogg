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
public class Character implements Serializable{
    
    //class instance variables
    private String characterType;
    private String characterLocation;

    public Character() {
    }

    
    
    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getCharacterLocation() {
        return characterLocation;
    }

    public void setCharacterLocation(String characterLocation) {
        this.characterLocation = characterLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.characterType);
        hash = 23 * hash + Objects.hashCode(this.characterLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "characterType=" + characterType + ", characterLocation=" + characterLocation + '}';
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.characterType, other.characterType)) {
            return false;
        }
        if (!Objects.equals(this.characterLocation, other.characterLocation)) {
            return false;
        }
        return true;
    }
    
    
}
