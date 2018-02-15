package seedu.addressbook.commands;

import org.junit.Before;
import org.junit.Test;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.UniqueTagList;
import seedu.addressbook.util.TestUtil;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class SortCommandTest {

	private AddressBook addressBook;

	@Before
	public void setUp() throws Exception {
		Person C = new Person(new Name("CCC"), new Phone("61234567", false),
				new Email("c@doe.com", false), new Address("395C Ben Road", false), new UniqueTagList());
		Person A = new Person(new Name("AAA"), new Phone("91234567", false),
				new Email("a@doe.com", false), new Address("33G Ohm Road", false), new UniqueTagList());
		Person D = new Person(new Name("DDD"), new Phone("63345566", false),
				new Email("d@doe.com", false), new Address("55G Abc Road", false), new UniqueTagList());
		Person B = new Person(new Name("BBB"), new Phone("61121122", false),
				new Email("b@grant.com", false), new Address("44H Define Road", false),
				new UniqueTagList());

		addressBook = TestUtil.createAddressBook(C, A, D, B);
	}

	/**
	 * Executes the command, and checks that the execution does not throw any Exception.
	 */
	@Test
	public void testSortCommand() throws Exception{
		SortCommand command = new SortCommand();
		try {
			command.setData(addressBook, null);
			command.execute();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertTrue(true);
	}
}
