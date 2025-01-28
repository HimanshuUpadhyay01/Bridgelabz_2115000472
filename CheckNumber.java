import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number + " is " + positiveNegative(number));
            if (positiveNegative(number).equals("Positive")) {
                System.out.println(number + " is " + evenOdd(number));
            }
        }

        int comparisonResult = compareNumbers(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println(numbers[0] + " is greater than " + numbers[4]);
        } else if (comparisonResult == 0) {
            System.out.println(numbers[0] + " is equal to " + numbers[4]);
        } else {
            System.out.println(numbers[0] + " is less than " + numbers[4]);
        }
    }

    public static String positiveNegative(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String evenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}