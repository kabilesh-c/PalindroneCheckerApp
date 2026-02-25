/**
 *
 * =========================================================
 * CLASS - PalindromeChecker
 * =========================================================
 *
 * Encapsulates palindrome validation logic.
 *
 * Responsibilities:
 * - Normalize string
 * - Perform palindrome validation
 *
 * OOPS Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * Internal Data Structure:
 * - Character Array (Two-pointer approach)
 *
 * @author Kabilesh C
 * @version 11.0
 */

public class PalindromeChecker {

    /**
     * Public method exposed to users.
     * Hides internal implementation details.
     */
    public boolean checkPalindrome(String input) {

        String normalized = normalize(input);

        return isPalindrome(normalized);
    }

    // Internal normalization logic
    private String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Internal two-pointer logic
    private boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}