package com.example.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({
        "Hello, World, HelloWorld",
        "'', Test, Test",
        "Java, '', Java",
        "'trim', '', trim" 
    })
    void testConcatenate(String input1, String input2, String expected) {
        assertEquals(expected, StringUtils.concatenate(input1, input2));
    }

    @ParameterizedTest
    @CsvSource({
        "Hello, olleH",
        "'', ''",
        "Java, avaJ",
        "trim, mirt"
    })
    void testReverse(String input, String expected) {
        assertEquals(expected, StringUtils.reverse(input));
    }

    @ParameterizedTest
    @CsvSource({
        "Hello, HELLO",
        "'', ''",
        "Java, JAVA",
        "'  trim  ', '  TRIM  '"
    })
    void testToUpperCase(String input, String expected) {
        assertEquals(expected, StringUtils.toUpperCase(input));
    }

    @ParameterizedTest
    @CsvSource({
        "'  Hello  ', Hello",
        "'', ''",
        "'  Java  ', Java",
        "'  trim  ', trim"
    })
    void testTrim(String input, String expected) {
        assertEquals(expected, StringUtils.trim(input));
    }
}
