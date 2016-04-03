/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.io.Serializable;

/**
 *
 * @author NicolasWilliams
 */
public class Planet implements Serializable{

    public static final int NUM_ROWS = 5;
    public static final int NUM_COLS = 8;

    private Location[][] matrix;

    public Planet() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
    }

    public void init() {

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location loc = new Location();

                //Create a random location type
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                loc.setRow(row);
                loc.setCol(col);

                matrix[row][col] = loc;
            }
        }
    }

    public String getSurvivorString() {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name();
                
               if (matrix[row][col].getSurvivor() != null){
                  rtn += matrix[row][col].getSurvivor().getName().charAt(0);
               }
                
                rtn += "\t";
            }
            rtn += "\n\n";
        }

        return rtn;
    }
    
    public String getItemString() {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name();
                
               if (matrix[row][col].getItem() != null){
                  rtn += matrix[row][col].getItem().getName().charAt(0);
               }
                
                rtn += "\t";
            }
            rtn += "\n\n";
        }

        return rtn;
    }
    
    public String getPlanetString(Location currentLocation) {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name();
                if(matrix[row][col] == currentLocation) {
                    rtn += "*";
                }
                
                rtn += "\t";
            }
            rtn += "\n\n";
        }

        return rtn;
    }

    public Location getLocation(int row, int col) {
        return matrix[row][col];
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        return "Planet{" + "matrix=" + matrix + '}';
    }
    
    
}