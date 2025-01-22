import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the dividend (first number): ");
        int dividend = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the divisor (second number): ");
        int divisor = scanner.nextInt();

        // Calculate the quotient
        int quotient = dividend / divisor;

        // Calculate the remainder
        int remainder = dividend % divisor;

        // Display the quotient and remainder
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder 
                           + " for the division of " + dividend + " by " + divisor);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
