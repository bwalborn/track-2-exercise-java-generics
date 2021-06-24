package edu.vanderbilt.cs.generics.exercise3;

/**
 * @ToDo
 *
 * A Mapping object stores a relationship between an identifier
 * and a value. For example, you could have mappings of "names"
 * to "people" or mappings of "addresses" to "buildings".
 *
 * Refactor this class so that the classes for the identifier
 * and value can be parameterized separately from each other.
 *
 * After you have passed the MappingTest, uncomment
 * the lines in the NestedDataContainerTest and
 * move on to the NestedDataContainer class.
 */
public class Mapping {

    private Object identifier;
    private Object value;

    public Object getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Object identifier) {
        this.identifier = identifier;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
