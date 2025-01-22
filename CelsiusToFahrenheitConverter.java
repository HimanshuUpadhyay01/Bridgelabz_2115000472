import java.util.Scanner;

/**
 * This class converts temperature from Celsius to Fahrenheit.
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");

        // Store the user input in the temperatureInCelsius variable
        double temperatureInCelsius = scanner.nextDouble();

        // Convert temperature from Celsius to Fahrenheit
        double temperatureInFahrenheit = (temperatureInCelsius * 9 / 5) + 32;

        // Display the conversion result
        System.out.println(temperatureInCelsius + " degrees Celsius is equal to " + temperatureInFahrenheit + " degrees Fahrenheit");

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}