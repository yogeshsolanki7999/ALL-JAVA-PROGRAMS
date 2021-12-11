package com.ReProgrammed;

import java.util.Scanner;

public class r2_Even_Odd_Using_AND {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=s.nextInt();

        if ((num&1)==0){
            System.out.println("NUMBER IS EVEN");
        }
        else
        {
            System.out.println("NUMBER IS ODD");
        }
    }
}
