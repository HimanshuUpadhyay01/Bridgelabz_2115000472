import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getIntegerInput(scanner, "Enter first number: ");
        int num2 = getIntegerInput(scanner, "Enter second number: ");
        int num3 = getIntegerInput(scanner, "Enter third number: ");
        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number: " + max);
    }

    private static int getIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static int findMax(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}