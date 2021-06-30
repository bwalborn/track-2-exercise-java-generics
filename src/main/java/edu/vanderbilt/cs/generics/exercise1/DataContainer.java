package edu.vanderbilt.cs.generics.exercise1;

import edu.vanderbilt.cs.generics.exercise2.AttributedDataContainer;

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
 * 
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

public class DataContainer<T> {

    private double lat;
    private double lon;

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T c) {
        this.data = c;
    }
}
