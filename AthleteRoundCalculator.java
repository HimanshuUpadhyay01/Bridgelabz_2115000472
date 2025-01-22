import java.util.Scanner;

/**
 * This class calculates the number of rounds an athlete needs to run to complete a 5 km distance.
 */
public class AthleteRoundCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the first side of the track
        System.out.print("Enter the length of side 1 in meters: ");
        double trackSide1Length = scanner.nextDouble();

        // Prompt the user to enter the length of the second side of the track
        System.out.print("Enter the length of side 2 in meters: ");
        double trackSide2Length = scanner.nextDouble();

        // Prompt the user to enter the length of the third side of the track
        System.out.print("Enter the length of side 3 in meters: ");
        double trackSide3Length = scanner.nextDouble();

        // Calculate the perimeter of the track
        double trackPerimeter = trackSide1Length + trackSide2Length + trackSide3Length;

        // Define the total distance to be covered (5 km)
        double totalDistanceInMeters = 5000;

        // Calculate the number of rounds required to cover the total distance
        double requiredRounds = totalDistanceInMeters / trackPerimeter;

        // Display the result, rounding up to the nearest whole number using Math.ceil()
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(requiredRounds) + " to complete 5 km");

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}