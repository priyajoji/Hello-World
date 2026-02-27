import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine().toLowerCase();

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }

    // Recursive Method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base Condition 1: If start >= end → All characters matched
        if (start >= end) {
            return true;
        }

        // If characters don't match → Not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Move inward
        return checkPalindrome(str, start + 1, end - 1);
    }
}
