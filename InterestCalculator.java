import java.util.Scanner;

public class InterestCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter the amount: ");
double amount = scanner.nextDouble();
System.out.print("Enter the rate: ");
double rate = scanner.nextDouble();
System.out.print("Enter the number of years: ");
int years = scanner.nextInt();
System.out.println("Calculated Interest: " + calculateInterest(amount, rate, years));
} catch (IllegalArgumentException e) {
System.out.println("Invalid input: Amount and rate must be positive");
} finally {
scanner.close();
}
}
public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
if (amount < 0 || rate < 0) {
throw new IllegalArgumentException();
}
return amount * rate * years / 100;
}
}
