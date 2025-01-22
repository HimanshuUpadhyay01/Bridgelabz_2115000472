import java.util.Scanner;

/**
 * This class calculates the total income by adding salary and bonus.
 */
public class IncomeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter salary in INR
        System.out.print("Enter the salary (INR): ");

        // Store the user input in the monthlySalary variable
        double monthlySalary = scanner.nextDouble();

        // Prompt the user to enter bonus in INR
        System.out.print("Enter the bonus (INR): ");

        // Store the user input in the annualBonus variable
        double annualBonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = monthlySalary + annualBonus;

        // Display the calculation result
        System.out.println("The salary is INR " + monthlySalary + " and bonus is INR " + annualBonus + ". Hence, Total Income is INR " + totalIncome);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}