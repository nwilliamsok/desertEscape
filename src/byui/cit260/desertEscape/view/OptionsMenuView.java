/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.desertEscape.view;


/**
 *
 * @author NicolasWilliams
 */
public class OptionsMenuView extends View {

    public OptionsMenuView() {
        super("\n                                          "
                + "\n------------------------------------------"
                + "\n|             Options Menu               |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           D - Difficulty                 "
                + "\n           H -    Help                    "
                + "\n           B -    Back                    "
                + "\n           Q -    Quit                    "
                + "\n                                          "
                + "\n------------------------------------------");
    }

    @Override
    public void display() {

        this.console.println("\n" + this.displayMessage);

        boolean done = false;
        do {

            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);
    }

    @Override
    public String getInput() {

        String value = "";
        boolean valid = false;
try {
        while (!valid) {
            this.console.println("\nSelect an option");

            value = keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                   ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }

            break;

        }
} catch (Exception e) {
       ErrorView.display(this.getClass().getName(),"Error in OptionsMenuView " + e.getMessage());
}
        return value;

    }

    @Override
    public boolean doAction(String value) {

        try {
        value = value.toUpperCase();

        switch (value) {
            case "D":
                this.difficulty();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "B":
                return true;               

            default:
                   ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again, It's not that hard.");
                break;

        }
        } catch (Exception e) {
               ErrorView.display(this.getClass().getName(),"Error in OptionsMenuView" + e.getMessage());
        }
        return true;

    }

    private void difficulty() {
        DifficultyMenuView difficultyMenuView = new DifficultyMenuView();
        difficultyMenuView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

   

}
