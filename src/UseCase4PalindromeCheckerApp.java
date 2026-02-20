import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        // Convert to lowercase
        s = s.toLowerCase();

        // Convert string to character array
        char[] chars = s.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text: " + s);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
