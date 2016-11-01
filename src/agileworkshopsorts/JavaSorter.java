package agileworkshopsorts;


import java.util.Arrays;


/**
 *
 * @author Adam Curtis
 * 
 * An implementation of the ISorter interface that uses the built-in Java
 * sorting algorithm. This class can be used as a correct reference implementation
 * to validate our sorting algorithms.
 * 
 */
public class JavaSorter implements ISorter {
    
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        Arrays.sort(arr);
    }
}
