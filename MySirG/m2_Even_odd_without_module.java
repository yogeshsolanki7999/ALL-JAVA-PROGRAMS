package com.MySirG;

import java.util.Scanner;

public class m2_Even_odd_without_module {
    public static boolean evodd(int number){
        return ((number/2)*2==number);
    }
    public static void main(String[] args) {
        System.out.println("ENTER ANY NUMBER");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean b=evodd(n);


        if (b==true){
            System.out.println("THIS NUMBER IS EVEN");
        }else
        {
            System.out.println("THIS NUMBER IS ODD");
        }
    }
}
