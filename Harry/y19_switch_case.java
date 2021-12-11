package com.Harry;

import java.util.Scanner;

public class y19_switch_case {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();

        switch (age){
            case 25:
                System.out.println("YOU ARE AN ADULT");
                break;
            case 45:
                System.out.println("YOU ARE A  MAN");
                break;
            case 55:
                System.out.println("YOU ARE AN OLD MAN");
                break;
            default:
                System.out.println("YOU ARE AN ANIMAL");
        }
    }
}
