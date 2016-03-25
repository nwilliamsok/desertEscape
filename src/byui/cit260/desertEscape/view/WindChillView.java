/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.ObjectiveControl;
import exceptions.GameException;
import java.util.Scanner;

/**
 *
 * @author NicolasWilliams
 */
public class WindChillView extends View {

    private String promptMessage;

    public WindChillView() {

        this.promptMessage = "\nPlease Enter the Temperature and Velocity:";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        this.console.println(
                "\n*******************************************************"
                + "\n*            Calculate Wind Chill Factor              *"
                + "\n*******************************************************"
        );
    }

    public boolean displayWindChillView() throws GameException {

        boolean done = false;
        while (!done) {
            this.console.println("\n" + this.promptMessage + "\n\nTemperature: ");

            double temp = this.gettemp();
            this.console.println("\nVelocity: ");
            double velocity = this.getvelocity();

            if (velocity <= 0) {
                   ErrorView.display(this.getClass().getName(),"The velocity must be a number greater than 0.");
            } else {
                done = this.doAction(temp, velocity);
            }
        }
        return true;
    }

    private double gettemp() {
        double valuetemp;

        valuetemp = getDoubleFromKeyboard();

        return valuetemp;
    }

    private double getvelocity() {
        double valuevelocity;

        valuevelocity = getDoubleFromKeyboard();

        return valuevelocity;
    }

    private boolean doAction(double temp, double velocity) throws GameException {

        this.console.println("\n====================================="
                + "\n|   The Wind Chill Factor is: " + ObjectiveControl.calcWindChill(temp, velocity)
                + "  |"
                + "\n====================================="
        );
        return true;
    }

    public double getDoubleFromKeyboard() {
        boolean valid = false;

        try {
            while (!valid) {
                String input = keyboard.readLine();
                try {
                    double num = Double.parseDouble(input);
                    return num;
                } catch (Exception e) {
                       ErrorView.display(this.getClass().getName(),"Please enter a number." + e.getMessage());
                }
            }
        } catch (Exception e) {
               ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return 0;
    }
}
