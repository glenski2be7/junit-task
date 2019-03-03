package com.infoshareacademy.junit.task3;

import com.infoshareacademy.junit.task1.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

@DisplayName("Parametric tests for FizzBuzz")
public class ParametredFizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }


    @DisplayName("Should return Fizz if number is divisible by three")
    @ParameterizedTest(name = "{index} - {0}")
    @ValueSource(ints = {3, 6, 9, 99})
    public void verifyIfReturnBuzzDivisible3 (int number) {
        String expectedResult = "Fizz";

        String actualResult = fizzBuzz.play(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Should return Buzz if number is divisible by five")
    @ParameterizedTest(name = "{index} - value {0}")
    @MethodSource("dataProvider")
    public void shouldReturnBuzzWhenDivisable (int number) {
        String expectedResult = "Buzz";

        String actualResult = fizzBuzz.play(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Integer> dataProvider(){
        return Stream.of(5, 20, 110, 205, 10000);
    }

    @DisplayName("Should return expected value")
    @ParameterizedTest(name = "{index} - for {0} should return {1}")
    @MethodSource("argumentProvider")
    public void shouldReturnExpectedValue (int number, String expectedResult) {

        String actualResult = fizzBuzz.play(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> argumentProvider(){
        return Stream.of(
                Arguments.arguments(1, "1"),
                Arguments.arguments(3, "Fizz"),
                Arguments.arguments(5, "Buzz"),
                Arguments.arguments(15, "FizzBuzz")
        );
    }

    @DisplayName("Should return expected value")
    @ParameterizedTest(name = "{index} - for {0} should return {1}")
    @CsvFileSource(resources = "/test_data.csv", delimiter = ';', numLinesToSkip = 1)
    @CsvSource(value = {"110, Buzz","204,Fizz"})
    public void shouldReturnExpectedValueFromCsv (int number, String expectedResult) {

        String actualResult = fizzBuzz.play(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
