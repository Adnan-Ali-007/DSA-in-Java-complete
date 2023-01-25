
package com.adnan;
import java.util.Scanner;
public class intermediate_java_prgm {
     //Factorial Program In Java
     public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
       fact=fact*i;
        }
        System.out.println(fact);
        }
    }*/
//Find Ncr & Npr
/*          Scanner in = new Scanner(System.in);
          System.out.println("enter the n and r ");
          int num = in.nextInt();
          int r = in.nextInt();
          if(num>=r)
          {
          int fact = 1, factr = 1;
          for (int i = 1; i <=num; i++) {
               fact = fact * i;
          }
          for (int i = 1; i <=num - r; i++) {
               factr = factr * i;
          }
          }
          System.out.println("result is" + (fact) / factr);*/
          //Reverse A String In Java
          //HCF Of Two Numbers Program
          Scanner in=new Scanner(System.in);
          System.out.println("enter the two numbers");
          int a=in.nextInt();
          int b=in.nextInt();
          int hcf=0;
          for(int i=1;i<=a||i<=b;i++)
          {
             if (a%i==0&&b%i==0)
                 hcf=i;
          }
          System.out.println(hcf);
     }
}