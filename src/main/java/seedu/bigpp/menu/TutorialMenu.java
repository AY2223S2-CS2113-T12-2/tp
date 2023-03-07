package seedu.bigpp.menu;

import java.io.PrintStream;

public class TutorialMenu extends Menu {

    private static final PrintStream out = System.out;

    public static void printMenu() {
        out.println("PC tutorial");
        out.println("What would you like to do?");
        out.println("View tutorial");
        out.println("back");
        out.println("exit");
    }
}
