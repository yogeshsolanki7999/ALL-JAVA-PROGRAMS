package com.ReProgrammed;

import java.util.Scanner;

public class r3_Even_Odd_Using_XOR {
    public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            System.out.println("ENTER A NUMBER");
            int num=s.nextInt();

            if ((num^1)>num){
                System.out.println("NUMBER IS EVEN");
            }
            else
            {
                System.out.println("NUMBER IS ODD");

    }
}}
