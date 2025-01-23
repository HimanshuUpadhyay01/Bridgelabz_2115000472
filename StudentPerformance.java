import java.util.*;

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first course name: ");
        String course1 = scanner.next();
        System.out.println("Enter the score in first course: ");
        int score1 = scanner.nextInt();

        System.out.println("Enter the second course name: ");
        String course2 = scanner.next();
        System.out.println("Enter the score in second course: ");
        int score2 = scanner.nextInt();

        System.out.println("Enter the third course name: ");
        String course3 = scanner.next();
        System.out.println("Enter the score in third course: ");
        int score3 = scanner.nextInt();

        int totalScore = score1 + score2 + score3;
        double percentage = (double) (totalScore / 3) * 100;
        double averageScore = totalScore / 3.0;

        if (percentage >= 80.0) {
            System.out.println("Average score: " + averageScore + ",\nGrade: A" + " \nRemarks: Level 4, above agency-normalized standards");
        } else if (percentage < 80.0 && percentage >= 70.0) {
            System.out.println("Average score: " + averageScore + ",\nGrade: B" + " \nRemarks: Level 3, at agency-normalized standards");
        } else if (percentage < 70.0 && percentage >= 60.0) {
            System.out.println("Average score: " + averageScore + ",\nGrade: C" + " \nRemarks: Level 2, below agency-normalized standards");
        } else if (percentage < 60.0 && percentage >= 50.0) {
            System.out.println("Average score: " + averageScore + ",\nGrade: D" + " \nRemarks: Level 1, well below agency-normalized standards");
        } else if (percentage < 50.0 && percentage >= 40.0) {
            System.out.println("Average score: " + averageScore + ",\nGrade: E" + " \nRemarks: Level 1, too below agency-normalized standards");
        } else {
            System.out.println("Average score: " + averageScore + " \nRemedial standards");
        }

        scanner.close();
    }
}