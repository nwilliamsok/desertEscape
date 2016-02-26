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

    public boolean displayWindChillView() {

        boolean done = false;
        while (!done) {
            System.out.println("\n" + this.promptMessage + "\n\nTemperature: ");

            double temp = this.gettemp();
            System.out.println("\nVelocity: ");
            double velocity = this.getvelocity();
            done = this.doAction(temp, velocity);
        }
        return true;
    }

    private double gettemp() {
        Scanner keyboard = new Scanner(System.in);
        double valuetemp;

        valuetemp = keyboard.nextInt();

        return valuetemp;
    }

    private double getvelocity() {
        Scanner keyboard = new Scanner(System.in);
        double valuevelocity;

        valuevelocity = keyboard.nextInt();

        return valuevelocity;
    }

    private boolean doAction(double temp, double velocity) {
        boolean done = false;
        do {
            System.out.println("\n====================================="
                    + "\n|   doAction Stub function   |"
                    + "\n====================================="
            );
            return true;
        } while (!done);
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
