package com.MySirG;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class m24_N_term_of_fibonacci {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int a=0,b=1,c=0;
        for (int i=0;i<=num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
    }
}
