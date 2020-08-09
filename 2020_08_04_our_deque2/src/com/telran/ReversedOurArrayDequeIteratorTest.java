package com.telran;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReversedOurArrayDequeIteratorTest {


    @Test
    public void testReversedOurArrayDequeIterator_WithAddLast() {
        OurArrayDeque<Integer> deque = new OurArrayDeque<>(4);
        deque.addLast(8);
        deque.addLast(10);
        deque.addLast(12);
        deque.addLast(14);

        List<Integer> expected = Arrays.asList(14, 12, 10, 8);
        List<Integer> afterIteration = new ArrayList<>();

        ReversedOurArrayDequeIterator<Integer> it = new ReversedOurArrayDequeIterator<>(deque);
        while (it.hasNext()) {
            int num = it.next();
            afterIteration.add(num);
        }

        assertEquals(expected, afterIteration);
    }

    @Test
    public void testReversedOurArrayDequeIterator_WithAddFirst() {
        OurArrayDeque<Integer> deque = new OurArrayDeque<>(4);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        deque.addFirst(6);

        List<Integer> expected = Arrays.asList(6, 5, 4, 3);
        List<Integer> afterIteration = new ArrayList<>();

        ReversedOurArrayDequeIterator<Integer> it = new ReversedOurArrayDequeIterator<>(deque);
        while (it.hasNext()) {
            int num = it.next();
            afterIteration.add(num);
        }

        assertEquals(expected, afterIteration);


    }

    @Test
    public void testReversedOurArrayDequeIterator_WithAddLast_1Elt() {
        OurArrayDeque<Integer> deque = new OurArrayDeque<>(4);
        deque.addLast(2);


        List<Integer> expected = Arrays.asList(2);
        List<Integer> afterIteration = new ArrayList<>();

        ReversedOurArrayDequeIterator<Integer> it = new ReversedOurArrayDequeIterator<>(deque);
        while (it.hasNext()) {
            int num = it.next();
            afterIteration.add(num);
        }

        assertEquals(expected, afterIteration);
    }


    @Test
    public void testReversedOurArrayDequeIterator_WithAddFirst_1Elt() {
        OurArrayDeque<Integer> deque = new OurArrayDeque<>(4);
        deque.addFirst(5);


        List<Integer> expected = Arrays.asList(5);
        List<Integer> afterIteration = new ArrayList<>();

        ReversedOurArrayDequeIterator<Integer> it = new ReversedOurArrayDequeIterator<>(deque);
        while (it.hasNext()) {
            int num = it.next();
            afterIteration.add(num);
        }

        assertEquals(expected, afterIteration);

    }

}












