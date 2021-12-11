package com.practice;

import java.util.Scanner;

public class y13_methods {

    static void hello(int x,int b){
        System.out.printf("%d is greater", Math.max(x, b));

    }

    public static void main(String[] args) {
      //  System.out.println("FOR FIRST TIME");
       // hello(4,6);
       // System.out.println("");
        System.out.println("FOR SECOND TIME BY USER");
        Scanner s=new Scanner(System.in);

        int b=s.nextInt();
        hello(s.nextInt(),b);

    }
}
