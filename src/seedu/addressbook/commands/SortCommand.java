package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.person.UniquePersonList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorts all persons in the address book to the user in the lexicographic order.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = 'sort';

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list in lexicographic order.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
            addressBook.sort();
            List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
            List<ReadOnlyPerson> sortedAllPersons = new ArrayList<>(allPersons);
            return new CommandResult(getMessageForPersonListShownSummary(allPersons), sortedAllPersons);
    }

}
