import java.util.Scanner;

public class Grading2DArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create a 2D array to store marks
        int[][] marks = new int[numStudents][3]; // 3 subjects: physics, chemistry, maths

        // Create arrays to store percentages and grades
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) {
                        System.out.print("Physics: ");
                    } else if (j == 1) {
                        System.out.print("Chemistry: ");
                    } else {
                        System.out.print("Maths: ");
                    }
                    marks[i][j] = scanner.nextInt();
                } while (marks[i][j] < 0);
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nStudent Results:");
        System.out.println("--------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("--------------------------------");
        }
    }
}