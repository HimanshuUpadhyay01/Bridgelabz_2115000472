import java.util.Arrays;
class CountingSort {
public static void countingSort(int[] arr, int maxVal) {
int[] count = new int[maxVal + 1];
for (int num : arr) count[num]++;
int index = 0;
for (int i = 0; i <= maxVal; i++) {
while (count[i]-- > 0) arr[index++] = i;
}
}
public static void main(String[] args) {
int[] studentAges = {15, 12, 17, 14, 16, 11, 18, 13, 10};
countingSort(studentAges, 18);
System.out.println("Sorted Student Ages: " + Arrays.toString(studentAges));
}
}