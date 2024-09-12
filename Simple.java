public class Simple {
    public static void main(String[] args) {
        String original = "madam";  // Hardcoded input for testing
        int length = original.length();

        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (original.charAt(i) != original.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

