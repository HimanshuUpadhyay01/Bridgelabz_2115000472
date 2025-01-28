import java.util.Random;

public class Bonus {
    public static void main(String[] args) {
        int[][] employeeData = determineSalaryAndYearsOfService(10);
        int[][] bonusData = calculateNewSalaryAndBonus(employeeData);
        displayResults(employeeData, bonusData);
    }

    public static int[][] determineSalaryAndYearsOfService(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = random.nextInt(90000) + 10000; // salary
            employeeData[i][1] = random.nextInt(20) + 1; // years of service
        }
        return employeeData;
    }

    public static int[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int[][] bonusData = new int[employeeData.length][3];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            int bonusPercentage = yearsOfService > 5 ? 5 : 2;
            int bonusAmount = (salary * bonusPercentage) / 100;
            int newSalary = salary + bonusAmount;
            bonusData[i][0] = salary; // old salary
            bonusData[i][1] = newSalary; // new salary
            bonusData[i][2] = bonusAmount; // bonus amount
        }
        return bonusData;
    }

    public static void displayResults(int[][] employeeData, int[][] bonusData) {
        System.out.println("Employee Bonus Details:");
        System.out.println("Employee ID\tOld Salary\tNew Salary\tBonus Amount\tYears of Service");
        int sumOldSalary = 0, sumNewSalary = 0, sumBonusAmount = 0;
        for (int i = 0; i < bonusData.length; i++) {
            System.out.println((i + 1) + "\t\t" + bonusData[i][0] + "\t\t" + bonusData[i][1] + "\t\t" + bonusData[i][2] + "\t\t" + employeeData[i][1]);
            sumOldSalary += bonusData[i][0];
            sumNewSalary += bonusData[i][1];
            sumBonusAmount += bonusData[i][2];
        }
        System.out.println("Sum of Old Salary: " + sumOldSalary);
        System.out.println("Sum of New Salary: " + sumNewSalary);
        System.out.println("Total Bonus Amount: " + sumBonusAmount);
    }
}