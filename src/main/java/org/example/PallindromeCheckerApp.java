package org.example;

import java.util.*;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void add(char c) {
        Node newNode = new Node(c);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Node reverse(Node start) {
        Node prev = null;
        Node current = start;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalfStart = reverse(slow.next);
        Node firstHalfStart = head;
        Node secondHalfCopy = secondHalfStart;
        boolean palindrome = true;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                palindrome = false;
                break;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        slow.next = reverse(secondHalfCopy); // Restore original list
        return palindrome;
    }
}


public class PallindromeCheckerApp {
    public static void main(String[] args){

        String input = "level";

        SinglyLinkedList list = new SinglyLinkedList();
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + list.isPalindrome());
    }
}