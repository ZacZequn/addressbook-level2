package seedu.addressbook.data.person;

public class Street {
    private String street;

    public Street(String street){
        this.street = street;
    }

    /**
     *
     * @return Street of the address
     */
    public String getStreet(){
        return street;
    }

    public int hashCode() { return street.hashCode();}

    public String toString(){
        return street;
    }

    public boolean equals(Object other) {
        return other == this
                || (other instanceof Street
                && this.street.equals(((Street) other).getStreet()));

    }
}
