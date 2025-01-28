public class NumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, digits.length);
        }
        return sum == number;
    }

    public static void findLargestAndSecondLargest(int number) {
        int[] digits = storeDigits(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int number) {
        int[] digits = storeDigits(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits array: " + java.util.Arrays.toString(storeDigits(number)));
        System.out.println("Is duck number: " + isDuckNumber(number));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(number));
        findLargestAndSecondLargest(number);
        findSmallestAndSecondSmallest(number);
    }
}