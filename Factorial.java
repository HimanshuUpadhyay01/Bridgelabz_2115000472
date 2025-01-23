import java.util.Scanner;

public class Factorial {
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

            // Compute factorial using while loop
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}