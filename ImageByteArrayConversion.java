import java.io.*;

public class ImageByteArrayConversion {
    public static void main(String[] args) {
        String inputImagePath = "original_image.jpg";  
        String outputImagePath = "output_image.jpg";   

        try {
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            writeByteArrayToImage(imageBytes, outputImagePath);

            if (verifyImagesAreIdentical(inputImagePath, outputImagePath)) {
                System.out.println("The new image is identical to the original image.");
            } else {
                System.out.println("The new image is NOT identical to the original image.");
            }

        } catch (IOException e) {
            System.out.println("Error during file operations: " + e.getMessage());
        }
    }

    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(imagePath);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;

        while ((length = fileInputStream.read(buffer)) != -1) {
            byteArrayOutputStream.write(buffer, 0, length);
        }

        fileInputStream.close();
        byteArrayOutputStream.close();

        return byteArrayOutputStream.toByteArray();
    }

    private static void writeByteArrayToImage(byte[] imageBytes, String imagePath) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
        FileOutputStream fileOutputStream = new FileOutputStream(imagePath);

        byte[] buffer = new byte[1024];
        int length;

        while ((length = byteArrayInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, length);
        }

        byteArrayInputStream.close();
        fileOutputStream.close();
    }

    private static boolean verifyImagesAreIdentical(String originalImagePath, String newImagePath) throws IOException {
        File originalFile = new File(originalImagePath);
        File newFile = new File(newImagePath);

        if (originalFile.length() != newFile.length()) {
            return false;  
        }

        try (FileInputStream originalInputStream = new FileInputStream(originalFile);
             FileInputStream newInputStream = new FileInputStream(newFile)) {

            int byteOriginal, byteNew;
            while ((byteOriginal = originalInputStream.read()) != -1 &&
                   (byteNew = newInputStream.read()) != -1) {

                if (byteOriginal != byteNew) {
                    return false;  
                }
            }
        }

        return true;  
    }
}
