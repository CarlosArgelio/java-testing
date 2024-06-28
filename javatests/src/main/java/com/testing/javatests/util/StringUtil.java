package com.testing.javatests.util;

public class StringUtil {

    public static String repeat(String s, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("negative times not allowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }

    public static boolean isEmpty(String s) {
        if (s == null) return true;
        return !s.matches("[^ ]+");
    }
}
