import java.util.*;
public class cyclesort
    {
        public static void main(String[] args) {
            int[] arr = {1, 4, 5, 3, 2};// array in range 1 to n
            sort(arr);
            System.out.println(Arrays.toString(arr));//after sorting
        }
        static void sort(int[] arr)
        {
            int i=0;
            while(i<arr.length)
            {
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct])
                {
                    swap(arr,i,correct);
                }
                else
                {
                    i++;
                }
            }
        }
        static void swap(int []arr,int i, int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
