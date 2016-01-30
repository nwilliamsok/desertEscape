/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author NicolasWilliams
 */
public class Inventory implements Serializable{
    
    public String inventoryType;
    public double iQuantity;
    public String requiredType;
    public double requiredAmount;

    public Inventory() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(double iQuantity) {
        this.iQuantity = iQuantity;
    }

    public String getRequiredType() {
        return requiredType;
    }

    public void setRequiredType(String requiredType) {
        this.requiredType = requiredType;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.inventoryType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.iQuantity) ^ (Double.doubleToLongBits(this.iQuantity) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.requiredType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iQuantity) != Double.doubleToLongBits(other.iQuantity)) {
            return false;
        }
        if (!Objects.equals(this.requiredType, other.requiredType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", iQuantity=" + iQuantity + ", requiredType=" + requiredType + ", requiredAmount=" + requiredAmount + '}';
    }
    
    
}
