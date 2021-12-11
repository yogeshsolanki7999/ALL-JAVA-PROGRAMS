package com.GAssignments;

import java.util.Scanner;

public class Check_AND_OR {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    int AND = num1 & num2 ;
    int OR= num1 | num2 ;


        System.out.println("THE RESULT OF AND OPERATION IS  "+AND);
        System.out.println("THE RESULT OF AND OPERATION IS  "+OR);



int[] a = {2, 3, 4, 5};
        int bp= a[0];
        int profit=0;
        int sp =a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < bp) {
                bp = a[i];

                continue;

            }
            profit = Math.max(profit,a[i]-bp);

        }
         System.out.println(profit);
    }





}

