import java.util.Scanner;

public class ArithmeticCalculator{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of 'x'
        System.out.print("Enter value of x: ");
        double x = scanner.nextDouble();

        // Prompt the user to enter the value of 'y'
        System.out.print("Enter value of y: ");
        double y = scanner.nextDouble();

        // Prompt the user to enter the value of 'z'
        System.out.print("Enter value of z: ");
        double z = scanner.nextDouble();

        // Perform various arithmetic operations
        double operation1 = x + y * z;       // Addition of x and product of y and z
        double operation2 = x * y + z;       // Product of x and y, then addition of z
        double operation3 = z + x / y;       // Addition of z and division of x by y
        double operation4 = x % y + z;       // Remainder of x divided by y, then addition of z

        // Display the results of the operations
        System.out.println("The results of the arithmetic operations are:");
        System.out.println("1. x + y * z = " + operation1);
        System.out.println("2. x * y + z = " + operation2);
        System.out.println("3. z + x / y = " + operation3);
        System.out.println("4. x % y + z = " + operation4);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
