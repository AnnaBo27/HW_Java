package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    OurArrayList<Integer> arrayList = new OurArrayList<>(16);

    @Test
    public void test_Add_1Elt() {
        arrayList.add(5);

        assertEquals(5, 5);

    }

    @Test
    public void test_Add_2Elt() {
        arrayList.add(5);
        arrayList.add(7);

        assertEquals(7, 7);

    }

    @Test
    public void testSize_add_3Elt() {
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(15);

        assertEquals(3, arrayList.size());
    }

    @Test
    public void testSize_add_17Elt() {
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(16);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);
        arrayList.add(15);

        assertEquals(17, arrayList.size());
    }

    @Test
    public void testAdd1Elt_getIndex_Of_Elt() {
        arrayList.add(5);
        assertEquals(5, arrayList.getElt(0));
    }

    @Test
    public void testAdd2Elt_getIndex_Of_Elt() {
        arrayList.add(10);
        arrayList.add(12);
        assertEquals(12, arrayList.getElt(1));
    }

    @Test
    public void testAdd3Elt_getIndex_Of_Elt() {
        arrayList.add(5);
        arrayList.add(13);
        arrayList.add(8);
        assertEquals(13, arrayList.getElt(1));

    }
}