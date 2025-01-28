import java.util.Scanner;

public class Trigonometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] trigonometricFunctions = trigonometricFunctions(angle);

        System.out.printf("Sine: %.4f%n", trigonometricFunctions[0]);
        System.out.printf("Cosine: %.4f%n", trigonometricFunctions[1]);
        System.out.printf("Tangent: %.4f%n", trigonometricFunctions[2]);

        scanner.close();
    }

    public static double[] trigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }
}