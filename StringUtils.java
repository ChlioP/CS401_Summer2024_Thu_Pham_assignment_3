package com.example.demo;

public class StringUtils {

    // Private constructor to prevent instantiation
    private StringUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    // Concatenation of two strings
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Reversal of a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Conversion of a string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Trimming of leading and trailing whitespace
    public static String trim(String str) {
        return str.trim();
    }
}
