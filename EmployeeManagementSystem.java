abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    public Employee(int employeeId, String name, double baseSalary) {
    this.employeeId = employeeId;
    this.name = name;
    this.baseSalary = baseSalary;
    }
    public int getEmployeeId() {
    return employeeId;
    }
    public String getName() {
    return name;
    }
    public double getBaseSalary() {
    return baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
    System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
    }
    class FullTimeEmployee extends Employee {
    private double fixedSalary;
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
    super(employeeId, name, baseSalary);
    this.fixedSalary = fixedSalary;
    }
    @Override
    public double calculateSalary() {
    return fixedSalary;
    }
    }
    class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
    super(employeeId, name, baseSalary);
    this.workHours = workHours;
    this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
    return workHours * hourlyRate;
    }
    }
    interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
    }
    class EmployeeManagementSystem {
    public static void main(String[] args) {
    Employee emp1 = new FullTimeEmployee(1, "YSSUP", 50000, 60000);
    Employee emp2 = new PartTimeEmployee(2, "KCID", 20000, 20, 500);
    System.out.println("Details of Employees:");
    emp1.displayDetails();
    System.out.println("Salary: " + emp1.calculateSalary());
    emp2.displayDetails();
    System.out.println("Salary: " + emp2.calculateSalary());
    }
    }