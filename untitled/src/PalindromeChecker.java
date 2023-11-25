import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String transformed = transformInput(input);

            boolean isPalindrome = checkPalindrome(transformed);
            if (isPalindrome) {
                System.out.println("The transformed input is a palindrome.");
            } else {
                System.out.println("The transformed input is not a palindrome.");
            }
        }
    }

    public static String transformInput(String input) {
        return input.toLowerCase().replaceAll("[,!]", "");
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
