import java.io.*;

public class FileCopyPerformanceComparison {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt"; // The large file to copy
        String destinationFileBuffered = "destinationBuffered.txt";
        String destinationFileUnbuffered = "destinationUnbuffered.txt";
        
        try {
            // Measure the time taken with buffered streams
            long startTimeBuffered = System.nanoTime();
            copyWithBufferedStreams(sourceFile, destinationFileBuffered);
            long endTimeBuffered = System.nanoTime();
            long bufferedTime = endTimeBuffered - startTimeBuffered;
            
            // Measure the time taken with unbuffered streams
            long startTimeUnbuffered = System.nanoTime();
            copyWithUnbufferedStreams(sourceFile, destinationFileUnbuffered);
            long endTimeUnbuffered = System.nanoTime();
            long unbufferedTime = endTimeUnbuffered - startTimeUnbuffered;
            
            // Output the times for comparison
            System.out.println("Buffered Stream Time: " + bufferedTime + " nanoseconds");
            System.out.println("Unbuffered Stream Time: " + unbufferedTime + " nanoseconds");
            
            // Performance comparison
            if (bufferedTime < unbufferedTime) {
                System.out.println("Buffered streams are faster.");
            } else {
                System.out.println("Unbuffered streams are faster.");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to copy file using Buffered Streams
    public static void copyWithBufferedStreams(String source, String destination) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Method to copy file using Unbuffered Streams
    public static void copyWithUnbufferedStreams(String source, String destination) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
