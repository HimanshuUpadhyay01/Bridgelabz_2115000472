public class Average {
    public static void main(String[] args) {
        // Marks obtained in individual subjects
        int physicsMarks = 95;
        int mathsMarks = 94;
        int chemistryMarks = 96;

        // Calculate the total marks obtained
        int totalMarksObtained = physicsMarks + mathsMarks + chemistryMarks;

        // Calculate the average marks
        int averageMarks = totalMarksObtained / 3;

        // Print the average marks
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}
