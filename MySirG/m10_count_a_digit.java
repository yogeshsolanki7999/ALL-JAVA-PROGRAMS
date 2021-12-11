package com.MySirG;

import java.util.Scanner;

public class m10_count_a_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* //PRINTING COUNT OF A DIGIT MY WAY USING STRING METHODS

        System.out.println("ENTER A DIGIT");
        int digit =sc.nextInt();
        String str;
        str = String.valueOf(digit);
        int count =str.length();
        System.out.println(count);*/

     /*   // PRINTING COUNT OF A DIGIT 2ND METHOD
        System.out.println("ENTER 2ND DIGIT");
        int digit2=sc.nextInt();
        int count1=0;
        for (int i=0;digit2>0;i++){

            count1=count1+1;
            digit2=digit2/10;
        }System.out.println(count1);*/
        //PRINTING THE COUNT OF A DIGIT 3RD METHOD MYSIRG
        System.out.println("ENTER A DIGIT");
        int digit3=sc.nextInt();
        int count=0;
        while (digit3!=0){
            count=count+1;
            digit3=digit3/10;
        }
        System.out.println(count);
    }}
