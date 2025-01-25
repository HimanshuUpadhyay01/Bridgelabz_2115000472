import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Get input values from the user
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter the height of player " + (i + 1) + " (in meters): ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double meanHeight = sum / 11;

        // Print the mean height
        System.out.println("\nThe mean height of the football team is: " + meanHeight + " meters");

        scanner.close();
    }
}