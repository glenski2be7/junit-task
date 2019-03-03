package com.infoshareacademy.junit.task1;

public class FizzBuzz {
    public String play(int number) {
        if (number <= 0) {
            throw new ArithmeticException("Number cannot be 0 or negative");
        }

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return Integer.toString(number);
    }

    public static void main(String[] args) {
        //System.out.println(play(15));
    }
}
