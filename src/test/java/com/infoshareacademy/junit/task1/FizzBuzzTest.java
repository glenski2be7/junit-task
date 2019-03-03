package com.infoshareacademy.junit.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach

    @Test
    @DisplayName("Shoud return Buzz when given number is divisible by 3")
    public void shoudBeDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(3);
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Shoud return Buzz when given number is divisible by 5")
    public void shoudBeDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(5);
        assertEquals("Fizz", result, "Number isnt visible by 5");
    }

    @Test
    public void shoudBeDivisibleBy3and5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(15);
        assertEquals("FizzBuzz", result, "Number isnt visible by 3 and 5");
    }

    @Test
    @DisplayName("Should throw exception for number 0")
    void isLowerThanZero() {
        //given
        int number = 0;

        FizzBuzz fizzBuzz = new FizzBuzz();
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzz.play(number));
    }
}