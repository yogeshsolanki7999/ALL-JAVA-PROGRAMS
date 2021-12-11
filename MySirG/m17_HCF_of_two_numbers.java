package com.MySirG;

import java.util.Scanner;

public class m17_HCF_of_two_numbers {
    public static void main(String[] args) {
        System.out.println("ENTER TWO NUMBERS");
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int H=0;
        for (int i=1;i<=Math.min(num1,num2);i++){
            if (num1%i==0 && num2%i==0){
                H=i;
            }
        }
        System.out.printf("THE HCF OF %d AND %d IS   %d",num1,num2,H);
    }
}
