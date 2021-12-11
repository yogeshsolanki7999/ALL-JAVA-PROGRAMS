package com.practice;

import java.util.Scanner;

public class y9_loops {


    public static void main(String[] args) {

       /* //EXECUTING WHILE LOOP
        int i=0;
         while (i<=20){
        System.out.println(i);
        i++;
                       }*/


       /* //PRINT NATURAL NUMBERS 100TO200

        int i=100;

        while (i<=200){

            System.out.println(i);
            i++;
        }*/

       /* //PROGRAM TO PRINT FIRST N ODD NUMBERS USING WHILE
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any numbers");
        int i=0;
        int n=s.nextInt();
        while (i<=n){
            System.out.println(i*2+1);
            i++;
        }*/

       /* //PROGRAM TO PRINT FIRST N EVEN NUMBERS USING WHILE
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any numbers");
        int i=0;
        int n=s.nextInt();
        while (i<=n){
            System.out.println(i*2);
            i++;
        }*/

        //PROGRAM TO PRINT N N NATURAL NUMBERS IN REVERSE ORDER
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any numbers");
        int n=s.nextInt();
        while (n>=0){
            System.out.println(n);
            n--;
        }





}}
