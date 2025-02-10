abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
    }
    public String getItemName() {
    return itemName;
    }
    public double getPrice() {
    return price;
    }
    public int getQuantity() {
    return quantity;
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
    System.out.println("Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
    }
    class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
    super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
    return getPrice() * getQuantity();
    }
    }
    class NonVegItem extends FoodItem {
    private double additionalCharge;
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
    super(itemName, price, quantity);
    this.additionalCharge = additionalCharge;
    }
    @Override
    public double calculateTotalPrice() {
    return (getPrice() + additionalCharge) * getQuantity();
    }
    }
    interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
    }
    class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
    FoodItem veg = new VegItem("Paneer Tikka", 200, 2);
    FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1, 50);
    System.out.println("Details of Food Items:");
    veg.getItemDetails();
    System.out.println("Total Price: " + veg.calculateTotalPrice());
    nonVeg.getItemDetails();
    System.out.println("Total Price: " + nonVeg.calculateTotalPrice());
    }
    }