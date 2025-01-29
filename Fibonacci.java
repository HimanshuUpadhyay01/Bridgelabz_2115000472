import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        printFibonacciSequence(terms);
    }

    private static void printFibonacciSequence(int terms) {
        if (terms <= 0) {
            System.out.println("Invalid number of terms.");
            return;
        }

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");
        terms -= 2;

        while (terms > 0) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
            terms--;
        }
        System.out.println();
    }
}