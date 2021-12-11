package com.MySirG;

import java.util.Scanner;

public class m20_number_is_prime_or_not {
    public static void main(String[] args) {
        int i= 0;
        System.out.println("ENTER A NUMBER");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for (i=2;i<=num-1;i++){
            if (num%i==0){
                break;
            }
        }
if (num==i) {
    System.out.println(num + "  IS A PRIME NUMBER");
}else {
    System.out.println(num + " IS NOT A PRIME NUMBER");
}



    }
}
