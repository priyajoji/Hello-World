import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Use Case 13: Performance Comparison
 *
 * Goal:
 * Compare the performance of different palindrome approaches.
 *
 * Flow:
 * - Run multiple algorithms
 * - Capture execution time using System.nanoTime()
 * - Display performance results
 *
 * Key Concepts:
 * - System.nanoTime()
 * - Algorithm comparison
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        // Normalize input once for fair comparison
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        System.out.println("\n=== Performance Comparison ===\n");

        // ---------------- STACK APPROACH ----------------
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(normalized);
        long endStack = System.nanoTime();

        // ---------------- DEQUE APPROACH ----------------
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(normalized);
        long endDeque = System.nanoTime();

        // ---------------- RECURSIVE APPROACH ----------------
        long startRec = System.nanoTime();
        boolean recResult = recursivePalindrome(normalized, 0, normalized.length() - 1);
        long endRec = System.nanoTime();

        // ---------------- DISPLAY RESULTS ----------------
        System.out.println("Palindrome Result (Stack)     : " + stackResult);
        System.out.println("Execution Time (Stack)        : " + (endStack - startStack) + " ns\n");

        System.out.println("Palindrome Result (Deque)     : " + dequeResult);
        System.out.println("Execution Time (Deque)        : " + (endDeque - startDeque) + " ns\n");

        System.out.println("Palindrome Result (Recursive) : " + recResult);
        System.out.println("Execution Time (Recursive)    : " + (endRec - startRec) + " ns\n");

        sc.close();
    }

    // Stack-based palindrome check
    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    // Recursive palindrome check
    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursivePalindrome(str, start + 1, end - 1);
    }
}