import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numStr = String.valueOf(number);
        int count = numStr.length();

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        System.out.println("\nThe reverse of the number is: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}