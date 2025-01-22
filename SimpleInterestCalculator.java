import java.util.Scanner;

/**
 * This class calculates the simple interest based on the principal amount, rate of interest, and time period.
 */
public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double initialInvestment = scanner.nextDouble();

        // Prompt the user to enter the rate of interest (in percentage)
        System.out.print("Enter the rate of interest (in %): ");
        double interestRate = scanner.nextDouble();

        // Prompt the user to enter the time period in years
        System.out.print("Enter the time period in years: ");
        double investmentDuration = scanner.nextDouble();

        // Calculate the simple interest
        double calculatedInterest = (initialInvestment * interestRate * investmentDuration) / 100;

        // Display the result
        System.out.println("The simple interest is " + calculatedInterest + " for principal " + initialInvestment +
                           ", rate of interest " + interestRate + "%, and time " + investmentDuration + " years");

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}