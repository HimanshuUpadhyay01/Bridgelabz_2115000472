import java.util.Scanner;

public class Calendar {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("\n    " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        if (isLeapYear(year)) days[1] = 29;
        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%3d", i);
            if ((i + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0 == 0 ? 7 : d0;
    }
}