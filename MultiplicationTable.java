import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int[] multiplicationTable = new int[10];

            // Generate the multiplication table
            for (int i = 1; i <= 10; i++) {
                multiplicationTable[i - 1] = number * i;
            }

            // Display the multiplication table
            System.out.println("Multiplication Table of " + number);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
            }
        }

    }
}