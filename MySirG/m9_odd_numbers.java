package com.MySirG;
import java.util.Scanner;

public class m9_odd_numbers {
    public static void main(String[] args) {
        //PRINTING FIRST 10 ODD NUMBERS
        int count=0;
        int ODD=0;
        System.out.println("FIRST 10 ODD NUMBERS ARE");
        for(int i=0;count<=10-1;i++){
            if (i%2==1){
                System.out.println(i);
                count=count+1;
            }
        }
       //PRINTING FIRST 10 ODD NUMBERS 2ND METHOD MYSIRG WAY

        System.out.println("FIRST 10 ODD NUMBERS ARE");
        for(int i=1;i<=10-1;i++){

                System.out.println(i*2+1);
        }


        //PRINTING N NUMBERS OF ODD NUMBERS
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER N");
        int n=s.nextInt();
        int count1=0;
        System.out.println("FIRST 10 ODD NUMBERS ARE");
        for(int i=0;count1<=n;i++){
            if (i%2==1){
                System.out.println(i);
                count1=count1+1;
            }
        }

        //PRINTING N NUMBERS OF ODD NUMBERS 2ND METHOD MY SIRG WAY
        Scanner s1=new Scanner(System.in);
        System.out.println("ENTER A NUMBER N");
        int num=s.nextInt();

        System.out.println("FIRST N ODD NUMBERS ARE");
        for(int i=0;i<=num;i++){

                System.out.println(i*2+1);

        }

    }
}

