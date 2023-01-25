import java.util.Arrays;
public class quicksort {
    public static void main(String[] args)
    {
        int []arr={2, 4, 1, 5, 7};
        int n= arr.length;
        quicksort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    private static int partition(int[]arr,int l,int h )
    {
        int i=l;
        int j=h;
        int pivot=arr[l];
    while(i<j)
    {
        while(arr[i]<=pivot){i++ ;}
        while (arr[j]>pivot){j--;}
        if(i<j)
            swap(arr,i,j);
    }
swap(arr,j,l);
return j;
    }
    static void swap(int[]arr.int i, int j)
    {
        int temp=i;
        i=j;
        j=temp;
    }

     static void quicksort(int[]arr,int l,int h)
    {
        if(l<h)
        {
        int pi=partition(arr,l,h);
      quicksort(arr,l,pi-1);
      quicksort(arr,pi+1,h);
        }
    }
}
