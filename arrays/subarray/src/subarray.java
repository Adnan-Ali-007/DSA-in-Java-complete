import java.util.Arrays;
import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
         arr[i]=in.nextInt();
        }
   System.out.println(Arrays.toString(arr));
        int maxsum=Integer.MIN_VALUE;
//    for (int i=0; i< arr.length;i++)//finding start of subaaray everuytime
//    {
//        for (int j=i; j< arr.length;j++)//finding end of subarray everytime
//        {
//            int sum=0;
//
//            for (int k = i; k <= j; k++) {
////                System.out.printf("%d\t%n", arr[k]);
//                 sum=sum+arr[k];  //brute force o(n3)
//            }
//            maxsum=Math.max(maxsum,sum);
////            System.out.println();
//        }
//    }
        //kadens algorithm dp
    System.out.println(maxsum);
    }

}
