import java.util.Scanner;

/**
 * This class swaps two numbers using a temporary variable.
 */
public class NumberSwapper {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");

        // Store the user input in the firstNumber variable
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");

        // Store the user input in the secondNumber variable
        int secondNumber = scanner.nextInt();

        // Swap the numbers using a temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Display the swapped numbers
        System.out.println("The swapped numbers are " + firstNumber + " and " + secondNumber);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}