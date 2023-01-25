import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;
public class question_basic {
    public static void main(String[] args) {
       // swaping values in array
        int[]arr={1,3,5,23,18};
       // swap(arr,1,3);// took two indeces of array
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("after reversing array is"+Arrays.toString(arr));
    }
static void swap(int[]a, int i,int j)
{
  int temp=a[i];
  a[i]=a[j];
  a[j]=temp;
    // reversing an array
}
    static void reverse(int[]a)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
          swap(a,start,end);
            start++;
            end--;
        }
    }
}
