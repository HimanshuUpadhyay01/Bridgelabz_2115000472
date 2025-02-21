import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "data.txt";
        
        // Try to read the file and handle exceptions
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read and print each line of the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the case when file does not exist
            System.out.println("File not found");
        }
    }
}
