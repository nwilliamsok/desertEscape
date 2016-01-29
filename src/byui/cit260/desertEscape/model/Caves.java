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
 * @author Austin
 */
public class Caves implements Serializable{
    //class instance variables
    private double Visited;
    private double amountRemaining;
    private double Row;
    private double Column;
    private String Description;
    private double resourceGems;

    public Caves() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.Visited) ^ (Double.doubleToLongBits(this.Visited) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.Row) ^ (Double.doubleToLongBits(this.Row) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.Column) ^ (Double.doubleToLongBits(this.Column) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.Description);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.resourceGems) ^ (Double.doubleToLongBits(this.resourceGems) >>> 32));
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
        final Caves other = (Caves) obj;
        if (Double.doubleToLongBits(this.Visited) != Double.doubleToLongBits(other.Visited)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Row) != Double.doubleToLongBits(other.Row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Column) != Double.doubleToLongBits(other.Column)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourceGems) != Double.doubleToLongBits(other.resourceGems)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caves{" + "Visited=" + Visited + ", amountRemaining=" + amountRemaining + ", Row=" + Row + ", Column=" + Column + ", description=" + Description + ", resourceGems=" + resourceGems + '}';
    }
    
    
    public double getVisited() {
        return Visited;
    }

    public void setVisited(double Visited) {
        this.Visited = Visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public double getRow() {
        return Row;
    }

    public void setRow(double Row) {
        this.Row = Row;
    }

    public double getColumn() {
        return Column;
    }

    public void setColumn(double Column) {
        this.Column = Column;
    }

    public double getResourceGems() {
        return resourceGems;
    }

    public void setResourceGems(double resourceGems) {
        this.resourceGems = resourceGems;
    }

    public void setDescription(String this_is_the_Description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
