import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = number;

        // Find the count of digits in the number
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];

        // Find the digits in the number and save them in an array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];

        // Find the frequency of each digit in the number
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number
        System.out.println("\nDigit Frequency Report:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}