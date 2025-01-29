import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        // Define time zones
        ZoneId gmtZoneId = ZoneId.of("GMT");
        ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
        ZoneId pstZoneId = ZoneId.of("America/Los_Angeles");

        // Get current date and time in each time zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZoneId);
        ZonedDateTime istTime = ZonedDateTime.now(istZoneId);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZoneId);

        // Format date and time for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Display current time in each time zone
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("GMT: " + gmtTime.format(formatter));
        System.out.println("IST: " + istTime.format(formatter));
        System.out.println("PST: " + pstTime.format(formatter));
    }
}