public class PenDistribution {
        public static void main(String[] args) {
            // Total number of pens
            int totalPens = 14;
    
            // Total number of students
            int totalStudents = 3;
    
            // Calculate the number of pens left undistributed
            int remainingPens = totalPens % totalStudents;
    
            // Calculate the number of pens each student gets
            int pensPerStudent = totalPens / totalStudents;
    
            // Print the results
            System.out.println("Each student gets " + pensPerStudent + " pens, and the remaining pens not distributed are " + remainingPens + ".");
        }
    }
    
    

