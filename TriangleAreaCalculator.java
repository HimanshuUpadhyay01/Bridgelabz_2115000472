import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        float baseCm = scanner.nextFloat();

        // Convert the base from centimeters to inches
        float baseInches = baseCm / 2.54f;

        // Prompt the user to enter the height of the triangle in centimeters
        System.out.print("Enter the height of the triangle in cm: ");
        float heightCm = scanner.nextFloat();

        // Convert the height from centimeters to inches
        float heightInches = heightCm / 2.54f;

        // Calculate the area of the triangle in square centimeters
        float areaCm = (baseCm * heightCm) / 2;

        // Calculate the area of the triangle in square inches
        float areaInches = (baseInches * heightInches) / 2;

        // Display the results
        System.out.println("The area of the triangle with base " + baseCm + " cm and height " 
                           + heightCm + " cm is " + areaCm + " square cm.");
        System.out.println("The same area in inches is " + areaInches + " square inches.");
    }
}
