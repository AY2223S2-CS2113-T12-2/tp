package seedu.bigpp.menu;

import java.io.PrintStream;

public class PCViewerMenu extends Menu {

    private static final PrintStream out = System.out;

    public static void printMenu() {
        out.println("PC viewer");
        out.println("What would you like to do?");
        out.println("View PC");
        out.println("Build PC");
        out.println("back");
        out.println("exit");
    }
    
}
