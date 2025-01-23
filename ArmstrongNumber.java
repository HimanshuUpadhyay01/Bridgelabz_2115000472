import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputValue = inputScanner.nextInt();
        int originalInputValue = inputValue;
        int totalSum = 0;

        while (originalInputValue != 0) {
            int currentDigit = originalInputValue % 10;
            totalSum += currentDigit * currentDigit * currentDigit;
            originalInputValue /= 10;
        }

        if (totalSum == inputValue) {
            System.out.println(inputValue + " is a armstrong number.");
        } else {
            System.out.println(inputValue + " is not a armstrong number.");
        }
        inputScanner.close();
    }
}