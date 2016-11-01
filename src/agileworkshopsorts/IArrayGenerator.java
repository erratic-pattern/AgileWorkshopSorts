package agileworkshopsorts;

/**
 *
 * @author Adam Curtis
 * 
 * An interface that generates an array. This array should be suitable
 * for sorting via the ISorter interface.
 * 
 * @param <T> The type of elements in the array. Must be Comparable so that
 *            we can sort with ISorter.
 * 
 */
public interface IArrayGenerator<T extends Comparable> {
    public T[] generateArray();
}
