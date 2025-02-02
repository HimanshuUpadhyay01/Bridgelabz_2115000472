class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";
    Course(String courseName, int duration, double fee) {
    this.courseName = courseName;
    this.duration = duration;
    this.fee = fee;
    }
    void displayCourseDetails() {
    System.out.println(courseName + " " + duration + " " + fee);
    }
    static void updateInstituteName(String name) {
    instituteName = name;
    }
    public static void main(String[] args) {
    Course c1 = new Course("Java Programming", 3, 300.00);
    Course.updateInstituteName("Capgi Institute");
    c1.displayCourseDetails();
    System.out.println("Institute: " + Course.instituteName);
    }
    }