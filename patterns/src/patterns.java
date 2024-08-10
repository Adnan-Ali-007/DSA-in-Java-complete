import java.util.*;
public class patterns
{
    public static void main(String[] args)
    {
        int n=4;
//    pattern1(n);
        pattern2(n);
    }
//    static void pattern1(int n)
//    {
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=row;col++)
//            {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//    }
      static void pattern2(int n)
    {
        for(int row=0;row<2*n;row++){
            int totalcol= row>n?2*n-row:row;
            for(int col=0;col<totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
