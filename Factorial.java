import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = getInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    private static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    private static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}