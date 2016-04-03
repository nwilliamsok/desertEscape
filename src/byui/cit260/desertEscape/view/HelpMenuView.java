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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n                                          "
                + "\n------------------------------------------"
                + "\n|              Help Menu                 |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n           S - Storyline                  "
                + "\n           A - About Game                 "
                + "\n           M - Main Menu                  "
                + "\n           Q -    Quit                    "
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        try {
            value = value.toUpperCase();

            switch (value) {
                case "S":
                    this.storyLine();
                    break;
                case "A":
                    this.about();
                    break;
                case "M":
                    return true;
                case "Q":
                    return true;
                default:
                    ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try again, It's not that hard.");
                    break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error in Help Menu View");
        }
        return false;

    }

    public void storyLine() {
        this.console.println(
                "\n                                          "
                + "\n------------------------------------------"
                + "\n|               Storyline                |"
                + "\n------------------------------------------"
                + "\n                                          "
                + "\n              You are ALONE               "
                + "\n      You wake up among the wreakage      "
                + "\n        Of your crashed escape pod        "
                + "\n                                          "
                + "\n            It's hot, very hot.           "
                + "\n  And you cant seem to get your bearings  "
                + "\n   After a few moments, your eyes adjust  "
                + "\n   And you are able to see that you are   "
                + "\n     Definitely in some sort of desert    "
                + "\n                                          "
                + "\n    'I REALLY hope this whole planet      "
                + "\n             is not a desert'             "
                + "\n                                          "
                + "\n       You must find some resources       "
                + "\n     To aid in your survival among the    "
                + "\n       Seemingly endless sea of sand      "
                + "\n                                          "
                + "\n      Hopefully other survivors made      "
                + "\n     It off of mother earth after the     "
                + "\n         Aliens came to terraform         "
                + "\n    Lets see what we can find on this     "
                + "\n                  Planet                  "
                + "\n                                          "
                + "\n------------------------------------------");
    }

    public void about() {
        this.console.println(
                "\n                                          "
                + "\n------------------------------------------"
                + "\n|   Collect items and find survivors     |"
                + "\n|    To aid in your survival on the      |"
                + "\n|             Desert planet              |"
                + "\n|                                        |"
                + "\n|    Find a way to save mother earth     |"
                + "\n|   From the aliens that have come to    |"
                + "\n|          Terraform the planet          |"
                + "\n|                                        |"
                + "\n|         *      Game by:     *          |"
                + "\n|         *  Nicolas Willams  *          |"
                + "\n|         *         &         *          |"
                + "\n|         *   Austin Hanson   *          |"
                + "\n------------------------------------------"
                + "\n                                          ");
    }

}
