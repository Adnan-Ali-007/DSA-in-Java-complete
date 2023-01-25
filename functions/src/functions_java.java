package com.adnan;

import java.util.Scanner;

public class functions_java {
    public static void main(String[] args) {/*
  String message =greet();
  System.out.println(message);
    }
     static String greet() {
         String greeting = "how are you";
         return greeting;

     }*/
        // function overloading
      /*  fun(67);
        fun("kunal kushwaha");
    }*/
/*
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }*/
        /*   Define a program to find out whether a given number is even or odd. */
  /*      System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String result = check(num);
        System.out.println(result);
    }
    static String check(int a)
    {
        if(a%2==0)
            return "even";
        else
            return "odd";
    }
    */
        Scanner in = new Scanner(System.in);
        System.out.println("enter the three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("maximum of three numbers are" + max(a, b, c));
        System.out.println("minimum of three numbers are" + min(a, b, c));

    }

    static int max(int a, int b, int c) {
        int maxx = a;
        if (a < b) {
            maxx = b;
        }
        if (a < c) {
            maxx = c;
        }
        return maxx;
    }

    static int min(int a, int b, int c) {
        int minn = a;
        if (a > b) {
            minn = b;
        }
        if (a > c) {
            minn = c;
        }
        return minn;
    }

/*
    Write a function that returns all prime numbers between two given numbers.
*/



}
