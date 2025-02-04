public class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;
    
    public Employee(String name, String id, String designation) {
    this.name = name;
    this.id = id;
    this.designation = designation;
    totalEmployees++;
    }
    
    public static void displayTotalEmployees() {
    System.out.println("Total employees: " + totalEmployees);
    }
    
    public void displayEmployeeDetails() {
    if (this instanceof Employee) {
    System.out.println("Company Name: " + companyName);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee ID: " + id);
    System.out.println("Designation: " + designation);
    } else {
    System.out.println("This is not an Employee instance.");
    }
    }
    
    public String getId() {
    return id;
    }
    
    public String getName() {
    return name;
    }
    
    public String getDesignation() {
    return designation;
    }
    
    public static void main(String[] args) {
    Employee employee1 = new Employee("Alice", "E001", "Software Engineer");
    Employee employee2 = new Employee("Bob", "E002", "Project Manager");
    employee1.displayEmployeeDetails();
    employee2.displayEmployeeDetails();
    Employee.displayTotalEmployees();
    }
    }
    