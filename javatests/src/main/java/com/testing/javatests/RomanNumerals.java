package com.testing.javatests;

public class RomanNumerals {

    enum NumbersToRomas {
        I
    }

    private String I;


    public static String arabicToRoman(int n) {
        int lenght = Integer.toString(n).length();

        if (lenght == 1) {
            switch (n) {
                case 0:
                    return "ERROR";
                case 1:
                    return "I";
                case 2:
                    return "II";
                case 3:
                    return "III";
            }
        }

        return Integer.toString(n);
    }

}
