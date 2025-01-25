import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter up to 10 numbers (0 or negative to stop):");

            while (true) {
                System.out.print("Enter number " + (index + 1) + ": ");
                double number = scanner.nextDouble();

                if (number <= 0 || index == 9) {
                    break;
                }

                numbers[index] = number;
                index++;
            }
        }

        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nThe sum of the numbers is: " + total);

    }
}