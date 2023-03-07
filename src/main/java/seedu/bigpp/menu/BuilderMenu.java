package seedu.bigpp.menu;

import java.io.PrintStream;

public class BuilderMenu extends Menu {

    private static final PrintStream out = System.out;

    public static void printMenu() {
        out.println("PC builder");
        out.println("What would you like to do?");
        out.println("Add component");
        out.println("Remove component");
        out.println("View PC");
        out.println("back");
        out.println("exit");
    }
    
}
