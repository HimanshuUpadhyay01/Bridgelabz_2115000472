import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Define custom date formats
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format and display current date
        System.out.println("Current Date in Different Formats:");
        System.out.println("Format 1 (dd/MM/yyyy): " + currentDate.format(formatter1));
        System.out.println("Format 2 (yyyy-MM-dd): " + currentDate.format(formatter2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + currentDate.format(formatter3));
    }
}