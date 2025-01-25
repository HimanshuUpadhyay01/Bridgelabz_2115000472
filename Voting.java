import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Take user input for the age of all 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Loop through the array and check if each student can vote
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } else if (studentAges[i] >= 18) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}