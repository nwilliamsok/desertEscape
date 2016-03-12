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

    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns <) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }

        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;

        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {

            Location location = new Location();
            location.setColumn(column);
            location.setRow(Row);
            location.setVisited(false);

            locations[row][column] = location;
        }

    }
}
