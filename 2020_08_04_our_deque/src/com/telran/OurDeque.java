package com.telran;

/**
 * The interface of deque with fixed capacity. The implementations must contain a constructor accepting the max number of elements
 * @param <T>
 */


public interface OurDeque<T> {
    // T plawaju4ij (nekonkretnij) tip dannih. Bydet ykazan w bydy4em


    void addLast(T elt);

    void addFirst(T elt);

    T removeFirst();

    T removeLast();

    T getFirst();

    T getLast();

    int size();


}
