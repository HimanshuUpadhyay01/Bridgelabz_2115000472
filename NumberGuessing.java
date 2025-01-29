import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = MIN_NUMBER;
        int max = MAX_NUMBER;

        System.out.println("Think of a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");

        while (true) {
            int guess = generateGuess(min, max, random);
            System.out.println("My guess is: " + guess);

            String feedback = getUserFeedback(scanner);
            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it correctly!");
                break;
            } else if (feedback.equals("high")) {
                max = guess - 1;
            } else if (feedback.equals("low")) {
                min = guess + 1;
            }
        }
    }

    private static int generateGuess(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    private static String getUserFeedback(Scanner scanner) {
        while (true) {
            System.out.print("Is my guess high, low, or correct? ");
            String feedback = scanner.nextLine().trim().toLowerCase();
            if (feedback.equals("high") || feedback.equals("low") || feedback.equals("correct")) {
                return feedback;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
    }
}