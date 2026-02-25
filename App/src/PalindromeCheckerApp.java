/**
 *
 * =========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Encapsulated Palindrome Checker
 *
 * Description:
 * Demonstrates encapsulation by delegating palindrome
 * logic to a dedicated class.
 *
 * @author Kabilesh C
 * @version 11.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC11");
        System.out.println("=================================");
        System.out.println("Input: " + input);
        System.out.println();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }
}