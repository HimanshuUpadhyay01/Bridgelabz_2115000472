class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;
    Vehicle(String ownerName, String vehicleType) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
    System.out.println(ownerName + " " + vehicleType);
    }
    static void updateRegistrationFee(double fee) {
    registrationFee = fee;
    }
    public static void main(String[] args) {
    Vehicle v1 = new Vehicle("John Doe", "Car");
    Vehicle.updateRegistrationFee(600.00);
    v1.displayVehicleDetails();
    System.out.println("Registration Fee: " + Vehicle.registrationFee);
    }
    }