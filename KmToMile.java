import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double distanceKm = scanner.nextDouble();

        // Conversion factor from kilometers to miles
        double kmToMilesFactor = 0.621371;

        // Convert the distance to miles
        double distanceMiles = distanceKm * kmToMilesFactor;

        // Display the result
        System.out.println("The total distance is " + distanceMiles + " miles for the given " + distanceKm + " kilometers.");
    }
}
