package org.example;

import java.util.*;


public class PallindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        // Normalize string: remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama"; // Hardcoded input

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}