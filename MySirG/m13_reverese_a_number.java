package com.MySirG;

import java.util.Scanner;

public class m13_reverese_a_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rev=0;
        int number= s.nextInt();
        for (int i=0;number>0;i++){
            int r=number%10;
            rev=rev*10+r;

           number=number/10;
        }
        System.out.println(rev);
    }
}
