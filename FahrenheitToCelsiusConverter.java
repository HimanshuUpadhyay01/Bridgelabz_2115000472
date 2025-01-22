import java.util.Scanner;

/**
 * This class converts temperature from Fahrenheit to Celsius.
 */
public class FahrenheitToCelsiusConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");

        // Store the user input in the temperatureInFahrenheit variable
        double temperatureInFahrenheit = scanner.nextDouble();

        // Convert temperature from Fahrenheit to Celsius
        double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5 / 9;

        // Display the conversion result
        System.out.println(temperatureInFahrenheit + " degrees Fahrenheit is equal to " + temperatureInCelsius + " degrees Celsius");

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}