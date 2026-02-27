package org.example;

public class PallindromeCheckerApp {
    public static void main(String[] args){

        String text = "level";

        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);  // String concatenation
        }

        boolean isPalindrome = text.equals(reversedText);

        System.out.println("Input text: " + text);
        System.out.println("Reversed text: " + reversedText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}