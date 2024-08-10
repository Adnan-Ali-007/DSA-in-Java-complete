import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class mathsdsa {
    public static void main(String[] args) {
        //number is odd or even given in binary form
//    public static void main(String[] args)
//    {
//        int n=67;
//        System.out.println(check(n));
//    }
//    private static boolean check(int n)
//    {
//        return (n & 1)==1;
//    }
        // unique number
//    public static void main(String[] args)
//    {
//        int[] arr = {2, 4, 1, 4, 2};
//        System.out.println(ans(arr));
//    }
//    private static int ans(int []arr)
//    {
//    int unique=0;
//    for(int n : arr)
//    {
//        unique^=n;
//    }
//    return unique;
//    }
// magic number

        //
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(ans(n));
//    }
//    private static int ans(int n)
//    {
//        int ans=0;
//        int base =5;
//        while(n>0)
//        {
//            int last=n & 1;
//            n=n>>1;
//          ans+=base*last;
//          base=base*5;
//        }
//        return ans;
//    }
// find no of digits in a number n given in base b
//   int n=876544;
//    int base=10;
//    int digit=(int)(Math.log(n)/Math.log(base))+1;
//        System.out.println(digit);
        // find a number is power of 2 or not
//        int number=33;
//        System.out.println( check(number)+" number is a power of 2");
//    }
//    private static boolean check( int number) {
//        if (number > 0 && ((number & number - 1) == 0))
//        {
//            return true;
//        }
//        else return false;
        // given a no find no of set bits in it
        //brute force
//        int n = 9;//number in which we want set bits
//        int cntr=0;
//        while (n > 0) {
//            if (n&1 == 1) cntr++;
//              n>>=1;
//
//        }
//        System.out.println("number of set bits is"+cntr);
// another method set bits order
//int cntr=0;
//int n=10;
//while(n>0)
//{
//n=n&n-1;// rightmost set bit is unset and we increament there by getting set bits
//cntr++;
//}
//        System.out.println(" "+cntr);
        //xor of numbers in range
//         int a=3;
//         int b=9;
//         int ans=xornge(b)^xornge(a-1);
//        System.out.println(ans);
//    }
//    private static int xornge(int a)
//    {
//        if(a%4==0) return a; //see patterns xoring
//        if(a%4==1) return 1;
//        if(a%4==2) return a+1;
//        return 0;
    }
}
