import java.util.Scanner;

public class BmI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamMembers = new double[10][3];

        System.out.println("Enter weight (in kg) and height (in cm) for each team member:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Team Member " + (i + 1) + ": ");
            teamMembers[i][0] = scanner.nextDouble();
            teamMembers[i][1] = scanner.nextDouble();
        }

        BMI(teamMembers);
        String[] bmiStatus = determineBMIStatus(teamMembers);

        System.out.println("\nTeam Members' BMI Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Team Member " + (i + 1) + ":");
            System.out.println("Weight: " + teamMembers[i][0] + " kg");
            System.out.println("Height: " + teamMembers[i][1] + " cm");
            System.out.println("BMI: " + teamMembers[i][2]);
            System.out.println("BMI Status: " + bmiStatus[i]);
            System.out.println();
        }
    }

    public static void BMI(double[][] teamMembers) {
        for (int i = 0; i < 10; i++) {
            double heightInMeters = teamMembers[i][1] / 100;
            teamMembers[i][2] = teamMembers[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] teamMembers) {
        String[] bmiStatus = new String[10];
        for (int i = 0; i < 10; i++) {
            if (teamMembers[i][2] < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (teamMembers[i][2] >= 18.5 && teamMembers[i][2] < 24.9) {
                bmiStatus[i] = "Normal";
            } else if (teamMembers[i][2] >= 25 && teamMembers[i][2] < 29.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }
}