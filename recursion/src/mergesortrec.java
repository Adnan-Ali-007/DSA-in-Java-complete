import java.util.*;
public class mergesortrec
{
    public static void main(String[] args)
    {
        // do inplace merge sort
   int []arr={3,5,6,1,8};
  int[] ans=mergesort(arr);
   System.out.println(Arrays.toString(ans));
    }
    static int[] mergesort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        left = mergesort(left);
        right = mergesort(right);
        return merge(left, right);
    }
  private static int [] merge(int []first,int []second)
  {
  int []mix= new int[first.length+ second.length];
  int i=0,j=0,k=0;
  while(i<first.length && j< second.length)//comparing two halfes setting it in new merge array
  {
  if(first[i]<second[j]){
      mix[k]=first[i];
     i++;
  }
      else
      {
          mix[k]=second[j];
          j++;
      }
      k++;
  }
  while(i< first.length)
  {
  mix[k]=first[i];
  i++;
  k++;
  }
      while(j< second.length)
      {
          mix[k]=second[j];
          j++;
          k++;
      }
      return mix;
  }
}
