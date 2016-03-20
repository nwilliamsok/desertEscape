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
public class TimeMachineView {

    private String promptMessage;

    public TimeMachineView() {

        this.promptMessage = "\nPlease Enter Your Height(inches) and Weight(lbs):";
        //display the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {

        System.out.println(
                "\n*******************************************************"
                + "\n*         Calculate BMI & Build Time Machine          *"
                + "\n*******************************************************"
        );
    }

    public boolean displayTimeMachineView() throws GameException {

        boolean done = false;
        while (!done) {
            System.out.println("\n" + this.promptMessage + "\n\nHeight(inches): ");
            double BMI = 0;
            double height = this.getHeight();
            System.out.println("\nWeight(lbs): ");
            double weight = this.getWeight();

            if (height <= 0) {
                System.out.println("The height must be a number greater than 0.");
                if (weight <= 0) {
                    System.out.println("The weight must be a number greater than 0.");
                }

            } else {
                done = this.doAction(BMI);
            }
        }
        return true;
    }

    private double getHeight() {
        double valueHeight;

        valueHeight = getDoubleFromKeyboard();

        return valueHeight;
    }

    private double getWeight() {
        double valueWeight;

        valueWeight = getDoubleFromKeyboard();

        return valueWeight;
    }

    private boolean doAction(double BMI) throws GameException {

        System.out.println(ObjectiveControl.buildTimeMachine(BMI));
        return true;
    }

    public double getDoubleFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            String input = keyboard.nextLine();
            try {
                double num = Double.parseDouble(input);
                return num;
            } catch (Exception e) {
                System.out.println("Please enter a number.");
            }
        }

        return 0;
    }
}
