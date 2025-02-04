public class Product {
    private static double discount = 10.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    
    public Product(String productName, double price, int quantity, String productID) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.productID = productID;
    }
    
    public static void updateDiscount(double newDiscount) {
    discount = newDiscount;
    System.out.println("Discount updated to: " + discount + "%");
    }
    
    public void displayProductDetails() {
    if (this instanceof Product) {
    System.out.println("Product Name: " + productName);
    System.out.println("Product ID: " + productID);
    System.out.println("Price: $" + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Discount: " + discount + "%");
    double discountedPrice = price - (price * discount / 100);
    System.out.println("Discounted Price: $" + discountedPrice);
    } else {
    System.out.println("This is not a Product instance.");
    }
    }
    
    public String getProductID() {
    return productID;
    }
    
    public String getProductName() {
    return productName;
    }
    
    public double getPrice() {
    return price;
    }
    
    public int getQuantity() {
    return quantity;
    }
    
    public static void main(String[] args) {
    Product product1 = new Product("Laptop", 1000.00, 2, "P001");
    Product product2 = new Product("Smartphone", 500.00, 3, "P002");
    product1.displayProductDetails();
    product2.displayProductDetails();
    Product.updateDiscount(15.0);
    product1.displayProductDetails();
    product2.displayProductDetails();
    }
    }
    