import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);

        LocalDate result = modifyDate(date);
        System.out.println("Resulting date: " + result.format(formatter));
    }

    private static LocalDate modifyDate(LocalDate date) {
        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);

        return modifiedDate;
    }
}