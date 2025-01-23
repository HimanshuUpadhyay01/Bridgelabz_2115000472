import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize factorial variable
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}