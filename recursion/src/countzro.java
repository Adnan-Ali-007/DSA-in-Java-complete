import java.util.*;
import Scanner
public class countzro
{
    public static void main(String[] args)
    {
     int n=
    int ctr= cnt(n);
    System.out.println("count of zeroes "+ctr);
    }
    static int cnt(int n){

        return helper(n,0);
    }
    static int helper(int n,int c){
        int rem=n%10;
        if(n==0){return c;}
        else if(rem==0){return helper(n/10,c+1);}
         else return helper(n/10,c);
    }
}
