package com.telran;

import java.util.Iterator;

public class ReversedOurArrayDequeIterator<T> implements Iterator<T> {

    OurArrayDeque<T> toIterate;
    int currentIndex;

    public ReversedOurArrayDequeIterator(OurArrayDeque<T> toIterate){
        this.toIterate = toIterate;
        currentIndex = toIterate.size-1;

    }

    @Override
    public boolean hasNext() {
        return currentIndex >=0;
    }

    @Override
    public T next() {
        T result = (T) toIterate.source[currentIndex];
        currentIndex--;
        return result;
    }
}
