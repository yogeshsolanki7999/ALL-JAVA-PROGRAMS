package com.MySirG;

import java.util.Scanner;

public class m16_product_of_all_natural_numbers {
    public static void main(String[] args) {
        System.out.println("ENTER  A NUMBER");
        Scanner d=new Scanner(System.in);
        int num= d.nextInt();
        int product=1;
        for (int i=0;i<=num;i++){
            product=product*i;
        }
        System.out.println("THE SUM OF ALL NATURAL NUMBERS UPTO N NUM IS  "+product);
    }
}
