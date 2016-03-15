/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import byui.cit260.desertEscape.model.Scene;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author NicolasWilliams
 */
public class MapControl implements Serializable{

    static MapControl createMap() {
Map map = new Map(20,20);

Scene[] scenes = createScenes();

GameControl.assignScenesToLocations(map, scenes);

return map;
    }
    
    static MapControl moveCharactersToStartingLocation() {
        System.out.println("moveCharactersToStartingLocation function called");
        return null;
    }
    
}
