package com.pracrtice_geeks;

import java.util.Scanner;

public class P5_Reverse_a_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int rev=0;
        int ss=0;
        int count=0;
        while (num>0){
            ss=num%10;
            rev=(rev*10)+ss;

            num=num/10;
        }
        int result=0;
        while (rev>0){
            result=rev%10;
            System.out.println(result);
            rev=rev/10;
        }

    }

}
