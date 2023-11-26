import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a palindrome:");
        Scanner reader = new Scanner(System.in);
        // reads user input
        String in = reader.nextLine();

        String transformed = transformInput(in);

        // sets ispalindrome to true if the input is a palindrome
        boolean ispalindrome = checkPalindrome(transformed);
        if (ispalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }



    public static boolean checkPalindrome(String input) {
        String reversedString = reverseString(input);
        // checks if input is equal to reversedString
        if (input.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }

    public static String transformInput(String in) {
        in = in.toLowerCase();
        in = in.replace(",", "");
        in = in.replace("!", "");
        return in;
    }

    public static String reverseString(String input) {
        // creates a new StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }
}