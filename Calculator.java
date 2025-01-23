import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        double num1 = inputReader.nextDouble();
        System.out.print("Enter the second value: ");
        double num2 = inputReader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String operation = inputReader.next();

        switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
        inputReader.close();
    }
}