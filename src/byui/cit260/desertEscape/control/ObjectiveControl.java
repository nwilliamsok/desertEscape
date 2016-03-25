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
public class ObjectiveControl implements Serializable {

    public static double calcVolumeOfPit(double height, double width, double length) throws GameException {

        if (height <= 0) {
            throw new GameException("Height must be greater than 0.");
        }

        if (width <= 0) {
            throw new GameException("Width must be greater than 0.");
        }

        if (length <= 0) {
            throw new GameException("Length must be greater than 0.");
        }

        double volume = height * width * length;
        return volume;

    }

    public static double calcWindChill(double temp, double velocity) throws GameException {

        if (velocity < 1) {
            throw new GameException("Velocity must be greater than 1");
        }

        double windChill = Math.round(((35.74 + (0.6215 * temp) - (35.75 * (Math.pow(velocity, 0.16))) + (0.4275 * temp * (Math.pow(velocity, 0.16)))) * 2) / 2);
        return windChill;

    }

    public static String buildTimeMachine(double BMI) throws GameException {

        String gameStatus = "You must escape the desert and save your planet.";
        if (BMI < 1) {
            throw new GameException("/nBMI must be greater than 1");
        }

        if (BMI < 18.5) {
            gameStatus = "I'm sorry, you're underweight and the time machine will fry you with radiation. Try putting on some more pounds to save your planet.";
        } else if (BMI < 25) {
            gameStatus = "******************YOU WON THE GAME!********************";
        } else if (BMI < 30) {
            gameStatus = "You are overweight, and you need more resources to build a bigger device.";
        } else {
            return "This just isn't going to work for you buddy. You really gotta slim down or build a much bigger time machine.";
        }

        return gameStatus;
    }

    public static double calcBMI(double height, double weight) throws GameException {
        if (height < 1 && weight < 1) {
            throw new GameException(" Weight and Height must be greater than 1");
        }
        if (weight < 1) {
            throw new GameException(" Weight must be greater than 1");
        }
        if (height < 1) {
            throw new GameException(" Height must be greater than 1");
        }

        double BMI = Math.round((weight * 703 / Math.pow(height, 2)));
        return BMI;
    }
}
