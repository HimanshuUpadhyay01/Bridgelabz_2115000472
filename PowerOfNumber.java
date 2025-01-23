import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter the power: ");
        int power = scanner.nextInt();
        scanner.close();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power of " + power + " is " + result);
    }
}