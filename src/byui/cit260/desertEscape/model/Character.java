/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author NicolasWilliams
 */
public enum Character implements Serializable {

    
    Joe("He is strong."),
    Matt("He is brave."),
    Ben("He is smart."),
    John("He is quick."),
    Tom("He is just an example and will be deleted from the game before the final release."),
    Samantha("She is a woman."),
    Gary("He is also a woman."),
    Player1("Player1 is not even a real person and did not even deserve a name."),
    ThePlayerFormerlyKnownAsMousecop("University of Missouri, Columbia.");
    
    
    private final String description;
    private final Point coordinates;

    private Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
        
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "description=" + description + ", coordinates=" + coordinates + '}';
    }

}
