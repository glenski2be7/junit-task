package com.infoshareacademy.junit.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    Range range0;
    Range range1;


    @BeforeAll
    public static void initALL() {

    }

    @BeforeEach
    public void initRanges() {
        //given - przygotowanie danych (sekcje)
        range0 = new Range(10, 20);
        range1 = new Range(10, 20);

        System.out.println("BeforeEach");
    }

    @Test
    public void shouldReturnTrueIfNumberInRange() {
        //given - przygotowanie danych (sekcje)
        Range range0 = new Range(10, 20);
        Range range1 = new Range(10, 20);
        //when
        boolean result = range1.isInRange(12);
        //then
        assertTrue(result, "Number is outside range!");
    }

    @Test
    public void shouldReturnTrueIfNumberInRange2() {
        //then
        assertNotEquals(range0, range1);
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
        boolean result = range.isInRange(30);
        assertFalse(result, "Number is IN range!");
    }

}