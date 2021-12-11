package com.pracrtice_geeks;

import java.util.Scanner;

public class P6_rotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num=s.nextInt();
        System.out.println("ENTER THE ROTATION");
        int rotation=s.nextInt();
        int rem=num%(int) Math.pow(10,rotation);
        int quoteint=num/(int) Math.pow(10,rotation);
        int addQuoteint=quoteint;


        int count=0;
        while (quoteint>0){
            quoteint=quoteint/10;
            count++;
        }
        rem=(rem*(int) Math.pow(10,count));
        rem=rem+addQuoteint;
        System.out.println(rem);

    }
}
