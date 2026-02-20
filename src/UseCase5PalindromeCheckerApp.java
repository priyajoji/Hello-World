import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        // Convert to lowercase
        s = s.toLowerCase();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop from stack and compare with original string
        for (int i = 0; i < s.length(); i++) {
            char ch = stack.pop();
            if (ch != s.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + s);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
