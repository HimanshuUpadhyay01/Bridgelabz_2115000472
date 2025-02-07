import java.util.Date;

class Order {
int orderId;
Date orderDate;
Order(int orderId, Date orderDate) {
this.orderId = orderId;
this.orderDate = orderDate;
}
String getOrderStatus() {
return "Order Placed";
}
}
class ShippedOrder extends Order {
String trackingNumber;
ShippedOrder(int orderId, Date orderDate, String trackingNumber) {
super(orderId, orderDate);
this.trackingNumber = trackingNumber;
}
String getOrderStatus() {
return "Order Shipped";
}
}
class DeliveredOrder extends ShippedOrder {
Date deliveryDate;
DeliveredOrder(int orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
super(orderId, orderDate, trackingNumber);
this.deliveryDate = deliveryDate;
}
String getOrderStatus() {
return "Order Delivered";
}
}
public class OrderManagement {
public static void main(String[] args) {
Date orderDate = new Date();
Date deliveryDate = new Date();
DeliveredOrder deliveredOrder = new DeliveredOrder(101, orderDate, "123456789", deliveryDate);
System.out.println("Order ID: " + deliveredOrder.orderId);
System.out.println("Order Date: " + deliveredOrder.orderDate);
System.out.println("Delivery Date: " + deliveredOrder.deliveryDate);
System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
}
}
