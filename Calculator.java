import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        performAddition(scanner);
                        break;
                    case 2:
                        performSubtraction(scanner);
                        break;
                    case 3:
                        performMultiplication(scanner);
                        break;
                    case 4:
                        performDivision(scanner);
                        break;
                    case 5:
                        continueCalculating = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid operation.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        double num1 = getNumberInput(scanner, "Enter first number: ");
        double num2 = getNumberInput(scanner, "Enter second number: ");
        double result = add(num1, num2);
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
    }

    private static void performSubtraction(Scanner scanner) {
        double num1 = getNumberInput(scanner, "Enter first number: ");
        double num2 = getNumberInput(scanner, "Enter second number: ");
        double result = subtract(num1, num2);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
    }

    private static void performMultiplication(Scanner scanner) {
        double num1 = getNumberInput(scanner, "Enter first number: ");
        double num2 = getNumberInput(scanner, "Enter second number: ");
        double result = multiply(num1, num2);
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
    }

    private static void performDivision(Scanner scanner) {
        double num1 = getNumberInput(scanner, "Enter dividend: ");
        double num2 = getNumberInput(scanner, "Enter divisor: ");

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = divide(num1, num2);
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
        }
    }

    private static double getNumberInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}