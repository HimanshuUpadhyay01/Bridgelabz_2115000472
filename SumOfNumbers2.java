import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recursiveSum = findSumUsingRecursion(n);
        int formulaSum = findSumUsingFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Computations do not match.");
        }

        scanner.close();
    }

    public static int findSumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + findSumUsingRecursion(n - 1);
        }
    }

    public static int findSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}