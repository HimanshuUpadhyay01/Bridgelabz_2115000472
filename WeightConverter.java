import java.util.Scanner;

/**
 * This class converts weight from pounds to kilograms.
 */
public class WeightConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert the weight from pounds to kilograms (1 pound = 0.45359237 kilograms)
        // For simplicity, we'll use the approximate conversion rate of 1 pound = 0.45 kilograms
        double weightInKilograms = weightInPounds * 0.45;

        // Display the weight in both pounds and kilograms
        System.out.println("The weight is " + weightInPounds + " pounds and " + weightInKilograms + " kilograms");

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}