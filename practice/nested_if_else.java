package com.practice;

import java.util.Scanner;

public class nested_if_else {

    public void check(int n){

        if (n>100){
            System.out.println("N IS GREATER THAN 100");
            if (n>150){
                System.out.println("N IS GREATER THAN 150");
            }else {
                System.out.println("N IS LESS THAN 100");
                if (n>50){
                    System.out.println("N IS GREATER THAN 50");
                }else {
                    System.out.println("N IS LESS THAN 50");
                }
            }
        }


    }

    public static void main(String[] args) {
        nested_if_else el=new nested_if_else();
        Scanner s=new Scanner(System.in);
        int i= s.nextInt();
        el.check(i);
    }

}
