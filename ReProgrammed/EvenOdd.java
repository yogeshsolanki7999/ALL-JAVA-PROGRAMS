package com.ReProgrammed;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK WEATHER A NUMBER IS EVEN OR ODD");
        int num=s.nextInt();
         if ((num/2)*2==num){
             System.out.println("NUMBER IS EVEN");
         }
         else{
             System.out.println("NUMBER IS ODD");
         }

        System.out.println("ENTER THE SECOND NUMBER TO BE CHECKED");

         int num2=s.nextInt();

         if ((num2|2)==num+1){
             System.out.println("THE SECOND NUMBER IS EVEN");
         }
         else{
             System.out.println("THE SECOND NUMBER IS ODD");
         }

        System.out.println("ENTER THE THIRD NUMBER TPO BE CHECKED");
         int num3=s.nextInt();
         if ((num3&2)==0){
             System.out.println("THE THIRD NUMBER IS EVEN");
         }
         else {
             System.out.println("THE THIRD  NUMBER IS ODD");
         }
        System.out.println("ENTER FOURTH NUMBER TO BE CHECKED ");
         int num4=s.nextInt();
         if ((num^2)>=num){
             System.out.println("THE FOURTH NUMBER IS EVEN");
         }
         else {
             System.out.println("THE FOURTH NUMBER IS ODD");
         }
    }
}
