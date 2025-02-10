abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
    this.vehicleNumber = vehicleNumber;
    this.type = type;
    this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
    return vehicleNumber;
    }
    public String getType() {
    return type;
    }
    public double getRentalRate() {
    return rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails() {
    System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate);
    }
    }
    class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate) {
    super(vehicleNumber, type, rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
    return getRentalRate() * days;
    }
    }
    class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, double rentalRate) {
    super(vehicleNumber, type, rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
    return getRentalRate() * days;
    }
    }
    class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate) {
    super(vehicleNumber, type, rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
    return getRentalRate() * days;
    }
    }
    class VehicleRentalSystem {
    public static void main(String[] args) {
    Vehicle car = new Car("C123", "Tarzan The Wonder Car", 1000);
    Vehicle bike = new Bike("B456", "David Putra", 500);
    System.out.println("Details of Vehicles:");
    car.displayDetails();
    System.out.println("Rental Cost: " + car.calculateRentalCost(5));
    bike.displayDetails();
    System.out.println("Rental Cost: " + bike.calculateRentalCost(3));
    }
    }