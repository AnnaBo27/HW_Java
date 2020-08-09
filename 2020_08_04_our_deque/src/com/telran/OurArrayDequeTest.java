package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayDequeTest {

    OurArrayDeque ourArrayDeque = new OurArrayDeque(3);
    OurDeque<Integer> numbers = (OurDeque<Integer>) Arrays.asList(2, 3, 4);

    @Test
    public void testAddLast_0and0() {
        assertEquals(0, 0);
    }

    @Test
    public void testRemoveFirst() {
        assertEquals(2, 2);

    }

    @Test
    public void testSize() {
        assertEquals(4, 4);

    }
    @Test
    public void testgetFirst() {
        assertEquals(3, 3);

    }



}