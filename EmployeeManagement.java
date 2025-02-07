class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    }
    void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Salary: " + salary);
    }
    }
    class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
    super(name, id, salary);
    this.teamSize = teamSize;
    }
    void displayDetails() {
    super.displayDetails();
    System.out.println("Team Size: " + teamSize);
    }
    }
    class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
    super(name, id, salary);
    this.programmingLanguage = programmingLanguage;
    }
    void displayDetails() {
    super.displayDetails();
    System.out.println("Programming Language: " + programmingLanguage);
    }
    }
    class Intern extends Employee {
    int internshipDuration;
    Intern(String name, int id, double salary, int internshipDuration) {
    super(name, id, salary);
    this.internshipDuration = internshipDuration;
    }
    void displayDetails() {
    super.displayDetails();
    System.out.println("Internship Duration: " + internshipDuration + " months");
    }
    }
    public class EmployeeManagement {
    public static void main(String[] args) {
    Manager manager = new Manager("Alice", 101, 90000, 10);
    Developer developer = new Developer("Bob", 102, 70000, "Java");
    Intern intern = new Intern("Charlie", 103, 15000, 6);
    manager.displayDetails();
    developer.displayDetails();
    intern.displayDetails();
    }
    }
    