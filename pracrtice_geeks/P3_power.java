package com.pracrtice_geeks;

import java.util.Scanner;

public class P3_power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        System.out.println("enter the power");

        int pow=s.nextInt();
         int sum=1;
         int count=pow;
        int i=0;
        while (i<pow){
            sum=sum*num;
            i++;

        }
        System.out.println("sum= "+sum);
    }
}
