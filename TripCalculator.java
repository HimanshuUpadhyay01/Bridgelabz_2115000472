import java.util.Scanner;

/**
 * This class calculates the total distance and time taken for a trip with multiple destinations.
 */
public class TripCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the traveler's name
        System.out.print("Enter the name of the person traveling: ");
        String travelerName = scanner.nextLine();

        // Prompt the user to enter the starting city
        System.out.print("Enter the starting city: ");
        String startingCity = scanner.nextLine();

        // Prompt the user to enter the intermediate city
        System.out.print("Enter the intermediate city: ");
        String intermediateCity = scanner.nextLine();

        // Prompt the user to enter the final destination city
        System.out.print("Enter the final destination city: ");
        String destinationCity = scanner.nextLine();

        // Prompt the user to enter the distance from the starting city to the intermediate city
        System.out.print("Enter the distance from " + startingCity + " to " + intermediateCity + " in miles: ");
        double distanceToIntermediateCity = scanner.nextDouble();

        // Prompt the user to enter the time taken to travel from the starting city to the intermediate city
        System.out.print("Enter the time taken to travel from " + startingCity + " to " + intermediateCity + " in minutes: ");
        int timeToIntermediateCity = scanner.nextInt();

        // Prompt the user to enter the distance from the intermediate city to the final destination city
        System.out.print("Enter the distance from " + intermediateCity + " to " + destinationCity + " in miles: ");
        double distanceToDestinationCity = scanner.nextDouble();

        // Prompt the user to enter the time taken to travel from the intermediate city to the final destination city
        System.out.print("Enter the time taken to travel from " + intermediateCity + " to " + destinationCity + " in minutes: ");
        int timeToDestinationCity = scanner.nextInt();

        // Calculate the total distance and time taken for the trip
        double totalDistance = distanceToIntermediateCity + distanceToDestinationCity;
        int totalTime = timeToIntermediateCity + timeToDestinationCity;

        // Display the trip summary
        System.out.println("The total distance traveled by " + travelerName + " from " +
                           startingCity + " to " + destinationCity + " via " + intermediateCity +
                           " is " + totalDistance + " miles and " +
                           "the total time taken is " + totalTime + " minutes");

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}