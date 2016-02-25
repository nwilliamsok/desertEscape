/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.control;

/**
 *
 * @author NicolasWilliams
 */
public class ObjectiveControl {

    public static double calcVolumeOfPit(double height, double width, double length) {

        if (height <= 0) {
            return -1;
        }

        if (width <= 0) {
            return -1;
        }

        if (length <= 0) {
            return -1;
        }

        double volume = height * width * length;
        return volume;

    }

    public static double calcWindChill(double temp, double velocity) {

        if (velocity < 1) {
            return -1;
        }

        double windChill = Math.round(((35.74 + (0.6215 * temp) - (35.75 * (Math.pow(velocity, 0.16))) + (0.4275 * temp * (Math.pow(velocity, 0.16)))) * 2) / 2);
        return windChill;

    }

}
