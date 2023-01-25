package com.adnan;

/*
   Write a function that returns all prime numbers between two given numbers.
*/
import java.util.Scanner;
public class prime_no {
public static void main(String[] args)
    {
        System.out.println("enter the ranges from which u want prime in between");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        prime(a,b);
    }
     static void prime(int a, int b)
     {
         int i,j;
         for(i=a;i<=b;i++)
         {
             for(j=2;j<=i;j++)
             {
     if(i%j==0) break;
             }
            if(i==j) System.out.println(j);
         }
     }
}
