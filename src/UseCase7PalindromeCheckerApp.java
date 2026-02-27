import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        // Convert to lowercase
        s = s.toLowerCase();

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque (rear)
        for (int i = 0; i < s.length(); i++) {
            deque.addLast(s.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();  // remove from front
            char rear = deque.removeLast();    // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + s);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}