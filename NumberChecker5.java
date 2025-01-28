public class NumberChecker5 {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) greatest = factor;
        }
        return greatest;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum == number;
    }
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum > number;
    }
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum < number;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        int number = 6;
        int[] factors = findFactors(number);
        System.out.println("Factors: "+java.util.Arrays.toString(factors));
        System.out.println("Greatest factor: "+greatestFactor(factors));
        System.out.println("Sum of factors: "+sumOfFactors(factors));
        System.out.println("Product of factors: "+productOfFactors(factors));
        System.out.println("Product of cube of factors: "+productOfCubeOfFactors(factors));
        System.out.println("Is perfect number: "+isPerfectNumber(number));
        System.out.println("Is abundant number: "+isAbundantNumber(number));
        System.out.println("Is deficient number: "+isDeficientNumber(number));
        System.out.println("Is strong number: "+isStrongNumber(number));
    }
}