import java.util.ArrayList;
import java.util.List;
class ECommercePlatform{
private String name;
private List<Customer> customers;
public ECommercePlatform(String name){
this.name=name;
customers=new ArrayList<>();
}
public void addCustomer(Customer customer){
customers.add(customer);
}
public void showCustomers(){
System.out.println("Customers in "+name+":");
for(Customer customer:customers){
System.out.println(customer.getName());
}
}
}
class Customer{
private String name;
private List<Order> orders;
public Customer(String name){
this.name=name;
orders=new ArrayList<>();
}
public String getName(){
return name;
}
public void placeOrder(Order order){
orders.add(order);
System.out.println(name+" placed an order: Order ID - "+order.getOrderId());
}
public void showOrders(){
System.out.println(name+" has placed the following orders:");
for(Order order:orders){
System.out.println("Order ID - "+order.getOrderId());
order.showProducts();
}
}
}
class Order{
private String orderId;
private List<Product> products;
public Order(String orderId){
this.orderId=orderId;
products=new ArrayList<>();
}
public String getOrderId(){
return orderId;
}
public void addProduct(Product product){
products.add(product);
}
public void showProducts(){
System.out.println("Products in Order ID - "+orderId+":");
for(Product product:products){
System.out.println(product.getProductName()+" - Price: "+product.getPrice());
}
}
}
class Product{
private String productName;
private double price;
public Product(String productName, double price){
this.productName=productName;
this.price=price;
}
public String getProductName(){
return productName;
}
public double getPrice(){
return price;
}
}
public class ECommerce{
public static void main(String[] args){
ECommercePlatform platform=new ECommercePlatform("Online Shopping Hub");
Customer customer1=new Customer("Ravi Kumar");
Customer customer2=new Customer("Priya Verma");
Product product1=new Product("Laptop", 50000);
Product product2=new Product("Smartphone", 20000);
Product product3=new Product("Headphones", 1500);
Order order1=new Order("ORD001");
Order order2=new Order("ORD002");
order1.addProduct(product1);
order1.addProduct(product2);
order2.addProduct(product3);
customer1.placeOrder(order1);
customer2.placeOrder(order2);
platform.addCustomer(customer1);
platform.addCustomer(customer2);
platform.showCustomers();
customer1.showOrders();
customer2.showOrders();
}
}
