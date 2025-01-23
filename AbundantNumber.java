import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputValue = inputReader.nextInt();
        int divisorSum = 0;

        for (int divisor = 1; divisor < inputValue; divisor++) {
            if (inputValue % divisor == 0) {
                divisorSum += divisor;
            }
        }

        if (divisorSum > inputValue) {
            System.out.println(inputValue + " is an Abundant number.");
        } else {
            System.out.println(inputValue + " is not an Abundant number.");
        }
        inputReader.close();
    }
}