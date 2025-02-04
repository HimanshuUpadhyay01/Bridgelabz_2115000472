public class Vehicle {
    private static double registrationFee = 150.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
    this.registrationNumber = registrationNumber;
    }
    
    public static void updateRegistrationFee(double newFee) {
    registrationFee = newFee;
    System.out.println("Registration fee updated to: $" + registrationFee);
    }
    
    public void displayRegistrationDetails() {
    if (this instanceof Vehicle) {
    System.out.println("Owner Name: " + ownerName);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Registration Number: " + registrationNumber);
    System.out.println("Registration Fee: $" + registrationFee);
    } else {
    System.out.println("This is not a Vehicle instance.");
    }
    }
    
    public String getRegistrationNumber() {
    return registrationNumber;
    }
    
    public String getOwnerName() {
    return ownerName;
    }
    
    public String getVehicleType() {
    return vehicleType;
    }
    
    public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle("John Doe", "Car", "V12345");
    Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "V67890");
    vehicle1.displayRegistrationDetails();
    vehicle2.displayRegistrationDetails();
    Vehicle.updateRegistrationFee(200.0);
    vehicle1.displayRegistrationDetails();
    vehicle2.displayRegistrationDetails();
    }
    }
    