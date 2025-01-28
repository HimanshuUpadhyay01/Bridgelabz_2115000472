import java.util.Random;

public class FourDigit {
    public static void main(String[] args) {
        int[] numbers = fourDigitRandomArray(5);
        System.out.println("Generated 4-digit random numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        double[] averageMinMax = averageMinMax(numbers);
        System.out.println("\nAverage: " + averageMinMax[0]);
        System.out.println("Minimum: " + averageMinMax[1]);
        System.out.println("Maximum: " + averageMinMax[2]);
    }

    public static int[] fourDigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000; // Generate 4-digit random numbers
        }
        return numbers;
    }

    public static double[] averageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }
}