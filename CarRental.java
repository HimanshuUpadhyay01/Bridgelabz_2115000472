public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalFee;

    // Default constructor
    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
        this.rentalFee = 0.0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalFee = calculateRentalFee();
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
        this.rentalFee = calculateRentalFee();
    }

    public double getRentalFee() {
        return rentalFee;
    }

    // Method to calculate rental fee
    private double calculateRentalFee() {
        double dailyRate = 50.0;
        return dailyRate * rentalDays;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Fee: $" + String.format("%.2f", rentalFee));
    }

    // Method to generate rental agreement
    public void generateRentalAgreement() {
        System.out.println("Rental Agreement");
        System.out.println("----------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Fee: $" + String.format("%.2f", rentalFee));
        System.out.println("Terms and Conditions:");
        System.out.println("1. The rental period is for " + rentalDays + " days.");
        System.out.println("2. The rental fee is $" + String.format("%.2f", rentalFee) + " per day.");
        System.out.println("3. The customer is responsible for any damages to the vehicle.");
    }

    // Main method
    public static void main(String[] args) {
        CarRental rental = new CarRental("John Doe", "Toyota Camry", 5);
        rental.displayDetails();
        rental.generateRentalAgreement();
    }
}