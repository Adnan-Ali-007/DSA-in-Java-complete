package com.adnan;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
     /*    counting number of given repeating digit in number
        System.out.println("enter the number plss");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        System.out.println("pls enter which digit repeating you want in the number given to us");
        int dig=input.nextInt();
        while(num>0)
        {
            int remainder=num%10;
            if(remainder==dig){ count++;}
            num=num/10;
        }
        System.out.println(count);*/
        // for reversing a number
        Scanner input=new Scanner(System.in);
        int num =input.nextInt();
        int rev=0;
        while(num>0)
        {
         int rem=num%10;
         rev=rev*10+rem;
         num/=10;
        }
        System.out.println(rev);
    }
}
