public class UnitConverter {

    public static double yardsToFeet(double yards) {
        return yards * 3;
    }

    public static double feetToYards(double feet) {
        return feet / 3;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        double yards = 1;
        double feet = 3;
        double meters = 1;
        double inches = 1;

        System.out.println(yards + " yards = " + yardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + feetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + metersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + inchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + inchesToCentimeters(inches) + " cm");
    }
}