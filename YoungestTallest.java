import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amarAge, akbarAge, anthonyAge;
        double amarHeight, akbarHeight, anthonyHeight;

        System.out.print("Enter Amar's age: ");
        amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's age: ");
        akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's age: ");
        anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        anthonyHeight = scanner.nextDouble();

        String youngest = getYoungest(amarAge, akbarAge, anthonyAge);
        String tallest = getTallest(amarHeight, akbarHeight, anthonyHeight);

        System.out.println("\nThe youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);

        scanner.close();
    }

    private static String getYoungest(int amarAge, int akbarAge, int anthonyAge) {
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            return "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    private static String getTallest(double amarHeight, double akbarHeight, double anthonyHeight) {
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            return "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }
}