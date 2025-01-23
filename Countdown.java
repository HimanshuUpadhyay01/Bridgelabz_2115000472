import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        scanner.close();

        System.out.println("Rocket launch countdown started!");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
            
        }
    }
}