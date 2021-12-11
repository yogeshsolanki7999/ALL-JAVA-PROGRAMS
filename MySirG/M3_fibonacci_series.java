package com.MySirG;

import java.util.Scanner;

public class M3_fibonacci_series {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER TO WHICH YOU WANT TO PRINT THE FIBO SERIES");
        int n=scan.nextInt();
        int a=0,b=1,c=0;
        System.out.printf("FIBONACCI SERIES UPTO %d  digit \n",n);
        for (int i=0;i<=n;i++){
            a=b;
            b=c;
            c=a+b;

            System.out.print(" "+c);
        }
    }
}
