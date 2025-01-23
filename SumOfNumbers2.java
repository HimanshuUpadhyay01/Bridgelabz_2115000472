import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to add (0 or negative to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("The sum is: " + total);
    }
}