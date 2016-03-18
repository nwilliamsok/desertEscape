/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

import exceptions.GameException;
import java.io.Serializable;

/**
 *
 * @author NicolasWilliams
 */
public class ObjectiveControl implements Serializable{

    public static double calcVolumeOfPit(double height, double width, double length) throws GameException {

        if (height <= 0) {
throw new GameException ("Height must be greater than 0.");        }

        if (width <= 0) {
throw new GameException ("Width must be greater than 0.");        }

        if (length <= 0) {
throw new GameException ("Length must be greater than 0.");        }

        double volume = height * width * length;
        return volume;

    }

    public static double calcWindChill(double temp, double velocity) throws GameException {

        if (velocity < 1) {
throw new GameException ("Velocity must be greater than 1");
        }

        double windChill = Math.round(((35.74 + (0.6215 * temp) - (35.75 * (Math.pow(velocity, 0.16))) + (0.4275 * temp * (Math.pow(velocity, 0.16)))) * 2) / 2);
        return windChill;

    }

}
