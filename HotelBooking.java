public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Getters and setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method
    public static void main(String[] args) {
        // Create a hotel booking object using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.setGuestName("John Doe");
        booking1.setRoomType("Deluxe");
        booking1.setNights(3);
        System.out.println("Booking 1 Details:");
        booking1.displayDetails();

        // Create a hotel booking object using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Jane Doe", "Suite", 5);
        System.out.println("\nBooking 2 Details:");
        booking2.displayDetails();

        // Create a hotel booking object using copy constructor
        HotelBooking booking3 = new HotelBooking(booking1);
        System.out.println("\nBooking 3 Details:");
        booking3.displayDetails();
    }
}