public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(0.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }


    public static void main(String[] args) {
        // Create a circle object using default constructor
        Circle circle1 = new Circle();
        circle1.setRadius(5.0);
        System.out.println("Circle 1 Details:");
        circle1.displayDetails();

        // Create a circle object using parameterized constructor
        Circle circle2 = new Circle(10.0);
        System.out.println("\nCircle 2 Details:");
        circle2.displayDetails();
    }
}