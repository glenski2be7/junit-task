package com.infoshareacademy.junit.task3;

import com.infoshareacademy.junit.task1.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Parametric tests for FizzBuzz")
public class ParametredFizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }


    @ParameterizedTest(name = "{index} - sholud return Fizz be divible by {0}")
    @ValueSource(ints = {3, 6, 9, 99})
    public void verifyIfReturnBuzzDivisible3 (int number) {
        String expectedResult = "Buzz";

        String actualResult = fizzBuzz.play(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
