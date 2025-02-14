import java.util.Arrays;
class MergeSort {
public static void mergeSort(int[] arr, int l, int r) {
if (l < r) {
int m = l + (r - l) / 2;
mergeSort(arr, l, m);
mergeSort(arr, m + 1, r);
merge(arr, l, m, r);
}
}
private static void merge(int[] arr, int l, int m, int r) {
int n1 = m - l + 1;
int n2 = r - m;
int[] L = new int[n1];
int[] R = new int[n2];
System.arraycopy(arr, l, L, 0, n1);
System.arraycopy(arr, m + 1, R, 0, n2);
int i = 0, j = 0, k = l;
while (i < n1 && j < n2) {
arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
}
while (i < n1) arr[k++] = L[i++];
while (j < n2) arr[k++] = R[j++];
}
public static void main(String[] args) {
int[] bookPrices = {500, 150, 700, 300, 450};
mergeSort(bookPrices, 0, bookPrices.length - 1);
System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));
}
}