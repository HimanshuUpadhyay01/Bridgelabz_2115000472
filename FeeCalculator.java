public class FeeCalculator {
    public static void main(String[] args) {
        // Total fee amount
        int totalFee = 125000;

        // Discount percentage
        int discountPercentage = 10;

        // Calculate the discount amount
        int discountAmount = (totalFee * discountPercentage) / 100;

        // Calculate the final fee after applying the discount
        int finalFee = totalFee - discountAmount;

        // Print the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discountAmount + " and the final discounted fee is INR " + finalFee);
    }
}
