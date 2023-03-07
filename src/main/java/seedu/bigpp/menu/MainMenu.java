package seedu.bigpp.menu;

import seedu.bigpp.ui.UI;
import java.io.PrintStream;

public class MainMenu extends Menu {

    private static final PrintStream out = System.out;

    public static void printMenu() {
        out.println(UI.LOGO);
        out.println("Welcome to BigPP!");
        out.println("What would you like to do?");
        out.println("PC viewer");
        out.println("PC tutorial");
        out.println("exit");
    }
}
