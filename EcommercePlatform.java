abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
    }
    public int getProductId() {
    return productId;
    }
    public String getName() {
    return name;
    }
    public double getPrice() {
    return price;
    }
    public abstract double calculateDiscount();
    public void displayDetails() {
    System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
    }
    class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
    super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
    return getPrice() * 0.1;
    }
    }
    class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
    super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
    return getPrice() * 0.2;
    }
    }
    class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
    super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
    return getPrice() * 0.05;
    }
    }
    interface Taxable {
    double calculateTax();
    String getTaxDetails();
    }
    class EcommercePlatform {
    public static void main(String[] args) {
    Product elec = new Electronics(1, "Laptop", 60000);
    Product cloth = new Clothing(2, "T-Shirt", 800);
    Product grocery = new Groceries(3, "Apple", 100);
    System.out.println("Details of Products:");
    elec.displayDetails();
    System.out.println("Discount: " + elec.calculateDiscount());
    cloth.displayDetails();
    System.out.println("Discount: " + cloth.calculateDiscount());
    grocery.displayDetails();
    System.out.println("Discount: " + grocery.calculateDiscount());
    }
    }