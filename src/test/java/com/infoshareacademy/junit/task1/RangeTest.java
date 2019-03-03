package com.infoshareacademy.junit.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RangeTest {

    @Test
    public  void shouldReturnTrueIfNumberInRange() {
        //given - przygotowanie danych (sekcje)
        Range range0 = new Range(10, 20);
        Range range1 = new Range(10, 20);
        //when
        boolean result = range1.isInRange(15);
        //then
        assertTrue(result, "Number is outside range!");
    }

    @Test
    public void shoudRerturnFalseIfNumberEqualsLowerBound() {
        Range range = new Range(10, 20);
        boolean result = range.isInRange(10);
        assertTrue(result);
    }

    @Test
    public void shoudRerturnFalseIfNumberEqualsUpperBound() {
        Range range = new Range(10, 20);
        boolean result = range.isInRange(20);
        assertTrue(result);
    }

    @Test
    public void shoudRerturnFalseIfNumberOutOfRange() {
        Range range = new Range(10, 20);
        boolean result = range.isInRange(25);
        assertFalse(result, "Number is IN range!");
    }

}