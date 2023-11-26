import java.util.Scanner;

//The PalindromeChecker class checks if a given input, after transformation, is a palindrome.

public class PalindromeChecker {

    //The main method takes user input, transforms it, and checks if it is a palindrome.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your string: "); // Narration for user-friendliness
        String input = scanner.nextLine();

        // Transform the input
        String transformed = transformInput(input);
        System.out.println("\nYour input transformed to \"" + transformed + "\".");

        // Check if the transformed input is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        // Display the result
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }
  
    //Transforms the input by converting to lowercase and removing commas and exclamation marks.

    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

     //Checks if a given string is a palindrome.

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return (input.equals(reversed));
    }

    //Reverses a given string.

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

}