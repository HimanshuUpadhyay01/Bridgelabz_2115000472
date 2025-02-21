import java.io.*;

public class ErrorLogReader {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; // Specify the path to the large text file
        String searchWord = "error"; // Word to search for (case insensitive)

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
