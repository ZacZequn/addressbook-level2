package seedu.addressbook.data.person;

public class PostalCode {
    private String postalCode;

    public PostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    /**
     *
     * @return PostalCode of the address
     */
    public String getPostalCode(){
        return postalCode;
    }

    public int hashCode() { return postalCode.hashCode();}

    public String toString(){
        return postalCode;
    }

    public boolean equals(Object other) {
        return other == this
                || (other instanceof PostalCode
                && this.postalCode.equals(((PostalCode) other).getPostalCode()));

    }
}
