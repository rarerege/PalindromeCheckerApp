package org.example;

import java.util.Stack;

public class PallindromeCheckerApp {
    public static void main(String[] args){

        String text = "noon";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}