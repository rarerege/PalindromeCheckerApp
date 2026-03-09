public class PallindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

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

        String input = "level"; // Hardcoded input

        long startTime = System.nanoTime();

        boolean result = isPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time: " + executionTime + " ns");
    }
}