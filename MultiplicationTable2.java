import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int[] multiplicationResult = new int[4];

            // Generate the multiplication table from 6 to 9
            for (int i = 0; i < 4; i++) {
                multiplicationResult[i] = number * (i + 6);
            }

            // Display the multiplication table
            System.out.println("Multiplication Table of " + number + " from 6 to 9:");
            for (int i = 0; i < 4; i++) {
                System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
            }
        }

    }
}