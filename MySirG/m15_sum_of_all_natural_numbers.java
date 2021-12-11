package com.MySirG;

import java.util.Scanner;

public class m15_sum_of_all_natural_numbers {
    public static void main(String[] args) {
        System.out.println("ENTER  A NUMBER");
        Scanner d=new Scanner(System.in);
        int num= d.nextInt();
        int sum=0;
        for (int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("THE SUM OF ALL NATURAL NUMBERS UPTO N NUM IS  "+sum);
    }
}
