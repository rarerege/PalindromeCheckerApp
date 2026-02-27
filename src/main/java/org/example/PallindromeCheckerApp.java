package org.example;

public class PallindromeCheckerApp {
    public static void main(String[] args){

        String text = "madam";

        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);
        }

        boolean isPalindrome;

        if (text.equals(reversedText)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}