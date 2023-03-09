package seedu.bigpp.menu;

import static seedu.bigpp.ui.UI.out;
import seedu.bigpp.pc.PCList;

public class PCViewerMenu extends Menu {

    public void printMenu() {
        out.println("PC viewer");
        PCList.printPcList();
        out.println("What would you like to do?");
        out.println("View PC");
        out.println("Build PC");
        out.println("back");
        out.println("exit");
    }
}
