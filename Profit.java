public class Profit {
    public static void main(String[] args) {
        // Selling price of the item
        double sellingPrice = 191;

        // Cost price of the item
        double costPrice = 129;

        // Calculate the profit
        double profit = sellingPrice - costPrice;

        // Calculate the profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Print the cost price, selling price, profit, and profit percentage
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice 
                           + ". The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
