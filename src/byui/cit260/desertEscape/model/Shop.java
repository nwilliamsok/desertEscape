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
public class Shop implements Serializable{
    
    public String inventoryType;
    private String shopType;
    public double iQuantity;
    private double sQuantity;

    public Shop() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public double getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(double iQuantity) {
        this.iQuantity = iQuantity;
    }

    public double getsQuantity() {
        return sQuantity;
    }

    public void setsQuantity(double sQuantity) {
        this.sQuantity = sQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.inventoryType);
        hash = 89 * hash + Objects.hashCode(this.shopType);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.iQuantity) ^ (Double.doubleToLongBits(this.iQuantity) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.sQuantity) ^ (Double.doubleToLongBits(this.sQuantity) >>> 32));
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
        final Shop other = (Shop) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.shopType, other.shopType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iQuantity) != Double.doubleToLongBits(other.iQuantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sQuantity) != Double.doubleToLongBits(other.sQuantity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shop{" + "inventoryType=" + inventoryType + ", shopType=" + shopType + ", iQuantity=" + iQuantity + ", sQuantity=" + sQuantity + '}';
    }
    
    
    
}
