package com.MySirG;

import java.util.Scanner;

public class m14_LCM_of_two_numbers  {
    public static void main(String[] args) {
        System.out.println("ENTER TWO NUMBER");
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
int lcm=0;
        for (int  i=1;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                lcm=i;
                break;
            }
        } System.out.println("LCM IS "+lcm);

    }
}
