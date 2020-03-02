package ZaaJaaVaa;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Stary {
    @Getter @Setter private int age = 10;

    /**
     * Name of the person.
     * -- SETTER --
     * Changes the name of this person.
     *
     * @param name The new value.
     */
    @Setter(AccessLevel.PROTECTED) private String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
