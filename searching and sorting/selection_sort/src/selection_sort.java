import java.util.Arrays;
import static java.util.Collections.swap;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {32,65,21,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            // finding max element in the remaining array and swapping it with correct index
            int last = arr.length - i - 1; // assigning last index in array
            int maxindex = max(arr, 0, last);
           swap(arr, maxindex, last);
        }
    }
    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int j = 0; j < end; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }
        static void swap ( int[] arr, int first, int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}
