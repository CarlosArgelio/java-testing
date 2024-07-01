package com.testing.javatests;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    /*
        arabicToRoman(1) ⇒ "I"
        arabicToRoman(2) ⇒ "II"
        arabicToRoman(3) ⇒ "III"
        arabicToRoman(5) ⇒ "V"
        arabicToRoman(6) ⇒ "VI"
        arabicToRoman(7) ⇒ "VII"
        arabicToRoman(10) ⇒ "X"
        arabicToRoman(11) ⇒ "XI"
        arabicToRoman(15) ⇒ "XV"
        arabicToRoman(16) ⇒ "XVI"
        arabicToRoman(50) ⇒ "L"
        arabicToRoman(51) ⇒ "LI"
        arabicToRoman(55) ⇒ "LV"
        arabicToRoman(56) ⇒ "LVI"
        arabicToRoman(60) ⇒ "LX"
        arabicToRoman(70) ⇒ "LXX"
        arabicToRoman(80) ⇒ "LXXX"
        arabicToRoman(81) ⇒ "LXXXI"
        arabicToRoman(85) ⇒ "LXXXV"
        arabicToRoman(86) ⇒ "LXXXVI"
        arabicToRoman(126) ⇒ "CXXVI"
        arabicToRoman(2507) ⇒ "MMDVII"
     */


    @Test
    public void should_return_I_when_number_is_1() {
        String testOne = RomanNumerals.arabicToRoman(1);
        String testTwo = RomanNumerals.arabicToRoman(2);
        String testThree = RomanNumerals.arabicToRoman(3);

        assertEquals("I", testOne);
        assertEquals("II", testTwo);
        assertEquals("III", testThree);
    }
}