package com.java_practice;

import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int Even=0;
        int Odd=0;

        for(int i=0;i<=num;i++){
            if (i%2==0){
                Even=Even+i;
            }
            else {
                Odd=Odd+i;
            }
        }
        System.out.println(Even);
        System.out.println(Odd);
    }
}
