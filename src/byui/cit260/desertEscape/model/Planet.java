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

    public static final int NUM_ROWS = 8;
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

    public String getPlanetString() {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name();
                
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
}