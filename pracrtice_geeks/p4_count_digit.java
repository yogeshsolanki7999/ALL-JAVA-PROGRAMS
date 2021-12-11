package com.pracrtice_geeks;

import java.util.Scanner;

public class p4_count_digit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        while (num>0){

            count++;
            num=num/10;


        }
        System.out.printf("\nAND THE COUNT OF DIGIT IS  =%d",count);
    }
}
