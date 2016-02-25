/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;

import byui.cit260.desertEscape.control.ObjectiveControl;
import java.util.Scanner;

/**
 *
 * @author NicolasWilliams
 */
public class WindChillView {

    private String promptMessage;

    public WindChillView() {

        this.promptMessage = "\nPlease Enter the Temperature and Velocity:";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        System.out.println(
                "\n*******************************************************"
                + "\n*            Calculate Wind Chill Factor              *"
                + "\n*******************************************************"
        );
    }

    public void displayWindChillView() {

        boolean done = false;
        do {
            double temp = this.gettemp();
            double velocity = this.getvelocity();

            done = this.doAction(temp, velocity);
        } while (!done);

    }

    private double gettemp() {
        Scanner keyboard = new Scanner(System.in);
        double value;
        value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");

                continue;
            }

            break;

        }
        return value;
    }

    private double getvelocity() {
        Scanner keyboard = new Scanner(System.in);
        double valuevelocity;
        valuevelocity = 0;
        boolean valid = false;

        while (!valid) {

            valuevelocity = keyboard.nextLine();
            valuevelocity = valuevelocity.trim();

            if (valuevelocity.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");

                continue;
            }

            break;

        }
        return value;
    }

    private boolean doAction(double temp, double velocity) {

        ObjectiveControl objectiveControl = new ObjectiveControl();
        double windChill = objectiveControl.calcWindChill(temp, velocity);

        return true;
    }

    private void displayNextView() {
        System.out.println("\n====================================="
                + "\n|   This is where the output goes   |"
                + "\n====================================="
        );

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

}
