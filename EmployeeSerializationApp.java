import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSerializationApp {
    public static void main(String[] args) {
        String fileName = "employees.ser";  // File where employee data will be stored

        // Scanner to read input from user
        Scanner scanner = new Scanner(System.in);

        // Create a list to hold employee objects
        List<Employee> employees = new ArrayList<>();

        // Prompt user for the number of employees to add
        System.out.print("Enter number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();  // Consume newline character left by nextInt()

        // Collect employee information from the user
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Get employee details
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            // Add employee to the list
            employees.add(new Employee(id, name, department, salary));
        }

        // Serialize the list of employees to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);  // Serialize the employees list
            System.out.println("Employee data serialized and saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the employees list from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Employee> deserializedEmployees = (List<Employee>) ois.readObject();
            System.out.println("\nEmployee data retrieved from file:");

            // Display the deserialized employees
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found during deserialization: " + e.getMessage());
        } finally {
            scanner.close();  // Close the scanner to prevent resource leak
        }
    }
}
