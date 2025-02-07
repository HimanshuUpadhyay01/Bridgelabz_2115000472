interface Refuelable{
    void refuel();
    }
    
    class Vehicle{
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed,String model){
    this.maxSpeed=maxSpeed;
    this.model=model;
    }
    }
    
    class ElectricVehicle extends Vehicle{
    int batteryCapacity;
    ElectricVehicle(int maxSpeed,String model,int batteryCapacity){
    super(maxSpeed,model);
    this.batteryCapacity=batteryCapacity;
    }
    void charge(){
    System.out.println("Charging electric vehicle " + model + " with battery capacity: " + batteryCapacity + " kWh.");
    }
    }
    
    class PetrolVehicle extends Vehicle implements Refuelable{
    int fuelCapacity;
    PetrolVehicle(int maxSpeed,String model,int fuelCapacity){
    super(maxSpeed,model);
    this.fuelCapacity=fuelCapacity;
    }
    public void refuel(){
    System.out.println("Refueling petrol vehicle " + model + " with fuel capacity: " + fuelCapacity + " liters.");
    }
    }
    
    public class VehicleManagement {
    public static void main(String[] args){
    Vehicle electricCar = new ElectricVehicle(180, "Tesla Model 3", 75);
    Vehicle petrolCar = new PetrolVehicle(150, "Toyota Corolla", 50);
    
    ((ElectricVehicle)electricCar).charge();
    ((PetrolVehicle)petrolCar).refuel();
    }
    }
    