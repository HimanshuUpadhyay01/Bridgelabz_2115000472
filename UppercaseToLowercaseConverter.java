import java.io.*;

public class UppercaseToLowercaseConverter {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";  // Path to the input file
        String outputFilePath = "output.txt";  // Path for the output file

        // Reading from the input file and writing to the output file
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            // Read the input file line by line
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase and write to the output file
                writer.write(line.toLowerCase());
                writer.newLine();  // To ensure each line is written properly with a newline character
            }

            System.out.println("File conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error reading or writing the file: " + e.getMessage());
        }
    }
}
