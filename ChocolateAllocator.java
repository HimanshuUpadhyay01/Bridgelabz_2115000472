import java.util.Scanner;

/**
 * This class calculates the number of chocolates each child gets and the remaining chocolates.
 */
public class ChocolateAllocator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int totalChocolates = scanner.nextInt();

        // Prompt the user to enter the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = totalChocolates / numberOfChildren;

        // Calculate the remaining chocolates
        int remainingChocolates = totalChocolates % numberOfChildren;

        // Display the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates are " + remainingChocolates);

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}