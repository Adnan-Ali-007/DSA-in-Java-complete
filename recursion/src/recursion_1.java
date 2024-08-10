import java.util.*;
public class recursion_1
{
//print 1-n
    static int sum=0;
//    static void reverse(int n)
//    {
// if(n==0){return;}
//    int rem=n%10;
//     sum=sum*10+rem;
//    reverse(n/10);
//    }
    static int rev2(int n)
    {
        int digits=(int)((Math.log10(n))+1);
        return helper(n,digits);
    }
    static int helper(int n, int digit)
    {
     if(n%10==n){return n;}
     int rem=n%10;
     return rem*(int)(Math.pow(10,digit-1)) +helper(n/10,digit-1);
    }
public static void main(String[] args)
{
    int n=435167;
//    one_n(n);
//    System.out.println(fact(n));
//     reverse(n);
    System.out.println(rev2(n)); // for palindrom do the same
}
//static void one_n(int n)
//{
//if(n==0){return;}
//    one_n(n-1);
//    System.out.println(n);
//}
//static int fact(int n)
//{
//if(n<=1){return 1;}
//return n*fact(n-1);//here rturn the same type as function return so rec also returns
//}
}
