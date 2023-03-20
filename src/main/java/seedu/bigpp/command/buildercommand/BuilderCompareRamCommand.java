package seedu.bigpp.command.buildercommand;

import seedu.bigpp.command.Command;
import seedu.bigpp.component.ram.RAM;
import seedu.bigpp.datastorage.DataStorage;
import seedu.bigpp.exceptions.PPIndexOutOfBoundsException;
import seedu.bigpp.exceptions.builderexceptions.BuilderInvalidTypeException;
import seedu.bigpp.exceptions.builderexceptions.BuilderMissingIndexException;

public class BuilderCompareRamCommand extends Command {
    public BuilderCompareRamCommand(String arguments) {
        setArguments(arguments);
    }

    /**
     * Compare all the specifications between 2 selected ram components
     * @return the comparison table of the 2 components
     */
    @Override
    public String executeCommand(DataStorage dataStorage)
            throws BuilderMissingIndexException, BuilderInvalidTypeException, PPIndexOutOfBoundsException {
        String inputString = getArguments();

        // throw exception if command does not contain "&"
        if (!inputString.contains("&")) {
            throw new BuilderMissingIndexException();
        }

        String[] componentIndexes = inputString.split("&", 2);
        String firstComponent = componentIndexes[0].trim();
        String secondComponent = componentIndexes[1].trim();

        //check if firstComponent and secondComponent is a number
        int firstComponentIndex;
        int secondComponentIndex;
        try {
            firstComponentIndex = Integer.parseInt(firstComponent) - 1;
            secondComponentIndex = Integer.parseInt(secondComponent) - 1;
        } catch (NumberFormatException e) {
            throw new BuilderInvalidTypeException();
        }

        //check if index is out of bounds
        if (firstComponentIndex < 0 || firstComponentIndex >= dataStorage.stringToComponentListMap.get("ram").size()) {
            throw new PPIndexOutOfBoundsException();
        }
        if (secondComponentIndex < 0 || secondComponentIndex >= dataStorage.stringToComponentListMap.get("ram")
                .size()) {
            throw new PPIndexOutOfBoundsException();
        }

        //get the 2 components
        RAM firstComponentObject = (RAM) dataStorage.stringToComponentListMap.get("ram").get(firstComponentIndex);
        RAM secondComponentObject = (RAM) dataStorage.stringToComponentListMap.get("ram").get(secondComponentIndex);

        //format the comparison table in outputString
        String outputString = String.format("%86s", "_".repeat(86));
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "NAME", firstComponentObject.getName(),
                secondComponentObject.getName());
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "-".repeat(12), "-".repeat(35), "-".repeat(35));
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "PRICE", "$" + firstComponentObject.getPrice(),
                "$" + secondComponentObject.getPrice());
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "MEMORY", firstComponentObject.getMemory() + "GB",
                secondComponentObject.getMemory() + "GB");
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "STICKS", firstComponentObject.getSticks(),
                secondComponentObject.getSticks());
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "SPEED", firstComponentObject.getSpeed() + "MHz",
                secondComponentObject.getSpeed() + "MHz");
        outputString += String.format("%n|%-12s|%-35s|%-35s|", "POWER", firstComponentObject.getPower() + "W",
                secondComponentObject.getPower() + "W");
        outputString += String.format("%n%86s", "_".repeat(86));
        return outputString;
    }
}