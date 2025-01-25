import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user and validate if it's a natural number
        int number = 0;
        while (true) {
            System.out.print("Enter a natural number: ");
            number = scanner.nextInt();

            if (number > 0) {
                break;
            } else {
                System.out.println("Error: Please enter a natural number.");
            }
        }

        // Create arrays for even and odd numbers
        int[] evenNumbers = new int[number];
        int[] oddNumbers = new int[number];

        // Initialize index variables for even and odd numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Separate odd and even numbers into their respective arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the even numbers array
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Print the odd numbers array
        System.out.println("\n\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        scanner.close();
    }
}