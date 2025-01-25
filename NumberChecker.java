import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check the nature of each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println("Number " + numbers[i] + " is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] > numbers[4]) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        }

        scanner.close();
    }
}