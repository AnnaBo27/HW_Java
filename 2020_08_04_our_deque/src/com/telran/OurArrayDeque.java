package com.telran;

public class OurArrayDeque<T> implements OurDeque<T> {

    private int size;
    private int firstEltIndex;
    private final int capacity;

    private final Object[] source;             // massiw, kotorij bydet hranit elementi na4ej o4eredi. Razmer etogo massiwa = capacity

    public OurArrayDeque(int capacity){
        this.capacity = capacity;
        source = new Object[capacity];
    }

    @Override
    public void addLast(Object elt) {
        if(size==capacity)
            throw new OurDequeOverFlowException();

    int nextIndex = (firstEltIndex + size++)%capacity;
    source[nextIndex] = elt;
    }

    @Override
    public void addFirst(Object elt) {

    }

    @Override
    public T removeFirst() {
        if(size==0)
            throw new OurDequeEmptyException();

    T result = (T) source[firstEltIndex];
    firstEltIndex = (firstEltIndex + 1)%capacity;
    size--;
    return result;
    }

    @Override
    public T removeLast() {    //ANNA
        if(size==0)
            throw new OurDequeEmptyException();

        T result = (T) source[firstEltIndex];
        firstEltIndex = (firstEltIndex - 1)%capacity;
        size--;
        return result;
    }

    @Override
    public T getFirst() {
        T result = (T) source[firstEltIndex];
        firstEltIndex++;
        return result;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
