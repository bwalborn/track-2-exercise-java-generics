package edu.vanderbilt.cs.generics.exercise4;

import edu.vanderbilt.cs.generics.exercise1.DataContainer;
import edu.vanderbilt.cs.generics.exercise2.Attributed;
import edu.vanderbilt.cs.generics.exercise2.AttributedDataContainer;

import java.util.List;

/**
 * @ToDo
 *
 * Refactor the NestedDataContainer to be parameterized in a way
 * that the NestedDataContainerTest compiles and passes.
 *
 * You should look at the NestedDataContainerTest to understand
 * how many type parameters are expected and what the return
 * type of getData should be.
 *
 * This one will really tests your understanding of generics!
 *
 * Once you complete this exercise, you should have a solid
 * understanding of the most important aspects of generics.
 * You should then go finish the generics tutorial and learn
 * about wildcards.
 *
 */
public class NestedDataContainer {

    private DataContainer data = new DataContainer();

    public void setNestedData(Object nestedData){
        // @ToDo
        //
        // Uncomment and fix the code below.
        //
//        AttributedDataContainer c = new AttributedDataContainer();
//        c.setData(nestedData);
//        data.setData(c);
    }

    public AttributedDataContainer getData() {
        // @ToDo
        //
        // Update this to return data.getData();
        //
        return null;
    }
}
