public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        String s = "madam";
        boolean pal;
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare original and reversed
        pal = s.equals(rev);
        System.out.println("Input text:" +s);
        System.out.println("Is it a Palindrome? : "+pal);
    }
}

