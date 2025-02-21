import java.util.Scanner;
import java.util.InputMismatchException;
public class DivisionExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter the numerator: ");
double numerator = scanner.nextDouble();
System.out.print("Enter the denominator: ");
double denominator = scanner.nextDouble();
double result = numerator / denominator;
System.out.println("The result of division is: " + result);
} catch (ArithmeticException e) {
System.out.println("Error: Cannot divide by zero.");
} catch (InputMismatchException e) {
System.out.println("Error: Please enter valid numbers.");
} finally {
scanner.close();
}
}
}
