package com.telran;

import java.util.Comparator;
import java.util.Iterator;

import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 * An implementation of the List data structure, made via array under the hood
 * The initial array has length 16. In the case the array is full, a new
 * array with the capacity of 2*<old length> must be created as a new
 * source for the elements
 *
 * @param <T>
*/

public class OurArrayList<T> implements OurList<T> {

    int size;
    int index;
    int capacity;

   final Object[] source;

   public OurArrayList (int capacity){
       this.capacity = capacity;
       source = new Object[capacity];
   }

    @Override
    public void add(T elt) {
        if (size == capacity)
            throw new OurArrayListOverFlowException();

        if (index < size-1)
            index++;
        else capacity = capacity*2;
        source[index] = elt;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, T elt) {

    }

    @Override
    public T getElt(int index) {

       if (size == 0)
            throw new OurArrayListEmptyException();

            return (T) source[index];

    }

    @Override
    public boolean contains(T elt) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T elt) {
        return false;
    }



    @Override
    public void sort() {

    }

    @Override
    public void sort(Comparator<T> comparator) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
