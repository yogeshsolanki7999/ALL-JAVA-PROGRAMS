package com.Harry;
import  java.util.Scanner;
public class y17_if_else_statements {
    public static void main(String[] args) {
        System.out.println("ENTER FIRST NUMBER");
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        System.out.println("ENTER SECONDD NUMBER");
        int num2=s.nextInt();

        if (num1>num2) {
            System.out.println("FIRST NUMBER IS GREATER THAN SECOND");
        }
        else {
            System.out.println("SECOND NUMBER IS GREATER THAN FIRST");

        }
    }
}
