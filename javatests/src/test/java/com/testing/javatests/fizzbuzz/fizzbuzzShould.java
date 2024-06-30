package com.testing.javatests.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class fizzbuzzShould {
    @Test
    public void should_return_fizz_when_n_is_divisible_by_three() {

        String testOne = Fizzbuzz.FizzBuzz(3);
        String testTwo = Fizzbuzz.FizzBuzz(6);
        String testThree = Fizzbuzz.FizzBuzz(9);

        assertEquals("Fizz", testOne);
        assertEquals("Fizz", testTwo);
        assertEquals("Fizz", testThree);

    }

    @Test
    public void should_return_buzz_when_n_is_divisible_by_five() {

        String testOne = Fizzbuzz.FizzBuzz(5);
        String testTwo = Fizzbuzz.FizzBuzz(10);

        assertEquals("Buzz", testOne);
        assertEquals("Buzz", testTwo);
    }

    @Test
    public void should_return_fizzbuzz_when_n_is_divisible_by_three_and_five() {

        String testOne = Fizzbuzz.FizzBuzz(15);
        String testTwo = Fizzbuzz.FizzBuzz(30);

        assertEquals("FizzBuzz", testOne);
        assertEquals("FizzBuzz", testTwo);
    }

    @Test
    public void should_return_n_when_n_is_not_divisble_by_and_five() {

        String testOne = Fizzbuzz.FizzBuzz(2);
        String testTwo = Fizzbuzz.FizzBuzz(16);

        assertEquals("2", testOne);
        assertEquals("16", testTwo);

    }
}