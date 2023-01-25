import java.util.Arrays;
public class bubble_sort
{
 public static void main(String[]args)
 {
int[]arr={1,34,22,4,9,5,0};
bubble(arr);
  System.out.println(Arrays.toString(arr));
 }
 static void bubble(int[]arr)
 {
  boolean swapped=false;//for checking for best case so it dont keeps checking after there was no swapped in first pass
for(int i=0;i<arr.length;i++)
{
 for(int j=1;j<=arr.length-i-1;j++) // comparing only unsorted ones via limiting j
 {
if(arr[j]<arr[j-1])
{
 int temp=arr[j];
 arr[j]=arr[j-1];
 arr[j-1]=temp;
 swapped=true;
}
 }
 if(swapped==false) break; // telling it to break after first pass cause there was no swap in first phase
}
 }
}


