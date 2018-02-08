package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, #123, 123456";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format of 'Block, Street, Unit, PostalCode'";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    private static final String SEPARATOR = ",";
    private static final int INDEX_BLOCK = 0;
    private static final int INDEX_STREET = 1;
    private static final int INDEX_UNIT = 2;
    private static final int INDEX_POSTAL_CODE = 3;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;


    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressComponents = address.split(SEPARATOR);
        if(addressComponents.length != 4){
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        block = new Block(addressComponents[INDEX_BLOCK]);
        street = new Street(addressComponents[INDEX_STREET]);
        unit = new Unit(addressComponents[INDEX_UNIT]);
        postalCode = new PostalCode(addressComponents[INDEX_POSTAL_CODE]);
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return block.toString() +", "+ street.toString()+", " + unit.toString() +", "+ postalCode.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.block.equals(((Address) other).block)
                && this.street.equals(((Address) other).street)
                && this.unit.equals(((Address) other).unit)
                && this.postalCode.equals(((Address) other).postalCode)); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
