package com.testing.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilIsEmptyTest {


    @Test
    public void should_return_false_if_is_has_string() {
        // Arrange
        String s = "hello";
        // Action
        boolean isEmpty = StringUtil.isEmpty(s);
        // Assert
        assertFalse(isEmpty);
    }

    @Test
    public void should_return_true_if_string_is_empty() {
        // Arrange
        String s = "";
        // Action
        boolean isEmpty = StringUtil.isEmpty(s);
        // Assert
        assertTrue(isEmpty);
    }

    @Test
    public void should_return_true_if_null_parameter() {
        // Arrange
        String s = null;
        // Action
        boolean isEmpty = StringUtil.isEmpty(s);
        // Assert
        assertTrue(isEmpty);
    }

    @Test
    public void should_return_true_if_string_with_only_space() {
        // Arrange
        String s = " ";
        // Action
        boolean isEmpty = StringUtil.isEmpty(s);
        // Assert
        assertTrue(isEmpty);
    }
}