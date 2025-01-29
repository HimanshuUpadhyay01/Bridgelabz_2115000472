public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}