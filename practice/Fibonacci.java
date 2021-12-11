package com.practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        System.out.println("ENTER A NUMBER");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i=0;i<=number;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);

        }
    }
}
