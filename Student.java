public class Student {
    private static String universityName = "State University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, String rollNumber, String grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    totalStudents++;
    }
    
    public static void displayTotalStudents() {
    System.out.println("Total students enrolled: " + totalStudents);
    }
    
    public void displayStudentDetails() {
    if (this instanceof Student) {
    System.out.println("University Name: " + universityName);
    System.out.println("Student Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Grade: " + grade);
    } else {
    System.out.println("This is not a Student instance.");
    }
    }
    
    public void updateGrade(String newGrade) {
    if (this instanceof Student) {
    this.grade = newGrade;
    System.out.println("Grade updated to: " + newGrade);
    } else {
    System.out.println("This is not a Student instance.");
    }
    }
    
    public String getRollNumber() {
    return rollNumber;
    }
    
    public String getName() {
    return name;
    }
    
    public String getGrade() {
    return grade;
    }
    
    public static void main(String[] args) {
    Student student1 = new Student("Alice", "S001", "A");
    Student student2 = new Student("Bob", "S002", "B");
    student1.displayStudentDetails();
    student2.displayStudentDetails();
    Student.displayTotalStudents();
    student1.updateGrade("A+");
    student1.displayStudentDetails();
    }
    }
    