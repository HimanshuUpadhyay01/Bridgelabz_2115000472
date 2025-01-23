import java.util.Scanner;

public class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Calculate sum using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Compare results
            if (sumFormula == sumLoop) {
                System.out.println("Results match!");
                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using for loop: " + sumLoop);
            } else {
                System.out.println("Results do not match.");
            }
        }

        scanner.close();
    }
}