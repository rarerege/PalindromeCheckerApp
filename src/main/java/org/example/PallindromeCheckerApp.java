import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class PallindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level"; // Hardcoded input

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        //PalindromeStrategy strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}