class Course {
    String courseName;
    int duration; // in hours
    Course(String courseName, int duration) {
    this.courseName = courseName;
    this.duration = duration;
    }
    void displayCourseInfo() {
    System.out.println("Course Name: " + courseName);
    System.out.println("Duration: " + duration + " hours");
    }
    }
    class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
    super(courseName, duration);
    this.platform = platform;
    this.isRecorded = isRecorded;
    }
    void displayCourseInfo() {
    super.displayCourseInfo();
    System.out.println("Platform: " + platform);
    System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
    }
    class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
    super(courseName, duration, platform, isRecorded);
    this.fee = fee;
    this.discount = discount;
    }
    void displayCourseInfo() {
    super.displayCourseInfo();
    System.out.println("Fee: $" + fee);
    System.out.println("Discount: " + discount + "%");
    }
    }
    public class EducationCourse {
    public static void main(String[] args) {
    PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 99.99, 20);
    paidCourse.displayCourseInfo();
    }
    }
    