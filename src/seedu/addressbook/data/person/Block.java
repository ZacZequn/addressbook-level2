package seedu.addressbook.data.person;

public class Block {
    private String block;

    public Block(String block) {
        this.block = block;
    }

    /**
     * @return Block of the address
     */
    public String getBlock() {
        return block;
    }

    public int hashCode() {
        return block.hashCode();
    }

    public String toString() {
        return block;
    }

    public boolean equals(Object other) {
        return other == this
                || (other instanceof Block
                && this.block.equals(((Block) other).getBlock()));

    }
}
