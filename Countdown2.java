import java.util.Scanner;

public class Countdown2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        scanner.close();

        System.out.println("Rocket launch countdown started!");
        for (; counter >= 1; counter--) {
            System.out.println(counter);
        }   
    }
}