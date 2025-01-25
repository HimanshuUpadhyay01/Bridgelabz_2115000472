import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaryAndYears = new double[20];
        double[] bonusAndNewSalary = new double[20];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salaryAndYears[i * 2] = scanner.nextDouble();

                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    salaryAndYears[i * 2 + 1] = scanner.nextDouble();

                    if (salaryAndYears[i * 2] <= 0 || salaryAndYears[i * 2 + 1] <= 0) {
                        System.out.println("Error: Please enter a positive number.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Error: Invalid input. Please enter a number.");
                    scanner.next();
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            double bonus;
            if (salaryAndYears[i * 2 + 1] > 5) {
                bonus = salaryAndYears[i * 2] * 0.05;
            } else {
                bonus = salaryAndYears[i * 2] * 0.02;
            }

            bonusAndNewSalary[i * 2] = bonus;
            bonusAndNewSalary[i * 2 + 1] = salaryAndYears[i * 2] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaryAndYears[i * 2];
            totalNewSalary += bonusAndNewSalary[i * 2 + 1];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}