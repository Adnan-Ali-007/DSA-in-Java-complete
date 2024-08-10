import java.util.*;
public class bin_rec {
    public static void main(String[] args)
    {
        int []arr={1,2,6,9,10};
        int target=9;
        int key=bins(arr,target,0,arr.length-1);
        System.out.println("position of target element is "+key);
    }
 static int bins(int[]arr,int target,int s,int e)
 {
   if(s>e) return -1;
   int mid=s+(e-s)/2;
   if(target==arr[mid]) return mid;
   if(target>arr[mid])return bins(arr,target,mid+1,e);
    else return bins(arr,target,s,mid-1);
 }
}
//mai kabil hun i knw that i just need to work and prove
