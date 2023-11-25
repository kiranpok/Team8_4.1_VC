import java.util.Scanner; // Include import for resource

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your string: "); // Narration for user-friendliness
        String input = scanner.nextLine();

        String transformed = transformInput(input);
        System.out.println("\nYour input transformed to \"" + transformed + "\".");

        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);

        /*if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }*/

        return (input.equals(reversed)); // Simplified original if-else code
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
}