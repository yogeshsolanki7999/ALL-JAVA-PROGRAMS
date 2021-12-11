package com.MySirG;

import java.util.Scanner;

public class m19_power_calculation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE VARIABLE");
        int x=s.nextInt();
        System.out.println("ENTER THE POWER OF THE VARIABLE");
        int y=s.nextInt();
        int cal=1;
        for (int i=0;i<=y;i++){
            cal=cal*x;
        }
        System.out.println(cal);
    }
}
