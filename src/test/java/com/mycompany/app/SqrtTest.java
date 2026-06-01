package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SqrtTest {

    @Test
    void averageOfSixAndFour() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(5.0, sqrt.average(6.0, 4.0), 1e-12);
    }

    @Test
    void averageOfTenAndTwenty() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(15.0, sqrt.average(10.0, 20.0), 1e-12);
    }

    @Test
    void goodIsTrueForExactSqrtOfSixteen() {
        Sqrt sqrt = new Sqrt(16.0);
        assertTrue(sqrt.good(4.0, 16.0));
    }

    @Test
    void goodIsFalseForWrongGuessOfSixteen() {
        Sqrt sqrt = new Sqrt(16.0);
        assertFalse(sqrt.good(5.0, 16.0));
    }

    @Test
    void improveFromTwoForEight() {
        Sqrt sqrt = new Sqrt(8.0);
        assertEquals(3.0, sqrt.improve(2.0, 8.0), 1e-12);
    }

    @Test
    void improveKeepsExactGuessForTwentyFive() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.improve(5.0, 25.0), 1e-12);
    }

    @Test
    void iterConvergesForTwentyFive() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.iter(1.0, 25.0), 1e-7);
    }

    @Test
    void iterConvergesForFortyNine() {
        Sqrt sqrt = new Sqrt(49.0);
        assertEquals(7.0, sqrt.iter(1.0, 49.0), 1e-7);
    }

    @Test
    void calcSqrtOfSixteen() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), 1e-7);
    }

    @Test
    void calcSqrtOfEightyOne() {
        Sqrt sqrt = new Sqrt(81.0);
        assertEquals(9.0, sqrt.calc(), 1e-7);
    }
}
