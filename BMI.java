import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mass (in kg): ");
        double mass = scanner.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double heightCentimeters = scanner.nextDouble();
        double heightMeters = heightCentimeters / 100;

        double bodyMassIndex = mass / Math.pow(heightMeters, 2);
        String weightCategory;

        if (bodyMassIndex < 18.5) {
            weightCategory = "Underweight";
        } else if (bodyMassIndex < 24.9) {
            weightCategory = "Normal weight";
        } else if (bodyMassIndex < 29.9) {
            weightCategory = "Overweight";
        } else {
            weightCategory = "Obese";
        }

        System.out.printf("Your Body Mass Index is: %.2f\n", bodyMassIndex);
        System.out.println("Your weight category is: " + weightCategory);

        scanner.close();
    }
}