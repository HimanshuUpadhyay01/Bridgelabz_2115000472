import java.io.*;

class Student {
    private int rollNumber;
    private String name;
    private double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StudentDetailsBinaryFile {
    public static void main(String[] args) {
        String filePath = "students.dat"; // Path to the binary file

        // Write student details to the binary file
        Student student1 = new Student(101, "John Doe", 3.75);
        Student student2 = new Student(102, "Jane Smith", 3.90);
        
        // Write the student details to the binary file
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            writeStudentDetails(dataOutputStream, student1);
            writeStudentDetails(dataOutputStream, student2);
            System.out.println("Student details written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read student details from the binary file
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))) {
            while (dataInputStream.available() > 0) {
                int rollNumber = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                double gpa = dataInputStream.readDouble();
                
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to write student details to the DataOutputStream
    private static void writeStudentDetails(DataOutputStream dataOutputStream, Student student) throws IOException {
        dataOutputStream.writeInt(student.getRollNumber());
        dataOutputStream.writeUTF(student.getName());
        dataOutputStream.writeDouble(student.getGpa());
    }
}
