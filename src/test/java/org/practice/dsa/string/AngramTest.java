package org.practice.dsa.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class AngramTest {

    private final String sample1 = "";
    private final String sample2 = "This is not a pangram";
    private final String sample3 = "TheQuickBrownFoxJumpsOverTheLazyDog";
    private final String sample4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final Angram object = new Angram();

    @Test
    void usingSet() {
        assertFalse(object.usingSet(sample1));
        assertFalse(object.usingSet(sample2));
        assertTrue(object.usingSet(sample3));
        assertTrue(object.usingSet(sample4));
    }

    @Test
    void usingArray() {
        assertFalse(object.usingArray(sample1));
        assertFalse(object.usingArray(sample2));
        assertTrue(object.usingArray(sample3));
        assertTrue(object.usingArray(sample4));
    }
}
