package seedu.bigpp.ui;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;
import seedu.bigpp.menu.BuilderMenu;
import seedu.bigpp.menu.ComponentMenu;
import seedu.bigpp.menu.MainMenu;
import seedu.bigpp.menu.PCViewerMenu;
import seedu.bigpp.menu.TutorialMenu;

public abstract class UI {
    
    public static Stack<UIState> visitedMenusStack = new Stack<UIState>();
    public static final String LOGO = "add logo here";
    private static final String DIVIDER = "===================================================";
    private static final Scanner in = new Scanner(System.in);
    private static final PrintStream out = System.out;
    private static UIState uiState = UIState.MAIN_MENU;

    public static void initializeVisitedMenusStack() {
        visitedMenusStack.push(UIState.MAIN_MENU);
    }

    public static UIState getUiState() {
        return uiState;
    }

    public static String getInput() {
        return in.nextLine();
    }

    public static void updateUI() {
        clearTerminal();
        out.println(DIVIDER);

        switch (uiState) {
        case MAIN_MENU:
            MainMenu.printMenu();
            break;
        case VIEWER:
            PCViewerMenu.printMenu();
            break;
        case BUILDER:
            BuilderMenu.printMenu();
            break;
        case TUTORIAL:
            TutorialMenu.printMenu();
            break;
        case COMPONENT:
            ComponentMenu.printMenu();
            break;
        default:
            break;
        }

        out.println(DIVIDER);
    }

    public static void clearTerminal() {
        out.println("\033[H\033[2J");
    }

    public static void showResult(String result) {
        out.println(result);
    }

    public static void setMainMenuMode() {
        visitedMenusStack.push(UIState.MAIN_MENU);
        uiState = UIState.MAIN_MENU;
    }

    public static void setViewerMode() {
        visitedMenusStack.push(UIState.VIEWER);
        uiState = UIState.VIEWER;
    }

    public static void setBuilderMode() {
        visitedMenusStack.push(UIState.BUILDER);
        uiState = UIState.BUILDER;
    }

    public static void setTutorialMode() {
        visitedMenusStack.push(UIState.TUTORIAL);
        uiState = UIState.TUTORIAL;
    }

    public static void setComponentMode() {
        visitedMenusStack.push(UIState.COMPONENT);
        uiState = UIState.COMPONENT;
    }
}
