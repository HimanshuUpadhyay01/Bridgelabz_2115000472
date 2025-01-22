import java.util.Scanner;
public class UniversityFee {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total fee amount
        System.out.println("Enter the total fee amount:");
        int totalFee = scanner.nextInt();

        // Prompt the user to enter the discount percentage
        System.out.println("Enter the discount percentage:");
        int discountPercentage = scanner.nextInt();

        // Calculate the discount amount
        int discountAmount = (totalFee * discountPercentage) / 100;

        // Calculate the final fee after applying the discount
        int discountedFee = totalFee - discountAmount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discountAmount + " and the final discounted fee is INR " + discountedFee);
    }
}


