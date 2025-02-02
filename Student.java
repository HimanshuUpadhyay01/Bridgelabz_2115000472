class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    void setCGPA(double CGPA) {
    this.CGPA = CGPA;
    }
    double getCGPA() {
    return CGPA;
    }
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNumber = 101;
    s1.name = "Alice";
    s1.setCGPA(3.8);
    System.out.println("Roll Number: " + s1.rollNumber);
    System.out.println("Name: " + s1.name);
    System.out.println("CGPA: " + s1.getCGPA());
    }
    }
    class PostgraduateStudent extends Student {}