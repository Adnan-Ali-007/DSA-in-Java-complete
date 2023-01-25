package com.adnan;

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
*/
import java.util.ArrayList;
import java.util.Scanner;

public class array_intro {
public static void main(String[] arg)
{
    /*Scanner in=new Scanner(System.in);*/

  /*  System.out.println("pls enter elements of array and its size");
    int size=in.nextInt();
   int[] ros=new int[size];
     for(int i=0;i<ros.length;i++) {
        ros[i]=in.nextInt();
    }
    System.out.println(Arrays.toString(ros));
    }*/
    //arrays of objects
  /*  String[] str=new String[4];
    for(int i=0;i< str.length;i++)
    {
    str[i]=in.next();
    }
    System.out.println(Arrays.toString(str));
     */
    // array lists
    ArrayList<Integer>list=new ArrayList<>(10);/*
     list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    list.add(69);
    System.out.println(list.contains(69));
    list.set(1,45);//for setting value at index
    list.remove(3);
    System.out.println(list);*/
    // for input and printing list
    Scanner in=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
       list.add(in.nextInt());
    }
for(int i=0;i<5;i++) {
    System.out.println(list.get(i)); // for printing
}
}
}

