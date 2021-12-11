package com.MySirG;

import java.util.Scanner;

public class m22_print_all_prime_factors_of_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=s.nextInt();

        for (int i=2;num>1;i++){

            while (num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
    }
}
