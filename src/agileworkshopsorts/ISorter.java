package agileworkshopsorts;

/**
 *
 * @author Adam Curtis
 * 
 * An interface for sorting algorithms.
 * 
 */
public interface ISorter {
    
    public <T extends Comparable> void sort(T[] arr);
    
}
