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
public enum LocationType implements Serializable {

    Desert___("Desert"),
    Pyramid__("Pyramid"),
    Mountains("Mountains"),
    AlienCamp("Alien Camp"),
    Caves____("Caves"),
    Cliffs___("Caves");

    private final String LocationList;

    private LocationType(String LocationList) {
        this.LocationList = LocationList;
    }

    public String getLocationList() {
        return LocationList;
    }
}
