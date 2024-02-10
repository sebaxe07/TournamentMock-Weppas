package com.example;

public class StringUtils {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return null;
    }
}
