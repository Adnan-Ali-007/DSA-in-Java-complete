import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int len = arr.length;
        inssrt(arr, len);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void inssrt(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = key;
                j = j - 1; // Fix: Remove int before j
            }
            arr[j + 1] = key;
        }
    }
}
