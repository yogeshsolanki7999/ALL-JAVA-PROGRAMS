package com.MySirG;

import java.util.Scanner;

public class m11_sum_of_count_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A DIGIT");
        int digit =sc.nextInt();
        int sum=0;

        while (digit!=0){
            int dig=digit%10;
            sum=sum+dig;
            digit=digit/10;
        }
        System.out.println(sum);
    }
}
