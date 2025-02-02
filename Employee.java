class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    void setSalary(double salary) {
    this.salary = salary;
    }
    public static void main(String[] args) {
    Employee emp = new Employee();
    emp.employeeID = 1001;
    emp.department = "HR";
    emp.setSalary(5000.00);
    System.out.println("Employee ID: " + emp.employeeID);
    System.out.println("Department: " + emp.department);
    }
    }
    class Manager extends Employee {}