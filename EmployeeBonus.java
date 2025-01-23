import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter employee's year of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate bonus
        double bonus;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        } else {
            bonus = 0;
        }

        // Print bonus amount
        System.out.println("Bonus amount: " + bonus);

        scanner.close();
    }
}