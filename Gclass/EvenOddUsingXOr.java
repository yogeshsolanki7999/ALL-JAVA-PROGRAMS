package com.Gclass;

import java.util.Scanner;

public class EvenOddUsingXOr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=s.nextInt();

        int xor=num^1;
        if (xor==num+1){
            System.out.println("NUMBER IS EVEN");

        }
        else
        {
            System.out.println("NUMBER IS ODD");
        }
    }
}
