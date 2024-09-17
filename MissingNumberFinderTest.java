package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberFinderTest {

    @Test
    public void testFindMissingNumberWithSimpleArray() {
        int[] array = {5, 0, 1, 3, 2};
        assertEquals(4, MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void testFindMissingNumberWithAnotherArray() {
        int[] array = {7, 9, 10, 11, 12};
        assertEquals(8, MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void testFindMissingNumberWithLargeArray() {
        int[] array = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10};
        assertEquals(5, MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void testFindMissingNumberWithNegativeNumbers() {
        int[] array = {-3, -1, 0, 1};
        assertEquals(-2, MissingNumberFinder.findMissingNumber(array));
    }

    @Test
    public void testFindMissingNumberWhenMultipleNumbersMissing() {
        int[] array = {10, 11, 12, 14, 15};
        assertEquals(13, MissingNumberFinder.findMissingNumber(array));
    }
}