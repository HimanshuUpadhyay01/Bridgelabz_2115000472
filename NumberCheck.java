import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = checkNumber(number);

        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }

    public static int checkNumber(int number) {
        if (number < 0) {
            return -1; // Negative number
        } else if (number > 0) {
            return 1; // Positive number
        } else {
            return 0; // Zero
        }
    }
}