package seedu.addressbook.data.person;

public class Unit {
    private String unit;

    public Unit(String unit){
        this.unit = unit;
    }

    /**
     *
     * @return Unit of the address
     */
    public String getUnit(){
        return unit;
    }

    public int hashCode() { return unit.hashCode();}

    public String toString(){
        return unit;
    }

    public boolean equals(Object other) {
        return other == this
                || (other instanceof Unit
                && this.unit.equals(((Unit) other).getUnit()));

    }
}
