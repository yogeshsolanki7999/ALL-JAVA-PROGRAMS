package com.MySirG;

import java.util.Scanner;

public class m21_all_prime_no_btw_two_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int j;

        System.out.println("ENTER THE FIRST NUMBER");
        int num1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2=sc.nextInt();
           for ( i=num1;i<=num2;i++){
               for ( j=2;j<=i-1;j++){
                   if (i%j==0){

                       break;
                   }


               }
               if (i==j){
                   System.out.println(i);
               }
           }


    }
}
