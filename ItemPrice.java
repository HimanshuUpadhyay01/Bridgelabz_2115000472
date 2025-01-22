import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the unit price and quantity
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n",
                totalPrice, quantity, unitPrice);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
