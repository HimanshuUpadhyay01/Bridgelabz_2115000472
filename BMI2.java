import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            weightStatus[i] = getWeightStatus(personData[i][2]);
        }

        System.out.println("\nBMI and Weight Status Report:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }

        scanner.close();
    }

    private static String getWeightStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
}