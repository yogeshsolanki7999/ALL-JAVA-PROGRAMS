package com.practice;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=String.valueOf(n).length();
        int sumE=0;
        int sumO=0;
        int numC=0;
        int numD=0;
       for (int i=0;i<=l;i++){


           numC=n%10;


           if (numC%2==0){
                sumE=sumE+numC;
           }
           else if (numC%2==1){
               sumO=sumO+numC;
           }
           n=n/10;

       }
        System.out.println(sumE);
        System.out.println(sumO);


    }
}
