// Service class that contains palindrome logic
class PalindromeChecker {

    // Method to check if a string is palindrome
    public boolean checkPalindrome(String str) {

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
}

// Main Application class
public class PallindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";   // Hardcoded input

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}