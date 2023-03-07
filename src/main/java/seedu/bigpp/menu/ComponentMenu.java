package seedu.bigpp.menu;

import java.io.PrintStream;

public class ComponentMenu extends Menu {

    private static final PrintStream out = System.out;

    public static void printComponent() {
        out.println("Component");
        out.println("What would you like to do?");
        out.println("View component");
        out.println("back");
        out.println("exit");
    }
}
