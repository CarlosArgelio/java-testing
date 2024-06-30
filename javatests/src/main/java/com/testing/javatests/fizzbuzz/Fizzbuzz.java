package com.testing.javatests.fizzbuzz;

public class Fizzbuzz {

    public static String FizzBuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(n);
    }

}
