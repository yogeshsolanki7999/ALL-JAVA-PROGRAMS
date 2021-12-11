package com.MySirG;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class m7_natural_numbers {
    public static void main(String[] args) {
        //PROBLEM 1 PRINT FIRST 10 NATURAL NUMBERS
        System.out.println("FIRST 10 NATURAL NUMBERS ARE :");
        for (int i=0;i<=10;i++){
            System.out.print(" "+i);
        }
        //PROBLEM 2 PRINT FIRST 10 NATURAL NUMBERS IN REVERSE ORDER
        System.out.println("");
        System.out.println("FIRST 10 NATURAL IN REVERSE NUMBERS ARE :");
        for (int i=10;i>=0;i--){
            System.out.print(" "+i);
        }
        //PROBLEM 3 PRINT FIRST N NATURAL NUMBERS
        System.out.println("");
        Scanner s1=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n1=s1.nextInt();
        System.out.println("");
        System.out.println("FIRST N NATURAL  NUMBERS ARE :");
        for (int i=0;i<=n1;i++){
            System.out.print(" "+i);
        }
        //PROBLEM 4 PRINT FIRST N NATURAL NUMBERS IN REVERSE ORDER
        System.out.println("");
        Scanner s2=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n2=s2.nextInt();
        System.out.println("");
        System.out.println("FIRST N NATURAL IN REVERSE  ARE :");
        for (int i=n2;i>=0;i--){
            System.out.print(" "+i);
        }

    }
}
