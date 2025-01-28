public class Temperature {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 37.7778;
        double pounds = 10;
        double kilograms = 4.53592;
        double gallons = 5;
        double liters = 18.9271;

        System.out.println(fahrenheit + " Fahrenheit = " + fahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius = " + celsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(pounds + " Pounds = " + poundsToKilograms(pounds) + " Kilograms");
        System.out.println(kilograms + " Kilograms = " + kilogramsToPounds(kilograms) + " Pounds");
        System.out.println(gallons + " Gallons = " + gallonsToLiters(gallons) + " Liters");
        System.out.println(liters + " Liters = " + litersToGallons(liters) + " Gallons");
    }
}