 package com.adnan;

 import java.util.Scanner;

 public class programs {
    public static void main(String[] args) {
        /*To calculate Fibonacci Series up to n numbers.*/
  /*Scanner input=new Scanner(System.in);
        System.out.println("enter the number of terms upto which u want sum");
  int n=input.nextInt();
  int a=0;
  int b=1;
  int count,sum=0,temp;
  if(n==0||n==1)
  { sum=n;}
  for(count=2;count<=n;count++)
  {
      temp=b;
      b=b+a;
      a=temp;
      sum=sum+temp;
  }
  System.out.println(sum);*/
    //Take name as input and print a greeting message for that particular name.
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter your name");
        String s=sc.nextLine();
        System.out.println("Welcome to oracle "+s);*/
        //To find out whether the given String is Palindrome or not.
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string u want to check");
        String p=sc.nextLine();
        String rev="";
        int len=p.length();
        for (int i=len-1;i>=0;i--) {
        rev=rev+p.charAt(i);
        }
        if(p.equals(rev))
        {
            System.out.println(p+" is a palindrome");
        }
        else System.out.println("Not a palindrome");*/
       // To find Armstrong Number between two given number
        Scanner in=new Scanner(System.in);
        System.out.println("enter the two numbers for the range");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int i=0;

            for (i = num1; i < num2; i++) {
                int rem, check,sum= 0;
                check = i;
                while (check != 0) {
                    rem = check % 10;
                    sum = sum + rem * rem * rem;
                    check = check / 10;
                }
                if( sum==i) {System.out.println(i+"jackpot we found armstrong bewteen two numbers ");}

            }
        }

    }




