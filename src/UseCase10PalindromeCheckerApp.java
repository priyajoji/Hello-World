import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        // Step 1: Normalize String
        // Convert to lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Apply Palindrome Logic (Two-Pointer Technique)
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Original text: " + input);
        System.out.println("Normalized text: " + normalized);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}