import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.println("Enter your height in centimeters:");
        float heightCm = scanner.nextFloat();

        // Conversion factors
        float cmToInches = 2.54f;
        float inchesToFeet = 12.0f;

        // Convert height to inches
        float heightInches = heightCm / cmToInches;

        // Convert height to feet
        float heightFeet = heightInches / inchesToFeet;

        // Display the height in centimeters, feet, and inches
        System.out.println("Your height is " + heightCm + " cm, which is approximately " 
                           + heightFeet + " feet or " + heightInches + " inches.");
    }
}
