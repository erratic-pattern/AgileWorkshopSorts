/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
