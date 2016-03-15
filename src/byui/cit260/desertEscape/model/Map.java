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
public class Map implements Serializable {

    public static final int NUM_ROWS;
    public static final int NUM_COLS;

    private Location[][] matrix;

    public Map() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
    }

    public void init() {
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; row < NUM_COLS; col++) {
                Location loc = new Location();
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);

                matrix[row][col] = loc;
            }

            this.matrix = new Location[NUM_ROWS][NUM_COLS];
        }

    }

    public String getMapString() {

        String rtn = "";
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; row < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name().charAt(0) + "\t";
            }
            rtn += "\t";
        }
        return rtn;
    }

    public static int getNUM_ROWS() {
        return NUM_ROWS;
    }

    public static int getNUM_COLS() {
        return NUM_COLS;
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    public Location getLocation(int row, int col)

    {
        return matrix[row][col];
    }

}
