package com.adnan;
import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true)
        {
            System.out.println("enter the two numbers");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.print("Enter the operation");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                if (op == '+') ans = a + b;
                if (op == '-') ans = a - b;
                if (op == '*') ans = a * b;
                if (op == '/' && b != 0) ans = a / b;
                if (op == '%') ans = a % b;
            } else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("invalid command");
            }
            System.out.println(ans);
        }
    }
}
