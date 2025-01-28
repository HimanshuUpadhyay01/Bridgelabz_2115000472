import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        double windChill = windChill(temperature, windSpeed);

        System.out.printf("Wind Chill Temperature: %.2f°F%n", windChill);

        scanner.close();
    }

    public static double windChill(double temperature, double windSpeed) {
        if (windSpeed < 3 || temperature > 50) {
            return temperature; // Wind chill not applicable
        }

        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}