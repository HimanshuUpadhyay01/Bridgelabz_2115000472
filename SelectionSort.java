import java.util.Arrays;
class SelectionSort {
public static void selectionSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
int minIdx = i;
for (int j = i + 1; j < n; j++) {
if (arr[j] < arr[minIdx]) minIdx = j;
}
int temp = arr[minIdx];
arr[minIdx] = arr[i];
arr[i] = temp;
}
}
public static void main(String[] args) {
int[] examScores = {88, 75, 92, 67, 80};
selectionSort(examScores);
System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));
}
}