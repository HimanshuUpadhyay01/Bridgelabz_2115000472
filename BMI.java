import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            bmis[i] = calculateBMI(weights[i], heights[i]);
            statuses[i] = getWeightStatus(bmis[i]);
        }

        System.out.println("\nBMI and Weight Status Report:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Weight Status: " + statuses[i]);
            System.out.println();
        }

        scanner.close();
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}