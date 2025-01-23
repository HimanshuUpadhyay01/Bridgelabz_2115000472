import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputValue = inputReader.nextInt();
        int digitCount = 0;

        while (inputValue != 0) {
            inputValue /= 10;
            digitCount++;
        }

        System.out.println("The number of digits is: " + digitCount);
        inputReader.close();
    }
}