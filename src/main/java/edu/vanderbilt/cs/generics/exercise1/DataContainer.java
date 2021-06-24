package edu.vanderbilt.cs.generics.exercise1;

/**
 *
 * @ToDo
 *
 * Before starting this exercise, read through the Java
 * Generics Tutorial up to "Bounded Type Parameters":
 *
 * https://docs.oracle.com/javase/tutorial/java/generics/why.html
 *
 *
 */

/**
 * @ToDo
 *
 * The DataContainerTest does not compile because this class
 * is currently not parameterizable with a type.
 *
 * Refactor the DataContainer class so that the "data"
 * can be parameterized with any type.
 *
 * You will need to update all of the locations that
 * are commented.
 *
 * When you are done, the DataContainerTest should compile
 * and pass the test.
 *
 * After you have passed the DataContainerTest, uncomment
 * the lines in the AttributedDataContainerTest and
 * move on to the AttributedDataContainer and Attributed
 * classes.
 *
 */

// You will need to update the class declaration
public class DataContainer {

    private double lat;
    private double lon;

    // This will need updating
    private Object data;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    // This will need updating
    public Object getData() {
        return data;
    }

    // This will need updating
    public void setData(Object data) {
        this.data = data;
    }
}
