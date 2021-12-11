package com.Gclass;

import java.util.Scanner;

public class EvenOddUsingAnd {
    public static void main(String[] args) {
        System.out.println("ENTER ANY NUMBER");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int and=num&1;

        if (and==0){
            System.out.println("NUMBER IS EVEN");
        }
        else {
            System.out.println("NUMBER IS OF ODD");
        }
    }
}
