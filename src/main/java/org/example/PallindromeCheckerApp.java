package org.example;

import java.util.*;

public class PallindromeCheckerApp {
    public static void main(String[] args){

        // Hardcoded input string (you can change this to test)
        String input = "refer";

        // Normalize input: remove spaces and convert to lowercase
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Create a Deque for characters
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char ch : processedInput.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Remove from front and rear and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print output in required format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}